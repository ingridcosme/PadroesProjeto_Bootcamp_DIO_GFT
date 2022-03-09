package edu.dio.pp.gof;

import edu.dio.pp.gof.facade.Facade;
import edu.dio.pp.gof.singleton.SingletonEager;
import edu.dio.pp.gof.singleton.SingletonLazy;
import edu.dio.pp.gof.singleton.SingletonLazyHolder;
import edu.dio.pp.gof.strategy.Comportamento;
import edu.dio.pp.gof.strategy.ComportamentoAgressivo;
import edu.dio.pp.gof.strategy.ComportamentoDefensivo;
import edu.dio.pp.gof.strategy.ComportamentoNormal;
import edu.dio.pp.gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		// Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		System.out.println("\n==========================================================\n");
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		System.out.println("\n==========================================================\n");

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		System.out.println("\n==========================================================\n");

		// Strategy
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		System.out.println("\n==========================================================\n");

		robo.setComportamento(defensivo);
		robo.mover();
		System.out.println("\n==========================================================\n");

		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		System.out.println("\n==========================================================\n");
		
		// Facade
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
	}

}