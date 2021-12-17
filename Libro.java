package dbbiblio;

public class Libro {
	private String titolo;
	private int codice;
	
	public Libro(String titolo, int codice) {
		super();
		this.titolo = titolo;
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public int getCodice() {
		return codice;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", codice=" + codice + "]";
	}
	
	
	
}
