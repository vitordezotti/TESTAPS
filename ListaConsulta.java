package apsfinal;

import java.util.ArrayList;

public class ListaConsulta extends Listas {

    private ArrayList<Consulta> Lista;


    public ListaConsulta() {
        Lista = new ArrayList<>();
    }

    public void Add(Consulta C) {
        Lista.add(C);
    }

    public void imprimirConsultas() {
        for (Consulta C : Lista) {
            System.out.println("-----------------------------------------" +
                    "\n- Data: " + C.getDia() + "/" + C.getMes() + "/" + C.getAno() +
                    "\n- Nome do Médico: " + C.getNomeMed() +
                    "\n- CRM: " + C.getCrm() +
                    "\n- Nome do Paciente: " + C.getNomePac() +
                    "\n- CPF: " + C.getCpf() +
                    "\n- Diagnostico: " + C.getDiagnostico() +
                    "\n- Receita: " + C.getReceita());

        }

    }

    public void imprimirConsultas(int cpf) {
        for (Consulta C : Lista) {
            if (C.getCpf() == cpf)
                System.out.println("\n- Data: " + C.getDia() + "/" + C.getMes() + "/" + C.getAno() +
                        "\n- Nome do Médico: " + C.getNomeMed() +
                        "\n- CRM: " + C.getCrm() +
                        "\n- Nome do Paciente: " + C.getNomePac() +
                        "\n- Sexo: " + C.getSexo() +
                        "\n- CPF: " + C.getCpf() +
                        "\n- Diagnostico: " + C.getDiagnostico() +
                        "\n- Receita: " + C.getReceita());

        }

    }

}
