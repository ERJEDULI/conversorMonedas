import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BusquedaDeMoneda{

        public Conversor buscaDivisa(String monedaBase,String monedaTarget){

            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/601dc88b1790d28ae0c91a25/pair/"+monedaBase+"/"+monedaTarget);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                return new Gson().fromJson(response.body(), Conversor.class);
            } catch (IOException | InterruptedException e ) {
                throw new RuntimeException("No se encontro la moneda solicitada");
            }

        }

}
