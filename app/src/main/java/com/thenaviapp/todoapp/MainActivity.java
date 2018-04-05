package com.thenaviapp.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText addItemEditText;

    List<Todo> todoItemList;

    private RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        todoItemList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.rv_items);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new Adapter(todoItemList);
        recyclerView.setAdapter(adapter);

        addItemEditText = (EditText) findViewById(R.id.addItemET);

    }

    public void onBtnClicked(View v) {
        if(addItemEditText.getText()==null){

        }else{
            Todo todoItem = new Todo();
            todoItem.setItem(addItemEditText.getText().toString());
            todoItemList.add(todoItem);
            adapter.notifyDataSetChanged();
            addItemEditText.setText("");
        }
    }
}
