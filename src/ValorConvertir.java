import java.util.Scanner;

public class ValorConvertir {

    public static void convertir(String monedaBase, String monedaTarget, BusquedaDeMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;


        Conversor moneda = consulta.buscaDivisa(monedaBase, monedaTarget);

        System.out.println("La tasa de conversion para hoy\n1 "+monedaBase+ " = "+ moneda.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la cantidad de "+monedaBase);
        cantidad = lectura.nextDouble();
        cantidadConvertida = cantidad * moneda.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+ moneda.target_code());
    }

      public static void convertirOtraMoneda(BusquedaDeMoneda consulta, Scanner lectura){
        String monedaBase,monedaObjetivo;
        System.out.println("Ingrese el código de moneda base: ");
        monedaBase = lectura.next();
        monedaBase.toUpperCase();
        System.out.println("Ingrese la moneda objetivo:");
        monedaObjetivo = lectura.next().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
