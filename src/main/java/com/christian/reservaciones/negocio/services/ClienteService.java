package com.christian.reservaciones.negocio.services;



import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.christian.reservaciones.modelo.Cliente;
import com.christian.reservaciones.negocio.repositorio.ClienteRepository;

/**
 * Clase para definir los servicios del cliente
 * @author Christian
 *
 */
@Service
@Transactional(readOnly = true)
public class ClienteService {
	private final ClienteRepository clientRepository;
	
	public ClienteService(ClienteRepository clientRepository){
		this.clientRepository = clientRepository;			
	}
	
	/**
	 * metodo para realizar la operacion de guardar un cliente
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clientRepository.save(cliente);
	}
	
	
	/**
	 * metodo para realizar la operacion de actualizar un cliente
	 * @param cliente
	 * @return
	 */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clientRepository.save(cliente);
	}
	
	/**
	 * metodo para realizar la operacion de eliminacion de un cliente
	 * @param cliente
	 */
	@Transactional
	public void delete(Cliente cliente) {
		this.clientRepository.delete(cliente);
	}
	
	/**
	 * metodo para seleccionar un cliente por su identificacion
	 * @param identificacionCli
	 * @return
	 */
	public Cliente findByIdentificacionCli(String identificacionCli) {
		return this.clientRepository.findByIdentificacionCli(identificacionCli);
	}
	
	public List<Cliente> findAll(){
		return this.clientRepository.findAll();
	}
	
}
