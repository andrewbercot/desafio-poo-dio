import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1=new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(20);


        Curso curso2=new Curso();
        curso2.setTitulo("JS");
        curso2.setDescricao("Curso de JS");
        curso2.setCargaHoraria(20);


        Mentoria mentoria1=new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Mentoria");
        mentoria1.setTitulo("Java POO");

        Bootcamp bootcamp=new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAndrew=new Dev();
        devAndrew.setNome("Andrew");
        devAndrew.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+devAndrew.getNome()+" "+devAndrew.getConteudosInscritos());

        devAndrew.progredir();
        System.out.println("Conteúdos Inscritos "+devAndrew.getNome()+" "+devAndrew.getConteudosInscritos());

        System.out.println("Conteúdos Concluidos "+devAndrew.getNome()+" "+devAndrew.getConteudosConcluidos());
        devAndrew.progredir();
        System.out.println("XP:"+devAndrew.calcularTotalXP());

        Dev devJoao=new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+devJoao.getNome()+" "+devAndrew.getConteudosInscritos());

        devJoao.progredir();
        System.out.println("Conteúdos Inscritos "+devJoao.getNome()+" "+devAndrew.getConteudosInscritos());

        System.out.println("Conteúdos Concluidos "+devJoao.getNome()+" "+devAndrew.getConteudosConcluidos());
        System.out.println("XP:"+devJoao.calcularTotalXP());


    }
}
