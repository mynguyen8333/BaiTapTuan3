package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Screen_2 extends AppCompatActivity {
    Button btn_xanh,btn_do,btn_den,btn_xanhduong,btn_xong;
    TextView txtMau,txtGia;
    String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_2);
        btn_xanh = findViewById(R.id.btnXanhDuong);
        btn_do = findViewById(R.id.btnDo);
        btn_den = findViewById(R.id.btnDen);
        btn_xanhduong = findViewById(R.id.btnXanhDam);
        btn_xong = findViewById(R.id.btnXong);
        txtGia = findViewById(R.id.txtGia);
        txtMau = findViewById(R.id.txtMau);
        ImageView img = (ImageView) findViewById(R.id.imageDT);
        btn_xanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.vs_bac);
                txtMau.setText("Màu: bạc");
                txtGia.setText("1.780.000đ");
            }
        });

        btn_do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.vs_red_a);
                txtMau.setText("Màu: đỏ");
                txtGia.setText("1.790.000đ");
            }
        });

        btn_den.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.vsmart_black);
                txtMau.setText("Màu: đen");
                txtGia.setText("1.760.000đ");
            }
        });

        btn_xanhduong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.vsmart_xanh);
                txtMau.setText("Màu: xanh");
                txtGia.setText("1.800.000đ");
            }
        });

        btn_xong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDatHang();
            }
        });
    }


    public void openDatHang(){
        txtMau = findViewById(R.id.txtMau);
        text = txtMau.getText().toString();
//        System.out.println(text);
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("Value",text);
        startActivity(intent);
    }

}