public class NotaRazaoEndcomparator implements Comparable<NotaRazaoEndcomparator> { 
    String RazaoSocial;
    String Endereco;

    public NotaRazaoEndcomparator(String RazaoSocial, String Endereco){
        this.RazaoSocial = RazaoSocial;
        this.Endereco = Endereco;
    
    }

    @Override

    public int compareTo(NotaRazaoEndcomparator outra ){
        String valoratual = this.RazaoSocial + this.Endereco;
        String outravalor = outra.RazaoSocial + outra.Endereco;
        return valoratual.compareTo(outravalor);
    }


@Override
public String toString(){
   
    return "Razao Social:" +this.RazaoSocial +" Endereço:" +this.Endereco;

}


    
}
