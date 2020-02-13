package com.gdg.imdb;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void m11(View view)
    {
      Intent i = new Intent(MainActivity.this,mv1.class);
      startActivity(i);
    }
    public void m22(View view)
    {
        Intent i = new Intent(MainActivity.this,mv2.class);
        startActivity(i);
    }
    public void m33(View view)
    {
        Intent i = new Intent(MainActivity.this,mv3.class);
        startActivity(i);
    }
    public void m44(View view)
    {
        Intent i = new Intent(MainActivity.this,mv4.class);
        startActivity(i);
    }
    public void m55(View view)
    {
        Intent i = new Intent(MainActivity.this,mv5.class);
        startActivity(i);
    }
    public void w11(View view)
    {
        Intent i = new Intent(MainActivity.this,wb1.class);
        startActivity(i);
    }
    public void w22(View view)
    {
        Intent i = new Intent(MainActivity.this,wb2.class);
        startActivity(i);
    }
    public void w33(View view)
    {
        Intent i = new Intent(MainActivity.this,wb3.class);
        startActivity(i);
    }
    public void w44(View view)
    {
        Intent i = new Intent(MainActivity.this,wb4.class);
        startActivity(i);
    }
    public void w55(View view)
    {
        Intent i = new Intent(MainActivity.this,wb5.class);
        startActivity(i);
    }
    public void in11(View view)
    {
        Intent i = new Intent(MainActivity.this,i1.class);
        startActivity(i);
    }
    public void in22(View view)
    {
        Intent i = new Intent(MainActivity.this,i2.class);
        startActivity(i);
    }
    public void in33(View view)
    {
        Intent i = new Intent(MainActivity.this,i3.class);
        startActivity(i);
    }
    public void in44(View view)
    {
        Intent i = new Intent(MainActivity.this,i4.class);
        startActivity(i);
    }
    public void in55(View view)
    {
        Intent i = new Intent(MainActivity.this,i5.class);
        startActivity(i);
    }
    public void r11(View view)
    {
        Intent i = new Intent(MainActivity.this,rd1.class);
        startActivity(i);
    }
    public void r22(View view)
    {
        Intent i = new Intent(MainActivity.this,rd2.class);
        startActivity(i);
    }

    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        b1 = (Button)findViewById(R.id.mov);
        b2 = (Button)findViewById(R.id.web);
        b3 = (Button)findViewById(R.id.in);
        b4 = (Button)findViewById(R.id.top);
        b5 = (Button)findViewById(R.id.celeb);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j =new Intent(MainActivity.this,movies.class);
                startActivity(j);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j =new Intent(MainActivity.this,Web.class);
                startActivity(j);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j =new Intent(MainActivity.this,today.class);
                startActivity(j);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j =new Intent(MainActivity.this,top.class);
                startActivity(j);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent j =new Intent(MainActivity.this,celebs.class);
                startActivity(j);

            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent o = new Intent(MainActivity.this,review.class);
                startActivity(o);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement



        return super.onOptionsItemSelected(item);
    }
}
