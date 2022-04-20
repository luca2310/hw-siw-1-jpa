package it.uniroma3.siw.hw;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Azienda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String ragionesociale;
	
	private String indirizzo;
	
	private String numerotelefono;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRagionesociale() {
		return ragionesociale;
	}

	public void setRagionesociale(String ragionesociale) {
		this.ragionesociale = ragionesociale;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNumerotelefono() {
		return numerotelefono;
	}

	public void setNumerotelefono(String numerotelefono) {
		this.numerotelefono = numerotelefono;
	}

}
