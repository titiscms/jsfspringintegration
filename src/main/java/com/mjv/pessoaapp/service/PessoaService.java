package com.mjv.pessoaapp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjv.pessoaapp.model.Pessoa;
import com.mjv.pessoaapp.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Transactional
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	
	@Transactional
	public void deletar(Long pessoaId) {
		pessoaRepository.deleteById(pessoaId);
	}
	
	public Pessoa buscarOuFalhar(Long pessoaId) {
		return pessoaRepository.findById(pessoaId)
				.orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
	}
    
}
