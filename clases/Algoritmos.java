public class Algoritmos {

     // Método estático que determina si un número es par
    public static boolean esPar(int numero) {
        // Un número es par si el residuo de dividirlo entre 2 es 0
        return numero % 2 == 0;
    }


    // Método estático que determina si un número es primo
    public static boolean esPrimo(int numero) {
        // Si el número es menor o igual a 1, no es primo
        if (numero <= 1) {
            return false;
        }
        
        // Comienza a verificar si el número es divisible por números desde 2 hasta la raíz cuadrada de 'numero'
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Si el número es divisible por 'i', no es primo
            if (numero % i == 0) {
                return false;  // Tiene más de dos divisores, no es primo
            }
        }

        // Si no encontró divisores, entonces es primo
        return true;
    }


    //Método estático para invertir un String
    public static String stringEnReversa(String str){
   // Variable para almacenar el String invertido
    String resultado = "";
        
   // Recorremos el String de atrás hacia adelante
    for (int i = str.length() - 1; i >= 0; i--) {
       // Accedemos a cada carácter e iremos concatenándolo al resultado
        resultado += str.charAt(i);
}
// Retornamos el String invertido
    return resultado;
    }


    // Método estático que determina si un String es un palíndromo
    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase(); // Convierte el texto a minúsculas
        texto = texto.replace(" ", ""); // Elimina los espacios

        String textoReverso = new StringBuilder(texto).reverse().toString();
        return texto.equals(textoReverso);
    }


    // Método estático que imprime la secuencia FizzBuzz
    public static void secuenciaFizzBuzz(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Para un salto de línea al final
    }
    }

