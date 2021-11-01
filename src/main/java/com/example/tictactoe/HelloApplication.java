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
    //Проверка 3
    //Проверка 4
    //Проверка 5
    //Проверка 6
    public static void main(String[] args) {
        launch();
    }
}
