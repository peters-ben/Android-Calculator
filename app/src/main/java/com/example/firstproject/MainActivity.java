package com.example.firstproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addButton = findViewById(R.id.addButton);
        Button subtractButton = findViewById(R.id.SubtractButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = findViewById(R.id.secondNumEditText);
                TextView resultTextView = findViewById(R.id.resultTextView);
                if (firstNumEditText.getText().toString().equals("") || secondNumEditText.getText().toString().equals("")) {
                    resultTextView.setText("Try again!");
                } else {
                    BigDecimal num1 = new BigDecimal(firstNumEditText.getText().toString());
                    BigDecimal num2 = new BigDecimal(secondNumEditText.getText().toString());
                    BigDecimal sum = num1.add(num2);
                    resultTextView.setText("Answer\n " + sum);
                }
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = findViewById(R.id.secondNumEditText);
                TextView resultTextView = findViewById(R.id.resultTextView);
                if (firstNumEditText.getText().toString().equals("") || secondNumEditText.getText().toString().equals("")) {
                    resultTextView.setText("Try again!");
                } else {
                    BigDecimal num1 = new BigDecimal(firstNumEditText.getText().toString());
                    BigDecimal num2 = new BigDecimal(secondNumEditText.getText().toString());
                    BigDecimal diff = num1.subtract(num2);

                    resultTextView.setText("Answer\n " + diff);
                }
            }
        });
    }
}

