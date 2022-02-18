import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {

    public static void main(String[] args){
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso js");
        curso2.setDescricao("Mentoria Js");
        curso2.setCargaHoraria(9);
 
        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao da mentoria java");
        mentoria1.setDate(LocalDate.now());


        System.out.println(mentoria1);
    }
}
