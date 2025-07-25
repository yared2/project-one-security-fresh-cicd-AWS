package project_security.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import project_security.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
