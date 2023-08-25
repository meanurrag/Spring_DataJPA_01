package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Player;
import com.example.repository.PlayerRepository;

@SpringBootApplication
public class DataJpa01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DataJpa01Application.class, args);
		
		PlayerRepository pr = context.getBean(PlayerRepository.class);
		
		Player player = new Player();
		player.setPlayerId(102);
		player.setPlayerName("Kohli");
		player.setPlayerAge(34);
		player.setLocation("Delhi");
		
		pr.save(player);
		System.out.println("Data Inserted ...");
		
	}

}
