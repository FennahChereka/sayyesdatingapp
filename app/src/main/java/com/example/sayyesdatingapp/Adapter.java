package com.example.sayyesdatingapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
//Binding data with xml
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private List<ModelClass> userList;

    public Adapter(List<ModelClass> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  Adapter.ViewHolder holder, int position) {
        int resource = userList.get(position).getImageView();
        String name = userList.get(position).getTextView1();
        String msg = userList.get(position).getTextView2();
        String time = userList.get(position).getTextView3();

        holder.setData(resource,name,msg,time);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;


        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview1);
            textView1=itemView.findViewById(R.id.textView);
            textView2=itemView.findViewById(R.id.textView2);
            textView3=itemView.findViewById(R.id.textView3);

        }

        public void setData(int resource, String name, String msg, String time){

            imageView.setImageResource(resource);
            textView1.setText(name);
            textView2.setText(msg);
            textView3.setText(time);
        }
    }
}
