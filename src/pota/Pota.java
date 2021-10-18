package pota;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;

public class Pota {
    static int contador;
    
    public static void main(String[] args) {
        String arqCaminho = "C:/Users/gmmus/Documents/NetBeansProjects/Pota/arquivoDados.csv";
        String linha = "",  procuraCliente = "";
        Scanner input = new Scanner(System.in, "ISO-8859-2");
        boolean continuaBusca = true;
        List<Cliente> listaCli = new ArrayList<Cliente>();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(arqCaminho));
            
            while((linha = br.readLine()) != null){
                String [] listaVal = linha.split(",");
                
                String nome = listaVal[0];
                String sexo = listaVal[1];
                String endereco = listaVal[2];
                String cidade = listaVal[3];
                String email = listaVal[4];
                String telefone = listaVal[5];
                String idade = listaVal[6];
                
                Cliente cli = new Cliente(nome, sexo, endereco, cidade, email, telefone, idade);
                listaCli.add(cli);
            }
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        do {
            System.out.println("Digite um nome para procurar um cliente ou exit para sair.");
            procuraCliente = input.nextLine();
            System.out.println(procuraCliente);
            
            if(!procuraCliente.toLowerCase().equals("exit")){
                System.out.println("\nBuscando informações ...");
                int index = buscaBinaria(listaCli, procuraCliente);
                
                if(index == -1){
                    System.out.println("O nome buscado não foi encontrado em nossos dados.");
                } else {
                    Cliente cli = new Cliente();
                    cli.getInformacoes( listaCli.get(index).getNome(), listaCli.get(index).getSexo(), listaCli.get(index).getEndereco(), listaCli.get(index).getCidade(), listaCli.get(index).getEmail(), listaCli.get(index).getTelefone(), listaCli.get(index).getIdade() );
                    System.out.println("Busca finalizada, comparações realizadas: " + contador + "\n");
                }
            } else{
                continuaBusca = false;
            }
            System.out.println("");
        } while (continuaBusca);
        
    }
    
    public static Integer buscaBinaria(List<Cliente> listaCli, String nome){
        int inicio = 0, meio, fim = listaCli.size() - 1;
        contador = 0;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            contador++; 
            if (nome.equals(listaCli.get(meio).getNome())) {
                return meio;
            }
            contador++; 
            if (nome.compareTo(listaCli.get(meio).getNome()) < 0) { 
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }
}
