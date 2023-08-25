package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
