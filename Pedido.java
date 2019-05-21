public class Pedido{
    String codigo;
    String nome;
    String descricao;
     
   public Pedido(){}
   
    public Pedido (String codigo,String nome,String descricao){
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    }
    public void pegarCodigo(String user){
    codigo = user;
}
    public String colocarCodigo(){
    return codigo;
    }
    public void pegarNome(String user){
        nome = user;
    }
    public String colocarNome(){
    return  nome;
}
    public void pegarDescricao(String user){
        descricao = user;
    }
    public String colocarDescricao(){
        return descricao;
}
    public void imprimirPedido(){
    System.out.printf("O pedido do codigo %s com a descrição %s e com o cliente %s tem o valor total de 10.000\n",codigo,descricao,nome);
}
}