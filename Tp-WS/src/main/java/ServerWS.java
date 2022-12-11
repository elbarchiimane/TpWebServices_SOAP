import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

import java.util.Arrays;

public class ServerWS {
    public static void main(String[] args) {
        String url="http://localhost:8080/";
        Endpoint.publish(url,new BanqueService());
        System.out.println(url);
    }
}
