package com.rizki.latihan3akb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
// jumat 7 Mei 2021 Membuat activity biodata 10118025 Rizki Restu Illahi IF-1
public class BiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void moveHome(View view) {
        EditText editText = findViewById(R.id.etnama);
        String name = editText.getText().toString();

        Intent intent = new Intent(BiodataActivity.this, HomeActivity.class);
        intent.putExtra(HomeActivity.EXTRA_NAME, name);
        startActivity(intent);
    }
}