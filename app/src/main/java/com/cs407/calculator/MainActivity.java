package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        String firstNumberStr = firstNumber.getText().toString();
        String secondNumberStr = secondNumber.getText().toString();

        Float firstNumberInt = Float.parseFloat(firstNumberStr);
        Float secondNumberInt = Float.parseFloat(secondNumberStr);
        Float result = firstNumberInt + secondNumberInt;
        newWindow(result.toString());
    }

    public void minus(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        String firstNumberStr = firstNumber.getText().toString();
        String secondNumberStr = secondNumber.getText().toString();

        Float firstNumberInt = Float.parseFloat(firstNumberStr);
        Float secondNumberInt = Float.parseFloat(secondNumberStr);
        Float result = firstNumberInt - secondNumberInt;
        newWindow(result.toString());
    }

    public void mult(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        String firstNumberStr = firstNumber.getText().toString();
        String secondNumberStr = secondNumber.getText().toString();

        Float firstNumberInt = Float.parseFloat(firstNumberStr);
        Float secondNumberInt = Float.parseFloat(secondNumberStr);
        Float result = firstNumberInt * secondNumberInt;
        newWindow(result.toString());
    }

    public void divi(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);

        String firstNumberStr = firstNumber.getText().toString();
        String secondNumberStr = secondNumber.getText().toString();

        Float firstNumberInt = Float.parseFloat(firstNumberStr);
        Float secondNumberInt = Float.parseFloat(secondNumberStr);

        if (secondNumberInt == 0) {
            newWindow("Division by Zero Error");
        } else {
            Float result = firstNumberInt / secondNumberInt;
            newWindow(result.toString());
        }
    }

    public void newWindow(String s) {
        Intent intent = new Intent(this, popUp.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}