package br.com.sistema.negocio;
import java.util.ArrayList;
import java.util.List;

public class Objeto implements IObjeto{

	private int value;
	
	List<IObserver> observerList = new ArrayList<IObserver>();
	
	@Override
	public void registrar(IObserver o) {
		observerList.add(o);
		
	}

	@Override
	public void desregistrar(IObserver o) {
		observerList.remove(o);
		
	}

	@Override
	public void notificarObservadores() {
		for (int i=0; i<observerList.size();i++)
			observerList.get(i).update(value);
		
	}
	
	
		
}