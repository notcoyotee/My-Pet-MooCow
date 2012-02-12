package com.SCT.MyPetMooCow;

import java.util.Random;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;

public class MyPetMooCowActivity extends Activity {
	public String[] filelist;
	AssetFileDescriptor descriptor;
    private int mfile[] = new int[12];
    private MediaPlayer mp;
    public static Integer counter=1;
    
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
        mfile[0] = R.raw.a1;  
        mfile[1] = R.raw.a2;  
        mfile[2] = R.raw.a3;
        mfile[3] = R.raw.a4;  
        mfile[4] = R.raw.a5;  
        mfile[5] = R.raw.a6;
        mfile[6] = R.raw.a7;  
        mfile[7] = R.raw.a8;  
        mfile[8] = R.raw.a9;  
        mfile[9] = R.raw.a10;  
        mfile[10] = R.raw.a11;  
        mfile[11] = R.raw.a12;       
		final Random randomGenerator = new Random();

		
		final ImageButton playSound = (ImageButton) findViewById(R.id.button_play);
		playSound.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				counter=counter+1;
				Log.d("GBC", "counter =" + counter);

				if (counter%2 ==0) {
				playSound.setImageResource(R.drawable.happycow2);
				}
				else
				{
					playSound.setImageResource(R.drawable.happycow);
					
				}
				//playSound.setColorFilter(Color.argb(255, 255, 255, 255));
				int randomInt = randomGenerator.nextInt(11);
				Log.d("GBC", "Random =" + randomInt);
				if (randomInt > 11) randomInt=2;
	             mp = MediaPlayer.create(MyPetMooCowActivity.this, mfile[randomInt]);
	             mp.seekTo(0);
	             mp.start();
				//playSound.setImageResource(R.drawable.happycow);

			}
		});

	}
}
