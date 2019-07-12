package com.example.clicking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toats = Toast.makeText(MainActivity.this,"This is Toast Message ", Toast.LENGTH_SHORT);
        toats.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast toats = Toast.makeText(MainActivity.this,"This is Start ", Toast.LENGTH_SHORT);
        toats.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast toats = Toast.makeText(MainActivity.this,"This is Stop ", Toast.LENGTH_SHORT);
        toats.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast toats = Toast.makeText(MainActivity.this,"This is Resume ", Toast.LENGTH_SHORT);
        toats.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toats = Toast.makeText(MainActivity.this,"This is Destory ", Toast.LENGTH_SHORT);
        toats.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast toats = Toast.makeText(MainActivity.this,"This is Pause ", Toast.LENGTH_SHORT);
        toats.show();
    }

}
