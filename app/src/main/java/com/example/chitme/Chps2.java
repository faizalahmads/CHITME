package com.example.chitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Chps2 extends AppCompatActivity {

    Button avatar, basara, bmx, bully, gtasa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chps2);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        avatar = (Button) findViewById(R.id.avatar);
        basara = (Button) findViewById(R.id.basara);
        bmx = (Button) findViewById(R.id.bmx);
        bully = (Button) findViewById(R.id.bully);
        gtasa = (Button) findViewById(R.id.gtasa);

        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Avatar.class);
                startActivity(i);
            }
        });

        basara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Basara.class);
                startActivity(i);
            }
        });

        bmx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Bmx.class);
                startActivity(i);
            }
        });

        bully.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Bully.class);
                startActivity(i);
            }
        });

        gtasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Gtasa.class);
                startActivity(i);
            }
        });
    }
}