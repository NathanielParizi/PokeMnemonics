package com.example.go.pokemnemonics;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

//private ImageView bulbasaur;

public class MainActivity extends AppCompatActivity {


    int pokemon = 0;

    private ImageView bulbasaur, ditto, ivy, venus, charman, charmil, charizard;
    private TextView magicnum;
    private static final String TAG = "PokerFace";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        magicnum = (TextView) findViewById(R.id.NUMBER);
       final Typeface font = Typeface.createFromAsset(getAssets(),"uzura.ttf");
        magicnum.setTypeface(font);


        ditto = (ImageView) findViewById(R.id.img);
        bulbasaur = (ImageView) findViewById(R.id.img);
        ivy = (ImageView) findViewById(R.id.img);
        venus = (ImageView) findViewById(R.id.img);
        charman = (ImageView) findViewById(R.id.img);
        charmil = (ImageView) findViewById(R.id.img);
        charizard = (ImageView) findViewById(R.id.img);






        bulbasaur.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Random rand = new Random();

                Log.d(TAG,"HI");
                pokemon = rand.nextInt(6);
                switch(pokemon) {
                    case 0:
                        ditto.setImageResource(R.drawable.ditto);
                        magicnum.setText("00");
                        break;



                    case 1:

                        bulbasaur.setImageResource(R.drawable.bulby);
                        magicnum.setText("1");
                        break;
                    case 2:

                        ivy.setImageResource(R.drawable.ivy);
                        magicnum.setText("2");
                        break;
                    case 3:
                        venus.setImageResource(R.drawable.venus);
                        magicnum.setText("3");
                        break;
                    case 4:
                        charman.setImageResource(R.drawable.char004);
                        magicnum.setText("4");
                        break;
                    case 5: charmil.setImageResource(R.drawable.charmil);
                        magicnum.setText("5");
                        break;

                }

            }
        });








    }
}
