package com.example.realestatesystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Objects;

class CreateCondoHandler implements EventHandler<ActionEvent>, varr{
    Stage primaryStage = new Stage();
    protected CreateCondoHandler() {
    }
    protected CreateCondoHandler(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    public void handle(ActionEvent actionEvent) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        final TextField StreetAddress = new TextField();
        gridPane.add(new Label("Street Address:"), 0, 0);
        gridPane.add(StreetAddress, 1, 0);

        final TextField City = new TextField();
        gridPane.add(new Label("City:"), 0, 1);
        gridPane.add(City, 1, 1);

        final TextField State = new TextField();
        gridPane.add(new Label("State:"), 0, 2);
        gridPane.add(State, 1, 2);

        final TextField PostalCode = new TextField();
        gridPane.add(new Label("Postal Code:"), 0, 3);
        gridPane.add(PostalCode, 1, 3);

        final TextField nobed = new TextField();
        gridPane.add(new Label("Number of bedrooms:"), 0, 4);
        gridPane.add(nobed, 1, 4);

        final TextField nobath = new TextField();
        gridPane.add(new Label("Number of bathrooms:"), 0, 5);
        gridPane.add(nobath, 1, 5);

        final TextField PurchasePrice = new TextField();
        gridPane.add(new Label("Purchase Price:"), 0, 6);
        gridPane.add(PurchasePrice, 1, 6);

        final TextField tax = new TextField();
        gridPane.add(new Label("Annual Tax:"), 0, 7);
        gridPane.add(tax, 1, 7);

        final TextField Manfee = new TextField();
        gridPane.add(new Label("Management Fee:"), 0, 8);
        gridPane.add(Manfee, 1, 8);

        gridPane.setAlignment(Pos.CENTER);
        StreetAddress.setAlignment(Pos.BOTTOM_RIGHT);
        City.setAlignment(Pos.BOTTOM_RIGHT);
        State.setAlignment(Pos.BOTTOM_RIGHT);
        PostalCode.setAlignment(Pos.BOTTOM_RIGHT);
        nobed.setAlignment(Pos.BOTTOM_RIGHT);
        nobath.setAlignment(Pos.BOTTOM_RIGHT);
        PurchasePrice.setAlignment(Pos.BOTTOM_RIGHT);
        tax.setAlignment(Pos.BOTTOM_RIGHT);
        Manfee.setAlignment(Pos.BOTTOM_RIGHT);

        Label lb1 =new Label("- please enter alphabets only");
        lb1.setTextFill(Color.RED);
        gridPane.add(lb1, 2, 0);
        lb1.setVisible(false);
        Label lb2 =new Label("- please enter alphabets only");
        lb2.setTextFill(Color.RED);
        gridPane.add(lb2,2,1);
        lb2.setVisible(false);
        Label lb3 =new Label("- please enter alphabets only");
        lb3.setTextFill(Color.RED);
        gridPane.add(lb3,2,2);
        lb3.setVisible(false);
        Label lb4 = new Label("- please enter numbers only");
        lb4.setTextFill(Color.RED);
        gridPane.add(lb4,2,3);
        lb4.setVisible(false);
        Label lb5 = new Label("- please enter numbers only");
        lb5.setTextFill(Color.RED);
        gridPane.add(lb5,2,4);
        lb5.setVisible(false);
        Label lb6 = new Label("- please enter numbers only");
        lb6.setTextFill(Color.RED);
        gridPane.add(lb6,2,5);
        lb6.setVisible(false);
        Label lb7 = new Label("- please enter numbers only");
        lb7.setTextFill(Color.RED);
        gridPane.add(lb7,2,6);
        lb7.setVisible(false);
        Label lb8 = new Label("- please enter numbers only");
        lb8.setTextFill(Color.RED);
        gridPane.add(lb8,2,7);
        lb8.setVisible(false);
        Label lb9 = new Label("- please enter numbers only");
        lb9.setTextFill(Color.RED);
        gridPane.add(lb9,2,8);
        lb9.setVisible(false);

        Button Okay = new Button("Submit");
        gridPane.add(Okay, 1, 9);
        Okay.setMinWidth(200);

        Label lb11 = new Label("- please enter any value");
        lb11.setTextFill(Color.RED);
        gridPane.add(lb11,2,0);
        lb11.setVisible(false);
        Label lb12 = new Label("- please enter any value");
        lb12.setTextFill(Color.RED);
        gridPane.add(lb12,2,1);
        lb12.setVisible(false);
        Label lb13 = new Label("- please enter any value");
        lb13.setTextFill(Color.RED);
        gridPane.add(lb13,2,2);
        lb13.setVisible(false);
        Label lb14 = new Label("- please enter any value");
        lb14.setTextFill(Color.RED);
        gridPane.add(lb14,2,3);
        lb14.setVisible(false);
        Label lb15 = new Label("- please enter any value");
        lb15.setTextFill(Color.RED);
        gridPane.add(lb15,2,4);
        lb15.setVisible(false);
        Label lb16 = new Label("- please enter any value");
        lb16.setTextFill(Color.RED);
        gridPane.add(lb16,2,5);
        lb16.setVisible(false);
        Label lb17 = new Label("- please enter any value");
        lb17.setTextFill(Color.RED);
        gridPane.add(lb17,2,6);
        lb17.setVisible(false);
        Label lb18 = new Label("- please enter any value");
        lb18.setTextFill(Color.RED);
        gridPane.add(lb18,2,7);
        lb18.setVisible(false);
        Label lb19 = new Label("- please enter any value");
        lb19.setTextFill(Color.RED);
        gridPane.add(lb19,2,8);
        lb19.setVisible(false);

        Okay.setOnAction(e ->
        {String b=StreetAddress.getText();
            String c=City.getText();
            String d=State.getText();
            String e2=PostalCode.getText();
            String f=nobed.getText();
            String g=nobath.getText();
            String h=PurchasePrice.getText();
            String i=tax.getText();
            String j=Manfee.getText();

            Blist.add(b);
            Blist.add(c);
            Blist.add(d);
            Blist.add(e2);
            Blist.add(f);
            Blist.add(g);
            Blist.add(h);
            Blist.add(i);
            Blist.add(j);

            if (Objects.equals(b, ""))
            {
                lb11.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            }
            else{
                lb11.setVisible(false);
            }
            try {
                Integer.parseInt(b);
                lb1.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            } catch (NumberFormatException e1) {
                lb1.setVisible(false);
            }
            if (Objects.equals(c, ""))
            {
                lb12.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            }
            else{
                lb12.setVisible(false);
            }
            try {
                Integer.parseInt(c);
                lb2.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            } catch (NumberFormatException e1) {
                lb2.setVisible(false);
            }
            if (Objects.equals(d, ""))
            {
                lb13.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            }
            else{
                lb13.setVisible(false);
            }
            try {
                Integer.parseInt(d);
                lb3.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            } catch (NumberFormatException e1) {
                lb3.setVisible(false);
            }
            if (Objects.equals(e2, ""))
            {
                lb14.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            }
            else{
                lb14.setVisible(false);
            }
            if (!Objects.equals(e2, "")) {
                try {
                    Integer.parseInt(e2);
                    lb4.setVisible(false);
                } catch (NumberFormatException e1) {
                    lb4.setVisible(true);
                    Blist.remove(b);
                    Blist.remove(c);
                    Blist.remove(d);
                    Blist.remove(e2);
                    Blist.remove(f);
                    Blist.remove(g);
                    Blist.remove(h);
                    Blist.remove(i);
                    Blist.remove(j);
                }
            }
            if (Objects.equals(f, ""))
            {
                lb15.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            }
            else{
                lb15.setVisible(false);
            }
            if (!Objects.equals(f, "")) {
                try {
                    Integer.parseInt(f);
                    lb5.setVisible(false);
                } catch (NumberFormatException e1) {
                    lb5.setVisible(true);
                    Blist.remove(b);
                    Blist.remove(c);
                    Blist.remove(d);
                    Blist.remove(e2);
                    Blist.remove(f);
                    Blist.remove(g);
                    Blist.remove(h);
                    Blist.remove(i);
                    Blist.remove(j);
                }
            }
            if (Objects.equals(g, ""))
            {
                lb16.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            }
            else{
                lb16.setVisible(false);
            }
            if (!Objects.equals(g, "")) {
                try {
                    Integer.parseInt(g);
                    lb6.setVisible(false);
                } catch (NumberFormatException e1) {
                    lb6.setVisible(true);
                    Blist.remove(b);
                    Blist.remove(c);
                    Blist.remove(d);
                    Blist.remove(e2);
                    Blist.remove(f);
                    Blist.remove(g);
                    Blist.remove(h);
                    Blist.remove(i);
                    Blist.remove(j);
                }
            }
            if (Objects.equals(h, ""))
            {
                lb17.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            }
            else{
                lb17.setVisible(false);
            }
            if (!Objects.equals(h, "")) {
                try {
                    Integer.parseInt(h);
                    lb7.setVisible(false);
                } catch (NumberFormatException e1) {
                    lb7.setVisible(true);
                    Blist.remove(b);
                    Blist.remove(c);
                    Blist.remove(d);
                    Blist.remove(e2);
                    Blist.remove(f);
                    Blist.remove(g);
                    Blist.remove(h);
                    Blist.remove(i);
                    Blist.remove(j);
                }
            }
            if (Objects.equals(i, ""))
            {
                lb18.setVisible(true);
                Blist.remove(b);
                Blist.remove(c);
                Blist.remove(d);
                Blist.remove(e2);
                Blist.remove(f);
                Blist.remove(g);
                Blist.remove(h);
                Blist.remove(i);
                Blist.remove(j);
            }
            else{
                lb18.setVisible(false);
            }
            if (!Objects.equals(i, "")) {
                try {
                    Integer.parseInt(i);
                    lb8.setVisible(false);
                } catch (NumberFormatException e1) {
                    lb8.setVisible(true);
                    Blist.remove(b);
                    Blist.remove(c);
                    Blist.remove(d);
                    Blist.remove(e2);
                    Blist.remove(f);
                    Blist.remove(g);
                    Blist.remove(h);
                    Blist.remove(i);
                    Blist.remove(j);
                }
            }
                if (Objects.equals(j, ""))
                {
                    lb19.setVisible(true);
                    Blist.remove(b);
                    Blist.remove(c);
                    Blist.remove(d);
                    Blist.remove(e2);
                    Blist.remove(f);
                    Blist.remove(g);
                    Blist.remove(h);
                    Blist.remove(i);
                    Blist.remove(j);
                }
                else{
                    lb19.setVisible(false);
                }
                if (!Objects.equals(j, "")) {
                    try {
                        Integer.parseInt(j);
                        lb9.setVisible(false);
                    } catch (NumberFormatException e1) {
                        lb9.setVisible(true);
                        Blist.remove(b);
                        Blist.remove(c);
                        Blist.remove(d);
                        Blist.remove(e2);
                        Blist.remove(f);
                        Blist.remove(g);
                        Blist.remove(h);
                        Blist.remove(i);
                        Blist.remove(j);
                    }
                }
        });


        Button returnMain = new Button("Return to Main Menu");
        gridPane.add(returnMain, 1, 10);
        returnMain.setMinWidth(200);
        returnMain.setOnAction(new MainMenuHandler(primaryStage));

        Button exitProgram = new Button("Exit Program");
        gridPane.add(exitProgram, 1, 11);
        exitProgram.setMinWidth(200);
        exitProgram.setOnAction(new ExitHandler());

        GridPane.setHalignment(returnMain, HPos.CENTER);
        GridPane.setHalignment(Okay, HPos.CENTER);
        GridPane.setHalignment(exitProgram, HPos.CENTER);

        Scene scene = new Scene(gridPane, 500, 500);
        primaryStage.setTitle("Rohith Real Estate");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}