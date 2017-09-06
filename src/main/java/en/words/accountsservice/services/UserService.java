package en.words.accountsservice.services;

import en.words.accountsservice.dao.UserDAO;
import en.words.accountsservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public User register(User user) {

        if (userDAO.findByUserName(user.getUserName()).isPresent()) {
            throw new RuntimeException("User with this user name already exists.");
        }

        userDAO.save(user);

        // SEND REGISTER MESSAGE

        return user;
    }

}
