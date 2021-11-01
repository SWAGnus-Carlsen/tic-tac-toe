package com.example.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Главное меню.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 920, 640);
        stage.setTitle("App");
        stage.setScene(scene);
        stage.show();
    }


//Проверка 1
    //Проверка 2
    public static void main(String[] args) {
        launch();
    }
}