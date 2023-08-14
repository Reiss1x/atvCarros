public class Motor {

    private TipoCombustivel tipoMotor;
    private int consumo; // em quilometros por unidade. Ex: Km/Lt
    private int quilometragem;
    private int consumo1;
    private int consumo2;

    public Motor(TipoCombustivel tipoMotor, int consumo) {
        this.tipoMotor = tipoMotor;
        this.consumo = consumo;
        this.consumo1 = consumo;
        this.consumo2 = consumo;
    }

    public Motor(TipoCombustivel tipoMotor, int consumo1, int consumo2) {
        this.tipoMotor = tipoMotor;
        this.consumo1 = consumo1;
        this.consumo2 = consumo2;
    }

    public int getConsumo() {
        return this.consumo;
    }

    public void setConsumo(TipoCombustivel tipo){
        if(tipo == TipoCombustivel.GASOLINA){
            consumo = consumo1;
        }
        if(tipo == TipoCombustivel.ALCOOL){
            consumo = consumo2;
        }

    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public int combustivelNecessario(int distancia) {
        return distancia / consumo;
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
    }

    @Override
    public String toString() {
        return "Motor [consumo=" + consumo + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}