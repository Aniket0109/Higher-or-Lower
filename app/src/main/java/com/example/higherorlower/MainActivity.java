package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int magicalNumber;
    public void generateRandomNumber(){
        magicalNumber = (int)(Math.random() * 20 + 1);
    }

    public void click(View view){
        EditText number = (EditText)findViewById(R.id.number);
        int userNumber = Integer.parseInt(number.getText().toString());
        String message;
        if (userNumber<magicalNumber){
            message = "HIGHER!!";
        } else if(userNumber>magicalNumber){
            message="LOWER!!";
        } else {
            message = "You got it right, Try again!!!";
            generateRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}