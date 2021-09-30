package com.example.hibernate_example.service;

import com.example.hibernate_example.model.Country;

import java.util.List;

public interface CountryService {
    Country save(Country country);
    List<Country> getAll();
    Country get(long id);
    Country update(long id, Country country);
    Country delete(long id);
}
