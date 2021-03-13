package fr.dumernet.javafx.examples.first_fxml_application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ApplicationController {

    @FXML
    private Label label;

    @FXML
    public void initialize() {
        final String javaVersion = SystemInfo.javaVersion();
        final String javafxVersion = SystemInfo.javafxVersion();
        label.setText(String.format("java version: %s - javafx version: %s", javaVersion, javafxVersion));
    }

}
