package hilario.me.bankAPI.service;

import hilario.me.bankAPI.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}

