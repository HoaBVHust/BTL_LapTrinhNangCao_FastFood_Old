package edu.hust.talent.fastfood.repository;

import org.springframework.data.repository.CrudRepository;
import edu.hust.talent.fastfood.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}
