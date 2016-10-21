package com.example.simplemathactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private String mNumber;
    private int mTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = (EditText) findViewById(R.id.eTxt);
    }

    public void power2(View view) {
        Intent mIntent = new Intent(this, ResultActivity.class);
        mNumber = mEditText.getText().toString();
        int number = Integer.parseInt(mNumber);
        mTotal = number * number;
        mIntent.putExtra("RESULT", mTotal);
        startActivity(mIntent);
    }

    public void power3(View view) {
        Intent mIntent = new Intent(this, ResultActivity.class);
        mNumber = mEditText.getText().toString();
        int number = Integer.parseInt(mNumber);
        mTotal = number * number * number;
        mIntent.putExtra("RESULT", mTotal);
        startActivity(mIntent);
    }

    public void power4(View view) {
        Intent mIntent = new Intent(this, ResultActivity.class);
        mNumber = mEditText.getText().toString();
        int number = Integer.parseInt(mNumber);
        mTotal = number * number * number * number;
        mIntent.putExtra("RESULT", mTotal);
        startActivity(mIntent);
    }
}
