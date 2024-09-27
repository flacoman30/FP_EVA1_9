/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_conversiones;

import java.util.Scanner;

/**
 *
 * @author flac3
 */
public class EVA1_9_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double far, cent;
        Scanner captura = new Scanner(System.in);
        far = captura.nextDouble();
        cent = (far - 32) / 1.8;
        System.out.println("Temperatura en grados far" + cent);     
        System.out.println("°c = " + cent);
         
        //CENTIGRADOS A FAREHET
        cent = captura.nextDouble();
        far = cent*1.8+32;
        System.out.println("Temperatura en grados cent" + far);     
        System.out.println("°F = " + far);
        
        
        
    }
    
}
