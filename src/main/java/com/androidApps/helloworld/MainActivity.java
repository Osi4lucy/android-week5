package com.androidApps.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creaate handler for the page2 button

        public void goToPage2(View view){
            Intent intent = new Intent(this, Page2.class);
            startActivity(intent);
        }
    }
}
