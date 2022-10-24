package com.example.youtubeplayerapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    Button btnplay;
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnplay = findViewById(R.id.play);
         youTubePlayerView=findViewById(R.id.youtubeplayer);

         onInitializedListener = new YouTubePlayer.OnInitializedListener() {
             @Override
             public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                 youTubePlayer.loadVideo("PbP-aIe51Ek");

             }

             @Override
             public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

             }
         };
         btnplay.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 youTubePlayerView.initialize("AIzaSyDD6M3tRJ0zFcAw0aTBnJmhGzyJfUNe0dU",onInitializedListener);

             }
         });
    }
}