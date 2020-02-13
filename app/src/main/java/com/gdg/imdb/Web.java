package com.gdg.imdb;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Web extends AppCompatActivity {

    Button w1,w2,w3,w4,w5,w6,w7,w8,w9,w10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        w1 = (Button)findViewById(R.id.b1);
        w2 = (Button)findViewById(R.id.b2);
        w3 = (Button)findViewById(R.id.b3);
        w4 = (Button)findViewById(R.id.b4);
        w5 = (Button)findViewById(R.id.b5);
        w6 = (Button)findViewById(R.id.b6);
        w7 = (Button)findViewById(R.id.b7);
        w8 = (Button)findViewById(R.id.b8);
        w9 = (Button)findViewById(R.id.b9);
        w10 = (Button)findViewById(R.id.b10);

        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Web.this,wb1.class);
                startActivity(i);
            }
        });

        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j = new Intent(Web.this,wb2.class);
                startActivity(j);

            }
        });

        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent k = new Intent(Web.this,wb3.class);
                startActivity(k);

            }
        });

        w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent m = new Intent(Web.this,wb4.class);
                startActivity(m);

            }
        });

        w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(Web.this,wb5.class);
                startActivity(n);

            }
        });

        w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(Web.this,wb6.class);
                startActivity(n);

            }
        });

        w7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(Web.this,wb7.class);
                startActivity(n);

            }
        });

        w8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(Web.this,wb8.class);
                startActivity(n);

            }
        });

        w9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(Web.this,wb9.class);
                startActivity(n);

            }
        });

        w10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent n = new Intent(Web.this,wb10.class);
                startActivity(n);

            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent o = new Intent(Web.this,review.class);
                startActivity(o);
            }
        });


    }

}
