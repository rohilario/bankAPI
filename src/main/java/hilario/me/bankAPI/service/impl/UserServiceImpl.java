package hilario.me.bankAPI.service.impl;

import java.util.NoSuchElementException;

import javax.xml.crypto.NoSuchMechanismException;

import org.springframework.stereotype.Service;

import hilario.me.bankAPI.domain.model.User;
import hilario.me.bankAPI.domain.repository.UserRepository;
import hilario.me.bankAPI.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This user ID Already exists.");
        }

        return userRepository.save(userToCreate);

    }
    
}
