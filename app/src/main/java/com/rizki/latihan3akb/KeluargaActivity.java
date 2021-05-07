package com.rizki.latihan3akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// Kamis 6 Mei 2021 Membuat activity kode keluarga 10118025 Rizki Restu Illahi IF-1
public class KeluargaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keluarga);
    }

    public void moveBiodata(View view) {
        Intent intent = new Intent(KeluargaActivity.this, BiodataActivity.class);
        startActivity(intent);
    }
}