package com.puxler.MTGPlanner.controller;

import io.magicthegathering.javasdk.api.CardAPI;
import io.magicthegathering.javasdk.resource.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {


    @GetMapping("/{id}")
    public String getCard(@PathVariable int id){
        Card card = CardAPI.getCard(id);
        System.out.println(card.getName());
        return card.getName();
    }

    @GetMapping("/getAllCardTypes")
    public String getAllCardTypes(){
        List<String> cardTypes = CardAPI.getAllCardTypes();
        for(String cardType : cardTypes){
            System.out.println(cardType);
        }
        return "";
    }

    @GetMapping("/GetAllCardSupertypes")
    public String getAllCardSupertypes(){
        List<String> cardSupertypes = CardAPI.getAllCardSupertypes();
        for(String cardSupertype : cardSupertypes){
            System.out.println(cardSupertype);
        }
        return "";
    }

    @GetMapping("/GetAllCardSubtypes")
    public String getAllCardSubtypes(){
        List<String> cardSubtypes = CardAPI.getAllCardSubtypes();
        for(String cardSubtype : cardSubtypes){
            System.out.println(cardSubtype);
        }
        return "";
    }

    @GetMapping("/Filter")
    public String getCardsWithFilter(){
        List<String> filters = new ArrayList<String>();
        filters.add("Cyborg");

        List<Card> allCardsWithFilter = CardAPI.getAllCards(filters);

        for(Card card : allCardsWithFilter){
            System.out.println(card.getName());
        }

        return "";
    }




}
