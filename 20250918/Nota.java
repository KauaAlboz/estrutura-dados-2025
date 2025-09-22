public class Nota implements Comparable<Nota> {
    String numerodanota;
    String emitente;
    String data;

    @Override
    public int compareTo(Nota outra) {
        String valorAtual = this.numerodanota + this.emitente + this.data;
        String valorOutra = outra.numerodanota + outra.emitente + outra.data;
        return valorAtual.compareTo(valorOutra);
    }

    public Nota(String numerodanota, String emitente, String data) {
        this.numerodanota = numerodanota;
        this.emitente = emitente;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Nota: " + this.numerodanota + " - " + this.emitente + " - " + this.data;
    }
}

