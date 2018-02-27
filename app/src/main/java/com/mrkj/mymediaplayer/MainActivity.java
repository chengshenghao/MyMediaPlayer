package com.mrkj.mymediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mrkj.mymediaplayer.utils.SoundUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startPlay(View view) {
        SoundUtils.playSoundByMedia(R.raw.music);
    }

    public void pausePlay(View view) {
        SoundUtils.playPauseSoundByMedia();
    }

    public void stopPlay(View view) {
        SoundUtils.playStopSoundByMedia();
    }
}
