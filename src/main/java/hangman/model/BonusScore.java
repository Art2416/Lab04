package hangman.model;

public class BonusScore implements GameScore{

    /**
     * @param correctCount Cantidad de letras correctas
     * @param incorrectCount Cantidad de letras incorrectas
     * @throws IllegalArgumentException se produce cuando algún paramentro es negativo
     * @return Puntaje Final
     * @pos En caso de Score < 0 -> Score = 0 /// Caso en 2 * incorrectCount > correctCount
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int Score = 0;
        if((correctCount < 0 || incorrectCount < 0)) throw new IllegalArgumentException("Los valores tienen que ser positivos.");
        else{
            incorrectCount = incorrectCount * 5;
            correctCount = correctCount * 10;
            Score = Score - incorrectCount + correctCount;
        }
        return Score < 0 ? 0: Score;
    }
}