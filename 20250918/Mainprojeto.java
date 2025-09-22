public class Mainprojeto {
    public static void main(String[] args) {
        Arvorebinariaprojeto<Nota> arvore = new Arvorebinariaprojeto<>();

        Nota nota1 = new Nota("001", "empresa 1", "01/01/2023");
        Nota nota2 = new Nota("002", "empresa 2", "02/01/2023");
        Nota nota3 = new Nota("003", "empresa 3", "03/01/2023");
        Nota nota4 = new Nota("004", "empresa 4", "04/01/2023");
        Nota nota5 = new Nota("005", "empresa 5", "05/01/2023");
        Nota nota6 = new Nota("006", "empresa 6", "06/01/2023");
        Nota nota7 = new Nota("007", "empresa 7", "07/01/2023");
        Nota nota8 = new Nota("008", "empresa 8", "08/01/2023");
        Nota nota9 = new Nota("009", "empresa 9", "09/01/2023");
        Nota nota10 = new Nota("010", "empresa 10", "10/01/2023");

        
       
        
        arvore.inserir(nota5);
        arvore.inserir(nota3);
        arvore.inserir(nota1);
        arvore.inserir(nota7);
        arvore.inserir(nota2);
        arvore.inserir(nota4);
        arvore.inserir(nota6);
        arvore.inserir(nota8);
        arvore.inserir(nota9);
        arvore.inserir(nota10);

        

        System.out.println("\n--- Impressão em ordem ---");
        arvore.imprimeemOrdem();

        System.out.println("\n\n--- Impressão pré-fixada ---");
        arvore.imprimePreFixado();
        
    

    

    Arvorebinariaprojeto<NotaRazaoEndcomparator> arvoreRazao = new Arvorebinariaprojeto<>();{ 

    NotaRazaoEndcomparator razao1 = new NotaRazaoEndcomparator("pererinha" , "rua antonio jose vaz");
        NotaRazaoEndcomparator razao2 = new NotaRazaoEndcomparator("bar do paulo" , "rua almeida garve");

        arvoreRazao.inserir(razao1);
        arvoreRazao.inserir(razao2);

        System.out.println("\n--- Impressão em ordem ---");
        arvoreRazao.imprimeemOrdem();

        System.out.println("\n\n--- Impressão pré-fixada ---");
        arvoreRazao.imprimePreFixado();



    }
}
 }