package com.ngvcodes.springbatch.repository;

import com.ngvcodes.springbatch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
