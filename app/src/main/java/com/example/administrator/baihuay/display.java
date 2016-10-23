package com.example.administrator.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent z = getIntent();
        String name = z.getStringExtra("text");
        String number = z.getStringExtra("num");

        TextView huayname = (TextView) findViewById(R.id.textView_one);
        huayname.setText(name);
        TextView huaynumber = (TextView) findViewById(R.id.textView_two);
        huaynumber.setText(number);

    }
}
