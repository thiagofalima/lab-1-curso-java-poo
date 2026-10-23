import lab.dominio.Bootcamp;
import lab.dominio.Curso;
import lab.dominio.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoriaJava);

        Dev dev1 = new Dev();
        dev1.setNome("Thiago");
        dev1.inscreverBoootcamp(bootcamp);
        System.out.println("Conteudos incritos:" + dev1.getConteudosIncrito());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos concluidos:" + dev1.getConteudosConcluido());
        System.out.println(dev1.calcularTotalXp());
        System.out.println("Conteudos incritos:" + dev1.getConteudosIncrito());

        System.out.println("----------------");

        Dev dev2 = new Dev();
        dev2.setNome("Ana");
        dev2.inscreverBoootcamp(bootcamp);
        System.out.println("Conteudos incritos:" + dev2.getConteudosIncrito());
        dev2.progredir();
        System.out.println("Conteudos concluidos:" + dev1.getConteudosConcluido());
        System.out.println(dev2.calcularTotalXp());
        System.out.println("Conteudos incritos:" + dev2.getConteudosIncrito());


    }

}
