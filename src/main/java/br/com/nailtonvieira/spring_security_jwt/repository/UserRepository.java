package br.com.nailtonvieira.spring_security_jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nailtonvieira.spring_security_jwt.domain.user.User;

public interface UserRepository extends JpaRepository<User, String> {
    
    Optional<User> findByEmail(String email);

}
