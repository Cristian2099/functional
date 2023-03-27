package functional.youtube.v1_imperativa;

import java.util.ArrayList;
import java.util.List;

public class MainFuncYT {
    public static void main(String[] args) {
        //- ¿Qué queremos hacer?
        //- 1. Crear una lista de enteros.
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
        //- 2. Quedarme solo con los pares.
        List<Integer> pares = filtrarPares(numeros);
        System.out.println(pares);
        //- 3. Pasar cada número al cuadrado.
        List<Integer> cuadrados = elevarAlCuadrado(pares);
        System.out.println(cuadrados);
        //- 4. Mostrar cada cuadrado por pantalla.
        List<Integer> mostrados = mostrarLista(cuadrados);
        //- 5. Obtener la suma de los cuadrados.
        int totalCuadrados = sumarLista(cuadrados);
        System.out.println("La suma de los cuadrados es: " + totalCuadrados);
    }

    public static List<Integer> crearLista(){
        return List.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
    }

    public static List<Integer> filtrarPares(List<Integer> numeros){
        List<Integer> resultado = new ArrayList<>();
        //se recorre la lista numeros y se agregan a la lista resultado solo los números pares.
        for (Integer numero: numeros) {
            if (numero % 2 == 0) resultado.add(numero);
        }
        return resultado;
    }

    public static List<Integer> elevarAlCuadrado(List<Integer> numeros){
        List<Integer> resultado = new ArrayList<>();
        //se recorre la lista numeros y se agregan a la lista resultado solo los números pares.
        for (Integer numero: numeros) {
            resultado.add(numero * numero);
        }
        return resultado;
    }

    public static List<Integer> mostrarLista(List<Integer> numeros){
        for (Integer numero: numeros) {
            System.out.println(numero);
        }
        return numeros;
    }

    public static int sumarLista(List<Integer> numeros){
        int total = 0;
        for (Integer numero: numeros) {
            total += numero;
        }
        return total;
    }
}
