
package Proceso;

import Objetopublico.Global;

import javax.swing.JOptionPane;

public class Procesosclientes {
    //metodo  con parametros  con cada tipo(String)
    public void InsertarEnArreglo(String Nom,String Ape,String Edad,int Cont){
        
        Global.Clientes[Cont][0]=Nom;
           Global.Clientes[Cont][1]=Ape;
              Global.Clientes[Cont][2]=Edad;
              
              // acumulador
              Cont++;
                           
                      
        JOptionPane.showMessageDialog(null, "Dato insertado correctamente");
    }
  public void InsertarClientes(){
      for(int i =0;i<=3;i++){
          
        JOptionPane.showMessageDialog(null,Global.Clientes[i][0]+Global.Clientes[i][1]+Global.Clientes[i][2]);   
      }

 }
  
}
