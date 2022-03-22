package com.example.munchkin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView img_Player1;
    ImageView img_Player2;
    ImageView img_Player3;
    ImageView img_Player4;
    ImageView img_Player5;
    ImageView img_Player6;

    EditText tx_Player1_name;
    EditText tx_Player2_name;
    EditText tx_Player3_name;
    EditText tx_Player4_name;
    EditText tx_Player5_name;
    EditText tx_Player6_name;

    Button btn_play;

    int tap1 = 0;
    int tap2 = 0;
    int tap3 = 0;
    int tap4 = 0;
    int tap5 = 0;
    int tap6 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_Player1 = findViewById(R.id.iv_Player1);
        img_Player2 = findViewById(R.id.iv_Player2);
        img_Player3 = findViewById(R.id.iv_Player3);
        img_Player4 = findViewById(R.id.iv_Player4);
        img_Player5 = findViewById(R.id.iv_Player5);
        img_Player6 = findViewById(R.id.iv_Player6);

        tx_Player1_name = findViewById(R.id.PLayer1_name);
        tx_Player2_name = findViewById(R.id.PLayer2_name);
        tx_Player3_name = findViewById(R.id.PLayer3_name);
        tx_Player4_name = findViewById(R.id.PLayer4_name);
        tx_Player5_name = findViewById(R.id.PLayer5_name);
        tx_Player6_name = findViewById(R.id.PLayer6_name);

        btn_play = findViewById(R.id.btn_play);

        getSupportActionBar().hide(); //Title bar is not showing

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int player = 0;

                if(!isEmpty(tx_Player1_name)){
                    player++;
                }
                if(!isEmpty(tx_Player2_name)){
                    player++;
                }
                if(!isEmpty(tx_Player3_name)){
                    player++;
                }
                if(!isEmpty(tx_Player4_name)){
                    player++;
                }
                if(!isEmpty(tx_Player5_name)){
                    player++;
                }
                if(!isEmpty(tx_Player6_name)){
                    player++;
                }

                if(player > 2) {
                    Intent intent = new Intent(MainActivity.this, PlayerView.class);
                    startActivity(intent);
                }else{
                    showMessage("Nincs elég játékos! Minimum 3 kell!");
                }

            }
        });

        img_Player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tap1%2==0) {
                    img_Player1.setImageResource(R.drawable.munchkin_w);
                }else{
                    img_Player1.setImageResource(R.drawable.munchkin_m);
                }
                tap1++;
            }
        });

        img_Player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tap2 % 2 == 0) {
                    img_Player2.setImageResource(R.drawable.munchkin_w);
                }else{
                    img_Player2.setImageResource(R.drawable.munchkin_m);
                }
                tap2++;
            }
        });

        img_Player3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tap3%2==0) {
                    img_Player3.setImageResource(R.drawable.munchkin_w);
                }else{
                    img_Player3.setImageResource(R.drawable.munchkin_m);
                }
                tap3++;
            }
        });

        img_Player4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tap4%2==0) {
                    img_Player4.setImageResource(R.drawable.munchkin_w);
                }else{
                    img_Player4.setImageResource(R.drawable.munchkin_m);
                }
                tap4++;
            }
        });

        img_Player5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tap5%2==0) {
                    img_Player5.setImageResource(R.drawable.munchkin_w);
                }else{
                    img_Player5.setImageResource(R.drawable.munchkin_m);
                }
                tap5++;
            }
        });

        img_Player6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tap6%2==0) {
                    img_Player6.setImageResource(R.drawable.munchkin_w);
                }else{
                    img_Player6.setImageResource(R.drawable.munchkin_m);
                }
                tap6++;
            }
        });
    }
    private void showMessage(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
}