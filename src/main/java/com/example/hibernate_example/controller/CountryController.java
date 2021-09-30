package com.example.hibernate_example.controller;


import com.example.hibernate_example.model.Country;
import com.example.hibernate_example.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    private CountryService countryService;

    public CountryController(CountryService countryService){
        super();
        this.countryService = countryService;
    }

    @PostMapping
    public ResponseEntity<Country> create(@RequestBody Country country){
        return new ResponseEntity<Country>(countryService.save(country), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Country> get(){
        return countryService.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<Country> get(@PathVariable("id") long id){
        return new ResponseEntity<Country>(countryService.get(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Country> update(@PathVariable ("id") long id, @RequestBody Country country) {
        return new ResponseEntity<Country>(countryService.update(id, country), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Country> delete(@PathVariable ("id") long id) {
        return new ResponseEntity<Country>(countryService.delete(id), HttpStatus.OK);
    }
}
