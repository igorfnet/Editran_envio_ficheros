/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editranfiles;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author igorf
 */
public class Editranfiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner input = new Scanner (System.in) ;
        
        System.out.println("Selecciona para enviar la sesion correspondiente o 0 para salir");
        
        System.out.println("1 - SIFEDT");
        System.out.println("2 - SEPBLAC");
        System.out.println("3 - GTRTTE");
        System.out.println("4 - GTRNRE");
        System.out.println("5 - CRGOPE");
        System.out.println("6 - CRGDEC");
        System.out.println("7 - CRGCCE");
        System.out.println("8 - CIRRRE");
        System.out.println("9 - CIRITE");
        System.out.println("10 - CIRDEC");
        System.out.println("");
        System.out.println("0 - Salir");
        
         System.out.print("Seleccione una opcion:");
        int choice=input.nextInt();
         
           switch (choice) {
            case 1: Runtime.getRuntime().exec ("cmd /C start c:\\Temp\\azul.bat");
                     break;
            case 2: Runtime.getRuntime().exec ("cmd /C start c:\\Temp\\verde.bat");
                    break;
            case 3: System.out.println("Sending GTRTTE"); 
                    break;
            case 4: System.out.println("Sending GTRNRE"); 
                     break;
            case 5: System.out.println("Sending CRGOPE"); 
                     break;
            case 6: System.out.println("Sending CRGDEC"); 
                     break;         
            case 7: System.out.println("Sending CRGCCE"); 
                     break;         
            case 8: System.out.println("Sending CIRRRE"); 
                     break;         
            case 9: System.out.println("Sending CIRITE"); 
                     break;        
            case 10: System.out.println("Sending CIRDEC"); 
                     break;         
    }
    
}
