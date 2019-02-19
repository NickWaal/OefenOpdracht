
public class Koe {

	String kleur = "Bruin";
	int leeftijd;
	boolean eetGras;
	public String string;
	public int i;
	public boolean b;

	public Koe(String string, int i, boolean b) {
		this.string = string;
		this.i = i;
		this.b = b;
	}

	public void leeftijd() {
		System.out.println("deze koe is " + leeftijd + " jaar oud");
	}

	public void kleur() {
		System.out.println("de kleur van deze koe is " + kleur);
	}

	public void eetGras() {
		System.out.println("eet deze koe gras? " + eetGras);
	}
	
	public @Override String toString()
	{
		  return ("Deze koe is: " + leeftijd + " jaar oud en is " + kleur + ". Eet hij nu gras? " + eetGras);
	}
}
