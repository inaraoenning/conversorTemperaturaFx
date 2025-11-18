package br.unipar.conversortemperaturafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConversorController {
    @FXML
    private TextField txtValorTemperatura;

    @FXML
    private Label lblResultado;

    @FXML
    private Button btnCelsius;

    @FXML
    private Button btnFarenheit;

    @FXML
    public void initialize() {
        // Pode deixar vazio, se não precisar inicializar nada
    }

    // Fahrenheit → Celsius
    @FXML
    public void btnCelsius() {
        //(32 °F − 32) × 5/9 = 0 °C
        try {
            double temp = Double.parseDouble(txtValorTemperatura.getText().trim());
            double resultado = (temp - 32) / 1.8;
            lblResultado.setText(String.format("%.1f ºC", resultado));

        } catch (NumberFormatException e) {
            lblResultado.setText("Erro: Valor Inválido!");
        }
    }

    //Celsius to Farenheit
    @FXML
    public void btnFarenheit() {
        //(30 °C × 9/5) + 32 = 86 °F
        try {
            double temp = Double.parseDouble(txtValorTemperatura.getText().trim());
            double resultado = (temp * 1.8) + 32;

            lblResultado.setText(String.format("%.1f °F", resultado));
        } catch (NumberFormatException e) {
            lblResultado.setText("Erro: Valor Inválido!");
        }
    }

}
