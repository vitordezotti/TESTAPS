package apsfinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

public class ListaPaciente extends Listas {

    private ArrayList<Paciente> Lista;


    public ListaPaciente() {
        Lista = new ArrayList<>();
    }

    public void Add(Paciente P) {
        Lista.add(P);
    }

    public void imprimirPaciente() {
        for (Paciente P : Lista) {
            System.out.println("-----------------------------------------" +
                    "\n- Nome do Paciente: " + P.getNome() +
                    "\n- CPF: " + P.getCpf() +
                    "\n- Sexo " + P.getSexo() +
                    "\n- Idade: " + P.getIdade());
                            }

    }

    public void imprimirPaciente(int cpf) {
        for (Paciente P : Lista) {
            if (P.getCpf() == cpf)
                System.out.println("\n- Nome do Paciente: " + P.getNome() +
                    "\n- CPF: " + P.getCpf() +
                    "\n- Sexo " + P.getSexo() +
                    "\n- Idade: " + P.getIdade());

        }

    }

}