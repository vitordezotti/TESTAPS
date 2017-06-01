package apsfinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

public class ListaMedico extends Listas {

    private ArrayList<Medico> Lista;


    public ListaMedico() {
        Lista = new ArrayList<>();
    }

    public void Add(Medico M) {
        Lista.add(M);
    }

    public void imprimirMedico() {
        for (Medico M : Lista) {
            System.out.println("-----------------------------------------" +
                    "\n- Nome do Medico: " + M.getNome() +
                    "\n- CRM: " + M.getCrm() +
                    "\n- Sexo " + M.getEspecialidade() +
                    "\n- Idade: " + M.getIdade());
                            }

    }

    public void imprimirMedico(int crm) {
        for (Medico M : Lista) {
            if (M.getCrm() == crm)
                System.out.println("\n- Nome do Medico: " + M.getNome() +
                    "\n- CRM: " + M.getCrm() +
                    "\n- Especialidade: " + M.getEspecialidade() +
                    "\n- Idade: " + M.getIdade());

        }

    }

}