package fr.dumernet.javafx.examples.first_fxml_application;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class FirstFxmlApplication extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {
        final Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        final Scene scene = new Scene(loadFXML("/view/scene.fxml"));
        stage.setScene(scene);
        stage.setTitle("My First JavaFX App");
        setSize(stage, screenBounds);
        stage.show();
        setPosition(stage, screenBounds);
    }

    private static Parent loadFXML(String fxml) throws IOException {
        final FXMLLoader fxmlLoader = new FXMLLoader(FirstFxmlApplication.class.getResource(fxml));
        return fxmlLoader.load();
    }

    private void setSize(Stage stage, Rectangle2D screenBounds) {
        stage.setWidth(screenBounds.getWidth()/2);
        stage.setHeight(screenBounds.getHeight()/2);
    }

    private void setPosition(Stage stage, Rectangle2D screenBounds) {
        stage.setX((screenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((screenBounds.getHeight() - stage.getHeight()) / 2);
    }

    public static void main(String[] args) {
        launch();
    }

}
