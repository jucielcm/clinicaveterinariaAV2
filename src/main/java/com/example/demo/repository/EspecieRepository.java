package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Especie;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Integer>{

}
