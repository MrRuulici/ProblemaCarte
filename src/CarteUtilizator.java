
public class CarteUtilizator {

	public static void main(String[] args) {
		Carte c1 = new Carte(140);
		Carte c2 = new Carte(140);
		System.out.println(c1);
		System.out.println(c2);
		if(c1.equals(c2)) 
			System.out.println("Cartile au acelasi numar de pagini!");
		else System.out.println("Cartile au numar diferit de pagini");
	}

}
