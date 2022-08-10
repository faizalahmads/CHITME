package com.example.chitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chps1 extends AppCompatActivity {

    Button trixtreme,ctr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chps1);

        trixtreme = findViewById(R.id.trix);
        ctr = findViewById(R.id.ctr);

        trixtreme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Trixtreme.class);
                startActivity(i);
            }
        });

        ctr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Ctr.class);
                startActivity(i);
            }
        });
    }
}