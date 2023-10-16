package com.springbootweb.pruebaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/prueba")
public class PruebaController {
    @GetMapping("/")
    public String index(){
        return "prueba/index";
    }
    @GetMapping("/pruebita/")
    public String param(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String dui, Model model){
        model.addAttribute("Usuario", "Nombre: " + nombre
                + " apellido: " + apellido + " y dui: " + dui);
        return "prueba/ver";
    }
}
