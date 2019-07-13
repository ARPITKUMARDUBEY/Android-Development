package com.example.connectiononetoanother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tx;
        tx=findViewById(R.id.textView);

        Intent rec = getIntent();
        String value=rec.getStringExtra("data");

        tx.setText(value);
    }
}
