package com.example.Sql_Rocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // First part in <> : with whom to connect (Entity), and second part : what is datatype of the primary key.





    // Generally in interface : you have to write custom queries, for Eg:
    // @Query ("SELECT * FROM user_info WHERE id = ")

}
