import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class Client {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(304));
        Compte compte = stub.getCompte(5);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
    }
}
