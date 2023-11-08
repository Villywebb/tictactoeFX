module prv.vilmer.tictactoefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens prv.vilmer.tictactoefx to javafx.fxml;
    exports prv.vilmer.tictactoefx;
}