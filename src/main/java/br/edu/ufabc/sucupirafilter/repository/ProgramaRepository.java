/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufabc.sucupirafilter.repository;

/**
 *
 * @author isaac
 */

import org.springframework.data.repository.CrudRepository;
import br.edu.ufabc.sucupirafilter.model.Programa;

public interface ProgramaRepository extends CrudRepository<Programa, Long> {
    Programa findByCodigo(String codigo);
}
