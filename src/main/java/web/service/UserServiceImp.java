package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UserDao;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}
