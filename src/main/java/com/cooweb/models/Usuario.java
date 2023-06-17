package com.cooweb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private Long Id;
	
	@Column(name="Nombre")
	private String Nombre;
	
	@Column(name="Apellido")
	private String Apellido;
	
	@Column(name="Telefono")
	private String Telefono;
	
	@Column(name="Email")
	private String Email;
		
	@Column(name="Password")
	private String Password;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long Id) {
		this.Id = Id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}
	
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String Telefono) {
		this.Telefono = Telefono;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	
	
	
}
