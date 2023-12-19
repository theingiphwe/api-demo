package org.ace.apidemo.repo;

import org.ace.apidemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
