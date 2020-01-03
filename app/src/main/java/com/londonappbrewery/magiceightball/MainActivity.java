package com.londonappbrewery.magiceightball;

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
        Button askbtn = findViewById(R.id.askbtn);
        final ImageView image = findViewById(R.id.image);

        final int[] images = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        askbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomgenerator = new Random();
                int num = randomgenerator.nextInt(5);
                image.setImageResource(images[num]);
            }
        });
    }
}
