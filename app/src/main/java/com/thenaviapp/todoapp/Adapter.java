package com.thenaviapp.todoapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Navneet on 04-04-2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Todo> data;

    public Adapter(List<Todo> data) {
        this.data = data;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.todo_items, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemTV.setText(data.get(position).getItem());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView itemTV;
        public ViewHolder(View itemView) {
            super(itemView);
            this.itemTV = itemView.findViewById(R.id.itemtextView);
        }
    }

}
