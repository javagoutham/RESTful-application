package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Goutham linga
 *
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
