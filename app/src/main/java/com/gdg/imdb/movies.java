package com.gdg.imdb;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class movies extends AppCompatActivity {

    Button m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        m1 = (Button)findViewById(R.id.b1);
        m2 = (Button)findViewById(R.id.b2);
        m3 = (Button)findViewById(R.id.b3);
        m4 = (Button)findViewById(R.id.b4);
        m5 = (Button)findViewById(R.id.b5);
        m6 = (Button)findViewById(R.id.b6);
        m7 = (Button)findViewById(R.id.b7);
        m8 = (Button)findViewById(R.id.b8);
        m9 = (Button)findViewById(R.id.b9);
        m10 = (Button)findViewById(R.id.b10);

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(movies.this,mv1.class);
                startActivity(i);

            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j = new Intent(movies.this,mv2.class);
                startActivity(j);

            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k = new Intent(movies.this,mv3.class);
                startActivity(k);

            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent m = new Intent(movies.this,mv4.class);
                startActivity(m);

            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(movies.this,mv5.class);
                startActivity(n);

            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(movies.this,mv6.class);
                startActivity(n);

            }
        });
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(movies.this,mv7.class);
                startActivity(n);

            }
        });
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(movies.this,mv8.class);
                startActivity(n);

            }
        });
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(movies.this,mv9.class);
                startActivity(n);

            }
        });
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(movies.this,mv10.class);
                startActivity(n);

            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent o = new Intent(movies.this,review.class);
                startActivity(o);
            }
        });

    }

}
