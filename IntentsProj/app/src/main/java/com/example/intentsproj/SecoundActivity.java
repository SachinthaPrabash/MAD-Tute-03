package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {

    private EditText Number1, Number2;
    private Button plus,min,multi,dive;
    private TextView txt;


    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);

        Number1 = findViewById(R.id.number1);
        Number2 = findViewById(R.id.number2);
        txt = findViewById(R.id.ans);
        plus = findViewById(R.id.button1);
        min = findViewById(R.id.button2);
        multi = findViewById(R.id.button3);
        dive = findViewById(R.id.button4);

        Number1.setText(getIntent().getStringExtra("tx1"));
        Number2.setText(getIntent().getStringExtra("tx2"));

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               num1 = Integer.parseInt(Number1.getText().toString());
               num2 = Integer.parseInt(Number2.getText().toString());

                int result = num1 + num2;
               txt.setText(num1+" + "+ num2 + " = "+String.valueOf(result));

            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());

                int result = num1 - num2;
                txt.setText(num1+" - "+ num2 + " = "+String.valueOf(result));

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());

                int result = num1 * num2;
                txt.setText(num1+" * "+ num2 + " = "+ String.valueOf(result));

            }
        });

        dive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(Number1.getText().toString());
                num2 = Integer.parseInt(Number2.getText().toString());

                float result= (float)num1 / num2;
                txt.setText(num1 +" / "+ num2 + " = "+String.valueOf(result));

            }
        });

    }
}
