package com.example.faisal.recyclerviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> feedsList;
    private RecyclerView mRecyclerView;
    private MyRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        feedsList=new ArrayList<String>();

        for(int i=0;i<10;i++){
            feedsList.add("demo name "+i);
        }

        adapter = new MyRecyclerAdapter(MainActivity.this, feedsList);
        mRecyclerView.setAdapter(adapter);

    }
}