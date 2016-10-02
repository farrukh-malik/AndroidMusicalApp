package com.example.mass_2016.musicalapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button for_play;
    Button for_pause;
    private  MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for_play = (Button) findViewById(R.id.play_button);
        for_pause = (Button) findViewById(R.id.pause_button);
        mp = MediaPlayer.create(this,R.raw.atif);

        for_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        for_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();

            }
        });


    }
}
