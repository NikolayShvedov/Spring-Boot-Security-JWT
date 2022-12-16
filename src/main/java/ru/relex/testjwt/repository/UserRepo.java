package ru.relex.testjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.relex.testjwt.domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
