package com.luizgcf.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.luizgcf.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
