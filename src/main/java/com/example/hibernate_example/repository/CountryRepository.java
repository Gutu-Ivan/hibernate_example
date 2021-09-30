package com.example.hibernate_example.repository;

import com.example.hibernate_example.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
