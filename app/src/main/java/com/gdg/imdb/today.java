package com.gdg.imdb;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class today extends AppCompatActivity {

    public void in11(View view)
    {
        Intent i = new Intent(today.this,i1.class);
        startActivity(i);
    }
    public void in22(View view)
    {
        Intent i = new Intent(today.this,i2.class);
        startActivity(i);
    }
    public void in33(View view)
    {
        Intent i = new Intent(today.this,i3.class);
        startActivity(i);
    }
    public void in44(View view)
    {
        Intent i = new Intent(today.this,i4.class);
        startActivity(i);
    }
    public void in55(View view)
    {
        Intent i = new Intent(today.this,i5.class);
        startActivity(i);
    }
    public void in66(View view)
    {
        Intent i = new Intent(today.this,i6.class);
        startActivity(i);
    }
    public void in77(View view)
    {
        Intent i = new Intent(today.this,i7.class);
        startActivity(i);
    }
    public void in88(View view)
    {
        Intent i = new Intent(today.this,i8.class);
        startActivity(i);
    }
    public void in99(View view)
    {
        Intent i = new Intent(today.this,i9.class);
        startActivity(i);
    }
    public void in101(View view)
    {
        Intent i = new Intent(today.this,i10.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(today.this,review.class);
                startActivity(o);
            }
        });
    }

}
