package com.pessoa.apipessoa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoa.apipessoa.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, String>{
	
	Optional<Pessoa> findById(String id);

}
