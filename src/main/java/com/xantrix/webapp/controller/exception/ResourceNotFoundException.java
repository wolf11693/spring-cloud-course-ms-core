package com.xantrix.webapp.controller.exception;

public class ResourceNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	private String messaggio = "Elemento Ricercato Non Trovato!";

	public ResourceNotFoundException() {
		super();
	}

	public ResourceNotFoundException(String Messaggio) {
		super(Messaggio);
		this.messaggio = Messaggio;
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

}
