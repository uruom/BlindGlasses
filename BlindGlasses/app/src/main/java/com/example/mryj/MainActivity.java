package com.example.mryj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_start;
    private Automat automat;
    private MediaPlayer mediaPlayerEnd;
    private MediaPlayer mediaPlayerIsEnd;
    private MediaPlayer mediaPlayerIsStart;
    private MediaPlayer mediaPlayerRunning;
    public String text_p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mediaPlayerEnd = MediaPlayer.create(this,R.raw.end);
        mediaPlayerIsEnd = MediaPlayer.create(this,R.raw.isend);
        mediaPlayerIsStart= MediaPlayer.create(this,R.raw.isstart);
        mediaPlayerRunning = MediaPlayer.create(this,R.raw.running);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_start = findViewById(R.id.btn_main_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                automat = automat.getAutomat();
                automat.updateStatu(false,true,false);
                musicPlay(automat.getAutomat().getStatu());
            }
        });
    }
    protected void musicPlay(Estatus estatus){
        switch (estatus){
            case Prime:
                mediaPlayerEnd.start();
                btn_start.setText("终止状态");
                break;
            case IsStart:
                mediaPlayerIsStart.start();
                btn_start.setText("确认开始");
                break;
            case IsClose:
                mediaPlayerIsEnd.start();
                btn_start.setText("确认结束");
                break;
            case Running:
                mediaPlayerRunning.start();
                btn_start.setText("运行中");
                break;
        }

    }
}