package com.example.android.happybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String greeting = "Happy Birthday, " + intent.getStringExtra(PrimaryActivity.MESSAGE_TO) + "!";
        String from = "From, " + intent.getStringExtra(PrimaryActivity.MESSAGE_FROM);
        TextView greetingTextView = findViewById(R.id.greeting_text_view);
        TextView fromTextView = findViewById(R.id.from_text_view);
        greetingTextView.setText(greeting);
        fromTextView.setText(from);
    }
}