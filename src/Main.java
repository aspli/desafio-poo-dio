import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Depeloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlexandre = new Dev();
        devAlexandre.setNome("Alexandre");
        devAlexandre.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dev "+ devAlexandre.getNome() + ": \n" + devAlexandre.getConteudosInscritos());
        devAlexandre.progredir();
        System.out.println("Conteúdos Concluídos" + devAlexandre.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devAlexandre.getConteudosInscritos());
        System.out.println("XP: "+ devAlexandre.calcularTotalXP());

        System.out.println("/n ################## /n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dev "+ devJoao.getNome() + ": \n" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos" + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        System.out.println("XP: "+ devJoao.calcularTotalXP());


    }

}
