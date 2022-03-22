package com.example.munchkin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PlayerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_view);

        getSupportActionBar().hide();
    }
}