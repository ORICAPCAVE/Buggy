package com.example.buggy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.buggy.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button4;
    Button button5;
    Button button14;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, rules_activity.class);
                startActivity(intent);
            }

        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, dedication_page_activity.class);
                startActivity(intent);
            }
        });
        // button14=(Button) findViewById(R.id.button14);
        //button14.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View v) {
        // TODO Auto-generated method stub
        //   finish();
        //  System.exit(0);
        //  Intent intent = new Intent(Intent.ACTION_MAIN);
        //intent.addCategory(Intent.CATEGORY_HOME);
        // intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //startActivity(intent);
    }}










