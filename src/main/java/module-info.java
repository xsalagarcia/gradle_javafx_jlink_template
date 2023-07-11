module gradlepr.main {
    requires javafx.controls;
    requires javafx.fxml;


    opens gradlepr to javafx.fxml;
    exports gradlepr;
}