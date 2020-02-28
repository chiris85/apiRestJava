package com.christian.reservaciones.negocio.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christian.reservaciones.modelo.Cliente;

/**
 * Interfaz para definir las operaciones de base de datos relacionadas con cliente
 * @author RoseChris
 *
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {
	
	/**
	 * Definicion de metodo para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	public Cliente findByIdentificacionCli(String identificacionCli);
	
}
