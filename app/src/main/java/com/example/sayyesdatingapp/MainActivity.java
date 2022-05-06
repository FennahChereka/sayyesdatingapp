package com.example.sayyesdatingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //intializing values
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();

    }

    //data to bind with xml
    public void initData(){
        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.safe, "Fennah", "10 45am", "Darling"));
        userList.add(new ModelClass(R.drawable.safe, "Phenyo", "12 45am", "wa nkhanda ?"));

    }

    //binding xml with recyclervew
    public void initRecyclerView(){
        //fetch recyclerview list by id from xml
        recyclerView = findViewById(R.id.recyclerView1);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}