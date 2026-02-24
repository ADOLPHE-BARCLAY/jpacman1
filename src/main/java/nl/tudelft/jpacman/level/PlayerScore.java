package nl.tudelft.jpacman.level;

public class PlayerScore {
    /**
     * The amount of points accumulated by this player.
     */
    int score;

    public PlayerScore() {
    }

    /**
     * Returns the amount of points accumulated by this player.
     *
     * @return The amount of points accumulated by this player.
     */
    public int getScore() {
        return score;
    }

    /**
     * Adds points to the score of this player.
     *
     * @param points The amount of points to add to the points this player already
     *               has.
     */
    public void addPoints(int points) {
        score += points;
    }
}
