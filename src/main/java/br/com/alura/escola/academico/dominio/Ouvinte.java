package br.com.alura.escola.academico.dominio;

public abstract class Ouvinte {
    
    public void processa(Evento evento) {
        if (this.deveProcessar(evento)) {
            this.reageAo(evento);
        }
    }

    public abstract boolean deveProcessar(Evento evento);

    public abstract void reageAo(Evento evento);

}
