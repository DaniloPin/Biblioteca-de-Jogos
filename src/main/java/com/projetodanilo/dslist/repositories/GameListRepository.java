package com.projetodanilo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodanilo.dslist.entities.Game;

public interface GameListRepository extends JpaRepository<Game, Long>{

}
