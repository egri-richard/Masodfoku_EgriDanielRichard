module com.example.quadraticsolver {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quadraticsolver to javafx.fxml;
    exports com.example.quadraticsolver;
}