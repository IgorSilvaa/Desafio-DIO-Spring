package one.digitalinnovation.gof.singleton;

/*
 * Singleton "Pregui�oso"
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return (SingletonLazy) instancia;
	}
}