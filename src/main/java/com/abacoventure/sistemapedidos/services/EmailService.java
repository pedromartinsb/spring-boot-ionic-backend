package com.abacoventure.sistemapedidos.services;

import org.springframework.mail.SimpleMailMessage;

import com.abacoventure.sistemapedidos.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
