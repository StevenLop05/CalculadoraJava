/*
Nombre: Steven Alejandro López del Cid
Codigo Tecnico: IN5AM
Carné: 2018151
Fecha creacion: 14/03/2022
Fecha Modificacion:
 */
package org.stevenlopez.system;


import javax.swing.JOptionPane;
import org.stevenlopez.bean.Division;
import org.stevenlopez.bean.Multiplicacion;
import org.stevenlopez.bean.Resta;
import org.stevenlopez.bean.Salida;
import org.stevenlopez.bean.Suma;

/**
 *
 * @author informatica
 */
public class Principal {


    public static void main(String[] args) {
//     
          boolean salir = false;
          int opcion;
          String Entrada;
          JOptionPane.showMessageDialog(null, "Programador: Steven López");
          while(!salir){
              JOptionPane.showMessageDialog(null, "1. Suma\n 2. Resta\n 3. Multiplicación\n 4. División\n 0. Salir");
              
              Entrada = JOptionPane.showInputDialog(null, "Escriba una de las opciones");
              opcion = Integer.parseInt(Entrada);
              
              switch(opcion){
                  case 1:
                      Suma suma = new Suma(0,0);
                        suma.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un valor")));
                        suma.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                        JOptionPane.showMessageDialog(null, "La suma es: " + String.valueOf(suma.sumatoria(suma.getNum1(), suma.getNum2())));
          
                      break;
                  case 2:
                      Resta resta = new Resta(0,0);
                        resta.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese primer valor")));
                        resta.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segundo valor")));
                        JOptionPane.showMessageDialog(null, "La resta es: " + String.valueOf(resta.resta(resta.getNum1(), resta.getNum2())));
          
                      break;
                  case 3:
                      Multiplicacion multiplicacion = new Multiplicacion(0,0);
                        multiplicacion.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese primer valor")));
                        multiplicacion.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segundo valor")));
                        JOptionPane.showMessageDialog(null, "La multiplicación es: " + String.valueOf(multiplicacion.multi(multiplicacion.getNum1(), multiplicacion.getNum2())));
          
                      break;
                  case 4:
                       Division division = new Division(0,0);
                        division.setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese primer valor")));
                        division.setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese segundo valor")));
                        JOptionPane.showMessageDialog(null, "La división es: " + String.valueOf(division.div(division.getNum1(), division.getNum2())));
          
                      break;
                  case 0:
                      salir = true;
                      Salida mensaje2= new Salida();
                      mensaje2.salir();
                      break;
                  default:
                      JOptionPane.showMessageDialog(null, "Elija un numero entre 0 y 4");
              }
          }      
    }
    
}
