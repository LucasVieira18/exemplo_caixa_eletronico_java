package ac2.algoritmos.banco;
/*
algoritmo de exemplo:
- caixa eletrônico;
*/
   import java.util.Locale;
   import java.util.Scanner;
   public class AC2AlgoritmosBanco {
   public static void main(String[] args) {
        System.out.println("===BEM=VINDO=AO=BANCO===");
        System.out.println(" ");
        int login, cadastro, escolha, escolha2 = 0, tentativa = 0, senha123 = 0, contat, agenciat, sair = 0;
        String SENHA = "01020304", senha, senhal2, senhac, senhaut, senhac2;
        String CPF = "123.456.789-00", cpf, cpfc, cpfaut;
        double saldo = 1000f, deposito1, saque1, deposito, saque, trans;
        String bancot, nomec;
        String nomel = "Lucas";
        Scanner ler;

        Locale.setDefault(Locale.US);
        ler = new Scanner(System.in);
        do {
            do {
                System.out.println("===========================");
                System.out.println("1 - EFETUAR LOGIN!");
                System.out.println("2 - QUERO ME CADASTRAR!");
                System.out.println("===========================");
                System.out.print("Digite aqui ----->: ");
                escolha = ler.nextInt();
                if (escolha > 2 || escolha < 1) {
                    System.out.println(" ");
                    System.out.println("OPÇÃO INCORRETA!!!");
                }
            } while (escolha > 2 || escolha < 1);
            switch (escolha) {
                case 1:
                    do {
                        System.out.println(" ");
                        System.out.println("Digite seu CPF ");
                        System.out.print("Digite aqui ----->: ");
                        cpf = ler.next();
                        System.out.println(" ");
                        System.out.println("Digite sua senha ");
                        System.out.print("Digite aqui ----->: ");
                        senha = ler.next();
                        if (!SENHA.equals(senha) || !CPF.equals(cpf)) {
                            tentativa++;
                            System.out.println("");
                            System.out.println("DADOS INCORRETOS !!! (tentativa(" + tentativa + ")");
                        }
                        if (tentativa == 3) {
                            System.out.println(" ");
                            System.out.println("EXCESSO DE TENTATIVAS, CONTA BLOQUEADA!!!");
                            System.exit(0);
                        }

                    } while (!SENHA.equals(senha) || !CPF.equals(cpf));
                    do {
                        do {
                            do {
                                System.out.println(" ");
                                System.out.println("BEM VINDO " + "'" + nomel + "'" + "!!!");
                                System.out.println("========================");
                                System.out.println("1 - SALDO");
                                System.out.println("2 - DEPOSITO");
                                System.out.println("3 - SAQUE");
                                System.out.println("4 - TRANSFERÊNCIA");
                                System.out.println("5 - EXTRATO");
                                System.out.println("0 - SAIR");
                                System.out.println("========================");
                                System.out.print("DIGITE AQUI ----->: ");
                                escolha2 = ler.nextInt();
                                if (escolha2 > 5) {
                                    System.out.println(" ");
                                    System.out.println("OPÇÃO INCORRETA!!! ");

                                }

                            } while (escolha2 > 9);
                            switch (escolha2) {
                                case 1:
                                    System.out.println(" ");
                                    System.out.println("================SALDO==================");
                                    System.out.println("Seu saldo atual é de: " + saldo + "R$");
                                    System.out.println("=======================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");

                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;
                                case 2:
                                    do {
                                        System.out.println(" ");
                                        System.out.println("===================DEPÓSITO=================");
                                        System.out.println("Qual valor do depósito?");
                                        System.out.print("Digite aqui ----->: ");
                                        deposito = ler.nextDouble();
                                        System.out.println(" ");
                                        System.out.println("Digite sua senha");
                                        System.out.print("Digite aqui ----->: ");
                                        senhal2 = ler.next();
                                        if (!senhal2.equals(SENHA)) {
                                            tentativa++;
                                            System.out.println("");
                                            System.out.println("DADOS INCORRETOS !!! (tentativa(" + tentativa + ")");
                                        }
                                        if (tentativa == 3) {
                                            System.out.println(" ");
                                            System.out.println("EXCESSO DE TENTATIVAS, CONTA BLOQUEADA!!!");
                                            System.exit(0);
                                        }

                                    } while (!senhal2.equals(SENHA));
                                    saldo = (saldo + deposito);
                                    System.out.println(" ");
                                    System.out.println("================================");
                                    System.out.println("Depósito efetuado!!! ");
                                    System.out.println("Seu saldo atual é " + saldo + "R$.");
                                    System.out.println("================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");
                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;
                                case 3:
                                    do {
                                        System.out.println(" ");
                                        System.out.println("===================SAQUE=================");
                                        System.out.println("Qual valor do saque?");
                                        System.out.print("Digite aqui ----->: ");
                                        saque = ler.nextDouble();
                                        System.out.println(" ");
                                        System.out.println("Digite sua senha");
                                        System.out.print("Digite aqui ----->: ");
                                        senhal2 = ler.next();
                                        if (saque > saldo) {
                                            System.out.println(" ");
                                            System.out.println("SALDO INSUFICIENTE (FINALIZANDO O LOGIN)");
                                            System.exit(0);
                                        }
                                        if (!senhal2.equals(SENHA)) {
                                            tentativa++;
                                            System.out.println("");
                                            System.out.println("DADOS INCORRETOS(verifique seu saldo ou sua senha !!! (tentativa(" + tentativa + ")");
                                        }
                                        if (tentativa == 3) {
                                            System.out.println(" ");
                                            System.out.println("EXCESSO DE TENTATIVAS, CONTA BLOQUEADA!!!");
                                            System.exit(0);
                                        }
                                    } while (!senhal2.equals(SENHA));
                                    saldo = (saldo - saque);
                                    System.out.println(" ");
                                    System.out.println("================================");
                                    System.out.println("Saque efetuado!!! ");
                                    System.out.println("Seu saldo atual é de " + saldo + "R$.");
                                    System.out.println("================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");

                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;
                                case 4:
                                    do {
                                        System.out.println(" ");
                                        System.out.println("===================TRANSFERÊNCIA=================");
                                        System.out.println("Qual valor da transferência");
                                        System.out.print("Digite aqui ----->: ");
                                        trans = ler.nextDouble();
                                        System.out.println("Qual a conta para efetuar a transferência?");
                                        System.out.print("Digite aqui ----->: ");
                                        contat = ler.nextInt();
                                        System.out.println("Qual a agência da conta desejada??");
                                        System.out.print("Digite aqui ----->: ");
                                        agenciat = ler.nextInt();
                                        System.out.println("Qual o banco da conta desejada?(sem espaço");
                                        System.out.print("Digite aqui ----->: ");
                                        bancot = ler.next();
                                        System.out.println(" ");
                                        System.out.println("Digite sua senha");
                                        System.out.print("Digite aqui ----->: ");
                                        senhal2 = ler.next();
                                        if (trans > saldo) {
                                            System.out.println(" ");
                                            System.out.println("SALDO INSUFICIENTE (FINALIZANDO O LOGIN)");
                                            System.exit(0);
                                        }
                                        if (!senhal2.equals(SENHA)) {
                                            tentativa++;
                                            System.out.println("");
                                            System.out.println("DADOS INCORRETOS(verifique seu saldo ou sua senha !!! (tentativa(" + tentativa + ")");
                                        }
                                        if (tentativa == 3) {
                                            System.out.println(" ");
                                            System.out.println("EXCESSO DE TENTATIVAS, CONTA BLOQUEADA!!!");
                                            System.exit(0);
                                        }
                                    } while (!senhal2.equals(SENHA));
                                    saldo = (saldo - trans);
                                    System.out.println(" ");
                                    System.out.println("================================");
                                    System.out.println("Transferência efetuada!!! ");
                                    System.out.println("valor: " + trans + ".00R$");
                                    System.out.println("conta: " + contat);
                                    System.out.println("agência: " + agenciat);
                                    System.out.println("banco: " + bancot);
                                    System.out.println(" ");
                                    System.out.println("================================");
                                    System.out.println("Seu saldo atual é de " + saldo + "R$.");
                                    System.out.println("================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");

                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;
                                case 5:
                                    System.out.println(" ");
                                    System.out.println("==========================EXTRATO============================");
                                    System.out.println("- Efetuou um pagamento de 40.OOR$, DIA: 03/05/2021;");
                                    System.out.println("- Efetuou uma transferência para a conta X, DIA: 07/05/2021;");
                                    System.out.println("- Saque de 500.00R$, DIA: 10/05/2021;");
                                    System.out.println("- Depósito de 450.00R$, DIA: 13/05/2021;");
                                    System.out.println("=============================================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");

                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;
                                case 0:
                                    System.out.println(" ");
                                    System.out.println("===================SAIR=================");
                                    System.out.println(" ");
                                    System.out.println("OBRIGADO, VOLTE SEMPRE!!! ");
                                    System.out.println(" ");
                                    break;

                            }
                        } while (sair == 4);
                        System.out.println("OPÇÃO INCORRETA!!!");
                    } while (sair != 4 && sair != 0);
                    
                    break;
                case 2:
                    do {
                        String nomecadastro;
                        System.out.println(" ");
                        System.out.println("===CADASTRO===");
                        System.out.println("Qual seu primeiro nome?");
                        System.out.print("Digite aqui ----->: ");
                        nomec = ler.next();
                        System.out.println(" ");
                        System.out.println("Cadastre seu CPF ");
                        System.out.print("Digite aqui ----->: ");
                        cpfc = ler.next();
                        System.out.println(" ");
                        System.out.println("Cadastre sua senha ");
                        System.out.print("Digite aqui ----->: ");
                        senhac = ler.next();
                        System.out.println(" ");
                        System.out.println("Digite a senha novamente ");
                        System.out.print("Digite aqui ----->: ");
                        senhac2 = ler.next();
                        if (!senhac.equals(senhac2)) {
                            System.out.println(" ");
                            System.out.println("AS SENHAS NÃO COINCIDEM");
                        }
                    } while (!senhac.equals(senhac2));
                    System.out.println(" ");
                    System.out.println("===========================");
                    System.out.println("Muito bem! faça o login!!!");
                    System.out.println("===========================");
                    do {
                        System.out.println(" ");
                        System.out.println("Digite seu CPF ");
                        System.out.print("Digite aqui ----->: ");
                        cpfaut = ler.next();
                        System.out.println(" ");
                        System.out.println("Digite sua senha ");
                        System.out.print("Digite aqui ----->: ");
                        senhaut = ler.next();
                        if (!cpfc.equals(cpfaut) || !senhac.equals(senhaut) || !senhac2.equals(senhaut)) {
                            tentativa++;
                            System.out.println("");
                            System.out.println("DADOS INCORRETOS !!! (tentativa(" + tentativa + ")");
                        }
                        if (tentativa == 3) {
                            System.out.println(" ");
                            System.out.println("EXCESSO DE TENTATIVAS, CONTA BLOQUEADA!!!");
                            System.exit(0);
                        }

                    } while (!cpfc.equals(cpfaut) || !senhac.equals(senhaut) || !senhac2.equals(senhaut));
                    do {
                        do {
                            do {
                                System.out.println(" ");
                                System.out.println("BEM VINDO " + "'" + nomec + "'" + "!!!");
                                System.out.println("========================");
                                System.out.println("1 - SALDO");
                                System.out.println("2 - DEPOSITO");
                                System.out.println("3 - SAQUE");
                                System.out.println("4 - TRANSFERÊNCIA");
                                System.out.println("5 - EXTRATO");
                                System.out.println("0 - SAIR");
                                System.out.println("========================");
                                System.out.print("DIGITE AQUI ----->: ");
                                escolha2 = ler.nextInt();
                                if (escolha2 > 5) {

                                    System.out.println(" ");
                                    System.out.println("OPÇÃO INCORRETA!!!");
                                }
                            } while (escolha2 > 5);
                            switch (escolha2) {
                                case 1:
                                    System.out.println(" ");
                                    System.out.println("=================SALDO=================");
                                    System.out.println("Seu saldo atual é de: " + saldo + "R$");
                                    System.out.println("=======================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");

                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;
                                case 2:
                                    do {
                                        System.out.println(" ");
                                        System.out.println("===================DEPÓSITO=================");
                                        System.out.println("Qual valor do depósito?");
                                        System.out.print("Digite aqui ----->: ");
                                        deposito = ler.nextDouble();
                                        System.out.println(" ");
                                        System.out.println("Digite sua senha");
                                        System.out.print("Digite aqui ----->: ");
                                        senhac2 = ler.next();
                                        if (!senhac.equals(senhac2)) {
                                            tentativa++;
                                            System.out.println("");
                                            System.out.println("DADOS INCORRETOS !!! (tentativa(" + tentativa + ")");
                                        }
                                        if (tentativa == 3) {
                                            System.out.println(" ");
                                            System.out.println("EXCESSO DE TENTATIVAS, CONTA BLOQUEADA!!!");
                                            System.exit(0);
                                        }

                                    } while (!senhac.equals(senhac2));
                                    saldo = (saldo + deposito);
                                    System.out.println(" ");
                                    System.out.println("================================");
                                    System.out.println("Depósito efetuado!!! ");
                                    System.out.println("Seu saldo atual é de " + saldo + "R$.");
                                    System.out.println("================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");

                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;

                                case 3:
                                    do {
                                        System.out.println(" ");
                                        System.out.println("===================SAQUE=================");
                                        System.out.println("Qual valor do saque?");
                                        System.out.print("Digite aqui ----->: ");
                                        saque = ler.nextDouble();
                                        System.out.println(" ");
                                        System.out.println("Digite sua senha");
                                        System.out.print("Digite aqui ----->: ");
                                        senhac2 = ler.next();
                                        if (saque > saldo) {
                                            System.out.println(" ");
                                            System.out.println("SALDO INSUFICIENTE (FINALIZANDO O LOGIN)");
                                            System.exit(0);
                                        }
                                        if (!senhac.equals(senhac2)) {
                                            tentativa++;
                                            System.out.println("");
                                            System.out.println("DADOS INCORRETOS(verifique seu saldo ou sua senha !!! (tentativa(" + tentativa + ")");
                                        }
                                        if (tentativa == 3) {
                                            System.out.println(" ");
                                            System.out.println("EXCESSO DE TENTATIVAS, CONTA BLOQUEADA!!!");
                                            System.exit(0);
                                        }
                                    } while (!senhac.equals(senhac2));
                                    saldo = (saldo - saque);
                                    System.out.println(" ");
                                    System.out.println("================================");
                                    System.out.println("Saque efetuado!!! ");
                                    System.out.println("Seu saldo atual é de " + saldo + "R$.");
                                    System.out.println("================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");

                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;
                                case 4:
                                    do {
                                        System.out.println(" ");
                                        System.out.println("===================TRANSFERÊNCIA=================");
                                        System.out.println("Qual valor da transferência");
                                        System.out.print("Digite aqui ----->: ");
                                        trans = ler.nextDouble();
                                        System.out.println("Qual a conta para efetuar a transferência?");
                                        System.out.print("Digite aqui ----->: ");
                                        contat = ler.nextInt();
                                        System.out.println("Qual a agência da conta desejada??");
                                        System.out.print("Digite aqui ----->: ");
                                        agenciat = ler.nextInt();
                                        System.out.println("Qual o banco da conta desejada?(sem espaço)");
                                        System.out.print("Digite aqui ----->: ");
                                        bancot = ler.next();
                                        System.out.println(" ");
                                        System.out.println("Digite sua senha");
                                        System.out.print("Digite aqui ----->: ");
                                        senhac2 = ler.next();
                                        if (trans > saldo) {
                                            System.out.println(" ");
                                            System.out.println("SALDO INSUFICIENTE (FINALIZANDO O LOGIN)");
                                            System.exit(0);
                                        }
                                        if (!senhac.equals(senhac2)) {
                                            tentativa++;
                                            System.out.println("");
                                            System.out.println("DADOS INCORRETOS(verifique seu saldo ou sua senha !!! (tentativa(" + tentativa + ")");
                                        }
                                        if (tentativa == 3) {
                                            System.out.println(" ");
                                            System.out.println("EXCESSO DE TENTATIVAS, CONTA BLOQUEADA!!!");
                                            System.exit(0);
                                        }
                                    } while (!senhac.equals(senhac2));
                                    saldo = (saldo - trans);
                                    System.out.println(" ");
                                    System.out.println("================================");
                                    System.out.println("Transferência efetuada!!! ");
                                    System.out.println("valor: " + trans + ".00R$");
                                    System.out.println("conta: " + contat);
                                    System.out.println("agência: " + agenciat);
                                    System.out.println("banco: " + bancot);
                                    System.out.println(" ");
                                    System.out.println("================================");
                                    System.out.println("Seu saldo atual é de " + saldo + "R$.");
                                    System.out.println("================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");

                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;
                                case 5:
                                    System.out.println(" ");
                                    System.out.println("==========================EXTRATO============================");
                                    System.out.println("- Efetuou um pagamento de 40.OOR$, DIA: 03/05/2021;");
                                    System.out.println("- Efetuou uma transferência para a conta X, DIA: 07/05/2021;");
                                    System.out.println("- Saque de 500.00R$, DIA: 10/05/2021;");
                                    System.out.println("- Depósito de 450.00R$, DIA: 13/05/2021;");
                                    System.out.println("=============================================================");
                                    System.out.println(" ");
                                    System.out.println("Digite '4' para fazer outra operação");
                                    System.out.println("Digite '0' para sair");

                                    System.out.print("Digite aqui ----->: ");
                                    sair = ler.nextInt();

                                    break;
                                case 0:
                                    System.out.println(" ");
                                    System.out.println("===================SAIR=================");
                                    System.out.println(" ");
                                    System.out.println("OBRIGADO, VOLTE SEMPRE!!! ");
                                    System.out.println(" ");
                                    break;

                            }
                        } while (sair == 4);

                    } while (sair != 4 && sair != 0);
            }
        } while (sair == 0 || escolha2 == 0);
    }
}
