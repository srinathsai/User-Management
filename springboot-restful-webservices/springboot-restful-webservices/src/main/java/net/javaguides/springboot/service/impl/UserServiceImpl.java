package net.javaguides.springboot.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.UserRepository;
import net.javaguides.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository; //usually we must use @Autowired annotation for injecting dependency injection but for one parameter no need of that tag for Spring 4.3+ versions
    //here we are using constructor based dependency injection.
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        User retrievedUser = userRepository.findById(userId).get();
        return retrievedUser;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public User updateUser(User user) {
        User retrievedUser = userRepository.findById(user.getId()).get();
        retrievedUser.setEmail(user.getEmail());
        retrievedUser.setFirstName(user.getFirstName());
        retrievedUser.setLastName(user.getLastName());
        User updatedUser = userRepository.save(retrievedUser);
        return updatedUser;

    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
