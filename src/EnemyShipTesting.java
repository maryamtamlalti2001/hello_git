import java.util.Scanner;
public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShipFactory shipFactory=new EnemyShipFactory();
		EnemyShip theEnemy=null;
		Scanner userInput=new Scanner(System.in);
		System.out.print("What type of ship? (U / R)"); 
		if(userInput.hasNextLine()){

			String TypeofShip = userInput.nextLine();
			theEnemy=EnemyShipFactory.makeEnemyShip(TypeofShip);

			}
		if(theEnemy!=null) {
			doStuffEnemy(theEnemy);
		}
		else {System.out.println("entrer U ou R la prochaine fois");}

			
			}
		
		
		
				

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayenemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.EnemyShipShoot();
		
	}

}
