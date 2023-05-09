package com.example.buggy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    Button button5;
    Button button10;
    Button button13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), settingsActivity.class);
                startActivity(intent);

            }
        });

       // button10= (Button) findViewById(R.id.button10);
       // button10.setOnClickListener(new );
       //   This method will start the Buggy app in bug listening mode
       //   and count bugs while the word bug or buggy is mentioned in by the
       //   the users own voice. A toast message will be generated letting
       //   the user know the battery usage will be more and that other users
        //  who have been logged on the buggy app in the users group will be
        //  appraised of the users bug tallies.
        //
       // });
        button10 = (Button) findViewById(R.id.button10);


        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
    });


}}





















