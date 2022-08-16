package one.digitalinnovation.gof.strategy;

public class Robo {
	private IComportamento comportamento;
	
	public void setComportamento(IComportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		this.comportamento.mover();
	}
}
