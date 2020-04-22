package com.pessoa.apipessoa.resources;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoa.apipessoa.entities.Pessoa;
import com.pessoa.apipessoa.repository.PessoaRepository;


@RestController
@RequestMapping(value="/api")
public class PessoaResource {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	

	@GetMapping("/pessoas")
	public ArrayList<Pessoa> listaPessoas(){
		return (ArrayList) pessoaRepository.findAll();
	}
	
	@GetMapping("/pessoa/{id}")
	public Optional<Pessoa> listaPessoa(@PathVariable(value="id") String id){
		return pessoaRepository.findById(id);
	}
	
	@PostMapping("/pessoa")
	public Pessoa salvaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
		
	}
	
	@DeleteMapping("/pessoa")
	public void deletaPessoa(@RequestBody Pessoa pessoa) {
		pessoaRepository.delete(pessoa);
		
	}
	
	@PutMapping("/pessoa")
	public Pessoa alterarPessoa(@RequestBody Pessoa pessoa) {		
		return pessoaRepository.save(pessoa);
		
	}
	
}
