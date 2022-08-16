package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.iterator.Colecao;
import one.digitalinnovation.gof.iterator.Iterator;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.IComportamento;
import one.digitalinnovation.gof.strategy.Robo;

public class Main {

	public static void main(String[] args) {
		//Testes com o uso do design pattern Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager lazyEager = SingletonEager.getInstancia();
		System.out.println(lazyEager);
		
		lazyEager = SingletonEager.getInstancia();
		System.out.println(lazyEager);
		
		
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		//Testes com o uso do design pattern Strategy
		IComportamento defensivo = new ComportamentoDefensivo();
		IComportamento normal = new ComportamentoNormal();
		IComportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(normal);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		
		
		//Testes com o uso do design pattern Facade
		Facade facade = new Facade();
		facade.migrarCliente("Maurício", "Pouso Alegre");
		
		
		//Testes com o uso do design pattern Iterator
		Colecao nomes = new Colecao();
		Iterator iter = nomes.getIterator();
		
		while( iter.hasNext() ) {
			String nome = (String) iter.next();
			System.out.println("Nome: "+ nome);
		}
		
	}

}
