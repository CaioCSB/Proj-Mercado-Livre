package br.com.mercadolivre.request;

public class UsuarioRequest {

	private String email;

	private String senha;

	public UsuarioRequest(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

}
