package com.myfirstproject.learnspringframework.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.udayproject.learnspringframework.game.GameRunner;
import com.udayproject.learnspringframework.game.GamingConsole;
import com.udayproject.learnspringframework.game.MarioGame;
import com.udayproject.learnspringframework.game.PacManGame;
import com.udayproject.learnspringframework.game.SuperContraGame;

@Configuration

public class GamingConfiguration {
	
	@Bean 
	
    public GamingConsole game() {
		var game = new PacManGame();
		return game;
		
	}
	@Bean
	public GamingConsole game1() {
		var game = new SuperContraGame();
		return game;
		
	}
	@Bean
	public GamingConsole game2() {
		var game = new MarioGame();
		return game;
		
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	@Bean
	@Primary
	public GameRunner gameRunner1(GamingConsole game1) {
		var gameRunner = new GameRunner(game1);
		return gameRunner;
	}
	@Bean
	public GameRunner gameRunner2(GamingConsole game2) {
		var gameRunner = new GameRunner(game2);
		return gameRunner;
	}
}
