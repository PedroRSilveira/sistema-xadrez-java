package boardgame;

public class Piece {
	
	//O atributo position é protected para que só possa ser acessado pelo pacote tabuleiro e as subclasses da classe Piece.
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
		//Iniciamos a peça com posição null porque inicialmente ela não foi colocada no tabuleiro.
	}

	protected Board getBoard() {
		return board;
	}
}