package com.vbs.vds.repositories;

import com.vbs.vds.models.User;
import jakarta.persistence.Entity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User findByEmail(String value);

  

    List<User> findByUsernameContainingIgnoreCaseAndRole(String keyword, String customer);

    List<User> findAllByRole(String customer, Sort sort);
}
