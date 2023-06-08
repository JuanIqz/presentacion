/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseppt;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ClasePpt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pd=new Scanner(System.in);
        System.out.println("Ingrese el valor del pedido");
        InfoPaqueteria Mipedido= new InfoPaqueteria(pd.nextDouble());
        System.out.println("  Factura: ");
        System.out.println("valor pedido: "+Mipedido.precio);
        Mipedido.impuestoProducto();
        System.out.println("Impuesto: "+Mipedido.impuesto);
        Mipedido.setcasilleroPrecio("CasilleroA");
        System.out.println("Casillero: "+Mipedido.casilleroEnvio);
        System.out.println("Total: "+(Mipedido.impuesto+Mipedido.precio));
        
    }
    
}
