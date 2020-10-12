package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.lab_5.dummy.DummyContent;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        music=new MediaPlayer();
        music=MediaPlayer.create(this,R.raw.drums);
        music.start();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                music.pause();
                finish();
                startActivity(new Intent(Splash.this, ItemListActivity.class));
            }
        };
        Timer opening= new Timer();
        opening.schedule(task,5000);
    }
}