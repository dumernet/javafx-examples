module fr.dumernet.javafx.examples.first_fxml_application {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.dumernet.javafx.examples.first_fxml_application to javafx.fxml;
    exports fr.dumernet.javafx.examples.first_fxml_application;
}
