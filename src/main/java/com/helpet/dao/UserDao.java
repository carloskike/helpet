package com.helpet.dao;

import com.helpet.dto.User;
import com.helpet.exception.DaoException;

/**
 * 
 * @author Carlos Enrique Agudelo Giraldo
 * @email carloskikea@gmail.com
 * @description Interface for User
 * @date 10/17/206 
 *
 */
public interface UserDao {
	
	void guardar(User user) throws DaoException;
	
	void actualizar(User user) throws DaoException;
	
	User buscarPaisPorNombre(String name) throws DaoException;
	
	User buscarPaisPorId(int id) throws DaoException;	
	
	void eliminar(User user) throws DaoException;

}
