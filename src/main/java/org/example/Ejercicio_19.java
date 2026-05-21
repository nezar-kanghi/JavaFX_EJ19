package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio_19 extends Application {

    @Override
    public void start(Stage stage) {

        Button btnAbrir = new Button("Abrir ventana");

        btnAbrir.setOnAction(event -> {

            // Crear la ventana secundaria
            Stage ventanaSecundaria = new Stage();
            ventanaSecundaria.setTitle("Ventana secundaria");

            Label lblMensaje = new Label("Esta es la ventana secundaria");

            VBox layout = new VBox(10);
            layout.getChildren().add(lblMensaje);

            Scene scene = new Scene(layout, 300, 100);
            ventanaSecundaria.setScene(scene);
            ventanaSecundaria.show();
        });

        VBox layout = new VBox(10);
        layout.getChildren().add(btnAbrir);

        Scene scene = new Scene(layout, 250, 100);
        stage.setTitle("Ventana principal");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}