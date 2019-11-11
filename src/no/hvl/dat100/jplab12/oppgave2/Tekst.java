package no.hvl.dat100.jplab12.oppgave2;

import no.hvl.dat100.jplab12.oppgave1.*;
import no.hvl.dat100.jplab12.common.TODO;

public class Tekst extends Innlegg {

	// TODO: objektvariable
	protected String tekst;

	public Tekst() {

	}

	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id, bruker, dato);
		this.tekst = tekst;
	}

	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id, bruker, dato, likes);
		this.tekst = tekst;
	}

	public String getTekst() {
		return tekst;

	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	
	//F�r en error p� unittest som forventer et linjeskifte p� slutten av strengen n�r det ikke er det
	// og forventer ikke det n�r det er et linjeksifte
	@Override
	public String toString() {
		return String.format("TEKST%n%x%n%s%n%s%n%x%n%s%n", super.getId(), super.getBruker(), super.getDato(),
				super.getLikes(), tekst);

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		throw new UnsupportedOperationException(TODO.method());

	}
}
