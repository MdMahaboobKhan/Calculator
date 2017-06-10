package com.example.sufiyankhan.calculator;

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

    protected void add(View view)
    {
        //getting input and output controls
        EditText input1 = (EditText)findViewById(R.id.AText);
        EditText input2 = (EditText)findViewById(R.id.BText);
        TextView output = (TextView)findViewById(R.id.resVal);

        //processing the data
        int a = Integer.valueOf(input1.getText().toString());
        int b = Integer.valueOf(input2.getText().toString());
        int result = a+b;
        String formattedresult = String.format("%d",result);
        output.setText("Result : "+formattedresult);

    }

    protected void sub(View view)
    {
        //getting input and output controls
        EditText input1 = (EditText)findViewById(R.id.AText);
        EditText input2 = (EditText)findViewById(R.id.BText);
        TextView output = (TextView)findViewById(R.id.resVal);

        //processing the data
        int a = Integer.valueOf(input1.getText().toString());
        int b = Integer.valueOf(input2.getText().toString());
        int result = a-b;
        String formattedresult = String.format("%d",result);
        output.setText("Result : "+formattedresult);

    }

    protected void mul(View view)
    {
        //getting input and output controls
        EditText input1 = (EditText)findViewById(R.id.AText);
        EditText input2 = (EditText)findViewById(R.id.BText);
        TextView output = (TextView)findViewById(R.id.resVal);

        //processing the data
        int a = Integer.valueOf(input1.getText().toString());
        int b = Integer.valueOf(input2.getText().toString());
        int result = a*b;
        String formattedresult = String.format("%d",result);
        output.setText("Result : "+formattedresult);

    }

    protected void div(View view)
    {
        //getting input and output controls
        EditText input1 = (EditText)findViewById(R.id.AText);
        EditText input2 = (EditText)findViewById(R.id.BText);
        TextView output = (TextView)findViewById(R.id.resVal);

        //processing the data
        int a = Integer.valueOf(input1.getText().toString());
        int b = Integer.valueOf(input2.getText().toString());
        try{
            int result = a/b;
            String formattedresult = String.format("%d",result);
            output.setText("Result : "+formattedresult);
        }
        catch(ArithmeticException ae)
        {
            output.setText("Math Error");
        }

    }

}
