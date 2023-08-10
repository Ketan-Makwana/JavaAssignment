public class ExpandingSpiralMatrix {

	public static void main(String[] args) {

		int n = 26;

		int numberOfColumn = (int) Math.round(Math.ceil(Math.sqrt(n)));
		int numberOfRow = (int) Math.round(Math.floor(Math.sqrt(n)));

		int[][] matrix = new int[numberOfRow][numberOfColumn];

		int counterPosition = 1;

		int currRowPosition = (numberOfRow - 1) / 2;
		int currColumnPosition = (numberOfColumn - 1) /2 ;

		boolean isPlus = true;

		int numberCounter = 1;

		while (numberCounter <= n) {
			if (isPlus) {
				int temp = 1;
				while (temp <= counterPosition &&  numberCounter <= n) {
					matrix[currRowPosition][currColumnPosition] = numberCounter;
					currColumnPosition++;
					temp++;
					numberCounter++;
				}
				temp = 1;
				while (temp <= counterPosition && numberCounter <= n) {
					matrix[currRowPosition][currColumnPosition] = numberCounter;
					currRowPosition++;
					temp++;
					numberCounter++;
				}
			} else {
				int temp = 1;
				while (temp <= counterPosition && numberCounter <= n) {
					matrix[currRowPosition][currColumnPosition] = numberCounter;
					currColumnPosition--;
					temp++;
					numberCounter++;
				}
				temp = 1;
				while (temp <= counterPosition && numberCounter <= n) {
					matrix[currRowPosition][currColumnPosition] = numberCounter;
					currRowPosition--;
					temp++;
					numberCounter++;
				}
			}

			counterPosition++;
			isPlus = !isPlus;
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}