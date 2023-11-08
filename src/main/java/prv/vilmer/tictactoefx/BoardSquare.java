package prv.vilmer.tictactoefx;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class BoardSquare extends Rectangle {
private int timesClicked = 0;
private double x;
private double y;
    BoardSquare(double x, double y){
        this.x = x;
        this.y = y;
        setLayoutX(x);
        setLayoutY(y);
        setWidth(200);
        setHeight(200);
        setFill(Color.WHITE);
        setStroke(Color.BLACK);
        setStrokeWidth(5);
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                onClick();
            }
        };
        addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
    }

    private boolean onClick(){
        timesClicked++;
        if(timesClicked==1){
            drawX();
            return true;
        }
         return false;
    }
    private void drawX(){
        Line line1 = new Line(x,y,x+200,y+200);
        Line line2 = new Line(x+200,y,x,y+200);
        line1.setStrokeWidth(5);
        line2.setStrokeWidth(5);
        Main.root.getChildren().addAll(line1,line2);
    }
}
