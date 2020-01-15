package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button plus;
    Button minus;
    TextView dollarCount;
    TextView alert;
    int dollars=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus =(Button)findViewById(R.id.plusOne);
        minus =(Button)findViewById(R.id.minusOne);
        dollarCount =(TextView)findViewById(R.id.dollarCount);
        alert =(TextView)findViewById(R.id.alert);

        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v==plus) {
            dollars++;
            dollarCount.setText("Dollar Count: " + dollars + "$");
        }
        if(v==minus){
            if(dollars>0) {
                dollars--;
                dollarCount.setText("Dollar Count: " + dollars + "$");
            }
            if(dollars==0){

                alert.setText("YOU CAN'T GO UNDER ZERO!!!!");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                alert.setText("");

            }
        }
        }
}
