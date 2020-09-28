package com.mjv.pessoaapp.controller;

import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mjv.pessoaapp.model.Pessoa;
import com.mjv.pessoaapp.repository.PessoaRepository;

@Scope(value = "session")
@Component(value = "pessoas")
@ELBeanName(value = "pessoas")
@Join(path = "/", to = "/colaboradores.jsf")
public class PessoaListaController {
    
	@Autowired
	private PessoaRepository pessoaRepository;
	
	private List<Pessoa> pessoas;
	
    @Deferred
    @RequestAction
    @IgnorePostback
	public void carregarDados() {
		pessoas = pessoaRepository.findAll();
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
}
