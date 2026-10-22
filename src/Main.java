import lab.dominio.Curso;
import lab.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso de JavaScript");
        cursoJs.setDescricao("Curso de JavaScript, FrontEnd e BackEnd");
        cursoJs.setCargaHoraria(100);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Mentoria de Java - BackEnd com Spring Boot");
        mentoriaJava.setData(LocalDate.now());

        System.out.println(cursoJs);
        System.out.println(mentoriaJava);
    }

}
