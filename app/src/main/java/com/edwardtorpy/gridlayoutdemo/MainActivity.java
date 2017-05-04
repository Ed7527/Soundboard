package com.edwardtorpy.gridlayoutdemo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    public void playSound(View view) {

        int id = view.getId();
        String ourID = view.getTag().toString();

        Toast.makeText(this, ourID, Toast.LENGTH_SHORT).show();

        int resourceID = getResources().getIdentifier(ourID, "raw", "com.edwardtorpy.gridlayoutdemo");

        mediaPlayer = MediaPlayer.create(this, resourceID);
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
