package messagerie.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import messagerie.demo.model.Message;
import messagerie.demo.repository.MessageDAO;

@Service
public class MessageService {

	@Autowired
    private MessageDAO MessageDao;
	
	public List<Message> getAllMessages() {
        return MessageDao.findAll();
    }
	
	public Message getMessageById(Long id) {
        return MessageDao.findById(id).orElse(null);
    }

    public Message saveMessage(Message message) {
        return MessageDao.save(message);
    }

    public void deleteMessage(Long id) {
    	MessageDao.deleteById(id);
    }
	
}
