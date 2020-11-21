package com.example.bookingapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchResultsActivity extends AppCompatActivity {

    private static final String TAG = "SearchResultsActivity";

    private ArrayList<String> mText = new ArrayList<>();
    private ArrayList<String> mImage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        getImages();

    }

    private void getImages(){

        Log.d(TAG, "initImageBitMaps: preparing bitmaps.");
        
        mImage.add("https://www.sustainable-bus.com/wp-content/uploads/2019/12/Schermata-2019-12-06-alle-09.59.28.png");
        mText.add("Almaty-Astana");

        mImage.add("https://www.irizar.com/wp-content/uploads/2019/11/JAZ_869229.jpg");
        mText.add("Almaty-Astana");

        mImage.add("https://www.sustainable-bus.com/wp-content/uploads/2019/11/img_9935-1-scaled-e1573890391969.jpg");
        mText.add("Almaty-Astana");

        mImage.add("https://i.pinimg.com/236x/3d/78/08/3d7808b3510dd42025f78373a0936f72--buses-rv.jpg");
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