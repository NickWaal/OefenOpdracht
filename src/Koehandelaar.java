
public class Koehandelaar {

	Koe koeKopen(int euro) {
		if (euro > 10) {
			Koe verkochteKoe = new Koe("Zwart", 5, false);
 			System.out.println("De koe is gekocht");
			return verkochteKoe;
		} else {

			return null;
		}
	}

}
