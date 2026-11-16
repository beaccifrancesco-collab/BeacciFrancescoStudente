/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beaccifrancescostudente;
import java.util.*;

public class testStudente 
{
     public void avvia() 
    {
      Scanner s = new Scanner(System.in);

      
        System.out.println(" Primo studente  ");
        System.out.println("Inserisci nome: ");
        String nome1 = s.nextLine();
        
        System.out.println("Inserisci cognome: ");
        String cognome1 = s.nextLine();
        
        System.out.println("Inserisci l'indirizzo: ");
        String indirizzo1 = s.nextLine();
        
        System.out.println("Inserisci sezione: ");
        String sezione1 = s.next();
        
        System.out.println("Inserisci anno: ");
        int anno1 = s.nextInt();
        
        System.out.println("Inserisci il numeroMaterie: ");
        int numeroMaterie1= s.nextInt();

        Studente s1 = new Studente(nome1, cognome1, anno1, indirizzo1, sezione1, numeroMaterie1);
        
         for(int i=0; i < numeroMaterie1;i++)
        {
           System.out.println("Inserisci voti: ");
           s1.inserisciVoto(s.nextInt());
        }
        
         
        System.out.println("\n" + s1.toString());
      
        
        if (s1.mediaSufficiente() == 0) 
        {
            System.out.println("Media sufficiente");
        } 
        else 
        {
            System.out.println("Media insufficiente");
        }
        
           
        
                
        System.out.println(" Secondo studente ");
        System.out.println("Inserisci nome: ");
        String nome2 =  s.nextLine();
       
        System.out.println("Inserisci cognome: ");
        String cognome2 = s.nextLine();
        
        System.out.println("Inserisci l'indirizzo: ");
        String indirizzo2 = s.nextLine();
        
        System.out.println("Inserisci sezione: ");
        String sezione2 = s.next();
        
        System.out.println("Inserisci anno: ");
        int anno2 = s.nextInt();
        
        System.out.println("Inserisci il numeroMaterie: ");
        int numeroMaterie2 = s.nextInt();

        Studente s2 = new Studente(nome2, cognome2, anno2, indirizzo2, sezione2, numeroMaterie2);
        
        for(int i=0; i < numeroMaterie2;i++)
        {
           System.out.println("Inserisci voti: ");
           s2.inserisciVoto(s.nextInt());
        }
        
    
        System.out.println("\n" + s2.toString());
        
        if (s2.mediaSufficiente() == 0) 
        {
            System.out.println("Media sufficiente");
        } 
        else 
        {
            System.out.println("Media insufficiente");
        }
        
        
        /**
         * Confronta le medie dei due studenti
         */
        if(s1.calcolaMedia() > s2.calcolaMedia())
        {
            System.out.println("\n la media migliore e' dello studente" + s1.getNome());
        }
        else if(s1.calcolaMedia() > s2.calcolaMedia())
        {
            System.out.println("\n la media migliore e' dello studente" + s2.getNome());
        }
        else
        {
            System.out.println("\n Hanno la stessa media");
        }
      
    }
     
}
