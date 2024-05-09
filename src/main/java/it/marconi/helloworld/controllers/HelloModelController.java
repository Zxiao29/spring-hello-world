package it.marconi.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("other")
public class HelloModelController {
    
    @GetMapping("fixed")
    public ModelAndView greetAttribute() {

        return new ModelAndView("hello-world-model").addObject("name", "The Rock");
    }

    @GetMapping("query")
    public ModelAndView greetParameter(@RequestParam(name = "name", defaultValue = "none") String name) {

        return new ModelAndView("hello-world-model").addObject("name", name);
    }

    @GetMapping("/{username}")
    public ModelAndView greetPlaceholder(@PathVariable("username") String username) {

        return new ModelAndView("hello-world-username").addObject("username", username);
    }


}
