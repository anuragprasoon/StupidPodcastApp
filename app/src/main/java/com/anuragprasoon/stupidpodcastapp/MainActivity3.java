package com.anuragprasoon.stupidpodcastapp;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    public Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound1);
        mediaPlayer.start();
        if(mediaPlayer.getDuration()==mediaPlayer.getCurrentPosition()){
            mediaPlayer.pause();
            mediaPlayer.release();
        }
        play= findViewById(R.id.button3);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }else{
                    mediaPlayer.start();
                }

            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }


}