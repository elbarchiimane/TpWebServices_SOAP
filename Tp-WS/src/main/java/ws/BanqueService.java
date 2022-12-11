package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "Banque")
public class BanqueService {
     @WebMethod(operationName = "convert")
    public double conversion(@WebParam(name = "montant") double mt){

        return mt*10.6;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){

        return new Compte(code,58000,new Date());
    }

    @WebMethod
    public List<Compte> listeComptes(){

        return List.of( new Compte(1,23000, new Date()),
                        new Compte(2,23000, new Date()),
                        new Compte(3
                                ,23000, new Date()));
    }
}
