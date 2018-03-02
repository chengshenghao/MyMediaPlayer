package com.mrkj.mymediaplayer;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.mrkj.mymediaplayer.utils.SoundUtils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
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
        String str = "market://details?id=" + getPackageName();
        Intent localIntent = new Intent("android.intent.action.VIEW");
        localIntent.setData(Uri.parse(str));
        startActivity(localIntent);

    }
}
