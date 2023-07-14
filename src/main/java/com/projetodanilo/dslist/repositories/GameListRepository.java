package com.projetodanilo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodanilo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
