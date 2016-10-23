package com.example.administrator.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class huay extends AppCompatActivity {

    Random ran = new Random();
    int number = 0;
    String m ;

    public String getRandomtwoDigits(){
        number = ran.nextInt(100);
        m = Integer.toString(number);
        if(number<10){
            m = "0"+m;
        }
        return m;
    }
    public String getRandomthreeDigits(){
        number = ran.nextInt(1000);
        m = Integer.toString(number);
        if(number<10){
            m="00"+m;
        }
        else if (number<100){
            m="0"+m;
        }
        return m;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huay);
        Button randombutton2 = (Button) findViewById(R.id.button_two);
        randombutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(huay.this,display.class);
                x.putExtra("text","lll");
                x.putExtra("num",getRandomtwoDigits());
                startActivity(x);
            }
        });

        Button randombutton3 = (Button) findViewById(R.id.button_three);
        randombutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(huay.this,display.class);
                x.putExtra("text","เลขท้าย3ตัว");
                x.putExtra("num",getRandomthreeDigits());
                startActivity(x);
            }
        });
    }
}
