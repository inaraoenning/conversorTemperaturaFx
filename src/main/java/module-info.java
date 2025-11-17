module br.unipar.conversortemperaturafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.unipar.conversortemperaturafx to javafx.fxml;
    exports br.unipar.conversortemperaturafx;
}