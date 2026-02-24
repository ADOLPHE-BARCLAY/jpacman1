package nl.tudelft.jpacman.level;

public class PlayerLife {
    final int livesMax = 3;
    int lives;

    public PlayerLife() {
        this.lives = livesMax;
    }

    /**
     * Returns whether this player is alive or not.
     * <p>
     * Returns livesMas of the player
     *
     * @return <code>true</code> iff the player is alive.
     */
    public boolean isAlive() {
        return lives > 0;

    }

    public void loseLife() {
        if (lives > 0) {
            lives--;
        }

    }

    public int getLives() {
        return lives;
    }
}
