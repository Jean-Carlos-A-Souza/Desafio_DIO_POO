import br.com.dio.desafio.dominio.*;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao da mentoria java");
        mentoria.setDate(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.setNome("Camila Alves");

        System.out.println("Conteudos Inscritos " + devCamila.getConteudosIncristos());
        devCamila.progredir();
        System.out.println("*---%%%--*");
        System.out.println("Conteudos Inscritos " + devCamila.getConteudosIncristos());
        System.out.println("Conteudos Concluidos " + devCamila.getConteudosConcluido());
        System.out.println("XP:"+ devCamila.calcularTotalXp());

        System.out.println("*------------------*");

        Dev devJoao = new Dev();
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.setNome("João Cabral");
        System.out.println("Conteudos Inscritos " + devJoao.getConteudosIncristos());
        devJoao.progredir();
        System.out.println("*---%%%--*");
        System.out.println("Conteudos Inscritos " + devJoao.getConteudosIncristos());
        System.out.println("Conteudos Concluidos " + devJoao.getConteudosConcluido());
        System.out.println("XP:"+ devJoao.calcularTotalXp());
    }
}
