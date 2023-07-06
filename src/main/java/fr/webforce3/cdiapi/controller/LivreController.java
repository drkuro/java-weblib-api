package fr.webforce3.cdiapi.controller;

import java.util.ArrayList;

import fr.webforce3.cdiapi.dao.LivreDAO;
import fr.webforce3.cdiapi.entity.Livre;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/livre")
public class LivreController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Livre> getAllLivre() {
		LivreDAO livre = new LivreDAO();
		ArrayList<Livre> list = livre.findAll();
		return list;
	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String addLivre(@FormParam("nom") String nom) {
		return "Tu as ecrit" + nom;
	}

}
