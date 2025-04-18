package xyz.inteligenciaativa.orderflow.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        log.info("Start world with...");
        return "This world, Mr. Raimundo, is a ball, Mr. Carola. Isn’t it, Mr. Mané?";
    }
}