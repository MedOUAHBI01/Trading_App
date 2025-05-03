package com.emsi.trading.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeContoller {

    @GetMapping("/")
    public String home() {
        return "home"; // va chercher "home.html" dans /templates
    }

    @GetMapping("/home")
    public String home1() {
        return "home1"; // va chercher "home.html" dans /templates
    }

    @GetMapping("/api")
    public String secure() {
        return "welcom secure"; // va chercher "home.html" dans /templates
    }
}
