package Controller;

import static Controller.BiletDetayi.obj;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import java.util.Date;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;



import javax.mail.Session;

 class SendEmailTLS  {
     NewJInternalFrame obj =new NewJInternalFrame();

     /**
      Outgoing Mail (SMTP) Server
      requires TLS or SSL: smtp.gmail.com (use authentication)
      Use Authentication: Yes
      Port for TLS/STARTTLS: 587
      */
     public static void main(String[] args)  {
         System.out.println("gidiyorereeeee");
         final String fromEmail = "swingjava98@gmail.com"; //requires valid gmail id
         final String password = "javamail"; // correct password for gmail id
         final String toEmail = "ugsuzf@gmail.com"; // can be any email id

         System.out.println("TLSEmail Start");
         Properties props = new Properties();
         props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
         props.put("mail.smtp.port", "587"); //TLS Port
         props.put("mail.smtp.auth", "true"); //enable authentication
         props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

         //create Authenticator object to pass in Session.getInstance argument
         Authenticator auth = new Authenticator() {
             //override the getPasswordAuthentication method
             protected PasswordAuthentication getPasswordAuthentication() {
                 return new PasswordAuthentication(fromEmail, password);
             }
         };
         Session session = Session.getInstance(props, auth);

         EmailUtil.sendEmail(session, toEmail,"Booking Info", ("Iyi gunler, "+NewJInternalFrame.arr[5] + " tarihinde saat "+NewJInternalFrame.arr[6]+" da olan,\n "
                        +NewJInternalFrame.arr[1]+" firmasindan ucak biletiniz alinmistir. \nIyi yolculuklar diler ve bizi tercih ettiginiz icin tesekkurler :)"));

     }
//        final String username = "javasiwng98@gmail.com";
//        final String password = "javamail";
//
//        Properties prop = new Properties();
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true"); //TLS
//
//        Session session = Session.getInstance(prop,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("from@gmail.com"));
//            message.setRecipients(
//                    Message.RecipientType.TO,
//                    InternetAddress.parse("to_username_a@gmail.com, to_username_b@yahoo.com")
//            );
//            message.setSubject("Testing Gmail TLS");
//            message.setText("Dear Mail Crawler,"
//                    + "\n\n Please do not spam my email!");
//
//            Transport.send(message);
//
//            System.out.println("Done");
//
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }

    


}

 class EmailUtil {
    /**
     * Utility method to send simple HTML email
     * @param session
     * @param toEmail
     * @param subject
     * @param body
     */
    public static void sendEmail(Session session, String toEmail, String subject, String body){
        try
        {
            MimeMessage msg = new MimeMessage(session);
            //set message headers
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");

            msg.setFrom(new InternetAddress("no_reply@example.com", "NoReply-JD"));

            msg.setReplyTo(InternetAddress.parse("no_reply@example.com", false));

            msg.setSubject(subject, "UTF-8");

            msg.setText(body, "UTF-8");

            msg.setSentDate(new Date());

            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            System.out.println("Message is ready");
            Transport.send(msg);

            System.out.println("EMail Sent Successfully!!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}