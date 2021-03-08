package com.example.demo_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView result_text;
    private EditText num1_edit;
    private EditText num2_edit;
    //main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void countClick(View view) {

        num1_edit=findViewById(R.id.num1_edit);
        num2_edit=findViewById(R.id.num2_edit);
        result_text=findViewById(R.id.result_text);

        //Float num1=Float.parseFloat(num1_edit.getText().toString());
        //Float num2=Float.parseFloat(num2_edit.getText().toString());

        try {
            Integer num1 =Integer.parseInt(num1_edit.getText().toString());
            Integer num2 =Integer.parseInt(num2_edit.getText().toString());

            //Float result=num1+num2;
            Integer result=num1+num2;
            result_text.setText(String.valueOf(result));

        }catch (Exception e){
            String error="please enter integer";
            //System.out.println((e.getMessage()));//get error message
            result_text.setText(error);
        }


    }
}