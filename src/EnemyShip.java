
public abstract class EnemyShip {
	private String Name;
	private double amtDamage;
	public String getName() {
		return Name;
	}
	public void Setname(String Newname) {
		Name=Newname;
	}
	public double getDamage() {
		return amtDamage ;
	}
	public void SetDamage(double NewDamage) {
		amtDamage=NewDamage;;
	}
	public void followHeroShip() {
		System.out.println(getName()+" is following the hero");
		
	}
	public void displayenemyShip() {
		System.out.println(getName()+" is on the screen");
		
	}
	public void EnemyShipShoot() {
		System.out.println(getName()+"attacks and does "+getDamage());
		
		
	}


}
 