public class Aplicacion {

    public static void main(String[] args) {
         // Probar el método esPar
        int numero1 = 10;
        int numero2 = 7;
         // Llamamos al método esPar() de la clase Algoritmos
        System.out.println("El numero " + numero1 + " es par " + Algoritmos.esPar(numero1));
        System.out.println("El numero " + numero2 + " es par " + Algoritmos.esPar(numero2));


          // Probar el método esPrimo con varios números
        int numero3 = 11;  // Número primo
        int numero4 = 15;  // Número no primo
        int numero5 = 1;   // Número no primo
        int numero6 = 7;   // Número primo
        // Llamamos al método esPrimo() de la clase Algoritmos
        System.out.println("¿El número " + numero3 + " es primo? " + Algoritmos.esPrimo(numero3));
        System.out.println("¿El número " + numero4 + " es primo? " + Algoritmos.esPrimo(numero4));
        System.out.println("¿El número " + numero5 + " es primo? " + Algoritmos.esPrimo(numero5));
        System.out.println("¿El número " + numero6 + " es primo? " + Algoritmos.esPrimo(numero6));


        // Probamos el método stringEnReversa
        String original = "Hola Mundo";
        String invertido = Algoritmos.stringEnReversa(original);
        System.out.println("Original: " + original);
        System.out.println("Invertido: " + invertido);


         // Probar el método esPalindromo
         String texto1 = "Anita lava la tina";   // Palíndromo
         String texto2 = "Hola mundo";           // No es palíndromo
         String texto3 = "A man a plan a canal Panama"; // Palíndromo
         String texto4 = "Racecar";              // Palíndromo
         // Llamamos al método esPalindromo() de la clase Algoritmos
        System.out.println("El texto \"" + texto1 + "\" es palindromo " + Algoritmos.esPalindromo(texto1));
        System.out.println("El texto \"" + texto2 + "\" es palindromo " + Algoritmos.esPalindromo(texto2));
        System.out.println("El texto \"" + texto3 + "\" es palindromo " + Algoritmos.esPalindromo(texto3));
        System.out.println("El texto \"" + texto4 + "\" es palindromo " + Algoritmos.esPalindromo(texto4));
      


      // Llamamos al método secuenciaFizzBuzz() con diferentes números de ejemplo
      System.out.println("Secuencia FizzBuzz hasta 15:");
      Algoritmos.secuenciaFizzBuzz(15);
      //
      System.out.println("\nSecuencia FizzBuzz hasta 20:");
      Algoritmos.secuenciaFizzBuzz(20);
      //
      System.out.println("\nSecuencia FizzBuzz hasta 10:");
      Algoritmos.secuenciaFizzBuzz(10);
  
    }
  }


