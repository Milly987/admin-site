package com.millyAdmin.admin.site.repositories;

import com.millyAdmin.admin.site.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository  extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
   public User findByEmail(String username);
}
