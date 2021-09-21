package com.example.lab_2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void add(View view) {
        EditText firstTextField = (EditText) findViewById(R.id.firstTextNumber);
        EditText secondTextField = (EditText) findViewById(R.id.secondTextNumber);

        int result = Integer.parseInt(firstTextField.getText().toString()) + Integer.parseInt(secondTextField.getText().toString());

        goToActivity2("" + result);
    }

    public void subtract(View view) {
        EditText firstTextField = (EditText) findViewById(R.id.firstTextNumber);
        EditText secondTextField = (EditText) findViewById(R.id.secondTextNumber);

        int result = Integer.parseInt(firstTextField.getText().toString()) - Integer.parseInt(secondTextField.getText().toString());

        goToActivity2("" + result);
    }

    public void multiply(View view) {
        EditText firstTextField = (EditText) findViewById(R.id.firstTextNumber);
        EditText secondTextField = (EditText) findViewById(R.id.secondTextNumber);

        int result = Integer.parseInt(firstTextField.getText().toString()) * Integer.parseInt(secondTextField.getText().toString());

        goToActivity2("" + result);
    }

    public void divide(View view) {
        EditText firstTextField = (EditText) findViewById(R.id.firstTextNumber);
        EditText secondTextField = (EditText) findViewById(R.id.secondTextNumber);

        int result = Integer.parseInt(firstTextField.getText().toString()) / Integer.parseInt(secondTextField.getText().toString());

        goToActivity2("" + result);
    }

    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}