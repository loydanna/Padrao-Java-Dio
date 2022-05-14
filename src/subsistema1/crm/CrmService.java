package subsistema1.crm;

public class CrmService {

    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String cidade, String estado ){
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.print(nome);
        System.out.print(cep);
        System.out.print(cidade);
        System.out.print(estado);
    }
}
