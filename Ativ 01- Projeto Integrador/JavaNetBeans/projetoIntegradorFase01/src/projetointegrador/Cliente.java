
package projetointegrador;

    public class Cliente {
        
        private String nome;
        private String cpf;
        private String rua;
        private int numero;
        private String balneario;
       

    public Cliente(String nome, String cpf, String rua, int numero, String balneario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rua = rua;
        this.numero = numero;
        this.balneario = balneario;
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBalneario() {
        return balneario;
    }

    public void setBalneario(String balneario) {
        this.balneario = balneario;
    }


    public void cadastroCliente(){
        System.out.println("Nome do Cliente: "+ nome);
        System.out.println("Cpf do Cliente: "+ cpf);
        System.out.println("Nome da Rua: "+ rua);
        System.out.println("Numero: "+ numero);
        System.out.println("Balneario: "+ balneario);
        System.out.println("\n");
        
        
    
}
    }
