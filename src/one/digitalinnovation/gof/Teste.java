package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facede.Facede;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Teste {
	public static void main(String[] args) {
		
		// Singleton:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getIntancia();
		System.out.println(lazyHolder);

		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();

		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		
		robo.setStrategy(defensivo);
		robo.mover();
		
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facede facede = new Facede();
		facede.migrarCliente("Igor", "53370266");
		
	}
}
