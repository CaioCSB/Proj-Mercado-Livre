package br.com.mercadolivre.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercadolivre.repository.UsuarioRepository;
import br.com.mercadolivre.request.UsuarioRequest;

@RestController
@RequestMapping("/usuario")
public class CadastroUsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<UsuarioRequest> cadastrar(@RequestBody @Valid UsuarioRequest request) {
		
		
		return ResponseEntity.ok().body(request);
		
	}
}