package com.example.yllub_pc.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button single=(Button)findViewById(R.id.to_youTube);
        Button list=(Button)findViewById(R.id.to_StandAlone);

        single.setOnClickListener(this);
        list.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId()){
            case R.id.to_youTube:
                intent=new Intent(this,YouTubeActivity.class);
                break;
            case R.id.to_StandAlone:
                intent=new Intent(this,StandAloneActivity.class);
                break;
            default:
        }
        if(intent!=null){
            startActivity(intent);
        }



    }
}
