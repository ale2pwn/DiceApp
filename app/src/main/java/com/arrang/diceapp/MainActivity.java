package com.arrang.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button rollbutton = findViewById(R.id.buttonroll);
    TextView result = findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollbutton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                result.setText(roll());
            }
        });
    }

    public String roll(){
        Random rand = new Random();
        String returnText = "";
        int randint = rand.nextInt(6);
        switch(randint)
        {
            case 0:
                returnText.equals("You Rolled a 1!");
            case 1:
                returnText.equals("You Rolled a 2!");
            case 2:
                returnText.equals("You Rolled a 3!");
            case 3:
                returnText.equals("You Rolled a 4!");
            case 4:
                returnText.equals("You Rolled a 5!");
            case 5:
                returnText.equals("You Rolled a 6!");



        }
        return returnText;

    }
}
