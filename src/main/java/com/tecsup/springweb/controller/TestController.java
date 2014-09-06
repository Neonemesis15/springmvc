/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.springweb.controller;


import com.tecsup.springweb.model.Programa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author SABADO-MANHANA
 */
@Controller
@RequestMapping(value = {"/", "pruebas", "test"})
public class TestController {

    
    @ModelAttribute
    public void listado(Model model){
        model.addAttribute("nombres", new String[]{"jose","jorge"});
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("titulo","Hola Tecsup");
        model.addAttribute("contenido","Bienvenido al curso");
        
        Programa programa = new Programa();
        programa.setDescripcion("Programa de formación");
        model.addAttribute("programa", programa);
        
        return "test/index";
    }

    @RequestMapping("informacion")
    public String alternativo() {
        return "test/informacion";
    }

    @RequestMapping("parametros")
    public String parametros(String nombres,String apellidos, Model model) {
        model.addAttribute("nombres",nombres + " " + apellidos);
        return "test/informacion";
    }
    
    
    @RequestMapping(value = {"info", "prueba"})
    public String pruebas() {
        return "test/pruebas";
    }
}
