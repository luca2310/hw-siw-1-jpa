package it.uniroma3.siw.hw;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Allievo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String cognome;
	
	private LocalDate datanascita;

	private String luogonascita;
	
	private String matricola;
	
	private String email;
	
	// è utile rendere persistente subito l'azienda dove lavora l'allievo
	// ed è inoltre utile modificare l'azienda nel caso in cui l'allievo la cambi
	@ManyToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Azienda azienda;
	
	@ManyToMany (mappedBy = "allievi")
	private List<Corso> corsi;
	


	
	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}
	
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public Azienda getAzienda() {
		return azienda;
	}

	public void setAzienda(Azienda azienda) {
		this.azienda = azienda;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDatanascita() {
		return datanascita;
	}

	public void setDatanascita(LocalDate datanascita) {
		this.datanascita = datanascita;
	}

	public String getLuogonascita() {
		return luogonascita;
	}

	public void setLuogonascita(String luogonascita) {
		this.luogonascita = luogonascita;
	}
	
	
}
