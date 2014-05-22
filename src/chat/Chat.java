/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * * @author Xerazx
 */
public class Chat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SignIn s = new SignIn();
        s.show();
    }

    public static void sendMessage(String s) {
        try {
            Socket socket = null;
            OutputStreamWriter osw;
            String str = "Hello World";
            socket = new Socket("localhost", 4014);
            osw = new OutputStreamWriter(socket.getOutputStream(), 
            "UTF-8"
            );
                osw.write(str, 0, str.length());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}