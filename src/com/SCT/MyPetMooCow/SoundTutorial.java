package com.SCT.MyPetMooCow;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SoundTutorial extends Activity {
    private Button mChangeActivityButton;
	private Button mPlaySound1Button;
	private Button mPlaySound2Button;
	
	

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Create, Initialise and then load the Sound manager
        SoundManager.getInstance();
        SoundManager.initSounds(this);
        SoundManager.loadSounds();
        
        

        
       
    }
    
    @Override
    public void onDestroy()
    {
    	super.onDestroy();
    	SoundManager.cleanup();
    }
}