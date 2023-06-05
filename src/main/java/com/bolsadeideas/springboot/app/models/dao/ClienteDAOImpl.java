package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
/**
 * Clase decorada con la notacion Repositorio
 * Se inyecta un bean de tipo EntityManager
 * el metodo busca todos los clientes guardados en la tabla de base de datos
 * se usa @Transactional y se declara que solo sea de lectura
 * al implementar una interfaz se sobreescribe su metodo
 * @author pedro
 *
 */

@Repository
public class ClienteDAOImpl implements IClienteDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Cliente> finAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Ciente").getResultList();
	}

}
