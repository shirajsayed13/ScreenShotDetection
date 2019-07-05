package com.shiraj.screenshotdetection;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends ScreenShotDetectionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onScreenCaptured(String path) {
        Toast.makeText(this, path, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onScreenCapturedWithDeniedPermission() {
        Toast.makeText(this, "Please grant read external storage permission for screenshot detection", Toast.LENGTH_SHORT).show();
    }
}
