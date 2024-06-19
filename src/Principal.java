import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner lectura = new Scanner(System.in);
        BusquedaDeMoneda consulta = new BusquedaDeMoneda();

        String menu = """
                ***********************
                Sea bienvenido/a al Conversor de Moneda =]
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso mexicano
                6) Peso mexicano =>> Dólar
                7) Otra moneda
                8) Salir
                
                Elija una opción válida:
                **********************
                """;


        int opcion = 0;


        String divisa = "";
        String divisaBusqueda = "";
        int valor = 0;
        double resultado;
        double valorDivisa = 0.0;

        while(opcion != 8){
            System.out.println(menu);
            opcion = lectura.nextInt();
            switch (opcion){
                case 1:
                    ValorConvertir.convertir("USD","ARS",consulta,lectura);
                break;
                case 2:
                    ValorConvertir.convertir("ARS","USD",consulta,lectura);
                break;
                case 3:
                    ValorConvertir.convertir("USD","BRL",consulta,lectura);
                break;
                case 4:
                    ValorConvertir.convertir("BRL","USD",consulta,lectura);
                break;
                case 5:
                    ValorConvertir.convertir("USD","MXN",consulta,lectura);
                break;
                case 6:
                    ValorConvertir.convertir("MXN","USD",consulta,lectura);
                break;
                case 7:
                    ValorConvertir.convertirOtraMoneda(consulta,lectura);
                break;
                case 8:
                    System.out.println("Saliendo del sistema, vuelva pronto!");
                    break;
            }
        }

    }
}
