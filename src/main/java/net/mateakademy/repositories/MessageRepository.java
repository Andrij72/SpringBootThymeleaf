package net.mateakademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.mateakademy.entities.Message;

/**
 * @author Andrew Kulynych
 *
 */
public interface MessageRepository extends JpaRepository<Message, Integer>{
}
