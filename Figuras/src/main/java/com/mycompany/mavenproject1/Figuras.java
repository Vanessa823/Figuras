/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Graphics;
/**
 *
 * @author hp
 */
public class Figuras extends Frame{
 private int figura ;
 
  public Figuras(){
        super("Dibuja: Figuras Geometricas");
        setSize(400,400);
        setBackground(Color.pink);
        setLayout(new FlowLayout());
        addComponentes();
        setVisible(true);
        setLocationRelativeTo(null);
    }
  private void addComponentes(){
        Button boton1= new Button("borrar");
        Button boton2= new Button("Cuadrado");
        Button boton3= new Button("Rectangulo");
        Button boton4= new Button("Circulo");
        Button boton5= new Button("Triangulo");
        Button boton6= new Button("Trapecio");
        
        AccionBoton aBoton1 = new AccionBoton(1);
        AccionBoton aBoton2 = new AccionBoton(2);
        AccionBoton aBoton3 = new AccionBoton(3);
        AccionBoton aBoton4 = new AccionBoton(4);
        AccionBoton aBoton5 = new AccionBoton(5);
        AccionBoton aBoton6 = new AccionBoton(6);
        
        boton1.addActionListener(aBoton1);
        boton2.addActionListener(aBoton2);
        boton3.addActionListener(aBoton3);
        boton4.addActionListener(aBoton4);
        boton5.addActionListener(aBoton5);
        boton6.addActionListener(aBoton6);
              
        addWindowListener(new WindowAdapter(){
          @Override
          public void windowClosing (WindowEvent e){
           System.exit(0);
        }
    });
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
    }
 @Override
  public void paint(Graphics g){
           g.setColor (Color.blue);
          if(figura==1){
            repaint();
          }
          if(figura==2){
            g.fillRect (100, 100, 200, 200);
          }
          if(figura==3){
            g.fillRect (100, 150, 200, 100);
          }
          if(figura==4){
            g.fillOval (100, 100, 200, 200);
          }
          if(figura==5){
            int [] vx1 = {200, 300, 100};
            int [] vy1 = {100, 300, 300};
            g.fillPolygon (vx1, vy1, 3);
          }  
          if(figura==6){
            int [] vx1 = {100, 150, 250,300};
            int [] vy1 = {250, 150, 150,250};
            g.fillPolygon (vx1, vy1, 4);
          }  
    }
   class AccionBoton implements ActionListener{
       private final int valor;
         public AccionBoton(int valor){
              this.valor = valor;
         }        
       @Override
         public void actionPerformed(ActionEvent e){
             figura = valor;
             repaint();         
         }    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figuras N =new Figuras ();
        // TODO code application logic here
    }
    
}
