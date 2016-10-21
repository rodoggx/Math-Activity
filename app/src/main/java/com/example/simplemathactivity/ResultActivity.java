package com.example.simplemathactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mTextView = (TextView) findViewById(R.id.textVw);
        int result = getIntent().getIntExtra("RESULT", 0);
        mTextView.setText(String.valueOf(result));

    }
}
