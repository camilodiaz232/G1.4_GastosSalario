import java.util.Scanner;

public class Main {

    static public void main (String []args){

        // Creacion de las variables
        int salario = 0;
        double porcentArriendo = 0.4;
        double porcentComida = 0.15;


        // Objeto para lectura de los valores
        Scanner lectura = new Scanner(System.in);

        //Captura de Salario
        System.out.println("Ingrese su salario mensual: ");
        salario = Integer.parseInt(lectura.next());


        //Presentacion de los resultado
        System.out.println("Con el salario de "+salario+" el gasto en arriendo es "+calcularArriendo(salario, porcentArriendo));
        System.out.println("Con el salario de "+salario+" el gasto en comida es "+calcularComida(salario,porcentComida));
        System.out.println("Con el salario de "+salario+" y el saldo del salario es "+calcularSaldo(salario, porcentArriendo, porcentComida));
        System.out.println();


    }
    //Funcion para calcular el arriendo
    public static double calcularArriendo (int salario,double porcentArriendo){

        return salario * porcentArriendo;
    }

    //Funcion para calcular la comida
    public static double calcularComida (int salario, double porcentComida){

        return  salario*porcentComida;
    }

    //Funcion para calcular el saldo
    public static double calcularSaldo (int salario, double porcentArriendo, double porcentComida){

        double arriendo = calcularArriendo(salario, porcentArriendo);
        double comida = calcularComida(salario, porcentComida);

        return salario-(arriendo+comida);
    }
}
