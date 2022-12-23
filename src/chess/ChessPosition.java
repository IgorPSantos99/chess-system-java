package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
	
	// Method to convert the default coordinates to chess coordinates
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	// Method to convert the chess coordinates to default coordinates
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a'+ position.getColumn()), 8 - position.getRow()); // casting char
				
	}
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
