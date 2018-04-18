package com.simplecalculator.tal.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {

        EditText temp_num1 = (EditText) findViewById(R.id.txt1);
        EditText temp_num2 = (EditText) findViewById(R.id.txt2);

        TextView result = (TextView) findViewById(R.id.txt4_res);

        int num1 = Integer.parseInt(temp_num1.getText().toString());
        int num2 = Integer.parseInt(temp_num2.getText().toString());

        int sum = num1 + num2;
        result.setText(Integer.toString(sum));
    }

}
