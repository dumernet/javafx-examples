package fr.dumernet.javafx.examples.first_application;

import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class FirstApplication extends javafx.application.Application {

    @Override
    public void start(Stage stage) {
        final Rectangle2D screenBounds = Screen.getPrimary().getBounds();
        final String javaVersion = SystemInfo.javaVersion();
        final String javafxVersion = SystemInfo.javafxVersion();
        final Label label = new Label(String.format("java version: %s - javafx version: %s", javaVersion, javafxVersion));

        final StackPane pane = new StackPane(label);
        final Scene scene = new Scene(pane);

        stage.setTitle("My First JavaFX App");
        stage.setScene(scene);
        setSize(stage, screenBounds);
        stage.show();
        setPosition(stage, screenBounds);
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
