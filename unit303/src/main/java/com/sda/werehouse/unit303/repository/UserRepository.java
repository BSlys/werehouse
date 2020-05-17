package com.sda.werehouse.unit303.repository;

import com.sda.werehouse.unit303.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
