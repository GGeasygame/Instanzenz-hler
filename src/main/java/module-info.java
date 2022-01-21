module ch.ictbz.instanzenzaehler.instanzenzaehler {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.ictbz.instanzenzaehler.instanzenzaehler to javafx.fxml;
    exports ch.ictbz.instanzenzaehler.instanzenzaehler;
}