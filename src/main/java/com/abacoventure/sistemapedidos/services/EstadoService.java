package com.abacoventure.sistemapedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abacoventure.sistemapedidos.domain.Estado;
import com.abacoventure.sistemapedidos.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;
	
	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}
	
}
