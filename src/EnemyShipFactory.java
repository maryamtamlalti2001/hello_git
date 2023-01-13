
public class EnemyShipFactory {
	public static EnemyShip makeEnemyShip(String newShipType)
    {
        EnemyShip newShip = null;
        if (newShipType.equals("U"))
        {
            return new UFOEnemyShip();
        }
        else if (newShipType.equals("R"))
        {
            return new RocketEnemy();
        }
        else
        {
            return null;
        }
    }

}
