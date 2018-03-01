package com.mrkj.mymediaplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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

    public void openStore(View view) {
        Toast.makeText(this,"启动",Toast.LENGTH_SHORT).show();
        String str = "market://details?id=" + getPackageName();
        Intent localIntent = new Intent("android.intent.action.VIEW");
        localIntent.setData(Uri.parse(str));
        startActivity(localIntent);
    }
}
