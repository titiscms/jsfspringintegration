package com.mjv.pessoaapp.controller;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import com.mjv.pessoaapp.model.Pessoa;
import com.mjv.pessoaapp.service.PessoaService;

@Scope(value = "session")
@Component(value = "pessoaController")
@ELBeanName(value = "pessoaController")
@Join(path = "/colaboradores", to = "/cadastro.jsf")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	private Pessoa pessoa = new Pessoa();
	
	@PostMapping
	public String salvar() {
		pessoaService.salvar(pessoa);
		pessoa = new Pessoa();
		return "/colaboradores.xhtml?faces-redirect=true";
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
}
