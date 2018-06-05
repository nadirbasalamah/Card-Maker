package com.example.android.happybirthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Nadir Basalamah on 1/19/2018.
 */

public class PrimaryActivity extends AppCompatActivity{
    public static final String MESSAGE_FROM = "com.example.android.FROM";
    public static final String MESSAGE_TO = "com.example.android.TO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
    }
    public void createBirthdayCard(View v) {
        EditText fromText = findViewById(R.id.from_edit_text);
        EditText toText = findViewById(R.id.to_edit_text);
        String from = fromText.getText().toString();
        String to = toText.getText().toString();
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra(MESSAGE_FROM,from);
        intent.putExtra(MESSAGE_TO,to);
        startActivity(intent);
    }
    public void createCongratulationCard(View v) {
        EditText fromText = findViewById(R.id.from_edit_text);
        EditText toText = findViewById(R.id.to_edit_text);
        String from = fromText.getText().toString();
        String to = toText.getText().toString();
        Intent intent = new Intent(this,CongratsActivity.class);
        intent.putExtra(MESSAGE_FROM,from);
        intent.putExtra(MESSAGE_TO,to);
        startActivity(intent);
    }
}
