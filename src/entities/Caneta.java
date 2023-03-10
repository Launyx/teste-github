package entities;

public class Caneta {
    
    private String cor;
    private String ponta;
    private Double carga;

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public void setPonta(String ponta){
        this.ponta = ponta;
    }

    public String getPonta(){
        return this.ponta;
    }

    public void setCarga(Double carga){
        this.carga = carga;
    }

    public Double getCarga(){
        return this.carga;
    }


    public String toString(){
        return "Cor: " + this.cor
                + "\nTipo da ponta: " + this.ponta
                + "\nQuantidade de carga: " + this.carga + "%";
    }
}
