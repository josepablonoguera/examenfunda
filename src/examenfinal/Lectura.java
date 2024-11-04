/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author pablonoguera
 */
public class Lectura {
        
    public String leerTecladoBufferedReader()throws IOException{
    
      return new BufferedReader(new InputStreamReader(System.in)).readLine();
    
    }
     
    
    public String leerTecladoScanner()throws IOException{
    
      return new Scanner(System.in).nextLine();
    
    }
}
