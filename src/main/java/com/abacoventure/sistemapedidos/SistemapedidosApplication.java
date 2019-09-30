package com.abacoventure.sistemapedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abacoventure.sistemapedidos.services.S3Service;

@SpringBootApplication
public class SistemapedidosApplication implements CommandLineRunner {
	
	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(SistemapedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		s3Service.uploadFile("C:\\Users\\Pedro\\Desktop\\PastaPedro\\Outros\\icones\\clientes.png");
	}	

}
