package project;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Scene2Controller implements Initializable {
    
    @FXML
    Button Maths;
    
    @FXML
    public void ShowMathsCourse(ActionEvent event) throws IOException{
    try {
    byte[] b = new byte[2002];
    
    Socket client = new Socket("localhost", 6666);
    
    DataOutputStream output = new DataOutputStream(client.getOutputStream());
    
    output.writeUTF("file");
    
    InputStream input = client.getInputStream();
    FileOutputStream fileOutput = new FileOutputStream("E:\\1-2\\JAVA\\test.txt");
    
    input.read(b, 0, b.length);
    
    fileOutput.write(b, 0, b.length);
    
    } catch (IOException ex) {
    Logger.getLogger(Scene2Controller.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
