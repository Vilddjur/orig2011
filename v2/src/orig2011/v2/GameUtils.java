package orig2011.v2;

/**
 * Created by Oskar on 2014-12-16.
 */
public class GameUtils {

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param pos
     *            The position in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    protected static void setGameboardState(final Position pos, final GameTile tile) {
        setGameboardState(pos.getX(), pos.getY(), tile);
    }

    /**
     * Set the tile on a specified position in the gameboard.
     *
     * @param x
     *            Coordinate in the gameboard matrix.
     * @param y
     *            Coordinate in the gameboard matrix.
     * @param tile
     *            The type of tile to paint in specified position
     */
    protected static void setGameboardState(GameTile[][] gameBoardState, final int x, final int y,
                                     final GameTile tile) {
        gameboardState[x][y] = tile;
    }

}
