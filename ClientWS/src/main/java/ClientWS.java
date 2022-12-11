import proxy.Banque;
import proxy.BanqueService;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new Banque().getBanqueServicePort();
        System.out.println(stub.convert(6000));
        Compte c=stub.getCompte(4);
        System.out.println(c.getSolde());
    }
}
