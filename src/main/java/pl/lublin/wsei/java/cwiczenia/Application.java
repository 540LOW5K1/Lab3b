package pl.lublin.wsei.java.cwiczenia;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("gusInfoGraphic.fxml"));
        Parent root = fxmlLoader.load();
        Controller controller = fxmlLoader.getController();
        controller.setHostServices(this.getHostServices());
        controller.setStage(stage);

        stage.setTitle("Hello!");
        stage.setScene(new Scene(root, 800, 700));
        stage.show();


    }

    public static void main(String[] args) {
        javafx.application.Application.launch();
    }
}