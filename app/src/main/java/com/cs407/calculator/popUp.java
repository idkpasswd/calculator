package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class popUp extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up);

        textView = (TextView) findViewById(R.id.textView);

        Intent intent=getIntent();
        String str = (String) intent.getStringExtra("message");
        textView.setText(str);
    }
}