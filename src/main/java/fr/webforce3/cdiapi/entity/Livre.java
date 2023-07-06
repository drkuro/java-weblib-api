package fr.webforce3.cdiapi.entity;

public class Livre {
	private int id;
	private String nom;
	private String auteur;
	private String format;

	public Livre(String nom, String auteur, String format) {
		this.auteur = auteur;
		this.format = format;
	}

	public Livre(int id, String nom, String auteur, String format) {
		this.id = id;
		this.setNom(nom);
		this.auteur = auteur;
		this.format = format;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("id : " + this.getId());
		sb.append(" - nom : " + this.getNom());
		return sb.toString();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}
}
