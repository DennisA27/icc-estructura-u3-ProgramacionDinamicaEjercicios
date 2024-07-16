package Ejercicio;

/*
 * Dados n pares de paréntesis, implementa un algoritmo para generar todas las combinaciones
 * válidas de paréntesis.
 *
 * Ejemplo 1:
 *  Input:
 *    n: 1
 *  Output:
 *    ["()"]
 *
 * Ejemplo 2:
 *  Input:
 *    n: 3
 *  Output:
 *    ["((()))","(()())","(())()","()(())","()()()"]
 *
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 * Se debe usar StringBuilder
 */

import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {

    // Método que genera todas las combinaciones válidas de paréntesis
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesesHelper(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    // Método auxiliar que utiliza recursión y backtracking para construir las combinaciones de paréntesis
    private void generateParenthesesHelper(List<String> result, StringBuilder current, int open, int close, int max) {
        // Si la longitud de la cadena actual es igual al número máximo de pares de paréntesis multiplicado por 2
        if (current.length() == max * 2) {
            result.add(current.toString());  // Añade la cadena actual a la lista de resultados
            return;
        }

        // Si el número de paréntesis abiertos es menor que el máximo permitido
        if (open < max) {
            current.append('(');  // Añade un paréntesis abierto
            generateParenthesesHelper(result, current, open + 1, close, max);  // Llama recursivamente incrementando el contador de paréntesis abiertos
            current.deleteCharAt(current.length() - 1);  // Elimina el último carácter añadido para retroceder
        }

        // Si el número de paréntesis cerrados es menor que el número de paréntesis abiertos
        if (close < open) {
            current.append(')');  // Añade un paréntesis cerrado
            generateParenthesesHelper(result, current, open, close + 1, max);  // Llama recursivamente incrementando el contador de paréntesis cerrados
            current.deleteCharAt(current.length() - 1);  // Elimina el último carácter añadido para retroceder
        }
    }
}