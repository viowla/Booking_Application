package com.example.bookingapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchResultsActivity extends AppCompatActivity {

    private static final String TAG = "SearchResultsActivity";

    private ArrayList<String> mText = new ArrayList<>();
    private ArrayList<Integer> mImage = new ArrayList<>();
    RecyclerView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        getImages();
        listView = findViewById(R.id.listView);
        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SearchResultsActivity.this, SetCustomSeatActivity.class));
            }
        });

    }

    private void getImages(){

        Log.d(TAG, "initImageBitMaps: preparing bitmaps.");
        
        mImage.add(R.drawable.bus1);
        mText.add("Almaty-Astana");

        mImage.add(R.drawable.bus2);
        mText.add("Almaty-Astana");

        mImage.add(R.drawable.bus3);
        mText.add("Almaty-Astana");

        mImage.add(R.drawable.bus4);
        mText.add("Almaty-Astana");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.listView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(mText, mImage,this);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}