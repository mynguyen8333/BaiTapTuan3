package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen_2 extends AppCompatActivity {
    Button btn_xanh,btn_do,btn_den,btn_xanhduong,btn_xong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_);
        btn_xanh = findViewById(R.id.button3);
        btn_do = findViewById(R.id.button7);
        btn_den = findViewById(R.id.button8);
        btn_xanhduong = findViewById(R.id.button9);
        btn_xong = findViewById(R.id.button10);

        btn_xanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}