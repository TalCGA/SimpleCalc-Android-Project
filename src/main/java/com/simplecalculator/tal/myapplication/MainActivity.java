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

    //Checks if the txtbox(user's number) is null
    private boolean isEmpty(EditText txt_temp) {
        return txt_temp.getText().toString().trim().length() == 0;
    }

    public void onButtonClick(View v) {

        boolean flag=false;             //Helps to remove Null errors for the next compute
        EditText temp_num1 = (EditText) findViewById(R.id.txt1);
        EditText temp_num2 = (EditText) findViewById(R.id.txt2);

        TextView result = (TextView) findViewById(R.id.txt4_res);

        //NULL checks
        if (isEmpty(temp_num1)){
            temp_num1.setError("Fill in two of the chosen numbers!");
            flag=true;
            result.setText(""); //Set the result up to NULL
        }
        if(isEmpty(temp_num2)) {
            temp_num2.setError("Fill in two of the chosen numbers!");
            result.setText(""); //Set the result up to NULL
            flag=true;
        }
        if(flag==true) {
            flag = false;
            return;
        }

        //The parse & compute
        int num1 = Integer.parseInt(temp_num1.getText().toString());
        int num2 = Integer.parseInt(temp_num2.getText().toString());

        int sum = num1 + num2;
        result.setText(Integer.toString(sum));
    }

}
