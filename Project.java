package project;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Project extends Application {
    
    Stage PrimaryStage;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        PrimaryStage = new Stage();
        
        PrimaryStage = stage;
        
        Parent root = FXMLLoader.load(getClass().getResource("Project.fxml"));
        
        Scene scene = new Scene(root);
        
        PrimaryStage.setScene(scene);
        
        PrimaryStage.show();
    }
    /*
    public void ViewHome() throws IOException
    {
    // XML Loading using FXMLLoader
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("Project.fxml"));
    Parent root = loader.load();
    
    // Loading the controller
    ProjectController controller = loader.getController();
    controller.setMain(this);
    
    // Set the primary stage
    PrimaryStage.setTitle("Login");
    PrimaryStage.setScene(new Scene(root, 400, 250));
    PrimaryStage.show();
    }
    */
    public static void main(String[] args) {
        launch(args);
        
        
    }
    
}
