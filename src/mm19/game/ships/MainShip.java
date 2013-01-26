package mm19.game.ships;

import mm19.game.Constants;

/**
 * @author mm19
 *
 * The ship that a player starts out with, can  fire, and move.
 * Length: 5
 */
public class MainShip extends Ship {
    //Private Constants
    final private static int HEALTH_MULTIPLIER = 6;

    //Public Constants
    final public static int HEALTH = HEALTH_MULTIPLIER * Constants.MISSILE_DAMAGE;
    final public static int LENGTH = 5;

    /**
     * Constructor
     * Sets length and health using parent constructor
     */
    public MainShip() {
        super(LENGTH, HEALTH);
    }
}
