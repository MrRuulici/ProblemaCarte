
public class Carte {

	private int nrPagini = 0;

	public Carte(int nrPagini) {
		this.nrPagini = nrPagini;
	}

	@Override
	public String toString() {
		return "Cartea are " + nrPagini + " pagini";
	}
	
	public boolean equals(Carte c) {
		if(this.nrPagini == c.nrPagini)
			return true;
		else return false;
	}

	public int getNrPagini() {
		return nrPagini;
	}

	public void setNrPagini(int nrPagini) {
		this.nrPagini = nrPagini;
	}
	
	
	
}
