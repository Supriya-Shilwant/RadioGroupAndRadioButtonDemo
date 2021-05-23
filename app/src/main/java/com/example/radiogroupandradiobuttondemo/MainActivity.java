package com.example.radiogroupandradiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
   RadioGroup rgLanguages;
   Button btnReset,btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgLanguages = findViewById(R.id.rgLanguages);
        btnReset = findViewById(R.id.btnReset);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkId = rgLanguages.getCheckedRadioButtonId();
                if (checkId== -1){
                    //No radio buttons are checked
                    Message.message(getApplicationContext(),"Please select a language.");
                }else{
                    //One of the radio button is checked.
                    findRadioButton(checkId);
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rgLanguages.clearCheck();
            }
        });
    }

    private void findRadioButton(int checkId) {
        switch (checkId){
            case R.id.radioButton:
                Message.message(getApplicationContext(),"I Like Android.");
                break;

            case R.id.radioButton2:
                Message.message(getApplicationContext(),"I Like Java.");
                break;

            case R.id.radioButton3:
                Message.message(getApplicationContext(),"I Like C++.");
                break;

            case R.id.radioButton4:
                Message.message(getApplicationContext(),"I Like PHP.");
                break;
            case R.id.radioButton5:
                Message.message(getApplicationContext(),"I Like Python.");
                break;

        }
    }
}