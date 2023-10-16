package com.springbootweb.pruebaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index(){
        return "params/index";
    }
    @GetMapping("/mix-params")
    public String param(@RequestParam String saludo, @RequestParam Integer numero, Model model){
        model.addAttribute("resultado", "El saludo enviado es: "
                + "'" + saludo + "' y el numero es '" + numero + "'");
        return "params/ver";
    }
}
