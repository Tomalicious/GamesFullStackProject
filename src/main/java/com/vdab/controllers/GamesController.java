package com.vdab.controllers;


import com.vdab.services.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GamesController {

    private GameService gameService = new GameService();

    @GetMapping(value = "/mygames")
    public String showGamePage(Model model){
        model.addAttribute("allgames", gameService.showAllGames() );
        model.addAttribute("game1" , gameService.findByID(1));
        model.addAttribute("address","Jerome ameystraat" );
        return "games";

    }
}
