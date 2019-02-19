
class Main {
	public static void main(String args[]) {
		Koe koe = new Koe("Zwart", 2, true);
		Koehandelaar koewinkel = new Koehandelaar();
		koe.leeftijd = 6;
		
		koe.eetGras = true;
		
		Koe koe2 = new Koe("Wit",5,false);
		koe2.kleur();
		System.out.println(koe2);
		koe2.eetGras = false;
		koe2.leeftijd = 11;
		koe.leeftijd();
		koe2.leeftijd();
		koe.kleur();
		koe.eetGras();
		koe2.eetGras();
		System.out.println(koe2);
		Koe koe3 = koewinkel.koeKopen(15);
		koe3.leeftijd = 7;
		koe3.leeftijd();
	}
}
