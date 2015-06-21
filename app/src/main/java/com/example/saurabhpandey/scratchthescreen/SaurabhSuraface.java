package com.example.saurabhpandey.scratchthescreen;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by SaurabhPandey on 6/21/2015.
 */
public class SaurabhSuraface extends SurfaceView implements Runnable {

    SurfaceHolder surfaceHolder;
    Thread thread;

    public SaurabhSuraface(Context context) {
        super(context);

        surfaceHolder = getHolder();
        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {

    }
}
