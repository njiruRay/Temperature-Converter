module com.example.converterfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires java.logging;
    requires java.desktop;

    opens com.app.converter to javafx.fxml;
    exports com.app.converter;
}