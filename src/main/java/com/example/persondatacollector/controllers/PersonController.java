package com.example.persondatacollector.controllers;

import com.example.persondatacollector.dtos.PersonPostDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(PersonController.URL)
public class PersonController {
    public static final String URL = "/api/persons";

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PersonPostDto post(@RequestBody PersonPostDto personPostDto) {
        return personPostDto;
    }
}
