 package projetointegrador;
    
import java.time.LocalDate;
import java.time.LocalDateTime;

    public class ProjetoIntegrador {

        public static void main(String[] args) {
    
        LocalDate  d01 = LocalDate.now();
        LocalDateTime  d02 = LocalDateTime.now();
        
        System.out.print(d01);
        System.out.print("\n");
        System.out.print(d02);
        System.out.print("\n");
        System.out.print("\n");

        
        Cliente clientes[] = new Cliente[5];
    
        clientes[0] = new Cliente("Carlos", "000.000.000.000","João 23",123,"Voo da Garça");   
        clientes[1] = new Cliente("Carlos", "000.000.000.000","João 23",123,"Voo da Garça");   
        clientes[2] = new Cliente("Carlos", "000.000.000.000","João 23",123,"Voo da Garça");   
        clientes[3] = new Cliente("Carlos", "000.000.000.000","João 23",123,"Voo da Garça");   
        clientes[4] = new Cliente("Carlos", "000.000.000.000","João 23",123,"Voo da Garça");   
        
    for(int i = 0; i < clientes.length; i++)
    {
        System.out.println("Dados do Cliente: " +i );
        clientes[i].cadastroCliente();
        
    }

}
    }
