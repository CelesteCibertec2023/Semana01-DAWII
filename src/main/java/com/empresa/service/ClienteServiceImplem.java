package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Cliente;
import com.empresa.repository.ClienteRepository;

@Service
public class ClienteServiceImplem implements ClienteService{

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listaCliente() {
		return repository.findAll();
	}

	@Override
	public Cliente insertarCliente(Cliente obj) {
		return repository.save(obj);
	}

}
