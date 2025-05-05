package principal;

import com.mycompany.exercicio35.Ave;
import com.mycompany.exercicio35.Cachorro;
import com.mycompany.exercicio35.IAnimal;

public class Principal {
    
    public static void main(String[] args) {
        IAnimal cachorro1 = new Cachorro();
        System.out.println("Scooby Doo: ");
        cachorro1.produzirSom();
        cachorro1.mover();
        
        IAnimal ave1 = new Ave();
        System.out.println("\nPica-Pau: ");
        ave1.produzirSom();
        ave1.mover();
        
    }  
}
