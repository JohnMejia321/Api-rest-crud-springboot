package com.example.demo.controller;

import java.util.List;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons")
    public List<Person> allPersons(){
        return (List<Person>) personRepository.findAll();
    }

    @DeleteMapping("/person/{idPersona}")
    public void deletePerson(@PathVariable("idPersona") Long idPersona) {
        personRepository.deleteById(idPersona);
    }

}
