/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rechercher.un.nombre.dans.un.tableau;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class RechercherUnNombreDansUnTableau {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab={12,15,13,10,8,9,13,14};
        int n = 0;
        boolean estLa = false;
        System.out.println("Entrer le nombre a chercher");
         Scanner sc= new Scanner(System.in);
          int str;
        // TODO code application logic here
        str = sc.nextInt();
        for (int i=0;i<tab.length;i++){
            if(tab[i]==n){
                estLa=true;
            }
        }
        if(estLa){
            System.out.println("Le nombre est dans le tableau");
        }else{
            System.out.println("Le nombre n'est pas dans le ttableau");
        }
        
    }
    
}
