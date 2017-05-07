package com.minghao.yu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("hello");
        int a = 0;
        String str= "hello";
        a++;
        str += " world";
        Log.i("dddd","yerrrrrrrr");
        TextView hello = (TextView) findViewById(R.id.tv_hw);
        hello.setText("heea");
        Intent intent=new Intent();
        intent.setClass(this,Line.class);
        startActivity(intent);
    }
}
