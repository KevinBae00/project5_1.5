package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class RootChanger {
    @RequestMapping(value = "/")
    public String rootChange(Model model){
        model.addAttribute("serverTime", new Date());
        return "index";
    }
}
