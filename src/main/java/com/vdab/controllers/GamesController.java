package com.vdab.controllers;


import com.vdab.services.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GamesController {

    private GameService gameService = new GameService();


    @GetMapping(value = "/")
    public String showHomePage(){
        return "index";
    }

    @GetMapping(value = "/mygames")
    public String showGamePage(Model model){
        model.addAttribute("games" , gameService.showAllGames());
        return "probeersel";
    }
    @GetMapping(value = ("/mytable"))
    public String showTablePage(Model model){
        return "tables";
    }

    @GetMapping(value = ("/ourproducts"))
    public String showProductsPage(Model model){
        return "products";
    }
}
