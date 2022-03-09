package one.digitalinnovation.gof.facede;

import subsistema1.CrmService;
import subsistema2.CepApi;

public class Facede {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
