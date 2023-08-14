public class App {
    public static void main(String[] args) throws Exception {


        System.out.println("Teste");
        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA,6,45);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL,8,70);
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8,55);
        Carro suvFlex = new Carro("SUVFLEX", TipoCombustivel.FLEX, 8,6, 65);


        //Abastecer.
        System.out.println("\nAbastecendo o carro");
        basico.abastece(TipoCombustivel.GASOLINA, 55);
        System.out.println(basico);
        esportivo.abastece(TipoCombustivel.GASOLINA,45);
        System.out.println(esportivo);
        utilitario.abastece(TipoCombustivel.DIESEL,70);
        System.out.println(utilitario);
        suv.abastece(TipoCombustivel.FLEX,55);
        System.out.println(suv);
        suvFlex.abastece(TipoCombustivel.ALCOOL, 65);
        System.out.println(suvFlex);

        //Distancia da viagem.
        System.out.println("\nViajando");
        basico.viaja(100);
        System.out.println(basico);
        esportivo.viaja(100);
        System.out.println(esportivo);
        utilitario.viaja(100);
        System.out.println(utilitario);
        suv.viaja(100);
        System.out.println(suv);
        suvFlex.viaja(100);
        System.out.println(suvFlex);
    }
}
