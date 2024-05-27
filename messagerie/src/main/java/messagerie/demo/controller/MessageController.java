package messagerie.demo.controller;



import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import messagerie.demo.service.*;

import messagerie.demo.model.Message;

@Controller
@RequestMapping("/messagerie")
public class MessageController {
	
	@Autowired 
	private MessageService messageDAO;
	 
	/*private ArrayList<Message> messageList = new ArrayList<Message>();
	 {messageList.add(new Message("Djabirati", "Bonjour!", LocalDateTime.now().minusDays(1)));}
	            /*new Message("Bob", "Salut!", LocalDateTime.now()),
	            new Message("Charles", "Message ancien", LocalDateTime.of(1990, 1, 1, 12, 0))
	        );*/
	
	@GetMapping("/liste")
    public String afficherMessagerie(Model model) {
		  System.out.println("get methode appellee");

        model.addAttribute("messages", messageDAO.getAllMessages());
        model.addAttribute("message", new Message()); 
        return "messagerie";
    }
	
	  @PostMapping("/liste")
	    public String addMessage(@ModelAttribute Message message) {
		  //message.setDate(LocalDateTime.now());
		  System.out.println(message);
		  Message msgDAO = new Message(message.getAuteur(), message.getMessage());
		  messageDAO.saveMessage(msgDAO);
	      //messageList.add(message);
	        return "redirect:/messagerie/liste";
	    }
}
