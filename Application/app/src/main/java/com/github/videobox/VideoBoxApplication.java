package com.github.videobox;

import android.app.Application;
import android.content.Context;

public class VideoBoxApplication extends Application{
    
    public static String TAG = VideoBoxApplication.class.getSimpleName();
    private static Context context;

    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getAppContext() {
        return context;
	}
}
