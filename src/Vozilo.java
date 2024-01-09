
public class Vozilo {

	double brzina = 140.5;
	double potrosuvacka = 7.5;
	System.out.println("Kolata ima brzina od" + brzina + " km/h");
	System.out.println("Kolata ima potrosuvacka od " + potrosuvacka + " L/km/h");
	class Atributi extends Vozilo{
		int vrati = 4;
		void kolaZapali() {
			System.out.println("Kolata e zapalena !");
			System.out.println("+ Informacija : Kolata ima " + vrati);
		}		
	}
	
}
