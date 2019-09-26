package com.abacoventure.sistemapedidos.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.abacoventure.sistemapedidos.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instateDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instateDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
	
}
