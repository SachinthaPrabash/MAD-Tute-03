package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button button;
    EditText editText1, editText2;

    String toast = "sending message...";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editText1 = (EditText) findViewById(R.id.tx1);
        editText2 = (EditText) findViewById(R.id.tx2);
        button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();
                Intent intent = new Intent(FirstActivity.this, SecoundActivity.class);
                intent.putExtra("tx1", num1);
                intent.putExtra( "tx2", num2);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),toast,Toast.LENGTH_SHORT).show();
            }
        });
    }
}