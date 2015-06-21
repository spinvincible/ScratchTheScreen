package com.example.saurabhpandey.scratchthescreen;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by SaurabhPandey on 6/21/2015.
 */
public class GFXSurface extends Activity {

    SaurabhSuraface ourSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ourSurfaceView = new SaurabhSuraface(this);
        setContentView(ourSurfaceView);
    }
}
