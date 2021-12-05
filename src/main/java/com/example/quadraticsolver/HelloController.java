package com.example.quadraticsolver;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField numberA;
    public TextField numberB;
    public TextField numberC;
    public Label outPut;
    public Button calcBtn;

    public void calculate(ActionEvent actionEvent) {
        double a = Double.parseDouble(numberA.getText());
        double b = Double.parseDouble(numberB.getText());
        double c = Double.parseDouble(numberC.getText());

        double D = (b*b)-(4*a*c);
        double Dsqrt = Math.sqrt(D);

        if (Dsqrt > 0) {
            double x1 = (-b - Dsqrt)/(2*a);
            double x2 = (-b + Dsqrt)/(2*a);

            outPut.setText(String.format("x1= %f\nx2= %f", x1, x2));
        } else if(Dsqrt == 0) {
            double x = (-b + Dsqrt)/(2*a);
            outPut.setText(String.format("x1= %f", x));
        } else {
            outPut.setText("Nem megoldhato");
        }

    }
}