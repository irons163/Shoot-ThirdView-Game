package com.example.try_shoot_thirdview;

//import android.support.v7.app.ActionBarActivity;
import com.example.try_gameengine.stage.BaseStage;

import android.os.Bundle;

public class MainActivity extends BaseStage {
	MyGameModel gameModel;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
	}

	@Override
	protected void initGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initGameModel() {
		// TODO Auto-generated method stub
		gameModel = new MyGameModel(this, null);
	}

	@Override
	protected void initGameController() {
		// TODO Auto-generated method stub
		new MyGameController(this, gameModel);
	}
}
