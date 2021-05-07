package com.rizki.latihan3akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
// Jumat 7 Mei 2021 Membuat activity home 10118025 Rizki Restu Illahi IF-1
public class HomeActivity extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView textView = findViewById(R.id.tv1);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String text = "Beres ! Sekarang " + name + " udah bisa ngecek penggunaan HP " + name + " tiap hari buat bantu " + name + " ngatur waktu :)";
        textView.setText(text);
    }

    public void finish(View view) {
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}