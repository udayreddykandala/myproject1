package com.udayproject.learnspringframework.game;

public class GameRunner {
	//MarioGame game;
	 private GamingConsole game;
	public GameRunner (GamingConsole game) {
		this.game = game;
		
	}
	public void run() {
		System.out.println("RunningGame:"+  game);
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
