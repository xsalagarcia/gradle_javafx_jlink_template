/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradlepr;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {


    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new Pane(new Label("Hello World")));
        primaryStage.setTitle("Project demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
