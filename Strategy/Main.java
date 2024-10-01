package Strategy;

public class Main {
    public static void main(String[] args) {
        ICalcMedia calculo = new Aritmetica();
        // ICalcMedia calculo = new Geometrica();

        Disciplina d = new Disciplina(calculo);
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.CalcularMedia();

        System.out.println(String.format("P1: %.2f P2: %.2f Média: %.2f Situação: %s",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }
}