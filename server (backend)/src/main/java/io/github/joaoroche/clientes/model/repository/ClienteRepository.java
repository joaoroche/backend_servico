package io.github.joaoroche.clientes.model.repository;

import io.github.joaoroche.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}
