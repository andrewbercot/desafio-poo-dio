import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1=new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(20);
        System.out.println(curso1.toString());

        Mentoria mentoria1=new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Mentoria");
        mentoria1.setTitulo("Java POO");
        System.out.println(mentoria1.toString());

    }
}
