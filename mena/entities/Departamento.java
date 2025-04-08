package com.ex.mena.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String departNome;
	
	public Departamento() {
		
	}
	
	public Departamento(Long id, String departNome) {
		super();
		this.id = id;
		this.departNome = departNome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepartNome() {
		return departNome;
	}

	public void setDepartNome(String departNome) {
		this.departNome = departNome;
	}
	
	
}
