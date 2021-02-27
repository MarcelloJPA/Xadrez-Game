package tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	/*Construtor - Ao criar a pe�a j� informa o tabuleiro(a posicao � nula pq ainda nao foi colocada no tabuleiro)*/
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}
	
	/*Protect para somente ser utilizado pelo pacote tabuleiro 
	 * ou as subclasses de pe�as(Bispo, torre, etc)*/
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	/*N�o haver� setTabuleiro() para n�o alterar o tabuleiro */
}
