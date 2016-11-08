package com.helpet.rest;

/*
 * 
 * @author Carlos Enrique Agudelo Giraldo, Laura Marcela MArtinez
 * @email carloskikea@gmail.com, laumarlon@gmail.com
 * @description class for open services for Pet in route /rest/PetService
 * @date 11/08/2016 
 *
 */

import java.rmi.RemoteException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.helpet.logic.PetB1;
import com.helpet.iw.dto.Pet;
import com.helpet.iw.exception.DaoException;

@Path("PetService")
@Component
public class PetService {
	
	@Autowired
	PetB1 petB1;

	public PetB1 getPetB1() {
		return petB1;
	}

	public void setPetB1(PetB1 petB1) {
		this.petB1 = petB1;
	}
	
	

}