package com.mrkj.mymediaplayer;

import android.app.Application;
import android.graphics.Bitmap;
import android.util.LruCache;


/**
 * Created by admin on 2017/5/9.
 */

public class MyApplication extends Application {
    public static MyApplication mApplication;
    private LruCache<String, Bitmap> imageLruCache;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        imageLruCache = new LruCache<>((int) (Runtime.getRuntime().maxMemory() / 8));
    }

    @Override
    public void onLowMemory() {
        if (mApplication != null) {
        }
        super.onLowMemory();
    }

    public LruCache<String, Bitmap> getImageLruCache() {
        return imageLruCache;
    }

}
