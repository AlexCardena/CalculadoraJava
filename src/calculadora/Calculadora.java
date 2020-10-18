/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Alex
 */
public class Calculadora extends Application {
        Double numero1=0.0,numero2=0.0;
        int operacion=0,tamanio=0;
        String respuesta="";
    @Override
    public void start(Stage primaryStage) {
        
        TextField caja = new TextField();
        caja.setEditable(false);
        Button btn1 = new Button();
        btn1.setText("1");
        btn1.setStyle("-fx-font-size:15");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn1.getText());
            }
        });
        Button btn2 = new Button();
        btn2.setText("2");
        btn2.setStyle("-fx-font-size:15");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn2.getText());
            }
        });
        Button btn3 = new Button();
        btn3.setText("3");
        btn3.setStyle("-fx-font-size:15");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn3.getText());
            }
        });
        Button btn4 = new Button();
        btn4.setText("4");
        btn4.setStyle("-fx-font-size:15");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn4.getText());
            }
        });
        Button btn5 = new Button();
        btn5.setText("5");
        btn5.setStyle("-fx-font-size:15");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn5.getText());
            }
        });
        Button btn6 = new Button();
        btn6.setText("6");
        btn6.setStyle("-fx-font-size:15");
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn6.getText());
            }
        });
        Button btn7 = new Button();
        btn7.setText("7");
        btn7.setStyle("-fx-font-size:15");
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn7.getText());
            }
        });
        Button btn8 = new Button();
        btn8.setText("8");
        btn8.setStyle("-fx-font-size:15");
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn8.getText());
            }
        });
        Button btn9 = new Button();
        btn9.setText("9");
        btn9.setStyle("-fx-font-size:15");
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn9.getText());
            }
        });
        Button btn0 = new Button();
        btn0.setText("0");
        btn0.setStyle("-fx-font-size:15");
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                caja.setText(caja.getText()+btn0.getText());
            }
        });
        //Botones de operacion
        Button btnsuma = new Button();
        btnsuma.setStyle("-fx-font-size:15");
        btnsuma.setText("+");
        
        Button btnmultiplicacion = new Button();
        btnmultiplicacion.setStyle("-fx-font-size:15");
        btnmultiplicacion.setText("*");
        
        Button btndivision = new Button();
        btndivision.setStyle("-fx-font-size:15");
        btndivision.setText("/");
        
        Button btnresta = new Button();
        btnresta.setStyle("-fx-font-size:15");
        btnresta.setText("-");
        
        btnsuma.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero1=Double.parseDouble(caja.getText());
                operacion=0;
                caja.setText(caja.getText()+"+");
                tamanio=caja.getText().length();
                btnsuma.setDisable(true);
                btnresta.setDisable(true);
                btnmultiplicacion.setDisable(true);
                btndivision.setDisable(true);
            }
        });
        btnresta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero1=Double.parseDouble(caja.getText());
                operacion=1;
                caja.setText(caja.getText()+"-");
                tamanio=caja.getText().length();
                btnsuma.setDisable(true);
                btnresta.setDisable(true);
                btnmultiplicacion.setDisable(true);
                btndivision.setDisable(true);
            }
        });
        btnmultiplicacion.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero1=Double.parseDouble(caja.getText());
                operacion=2;
                caja.setText(caja.getText()+"*");
                tamanio=caja.getText().length();
                btnsuma.setDisable(true);
                btnresta.setDisable(true);
                btnmultiplicacion.setDisable(true);
                btndivision.setDisable(true);
            }
        });
        btndivision.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero1=Double.parseDouble(caja.getText());
                operacion=3;
                caja.setText(caja.getText()+"/");
                tamanio=caja.getText().length();
                btnsuma.setDisable(true);
                btnresta.setDisable(true);
                btnmultiplicacion.setDisable(true);
                btndivision.setDisable(true);
            }
        });
        Button btnigual = new Button();
        btnigual.setText("=");
        btnigual.setStyle("-fx-font-size:15");
        btnigual.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero2=Double.parseDouble(caja.getText().substring(tamanio));
                switch (operacion)
                {
                   case 0:
                        numero1=numero1+numero2;
                        System.out.println(numero1);
                        respuesta=numero1+"";
                        break;
                   case 1:
                        numero1=numero1-numero2;
                        System.out.println(numero1);
                        respuesta=numero1+"";
                        break;
                   case 2:
                        numero1=numero1*numero2;
                        System.out.println(numero1);
                        respuesta=numero1+"";
                        break;
                   case 3:
                       if(numero2!=0){
                           numero1=numero1/numero2;
                           System.out.println(numero1);
                           respuesta=numero1+"";
                       } 
                       else{respuesta="ERROR";}
                       break;
                   default:
                     System.out.println("**ERROR**");
                     break;
                }
                caja.setText(respuesta);
                btnigual.setDisable(true);
            }
        });
        Button btnreset = new Button();
        btnreset.setText("RESET");
        btnreset.setStyle("-fx-font-size:15");
        btnreset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                numero1=0.0;
                numero2=0.0;
                tamanio=0;
                operacion=0;
                respuesta="";
                caja.setText("");
                btnsuma.setDisable(false);
                btnresta.setDisable(false);
                btnmultiplicacion.setDisable(false);
                btndivision.setDisable(false);
                btnigual.setDisable(false);
            }
        });
        
        
        
        GridPane root = new GridPane();
        GridPane.setRowIndex(caja, 0);
        GridPane.setColumnIndex(caja, 3);
        root.getChildren().add(caja);
        
        GridPane.setRowIndex(btn1, 1);
        GridPane.setColumnIndex(btn1, 0);
        root.getChildren().add(btn1);
        GridPane.setRowIndex(btn2, 1);
        GridPane.setColumnIndex(btn2, 1);
        root.getChildren().add(btn2);
        GridPane.setRowIndex(btn3, 1);
        GridPane.setColumnIndex(btn3, 2);
        root.getChildren().add(btn3);
        
        GridPane.setRowIndex(btn4, 2);
        GridPane.setColumnIndex(btn4, 0);
        root.getChildren().add(btn4);
        GridPane.setRowIndex(btn5, 2);
        GridPane.setColumnIndex(btn5, 1);
        root.getChildren().add(btn5);
        GridPane.setRowIndex(btn6, 2);
        GridPane.setColumnIndex(btn6, 2);
        root.getChildren().add(btn6);
        
        GridPane.setRowIndex(btn7, 3);
        GridPane.setColumnIndex(btn7, 0);
        root.getChildren().add(btn7);
        GridPane.setRowIndex(btn8, 3);
        GridPane.setColumnIndex(btn8, 1);
        root.getChildren().add(btn8);
        GridPane.setRowIndex(btn9, 3);
        GridPane.setColumnIndex(btn9, 2);
        root.getChildren().add(btn9);
        
        GridPane.setRowIndex(btn0, 4);
        GridPane.setColumnIndex(btn0, 1);
        root.getChildren().add(btn0);
        
        //Operaciones
        GridPane.setRowIndex(btnsuma, 1);
        GridPane.setColumnIndex(btnsuma, 5);
        root.getChildren().add(btnsuma);
        GridPane.setRowIndex(btnresta, 2);
        GridPane.setColumnIndex(btnresta, 5);
        root.getChildren().add(btnresta);
        GridPane.setRowIndex(btnmultiplicacion, 3);
        GridPane.setColumnIndex(btnmultiplicacion, 5);
        root.getChildren().add(btnmultiplicacion);
        GridPane.setRowIndex(btndivision, 4);
        GridPane.setColumnIndex(btndivision, 5);
        root.getChildren().add(btndivision);
        GridPane.setRowIndex(btnigual, 5);
        GridPane.setColumnIndex(btnigual, 5);
        root.getChildren().add(btnigual);
        GridPane.setRowIndex(btnreset, 1);
        GridPane.setColumnIndex(btnreset, 6);
        root.getChildren().add(btnreset);
        
        
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
}
