
        public class Main {
            public static void main(String[] args) {
                Aritmetica calculo = new Aritmetica();
                Disciplina d = new Disciplina(calculo);
                d.setP1(); d.setP2();
                d.CalcularMedia();
                System.out.println(
                        String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s",
                                d.getP1(),d.getP2(), d.getMedia(), d.getSituacao()));
                for (int P1 + P2 ; i <= 5; i++)
            }
        }
