package com.example.android.happybirthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Nadir Basalamah on 1/19/2018.
 */

public class CongratsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congrats);
        Intent intent = getIntent();
        String greeting = "Congratulations, " + intent.getStringExtra(PrimaryActivity.MESSAGE_TO) + "!";
        String from = "From, " + intent.getStringExtra(PrimaryActivity.MESSAGE_FROM);
        TextView greetingTextView = findViewById(R.id.congrats_text_view);
        TextView fromTextView = findViewById(R.id.from_text_view2);
        greetingTextView.setText(greeting);
        fromTextView.setText(from);
    }
}
