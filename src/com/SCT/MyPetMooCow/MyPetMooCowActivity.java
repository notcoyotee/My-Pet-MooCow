package com.SCT.MyPetMooCow;

import java.util.Random;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MyPetMooCowActivity extends Activity {
	
	public String[] filelist;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {

		SoundManager.getInstance();
		SoundManager.initSounds(this);
		SoundManager.loadSounds();

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ImageButton playSound = (ImageButton)findViewById(R.id.button_play);

		playSound.setOnClickListener(new View.OnClickListener() 
		{           
			public void onClick(View v) 
			{
				//SoundManager.stopSound(index)
				Random randomGenerator = new Random();
				int randomInt = randomGenerator.nextInt(12);
				SoundManager.playSound(randomInt, 1);
			}
		});   
	}
}