package com.example.gameplatform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(ModelMap model) {
        model.addAttribute("message", "Hi Guys");
        return "hello";
    }
}
