package com.tpo.teamseven.tpo.dao;

import com.tpo.teamseven.tpo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
