package com.example.bookingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SetCustomSeatActivity extends AppCompatActivity {

    ImageView tripImage;
    TextView tripText;
    Button seat1, seat2, seat3, seat4, seat5, seat6, seat7,seat8,seat9,seat10,
            seat11,seat12,seat13,seat14,seat15,seat16,seat17,seat18,seat19,seat20,
            seat21,seat22,seat23,seat24,seat25,seat26,seat27,seat28,
            seat29,seat30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_custom_seat);

        tripImage = findViewById(R.id.tripImage);
        tripText = findViewById(R.id.tripRoute);
        seat1 = findViewById(R.id.seatButton1);
        seat2 = findViewById(R.id.seatButton2);
        seat3 = findViewById(R.id.seatButton3);
        seat4 = findViewById(R.id.seatButton4);
        seat5 = findViewById(R.id.seatButton5);
        seat6 = findViewById(R.id.seatButton6);
        seat7 = findViewById(R.id.seatButton7);
        seat8 = findViewById(R.id.seatButton8);
        seat9 = findViewById(R.id.seatButton9);
        seat10 = findViewById(R.id.seatButton10);
        seat11 = findViewById(R.id.seatButton11);
        seat12 = findViewById(R.id.seatButton12);
        seat13 = findViewById(R.id.seatButton13);
        seat14 = findViewById(R.id.seatButton14);
        seat15 = findViewById(R.id.seatButton15);
        seat16 = findViewById(R.id.seatButton16);
        seat17 = findViewById(R.id.seatButton17);
        seat18 = findViewById(R.id.seatButton18);
        seat19 = findViewById(R.id.seatButton19);
        seat20 = findViewById(R.id.seatButton20);
        seat21 = findViewById(R.id.seatButton21);
        seat22 = findViewById(R.id.seatButton22);
        seat23 = findViewById(R.id.seatButton23);
        seat24 = findViewById(R.id.seatButton24);
        seat25 = findViewById(R.id.seatButton25);
        seat26 = findViewById(R.id.seatButton26);
        seat27 = findViewById(R.id.seatButton27);
        seat28 = findViewById(R.id.seatButton28);
        seat29 = findViewById(R.id.seatButton29);
        seat30 = findViewById(R.id.seatButton30);
    }
}