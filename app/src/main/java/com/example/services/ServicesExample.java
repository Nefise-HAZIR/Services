package com.example.services;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServicesExample extends IntentService {    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param  Used to name the worker thread, important only for debugging.
     */
    public ServicesExample() {
        super("name");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("servis", "onCreate: ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("servis", "onStartCommand: ");

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("servis", "onDestroy: ");
    }

    @Override
    protected void onHandleIntent( Intent intent) {
        Log.d("servis", "onHandleIntent: ");
    }
}
