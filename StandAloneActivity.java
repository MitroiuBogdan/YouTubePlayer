package com.example.yllub_pc.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by Yllub-pc on 12/2/2017.
 */

public class StandAloneActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        Intent intent=null;

        switch(view.getId()){
            case R.id.btnPlayVideo:
                intent= YouTubeStandalonePlayer.createVideoIntent(this,YouTubeActivity.GOOLE_API_KEY,YouTubeActivity.YOUTUBE_VIDEO_ID,1000,true,true);
                break;
            case R.id.btnPlaylist:
                intent=YouTubeStandalonePlayer.createPlaylistIntent(this,YouTubeActivity.GOOLE_API_KEY,YouTubeActivity.YOUTUBE_PLAYLIST);
                break;
            default:
        }
        if(intent!=null){
            startActivity(intent);

        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitystandalone);

        Button playVideo=(Button)findViewById(R.id.btnPlayVideo);
        Button playList=(Button)findViewById(R.id.btnPlaylist);

        playList.setOnClickListener(this);
        playVideo.setOnClickListener(this);
    }
}
