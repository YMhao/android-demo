package com.minghao.yu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by yu759 on 2017/5/7.
 */

public class Line extends AppCompatActivity {
    private Button button,button2,button3;
    private ImageView iv;
    private boolean image_flag = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.line);
        //Button
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        iv = (ImageView)findViewById(R.id.imageView);
        button.setOnClickListener(new MyOnClickListener());
        button3.setOnClickListener(new MyOnClickListener());
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("button2","onclick");
            }
        });

    }

    private class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button:
                    Log.i("button","onclick");
                    break;
                case R.id.button3:
                    Log.i("button3","onclick");
                    if(image_flag) {
                        iv.setImageDrawable(getResources().getDrawable(R.drawable.r1231));
                    }
                    else {
                        iv.setImageDrawable(getResources().getDrawable(R.drawable.xingkong));
                    }
                    image_flag = !image_flag;
                    break;
                default:
                    break;
            }

        }
    }


}
