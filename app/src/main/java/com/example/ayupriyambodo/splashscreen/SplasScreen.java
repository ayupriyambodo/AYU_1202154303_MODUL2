package com.example.ayupriyambodo.splashscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplasScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_screen);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplasScreen.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}