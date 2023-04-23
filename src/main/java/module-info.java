module java_fx.heartbeat {
    requires javafx.controls;
    requires javafx.fxml;


    opens java_fx.heartbeat to javafx.fxml;
    exports java_fx.heartbeat;
}