package web.repository;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public interface UserDao {
    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void deleteUser(Long id);
}
