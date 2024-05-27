package messagerie.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Table(name = "message")
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String auteur; 
	private String message;
	private LocalDateTime date;
	
	
	public Message(String auteur, String message, LocalDateTime date) {
		super();
		this.auteur = auteur;
		this.message = message;
		this.date = date;
	}
	
	public Message(String auteur, String message) {
		super();
		this.auteur = auteur;
		this.message = message;
		this.date = LocalDateTime.now();
	}
	

	public Message() {
		this.date = LocalDateTime.now();
	}


	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}


	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
}
