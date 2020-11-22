package com.example.bookingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SetCustomSeatActivity extends AppCompatActivity {

    ImageView tripImage;
    TextView tripText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_custom_seat);

        tripImage = findViewById(R.id.tripImage);
        tripText = findViewById(R.id.tripRoute);
    }
}