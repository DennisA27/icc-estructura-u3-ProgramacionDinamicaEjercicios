import java.util.ArrayList;
import java.util.List;

import Ejercicio.EjercicioDos;
import Ejercicio.EjercicioUno;

public class App {
    public static void main(String[] args) throws Exception {
        EjercicioUno ejerUno = new EjercicioUno();
         List<Integer> set = new ArrayList<>();
         set.add(1);
         set.add(2);
         set.add(3);
         List<List<Integer>> result = ejerUno.subsets(set);
         System.out.println("Resolución del Ejercicio Uno:");
        System.out.println(result);

         EjercicioDos ejerDos = new EjercicioDos();
         int n1 = 1;
        List<String> result1= ejerDos.generateParenthesis(n1);
         System.out.println("Resolución del Ejercicio Dos con 1 de entrada:");
        System.out.println(result);
         int n2 = 3;
         List<String> result2 = ejerDos.generateParenthesis(n2);
         System.out.println("Resolución del Ejercicio Dos con 3 de entrada:");
         System.out.println(result);

    }
}
