package vn.finn.spring.demospringjpaquery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAllByAtk(int atk);

    List<User> findAllByAgiBetween(int start, int end);

    @Query("SELECT u from User u where u.def = :def")
    User findUserByDefQuery(@Param("def") Integer def);

    List<User> findAllByAgiGreaterThan(int agiThreshold);
}
