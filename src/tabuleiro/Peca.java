package tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	/*Construtor - Ao criar a peça já informa o tabuleiro(a posicao é nula pq ainda nao foi colocada no tabuleiro)*/
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}
	
	/*Protect para somente ser utilizado pelo pacote tabuleiro 
	 * ou as subclasses de peças(Bispo, torre, etc)*/
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	/*Não haverá setTabuleiro() para não alterar o tabuleiro */
}
