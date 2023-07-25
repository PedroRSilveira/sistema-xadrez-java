package boardgame;

public abstract class Piece {
	
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
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getColumn()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}