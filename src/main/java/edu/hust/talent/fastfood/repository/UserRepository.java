package edu.hust.talent.fastfood.repository;

import edu.hust.talent.fastfood.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmail(String email);

}