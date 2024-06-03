import java.util.Random;
import java.util.Scanner;

public class ohmeudeus {
    public static void main(String[] args) {

        int casa = 0;
        int casa1 = 0;
        boolean fimdejogo = false;

        System.out.println("Bem vindo ao Jogo!");

        do {
            Scanner leia = new Scanner(System.in);
            Random random = new Random();

            int dado = random.nextInt(5)+1;

            System.out.println("Jogador 1");
            System.out.println("Jogue o dado!");
            leia.nextInt();

            System.out.println("Seu lance foi " + dado);
            casa += dado;

            switch (casa) {

                case 1:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 2:
                    System.out.println("Você está na casa " + casa);
                    System.out.println("Você encontrou o mapa do tesouro!\n" +
                            "Avance uma casa");
                    casa = 3;
                    System.out.println("Você foi para casa " + casa);
                    break;

                case 3:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 4:
                    System.out.println("Você deixou sua luneta pra trás!\n" + "Volte ao Início");
                    casa = 1;
                    System.out.println("Você foi para casa " + casa);
                    break;

                case 5:
                    System.out.println("Os golfinhos te deram uma carona!\n" + "Avance duas casas");
                    casa = 7;
                    System.out.println("Você foi para casa " + casa);
                    break;

                case 6:
                    System.out.println("O baú do tesouro está trancado!\n" +
                            "Volte duas casas");
                    casa = 4;
                    System.out.println("Você foi para casa " + casa);
                    break;

                case 7:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 8:
                    System.out.println("Você engoliu muita água salgada!\n" +
                            "Volte uma casa");
                    casa = 7;
                    break;

                case 9:
                    System.out.println("Você encontrou piratas amigos!\n" +
                            "Avance duas  casas");
                    casa = 11;
                    System.out.println("Você foi para casa " + casa);
                    break;

                case 10:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 11:
                    System.out.println("Pegue uma carona no esguicho da baleia! \n" +
                            "Avance uma casa");
                    casa = 12;
                    System.out.println("Você está na casa " + casa);
                    break;

                case 12:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 13:
                    System.out.println("Pegue um atalho pelo recife de corais!\n" +
                            "Aproveite a vista e avance para a casa 17");
                    casa = 17;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 14:
                    System.out.println("Tem uma ilha no caminho!\n" +
                            "Volte uma casa");
                    casa = 13;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 15:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 16:
                    System.out.println("Você encontrou um bando de águas vivas!\n" +
                            "Volte duas casas");
                    casa = 14;
                    System.out.println("Você foi para casa " + casa);
                    break;

                case 17:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 18:
                    System.out.println("Os piratas te traíram!\n" +
                            "Volte três casas");
                    casa = 15;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 19:
                    System.out.println("Pegue uma carona com a raia!\n" +
                            "Avance uma casa");
                    casa = 20;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 20:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 21:
                    System.out.println("Você caiu no canto das sereias!\n" +
                            "Volte três casas");
                    casa = 18;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 22:
                    System.out.println("Você teve que fugir do tubarão!\n" +
                            "Volte duas casas");
                    casa = 20;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 23:
                    System.out.println("Você pegou a corrente das tartarugas!\n" +
                            "Avance 3 casas");
                    casa = 26;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 24:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 25:
                    System.out.println("Você encontrou uma pista na garrafa!\n" +
                            "Avance uma casa");
                    casa = 26;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 26:
                    System.out.println("Você está na casa " + casa);
                    break;

                case 27:
                    System.out.println("O tubarâo te alcançou!\n" +
                            "Volte três casas");
                    casa = 24;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 28:
                    System.out.println("O baú do tesouro está destrancado!\n" +
                            "Avance duas casas ");
                    casa = 30;
                    System.out.println("Você foi para casa " + casa + "\n");
                    break;

                case 29:
                    System.out.println("A maré subiu!\n" +
                            "Jogue o dado para saber se venceu, avance uma casa se o resultado for ímpar");
                    int coisa;
                    coisa = leia.nextInt();
                    int dado2 = random.nextInt(5);
                    int dado3 = dado2 + 1;
                    System.out.println("seu lance foi " + dado3);
                    if (dado3 % 2 == 0) {
                        System.out.println("Você para aqui");
                    } else {

                        casa = 30;
                        System.out.println("Você foi para casa " + casa + "\n");
                        System.out.println("Você venceu!");
                    }
                    break;

                case 30:
                    System.out.println("Você venceu!");
                    break;
            }

            int dado6 = random.nextInt(5) + 1;

            System.out.println("Jogador 2");
            System.out.println("Jogue o dado!");
            leia.nextInt();

            System.out.println("Seu lance foi " + dado6);
            casa1 += dado6;

            switch (casa1) {

                case 1:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 2:
                    System.out.println("Você está na casa " + casa1);
                    System.out.println("Você encontrou o mapa do tesouro!\n" +
                            "Avance uma casa");
                    casa1 = 3;
                    System.out.println("Você foi para casa " + casa1);
                    break;

                case 3:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 4:
                    System.out.println("Você deixou sua luneta pra trás!\n" + "Volte ao Início");
                    casa1 = 1;
                    System.out.println("Você foi para casa " + casa1);
                    break;

                case 5:
                    System.out.println("Os golfinhos te deram uma carona!\n" + "Avance duas casas");
                    casa1 = 7;
                    System.out.println("Você foi para casa " + casa1);
                    break;

                case 6:
                    System.out.println("O baú do tesouro está trancado!\n" +
                            "Volte duas casas");
                    casa1 = 4;
                    System.out.println("Você foi para casa " + casa1);
                    break;

                case 7:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 8:
                    System.out.println("Você engoliu muita água salgada!\n" +
                            "Volte uma casa");
                    casa1 = 7;
                    System.out.println("Você foi para casa " + casa1);
                    break;

                case 9:
                    System.out.println("Você encontrou piratas amigos!\n" +
                            "Avance duas  casas");
                    casa1 = 11;
                    System.out.println("Você foi para casa " + casa1);
                    break;

                case 10:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 11:
                    System.out.println("Pegue uma carona no esguicho da baleia! \n" +
                            "Avance uma casa");
                    casa1 = 12;
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 12:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 13:
                    System.out.println("Pegue um atalho pelo recife de corais!\n" +
                            "Aproveite a vista e avance para a casa 17");
                    casa1 = 17;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 14:
                    System.out.println("Tem uma ilha no caminho!\n" +
                            "Volte uma casa");
                    casa1 = 13;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 15:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 16:
                    System.out.println("Você encontrou um bando de águas vivas!\n" +
                            "Volte duas casas");
                    casa1 = 14;
                    System.out.println("Você foi para casa " + casa1);
                    break;

                case 17:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 18:
                    System.out.println("Os piratas te traíram!\n" +
                            "Volte três casas");
                    casa1 = 15;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 19:
                    System.out.println("Pegue uma carona com a raia!\n" +
                            "Avance uma casa");
                    casa1 = 20;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 20:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 21:
                    System.out.println("Você caiu no canto das sereias!\n" +
                            "Volte três casas");
                    casa1 = 18;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 22:
                    System.out.println("Você teve que fugir do tubarão!\n" +
                            "Volte duas casas");
                    casa1 = 20;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 23:
                    System.out.println("Você pegou a corrente das tartarugas!\n" +
                            "Avance 3 casas");
                    casa1 = 26;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 24:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 25:
                    System.out.println("Você encontrou uma pista na garrafa!\n" +
                            "Avance uma casa");
                    casa1 = 26;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 26:
                    System.out.println("Você está na casa " + casa1);
                    break;

                case 27:
                    System.out.println("O tubarâo te alcançou!\n" +
                            "Volte três casas");
                    casa1 = 24;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 28:
                    System.out.println("O baú do tesouro está destrancado!\n" +
                            "Avance duas casas ");
                    casa1 = 30;
                    System.out.println("Você foi para casa " + casa1 + "\n");
                    break;

                case 29:
                    System.out.println("A maré subiu!\n" +
                            "Jogue o dado para saber se venceu, avance uma casa se o resultado for ímpar");
                    int coisa;
                    coisa = leia.nextInt();
                    int dado2 = random.nextInt(5);
                    int dado3 = dado2 + 1;
                    System.out.println("seu lance foi " + dado3);
                    if (dado3 % 2 == 0) {
                        System.out.println("Você para aqui");
                    } else {

                        casa1 = 30;
                        System.out.println("Você foi para casa " + casa1 + "\n");
                        System.out.println("Você venceu!");
                    }
                    break;

                case 30:
                    System.out.println("Você venceu!");
                    break;
            }

            if (casa >= 30) {
                System.out.println("Jogador 1 venceu!");
                fimdejogo = true;
            } else if (casa1 >= 30) {
                System.out.println("Jogador 2 venceu!");
                fimdejogo = true;
            }

        }

            while (!fimdejogo);
        }
    }