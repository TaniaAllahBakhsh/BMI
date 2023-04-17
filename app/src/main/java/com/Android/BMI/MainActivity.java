package com.Android.BMI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit_weight, edit_height, edit_height_inches;
        Button button;
        TextView textView;

        edit_weight = findViewById(R.id.editweight);
        edit_height = findViewById(R.id.editheight);
        edit_height_inches = findViewById(R.id.editheightinches);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(view -> {
          int wt=Integer.parseInt(edit_weight.getText().toString());
          int hf=Integer.parseInt(edit_height.getText().toString());
          int hi=Integer.parseInt(edit_height_inches.getText().toString());

          int total_in=(hf*12)+hi;
          double total_cn=(total_in)*2.53;
          double total_Mtr=(total_cn)/100;
          double bmi=wt/(total_Mtr*total_Mtr);
          if(bmi>25)
          {
           textView.setText(R.string.OW);

          }
          else if (bmi<18)
          {
              textView.setText(R.string.UW);
          }
          else
          {
              textView.setText(R.string.H);
          }
          }


        );




    }
}