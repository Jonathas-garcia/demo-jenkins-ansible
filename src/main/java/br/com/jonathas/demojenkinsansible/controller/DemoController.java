package br.com.jonathas.demojenkinsansible.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
public class DemoController {

    @GetMapping
    public String demo() {
        return "OK";
    }
}
