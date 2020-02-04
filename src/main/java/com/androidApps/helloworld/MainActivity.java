package com.androidApps.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // create handler for the page2 button

    public void nextPage(View view){
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }
}
