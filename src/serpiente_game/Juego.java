/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serpiente_game;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
//import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Davidhdezn
 */
public class Juego {
    JFrame ventana;
   JPanel panelJuego;
   JLabel fondo;
   
   ArrayList<JLabel> serpiente;
   int x,y;
   int desplazamiento=20;
   Timer tiempo;
   int ban=0;
  
   int cx=0,cy=0;
   JLabel comida;
   Rectangle serp,mor;
   Rectangle comi; 
   int perdio=0;
   JLabel puntuacion;
   int comidos=0,contador=0;
   JLabel comido;
   
   
   
   
   public Juego(){
   ventana= new JFrame("juego");
   ventana.setSize(600,600);
   ventana.setLocationRelativeTo(null);
   ventana.setLayout(null);
  // ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   ventana.setVisible(true); 
   
   panelJuego =new JPanel();
   panelJuego.setSize(ventana.getSize());
panelJuego.setLayout(null);
panelJuego.setVisible(true);

//panelJuego.setBackground(Color.red);
fondo=new JLabel();
fondo.setSize(panelJuego.getSize());
fondo.setIcon (new  ImageIcon("imagenes/fondo.png"));
fondo.setVisible(true);
panelJuego.add(fondo,0);

serpiente =new  ArrayList<JLabel>();
 JLabel aux = new JLabel();
         aux.setLocation(290,290 );
         aux.setSize(20,20);
         aux.setIcon(new ImageIcon("imagenes/Cabezaizq.jpg"));
         aux.setVisible(true);
     serpiente.add(aux);
     panelJuego.add(serpiente.get(0),0);
     ventana.add(panelJuego);
    
     
      comida=new JLabel();
      comida.setSize(24,27);
      comida.setIcon(new ImageIcon("imagenes/comida3.png"));
      Random aleatorio =new Random(); 
      cx=aleatorio.nextInt(560);
      cy=aleatorio.nextInt(560); 
      comida.setLocation(cx,cy);
      comida.setVisible(true);
      panelJuego.add(comida,0);
      
     
     serp=new Rectangle(serpiente.get(0).getBounds());
     comi=new Rectangle(comida.getBounds());
      
puntuacion=new JLabel("   Puntuacion: "+contador);
puntuacion.setBounds(10, 20, 100, 20);
puntuacion.setVisible(true);
puntuacion.setForeground(Color.white);
panelJuego.add(puntuacion,0);

comido=new JLabel("Comidos: "+comidos);
comido.setBounds(20, 30, 200, 30);
comido.setVisible(true);
comido.setForeground(Color.white);
panelJuego.add(comido,0);

      tiempo=new Timer(100,new ActionListener() {
          @Override
       public void actionPerformed(ActionEvent e) {
  //serpiente.get(0).setLocation(serpiente.get(0).getX()+x,serpiente.get(0).getY()+y);
           //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        comi.setBounds(comida.getBounds());
        serp.setBounds(serpiente.get(0).getBounds());
  //mor.setBounds(serpiente.get(0).bounds());
   
        if(serpiente.get(0).getX()>570){
        perdio=1;
    }
        if(serpiente.get(0).getX()<10){
        perdio=1;
    } 
        if(serpiente.get(0).getY()>568){
        perdio=1;
    } 
        if(serpiente.get(0).getY()<10){
        perdio=1;
    } 
        
        
//    for( int p=1;p<serpiente.get(0).getLabelFor();p++){
//        if(serpiente.get(0).getX()==serpiente[0] &&serpiente.get(0).getY(0)){
            
        //}
   // }
   //  if(serpiente[0].){
       //System.out.println("te mordiste"); 
     
         
        //if(serpiente.get(0)==serpiente.get(0)){
//for(int b= 1;b <serpiente.size();b++){
  //  if(serpiente. intersects(mor)){ 
    //System.out.println("te mordiste"); 
    //}
////}

// if(serp.intersects(serp)){
//     System.out.print("Te mordiste!");
//     
//     }
 
// for(int z=1;serpiente.size()-1<z;z++){
//          if(x[z]==x[0] && y[z].y[0]){
//
//          }     
// }

      if(perdio==1){      
       
        tiempo.stop();
        JOptionPane.showMessageDialog(null,"Has chocado!!  :´(");
ventana.setVisible(false);

    }
     
      
      
             
              if(comi.intersects(serp)){
                 
     cx=aleatorio.nextInt(540);
     cy=aleatorio.nextInt(540);
     comida.setLocation(cx,cy);
     comida.repaint();   
         JLabel aux = new JLabel();
         aux.setLocation(200,200);//serpiente.get(serpiente.size()-1).getLocation());
         aux.setSize(20,20);
         aux.setIcon(new ImageIcon("imagenes/cuerpo.jpg"));
        aux.setVisible(true);
     serpiente.add(aux);
     panelJuego.add(serpiente.get(serpiente.size()-1),0);   

comidos+=1;
contador+=5;
puntuacion.setText("   Puntuacion: "+contador);
comido.setText("Comidos: " +comidos);
    puntuacion.repaint();
      comido.repaint();
              }
   //serpiente.get(0).setLocation(serpiente.get(0).getX()+x, serpiente.get(0).getY()+y);
       for(int i=serpiente.size()-1;i>0;i--){
       // serpiente.get(0).setLocation(serpiente.get(0).getX()+x, serpiente.get(0).getY()+y);
      serpiente.get(i).setLocation(serpiente.get(i-1).getLocation());
      serpiente.get(i).repaint();
       }
      serpiente.get(0).setLocation(serpiente.get(0).getX()+x, serpiente.get(0).getY()+y);
    
      
//      for(int z=1;serpiente.size()-1<z;z++){
//          if
//      }
    }
   });
     
     
     
     
     
ventana.addKeyListener(new KeyListener() {
       @Override
       public void keyTyped(KeyEvent e) {
          // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }

       @Override
       public void keyPressed(KeyEvent e) {
           //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       if(e.getKeyCode()==KeyEvent.VK_UP){
   System.out.println("Arriba");
   if(serpiente.get(0).getY()>0){
       y=-desplazamiento;
       x=0;
       serpiente.get(0).setIcon(new ImageIcon("imagenes/cabezaari.jpg"));
       }
       if(ban==0){
           tiempo.start();
       ban=1;
       }
       }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
   System.out.println("Abajo");
    if(serpiente.get(0).getY()<600){
       y=desplazamiento;
       x=0;
           serpiente.get(0).setIcon(new ImageIcon("imagenes/cabezaabajo2.jpg"));
       }
    if(ban==0){
           tiempo.start();
       ban=1;
       }
        }
       
       
       if(e.getKeyCode()==KeyEvent.VK_LEFT){
  
            System.out.println("Izquierda");
       if(serpiente.get(0).getX()>0){
       y=0;
       x=-desplazamiento;
          serpiente.get(0).setIcon(new ImageIcon("imagenes/cabezaizq.jpg"));
       }
       if(ban==0){
           tiempo.start();
       ban=1;
        
       }
        }
       if(e.getKeyCode()==KeyEvent.VK_RIGHT){
   System.out.println("Derecha");
          if(serpiente.get(0).getX()<600){
       y=0;
       x=desplazamiento;
           serpiente.get(0).setIcon(new ImageIcon("imagenes/cabezadere.jpg"));
       }
        if(ban==0){
           tiempo.start();
       ban=1;
        }
        } 
        
        
       }

       @Override
       public void keyReleased(KeyEvent e) {
          // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }
   });

ventana.setVisible(true);
ventana.setResizable(false);

   }
}
