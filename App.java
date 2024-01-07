package com.mycompany.projectlab4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    

      

    @Override
    public void start(Stage stage) {
            
         Rectangle interfaceHouse = new Rectangle();
        interfaceHouse.setWidth(200);
        interfaceHouse.setHeight(160);
        interfaceHouse.setFill(Color.BLACK);
        interfaceHouse.setStroke(Color.BLACK);
        interfaceHouse.setX(90);
        interfaceHouse.setY(310);
        
                // Create a polygon (roof)
        Polygon roof = new Polygon();
        roof.getPoints().addAll(
                70.0, 310.0,    // Vertex 1 (x, y)
                300.0, 310.0,    // Vertex 2 (x, y)
                190.0, 200.0     // Vertex 3 (x, y)
        );

        //window
        Rectangle w1 = new Rectangle(135,360,30,30);
        w1.setFill(Color.WHITE);
        Rectangle w2 = new Rectangle(170,360,30,30);
        w2.setFill(Color.WHITE);
        Rectangle w3 = new Rectangle(135,395,30,30);
        w3.setFill(Color.WHITE);
        Rectangle w4 = new Rectangle(170,395,30,30);
        w4.setFill(Color.WHITE);
        
     Rectangle Housedoor = new Rectangle();
        Housedoor.setWidth(70);
        Housedoor.setHeight(120);
        Housedoor.setFill(Color.WHITE);
        Housedoor.setStroke(Color.BLACK);
        Housedoor.setX(210);
        Housedoor.setY(340);
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setCenterX(220);
        circle.setCenterY(390);
        circle.setFill(Color.BLACK);
        

         //Colors
        Text clr=new Text("Colors: ");
        String[] colors = {"Red","Green", "Yellow", "Blue"};
        ComboBox<String> cbo = new ComboBox<>();
        cbo.setValue("Red");
        cbo.getItems().addAll(colors);
        cbo.setVisibleRowCount(4);//for setting the number of visible items in the list
        HBox cbocolors=new HBox(10,clr,cbo);
        cbocolors.setAlignment(Pos.CENTER);
        
        //Select the house parts
        Text hp=new Text("house part: ");
        RadioButton w = new RadioButton("Window");
        RadioButton d = new RadioButton("Door");
        RadioButton r = new RadioButton("Roof");
        RadioButton i = new RadioButton("Interface");
        
        ToggleGroup group1 = new ToggleGroup();
        w.setToggleGroup(group1);
        d.setToggleGroup(group1);
        r.setToggleGroup(group1);
        i.setToggleGroup(group1);
        
        HBox hSelect=new HBox(10,hp,w,d,r,i);
        hSelect.setAlignment(Pos.CENTER);
   
       
       //Add strok? to door and window
        CheckBox strok=new CheckBox("Add strok?");
        
        //Reset to white with black strok
        Button reset=new Button("Reset Colors");

        
        
        Pane pane=new Pane(roof,interfaceHouse,w1,w2,w3,w4,Housedoor,circle);
        pane.setPrefSize(500, 500);
        pane.setStyle("-fx-border-color: black");
        VBox usercontrol=new VBox(15,cbocolors,hSelect,strok,reset);
        usercontrol.setAlignment(Pos.CENTER);
        
        HBox allscreen=new HBox(10,pane,usercontrol);
        allscreen.setPadding(new Insets(20,20,20,20));
        //actions
        //change color base on the part of house
        //window
         w.setOnAction(e -> { 
         if (cbo.getValue().equals("Red")) {
             w1.setFill(Color.RED);
             w2.setFill(Color.RED);
             w3.setFill(Color.RED);
             w4.setFill(Color.RED);}
         else if (cbo.getValue().equals("Green")) {
             w1.setFill(Color.GREEN);
             w2.setFill(Color.GREEN);
             w3.setFill(Color.GREEN);
             w4.setFill(Color.GREEN);}
         else if (cbo.getValue().equals("Yellow")) {
             w1.setFill(Color.YELLOW);
             w2.setFill(Color.YELLOW);
             w3.setFill(Color.YELLOW);
             w4.setFill(Color.YELLOW);}
         else {
             w1.setFill(Color.BLUE);
             w2.setFill(Color.BLUE);
             w3.setFill(Color.BLUE);
             w4.setFill(Color.BLUE);}
        });
     //door
     d.setOnAction(e -> { 
         if (cbo.getValue().equals("Red")) {
             Housedoor.setFill(Color.RED);}
         else if (cbo.getValue().equals("Green")) {
             Housedoor.setFill(Color.GREEN);}
         else if (cbo.getValue().equals("Yellow")) {
             Housedoor.setFill(Color.YELLOW);}
         else {
             Housedoor.setFill(Color.BLUE);}});
     //roof
     r.setOnAction(e -> { 
         if (cbo.getValue().equals("Red")) {
             roof.setFill(Color.RED);}
         else if (cbo.getValue().equals("Green")) {
             roof.setFill(Color.GREEN);}
         else if (cbo.getValue().equals("Yellow")) {
             roof.setFill(Color.YELLOW);}
         else {
             roof.setFill(Color.BLUE);}});
     //interface house
     i.setOnAction(e -> { 
         if (cbo.getValue().equals("Red")) {
             interfaceHouse.setFill(Color.RED);}
         else if (cbo.getValue().equals("Green")) {
             interfaceHouse.setFill(Color.GREEN);}
         else if (cbo.getValue().equals("Yellow")) {
             interfaceHouse.setFill(Color.YELLOW);}
         else {
             interfaceHouse.setFill(Color.BLUE);}});
     //reset  
         reset.setOnAction(e -> { 
                w1.setFill(Color.WHITE);
             w1.setFill(Color.WHITE);
             w2.setFill(Color.WHITE);
             w3.setFill(Color.WHITE);
             w4.setFill(Color.WHITE); 
             Housedoor.setFill(Color.WHITE);
             roof.setFill(Color.WHITE);
             interfaceHouse.setFill(Color.WHITE);
             
             w1.setStroke(Color.BLACK);
             w1.setStroke(Color.BLACK);
             w2.setStroke(Color.BLACK);
             w3.setStroke(Color.BLACK);
             w4.setStroke(Color.BLACK); 
             Housedoor.setStroke(Color.BLACK);
             roof.setStroke(Color.BLACK);
             interfaceHouse.setStroke(Color.BLACK);});
     //ADD STROK  
     strok.setOnAction(e -> { 
         if(strok.isSelected()){
             w1.setStroke(Color.BLACK);
             w2.setStroke(Color.BLACK);
             w3.setStroke(Color.BLACK);
             w4.setStroke(Color.BLACK); 
             Housedoor.setStroke(Color.BLACK);}
         else{ //edit
              w1.setStroke(Color.TRANSPARENT);
             w2.setStroke(Color.TRANSPARENT);
             w3.setStroke(Color.TRANSPARENT);
             w4.setStroke(Color.TRANSPARENT); 
             Housedoor.setStroke(Color.TRANSPARENT);
         }  });
         //key event
         allscreen.setOnKeyPressed(e -> {
          if (e.getCode() == KeyCode.DELETE) {
                   w1.setVisible(false);
             w1.setVisible(false);
             w2.setVisible(false);
             w3.setVisible(false);
             w4.setVisible(false); 
             Housedoor.setVisible(false);
             roof.setVisible(false);
             interfaceHouse.setVisible(false);
             circle.setVisible(false);
              e.consume();}
          
          else if(e.getCode() == KeyCode.SHIFT) {
                   w1.setVisible(true);
          w1.setVisible(true);
             w2.setVisible(true);
             w3.setVisible(true);
             w4.setVisible(true); 
             Housedoor.setVisible(true);
             roof.setVisible(true);
             interfaceHouse.setVisible(true);
             circle.setVisible(true);
              e.consume();}
         });
         //mouse event
         allscreen.setOnMouseClicked(e ->{
          if(e.getTarget()== pane){
            pane.setStyle("-fx-background-color: lightgreen");
          }
         });
        //mouse event(change color by click on specific part)
         pane.setOnMouseClicked(e ->{
          if(e.getTarget()== Housedoor){
               if (cbo.getValue().equals("Red")) {
             Housedoor.setFill(Color.RED);}
         else if (cbo.getValue().equals("Green")) {
             Housedoor.setFill(Color.GREEN);}
         else if (cbo.getValue().equals("Yellow")) {
             Housedoor.setFill(Color.YELLOW);}
         else {
             Housedoor.setFill(Color.BLUE);}
          }
                      else if(e.getTarget()== roof){
               if (cbo.getValue().equals("Red")) {
             roof.setFill(Color.RED);}
         else if (cbo.getValue().equals("Green")) {
             roof.setFill(Color.GREEN);}
         else if (cbo.getValue().equals("Yellow")) {
             roof.setFill(Color.YELLOW);}
         else {
             roof.setFill(Color.BLUE);}
          }
          else if(e.getTarget()== interfaceHouse){
               if (cbo.getValue().equals("Red")) {
             interfaceHouse.setFill(Color.RED);}
         else if (cbo.getValue().equals("Green")) {
             interfaceHouse.setFill(Color.GREEN);}
         else if (cbo.getValue().equals("Yellow")) {
             interfaceHouse.setFill(Color.YELLOW);}
         else {
             interfaceHouse.setFill(Color.BLUE);}
          }
         });
          
     
       
        Scene scene = new Scene(allscreen, 900, 600);
        stage.setTitle("lab4");
        stage.setScene(scene);    
        scene.setFill(Color.DARKGRAY);  
        stage.show();
    }
     
    
    

    public static void main(String[] args) {
        launch();
    }

}