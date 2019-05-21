import java.util.Scanner;
public class PedidoTeste {
    public static void main (String[]args){
        Scanner ler = new Scanner (System.in);
        String co,des,no;
        
        System.out.println("informe o codigo do produto");
        co = ler.nextLine();
        //P1.pegarCodigo(co);
        System.out.println("Informe a descrição do pedido");
        des = ler.nextLine();
        //P1.pegarDescricao(des);
        //P1.colocarDescricao();
        System.out.println("Informe o nome do cliente");
        no = ler.nextLine();
        Pedido P1 = new Pedido(co,no,des);
        //P1.pegarNome(no);
        P1.imprimirPedido();
        }
}
