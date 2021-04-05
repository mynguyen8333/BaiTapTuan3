package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnChonMau;
    private String text = "Màu: xanh";
    TextView txtTien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.imgAnh);
        txtTien = findViewById(R.id.txtTien);


        text = "Màu: xanh";
        if (getIntent().getStringExtra("Value") != null){
            text = getIntent().getStringExtra("Value");
        }
        if (text.equalsIgnoreCase("Màu: xanh")) {
            img.setImageResource(R.drawable.vsmart_xanh);
            txtTien.setText("1.800.000đ");
        } else if (text.equalsIgnoreCase("Màu: đỏ")) {
            img.setImageResource(R.drawable.vs_red_a);
            txtTien.setText("1.790.000đ");
        } else if (text.equalsIgnoreCase("Màu: bạc")) {
            img.setImageResource(R.drawable.vs_bac);
            txtTien.setText("1.780.000đ");
        } else if (text.equalsIgnoreCase("Màu: đen")) {
            img.setImageResource(R.drawable.vsmart_black);
            txtTien.setText("1.760.000đ");
        }


        btnChonMau = findViewById(R.id.btnChonMau);
        btnChonMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChonMau();
            }
        });

    }

    public void ChonMau() {
        Intent intent = new Intent(this, Screen_2.class);
        startActivity(intent);
    }


}