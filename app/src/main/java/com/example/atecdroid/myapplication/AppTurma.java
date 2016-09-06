package com.example.atecdroid.myapplication;

import android.app.Application;

/**
 * Created by atecdroid on 7/25/16.
 */
public class AppTurma extends Application {
    String transvalor;

    @Override
    public void onCreate() {
        transvalor = "1";
        super.onCreate();
    }

    public String getTransvalor() {
        return transvalor;
    }

    public void setTransvalor(String transvalor) {
        this.transvalor = transvalor;
    }
}
