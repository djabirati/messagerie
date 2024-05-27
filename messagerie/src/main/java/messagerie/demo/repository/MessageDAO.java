package messagerie.demo.repository;

import messagerie.demo.model.Message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageDAO extends JpaRepository<Message, Long> {
}
