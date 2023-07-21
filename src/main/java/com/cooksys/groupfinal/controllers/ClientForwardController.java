package com.cooksys.groupfinal.controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ClientForwardController {
    @GetMapping(value = "/**/{path:[^\\.]*}")
    @CrossOrigin(origins="*")
    public String forward(){
        return "forward:/*";
    }
    // @GetMapping("/")
    // @CrossOrigin(origins="http://localhost:8080")
    // public ModelAndView home() {
    //     ModelAndView mav=new ModelAndView("index");
    //     return mav;
    // }

}
