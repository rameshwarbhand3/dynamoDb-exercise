package com.ram.aws.controller;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.ram.aws.entity.Person;
import com.ram.aws.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/persons")
    public Person addPerson(@RequestBody Person person){
        return personRepository.addPerson(person);
    }

    @GetMapping("/persons/{personId}")
    public Person getPerson(@PathVariable String personId){
       return personRepository.findPersonByPersonId(personId);
    }

    @PutMapping("/persons")
    public String editPerson(Person person){
        return personRepository.editPerson(person);
    }

    @DeleteMapping("/persons")
    public String deletePerson(Person person){
        return personRepository.deletePerson(person);
    }
}
