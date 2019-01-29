/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverproject;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Asus
 */
public class ServerProjectController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        try {
            // TODO
            
            ServerSocket server = new ServerSocket(6666);
            Socket connection = server.accept();
            DataInputStream input = new DataInputStream(connection.getInputStream());  
            
            String s = input.readUTF();
            
            if(s.equals("file")){

                FileInputStream fr = new FileInputStream("E:\\1-2\\JAVA\\New Text Document.txt");

                byte[] b = new byte[2002];
                fr.read(b, 0, b.length);

                OutputStream output = connection.getOutputStream();
                output.write(b, 0, b.length);

            }
        } catch (IOException ex) {
            Logger.getLogger(ServerProjectController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    
    
}
