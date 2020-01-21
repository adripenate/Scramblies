public class Scramblies {
    public static boolean scramble(String pieces, String goal) {
        if (areNotEnoughPieces(pieces, goal)) return false;
        int pieceSelected = 0;
        while (!goalHasLetters(goal) && areUncheckedPieces(pieces, pieceSelected)){
            if (containsSelectedLetter(goal, pieces, pieceSelected)){
                goal = removeLetterFromGoal(pieces, goal, pieceSelected);
            }
            pieceSelected++;
        }
        return goalHasLetters(goal);
    }

    private static String removeLetterFromGoal(String pieces, String goal, int pieceSelected) {
        return goal.replaceFirst(pieces.charAt(pieceSelected)+"", "");
    }

    private static boolean containsSelectedLetter(String goal, String pieces, int pieceSelected) {
        return goal.contains(pieces.charAt(pieceSelected) + "");
    }

    private static boolean areUncheckedPieces(String pieces, int pieceSelected) {
        return pieceSelected < pieces.length();
    }

    private static boolean goalHasLetters(String goal) {
        return goal.isEmpty();
    }

    private static boolean areNotEnoughPieces(String pieces, String goal) {
        return pieces.length() < goal.length();
    }
}
