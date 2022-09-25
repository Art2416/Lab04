package hangman.model;

public class OriginalScore implements GameScore{

    /**
     * @param correctCount Cantidad de letras correctas
     * @param incorrectCount Cantidad de letras incorrectas
     * @throws IllegalArgumentException se produce cuando algún paramentro es negativo
     * @return Puntaje Final
     * @pos En caso de Score < 0 -> Score = 0 /// Caso en incorrectCount > 10
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int Score = 100;
        if((correctCount < 0 || incorrectCount < 0)) throw new IllegalArgumentException("Los valores tienen que ser positivos");
        else{
            incorrectCount = incorrectCount *10;
            Score = Score - incorrectCount;
        }
        return Score < 0 ? 0: Score;
    }

}