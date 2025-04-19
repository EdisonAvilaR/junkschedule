/**
 * 
 */
package horario.basura.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * 
 */
@Service
public class EmailService {
	
	@Autowired
    private JavaMailSender mailSender;

    public void enviarCorreo(String name) {
        SimpleMailMessage email = new SimpleMailMessage();
        // aca es donde se envia a los destinatarios
        email.setTo("horariobasura@gmail.com");
        email.setSubject("Preparate: ");
        email.setText(""+ name+" " + " proximamente debes alistar para sacar la basura");
        mailSender.send(email);
    }
}
