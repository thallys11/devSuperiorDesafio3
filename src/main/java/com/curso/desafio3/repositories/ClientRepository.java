package com.curso.desafio3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.desafio3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
