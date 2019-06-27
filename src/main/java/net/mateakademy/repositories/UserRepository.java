package net.mateakademy.repositories;

import net.mateakademy.entities.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{
    Optional<User> findByEmail(String email);
}