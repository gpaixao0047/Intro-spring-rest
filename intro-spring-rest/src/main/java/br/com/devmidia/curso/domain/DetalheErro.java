package br.com.devmidia.curso.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DetalheErro implements Serializable {

	private Integer statusCode;

	private String statusMessage;

	private String httpMethod;

	private String erro;

	private String detalhe;

	private String path;

	public Integer getStatusCode() {
		return statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	public String getErro() {
		return erro;
	}

	public String getDetalhe() {
		return detalhe;
	}

	public String getPath() {
		return path;
	}
	

	
	
}
