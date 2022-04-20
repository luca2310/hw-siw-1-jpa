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
public class Corso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private LocalDate datainizio;
	
	private Long durata;
	
	@ManyToMany
	private List<Allievo> allievi;
	
	// è utile tener traccia del docente associato al corso, modificandolo se necessario
	@ManyToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Docente docente;
	
	
	

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public List<Allievo> getAllievi() {
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi) {
		this.allievi = allievi;
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

	public LocalDate getDatainizio() {
		return datainizio;
	}

	public void setDatainizio(LocalDate datainizio) {
		this.datainizio = datainizio;
	}

	public Long getDurata() {
		return durata;
	}

	public void setDurata(Long durata) {
		this.durata = durata;
	}

}
