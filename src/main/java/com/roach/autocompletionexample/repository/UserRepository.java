package com.roach.autocompletionexample.repository;

import com.roach.autocompletionexample.domain.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "SELECT * FROM users WHERE MATCH(email, name) AGAINST (:searchText IN BOOLEAN MODE)", nativeQuery = true)
    List<User> searchByFullText(@Param("searchText") String searchText);

}
