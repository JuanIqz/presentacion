/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseppt;

/**
 *
 * @author User
 */
public class InfoPaqueteria {
    double precio;
    double impuesto;
    String casilleroEnvio;
    


    public InfoPaqueteria(double precio) {
        this.precio = precio;
    }
    
    
    
    public void impuestoProducto(){
        this.impuesto=this.precio*0.15;
    }
    
    public void setcasilleroPrecio(String casilleroEnvios){
        this.casilleroEnvio=casilleroEnvios;
        if (casilleroEnvio.equals("CasilleroA")) {
            this.precio=this.precio+1000.0;
        }else if (casilleroEnvio.equals("CasilleroB")) {
            this.precio=this.precio+500.0;
        }else{
            this.precio=this.precio+0.0;
        }
    }
    
 
    
    
}
