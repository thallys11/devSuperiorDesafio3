package com.curso.desafio3.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
