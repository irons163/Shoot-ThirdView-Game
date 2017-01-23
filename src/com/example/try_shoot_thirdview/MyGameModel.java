package com.example.try_shoot_thirdview;

import android.content.Context;
import android.graphics.Canvas;
import android.location.Address;
import android.view.MotionEvent;

import com.example.try_gameengine.framework.Data;
import com.example.try_gameengine.framework.GameModel;
import com.example.try_shoot_thirdview.sprites.Shooter;

public class MyGameModel extends GameModel{
	Shooter shooter;
	
	public MyGameModel(Context context, Data data) {
		super(context, data);
		// TODO Auto-generated constructor stub
		shooter = new Shooter(500, 500, false);
	}
	
	@Override
	protected void process() {
		// TODO Auto-generated method stub
		super.process();
		
		
	}

	@Override
	protected void doDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.doDraw(canvas);
		
		shooter.drawSelf(canvas, null);
	}
	
	@Override
	public void onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		super.onTouchEvent(event);
		
		
	}
}
