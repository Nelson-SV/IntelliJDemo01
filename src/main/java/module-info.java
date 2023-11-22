module com.example.intellijdemo01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intellijdemo01 to javafx.fxml;
    exports com.example.intellijdemo01;
}