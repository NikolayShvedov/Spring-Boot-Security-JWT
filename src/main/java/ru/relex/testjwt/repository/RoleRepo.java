package ru.relex.testjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.relex.testjwt.domain.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
