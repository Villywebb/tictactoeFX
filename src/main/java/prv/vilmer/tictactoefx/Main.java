package prv.vilmer.tictactoefx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

    char[][] board = new char[][]{{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};

    ArrayList<BoardSquare> BoardSquares;
   public static Group root;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        BoardSquares = new ArrayList<>();
        root = new Group();
        Scene scene = new Scene(root, 600, 600);
        stage.setTitle("tictactoe");
        stage.setScene(scene);
        stage.show();
        drawBoard();
    }

    public void drawBoard() {
        BoardSquare b;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b = new BoardSquare(i * 200, j * 200);
                BoardSquares.add(b);
                root.getChildren().add(b);
            }
        }
    }
}