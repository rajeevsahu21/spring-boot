package com.rajeev.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String teamInfo() { return "Coach: " + coachName + ", Team: " + teamName; }

    @GetMapping("/")
    public String  sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String  workout() { return "run a hard 5K"; }

    @GetMapping("/fortune")
    public String  fortune() { return "run a hard 5K"; }
}
