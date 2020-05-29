package br.com.github.alexandrespmg.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthCheckController {

    @RequestMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String greeting() {
        return "{\"status\": \"UP\"}";
    }

}
