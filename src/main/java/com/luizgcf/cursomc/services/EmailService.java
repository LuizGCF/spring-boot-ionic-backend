package com.luizgcf.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.luizgcf.cursomc.domain.Cliente;
import com.luizgcf.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
