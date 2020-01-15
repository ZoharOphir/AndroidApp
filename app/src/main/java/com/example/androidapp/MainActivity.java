package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button plus;
    Button upgrade;
    TextView dollarCount;
    TextView dollarPerclick;
    int upgradecost=20;
    int dollarsPerclick=1;
    int dollars=0;
    int dollarsAlltime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus =(Button)findViewById(R.id.plusOne);
        upgrade =(Button)findViewById(R.id.upgradeOne);
        dollarCount =(TextView)findViewById(R.id.dollarCount);
        dollarPerclick =(TextView)findViewById(R.id.dollarperclick);

        plus.setOnClickListener(this);
        upgrade.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == plus) {
            dollars+=dollarsPerclick;
            dollarCount.setText("Dollar Count: " + dollars + "$");
        }
        if(v == upgrade){
            if(dollars>=upgradecost){
                dollars-=upgradecost;
                upgradecost*=5;
                dollarsPerclick++;
                upgrade.setText("CLICK TO UPGRADE                        COST:"+upgradecost);
                dollarCount.setText("Dollar Count: " + dollars + "$");
                dollarPerclick.setText("DOLLARS PER CLICK:"+dollarsPerclick);
            }

        }
    }
}
