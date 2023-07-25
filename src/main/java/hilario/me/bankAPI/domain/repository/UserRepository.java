package hilario.me.bankAPI.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import hilario.me.bankAPI.domain.model.User;


public interface UserRepository extends JpaRepository<User,Long> {


}
