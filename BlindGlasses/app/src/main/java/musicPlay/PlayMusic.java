package musicPlay;

import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mryj.R;

import Veriable.TransmissionVeriable;

/**
 * @author uruom
 * @version 1.0
 * @ClassName PlayMusic
 * @date 2022/9/11 14:52
 */
public class PlayMusic extends AppCompatActivity {
    private MediaPlayer mediaPlayerLeft;
    private MediaPlayer mediaPlayerLeftFont;
    private MediaPlayer mediaPlayerFont;
    private MediaPlayer mediaPlayerRightFont;
    private MediaPlayer mediaPlayerRight;
    private int urlLeft;
    private int urlLeftFont;
    private int urlFont;
    private int urlRightFont;
    private int urlRight;
    private int urlNull;

    public void playMusic(){
        mediaPlayerLeft = MediaPlayer.create(this,R.raw.running);
        mediaPlayerLeftFont = MediaPlayer.create(this,R.raw.running);
        mediaPlayerFont = MediaPlayer.create(this,R.raw.running);
        mediaPlayerRightFont = MediaPlayer.create(this,R.raw.running);
        mediaPlayerRight = MediaPlayer.create(this,R.raw.running);

    }

    public void startPlay(TransmissionVeriable transmissionVeriable){
        switch (transmissionVeriable.getDirection()){
            case LEFT: mediaPlayerLeft.start();
            case LEFT_FONT: mediaPlayerLeftFont.start();
            case FONT: mediaPlayerFont.start();
            case RIGHT: mediaPlayerRight.start();
            case RIGHT_FONT: mediaPlayerRightFont.start();
        }
    }

}
