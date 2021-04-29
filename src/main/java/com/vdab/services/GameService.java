package com.vdab.services;

import com.vdab.Main;
import com.vdab.domain.Game;
import com.vdab.repositories.GameRepository;

import java.sql.SQLDataException;
import java.util.List;

public class GameService {
    GameRepository gameRepository = new GameRepository();


    public Game findFifthGame(){
        return gameRepository.findFifthGame();
    }


    public Game findGameByPartName(String string) {
            return gameRepository.findGameByPartName(string);
    }

    public List<Game> showAllGames() {
        return gameRepository.showAllGames();
    }

    public Game showAndChoose(String string) {
        return gameRepository.showAndChoose(string);
    }
}