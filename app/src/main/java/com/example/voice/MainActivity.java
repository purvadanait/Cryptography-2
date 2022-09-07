package com.example.voice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button btnText;
    Button btnStop;
    MediaPlayer player = new MediaPlayer();
    File file;
    int REQUEST_WRITE_PERMISSION=1;
    TextToSpeech textToSpeech;
    String encry=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestPermissions();

        
    }

    private void requestPermissions() {
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES)
    }
}