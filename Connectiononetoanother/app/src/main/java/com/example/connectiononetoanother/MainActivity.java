package com.example.connectiononetoanother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but,but2;
        //expilict

        but=findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intern = new Intent(MainActivity.this,Second.class);
                intern.putExtra("data","hello welcome ");//sending data one to another
                startActivity(intern);
            }
        });
        but2=findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intern = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                 startActivity(intern);
            }
        });
    }
}
