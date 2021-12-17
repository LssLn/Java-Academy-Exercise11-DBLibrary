package dbbiblio;

public class Prestito {
	private Utente utente;
	private Libro libro;
	
	public Prestito (Utente utente, Libro libro) {
		this.utente= utente;
		this.libro = libro;
	}

	public Utente getUtente() {
		return utente;
	}

	public Libro getLibro() {
		return libro;
	}

	@Override
	public String toString() {
		return "Prestito [" + utente + ", " + libro + "]";
	}

}
