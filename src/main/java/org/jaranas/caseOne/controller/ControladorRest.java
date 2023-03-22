package org.jaranas.caseOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar(){
        return ("Primera pagina web SpringBoot");
    }

    @GetMapping("/about")
    public String presentar(){
        return ("Soy CaseOne");
    }
}
