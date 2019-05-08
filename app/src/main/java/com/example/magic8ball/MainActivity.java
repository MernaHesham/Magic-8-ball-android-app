package com.example.magic8ball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = (Button) findViewById(R.id.askbutton);
        final ImageView ball = (ImageView) findViewById(R.id.ball);



        final int[] ballArray = {R.drawable.ball1, R.drawable.ball2,
                R.drawable.ball3, R.drawable.ball4,R.drawable.ball5, R.drawable.ball6,
                R.drawable.ball7};

        ask.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {

                                       Random num = new Random();
                                       int ballnumber = num.nextInt(7);
                                       ball.setImageResource(ballArray[ballnumber]);



                                   }
                               }
        );
    }
}
