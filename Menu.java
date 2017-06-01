package apsfinal;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Vitor on 18/05/2017.
 */
public class Menu {

    public int Menu() throws IOException

    {
        Scanner s1 = new Scanner(System.in);
        int i = 0;

        ListaConsulta LC1 = new ListaConsulta();
        ListaPaciente LP1 = new ListaPaciente();
        ListaMedico LM1 = new ListaMedico();

        int check = 0;

        do {
            System.out.println("-----------------------------------------");
            System.out.println("-----------------Main--------------------");
            System.out.println("1 - Cadastrar Médico");
            System.out.println("2 - Cadastrar Paciente");
            System.out.println("3 - Cadastrar Consulta");
            System.out.println("4 - Listar Consultas");
            System.out.println("5 - Buscar Consultas");
            System.out.println("6 - Listar Pacientes");
            System.out.println("7 - Buscar Paciente");
            System.out.println("8 - Listar Medicos");
            System.out.println("9 - Buscar Medico");
            System.out.println("10 - Encerrar");
            System.out.print("\n Digite a Opção: ");
            check = s1.nextInt();
            System.out.println("-----------------------------------------");


            switch (check) {
                case 1:
                    Medico M1 = new Medico();
                    LM1.Add(M1);
                    
                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;
                case 2:

                    Paciente P1 = new Paciente();
                    LP1.Add(P1);
                    
                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;

                case 3:
                    Consulta C1 = new Consulta();
                    LC1.Add(C1);

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();


                    break;
                case 4:
                    LC1.imprimirConsultas();

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;

                case 5:
                    System.out.println("Digite o CPF do paciente: ");
                    int checar = s1.nextInt();

                    LC1.imprimirConsultas(checar);

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;

                case 6:
                    LP1.imprimirPaciente();

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;
                    
                case 7:
                    System.out.println("Digite o CPF do paciente: ");
                    checar = s1.nextInt();

                    LP1.imprimirPaciente(checar);

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;
                    
                    
                case 8:
                    LM1.imprimirMedico();

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;
                    
                case 9:
                    System.out.println("Digite o CRM do Medico: ");
                    checar = s1.nextInt();

                    LM1.imprimirMedico(checar);

                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();
                    break;
                    
                case 10:
                    i = 1;
                    break;

                default:
                    System.out.println("Esta não é uma opção válida!");
                    System.out.println("Pressione Enter para continuar.");
                    System.in.read();

            }


        } while (check != 10);
        return i;
    }
}
