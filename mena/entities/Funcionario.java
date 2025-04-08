package com.ex.mena.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String funcNome;
	private double funcSalario;

	//chamar a classe
	@ManyToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;

	public Funcionario() {
		
	}
	
	public Funcionario(Long id, String funcNome, double funcSalario, Departamento departamento) {
		super();
		this.id = id;
		this.funcNome = funcNome;
		this.funcSalario = funcSalario;
		this.departamento = departamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFuncNome() {
		return funcNome;
	}

	public void setFuncNome(String funcNome) {
		this.funcNome = funcNome;
	}

	public double getFuncSalario() {
		return funcSalario;
	}

	public void setFuncSalario(double funcSalario) {
		this.funcSalario = funcSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
	
}
