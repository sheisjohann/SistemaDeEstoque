package br.com.sistema.negocio;

public interface IObjeto {

	void registrar(IObserver o);
	void desregistrar(IObserver o);
	void notificarObservadores();
}
