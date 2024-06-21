import java.util.ArrayList;
import java.util.List;

// Classe Bootcamp
class Bootcamp {
    @SuppressWarnings("unused")
    private String nome;
    private String dataInicio;
    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    private List<Curso> cursos;
    private List<Mentoria> mentorias;

    public Bootcamp(String nome, String dataInicio) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.cursos = new ArrayList<>();
        this.mentorias = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }
}

// Classe Curso
class Curso {
    private String titulo;
    @SuppressWarnings("unused")
    private String instrutor;
    @SuppressWarnings("unused")
    private boolean emAndamento;

    public Curso(String titulo, String instrutor) {
        this.titulo = titulo;
        this.instrutor = instrutor;
        this.emAndamento = false;
    }

    public void iniciar() {
        this.emAndamento = true;
        System.out.println("Curso " + titulo + " iniciado.");
    }

    public void finalizar() {
        this.emAndamento = false;
        System.out.println("Curso " + titulo + " finalizado.");
    }

    public String getTitulo() {
        return titulo;
    }
}

// Classe Mentoria
class Mentoria {
    private String nome;
    @SuppressWarnings("unused")
    private String mentor;
    @SuppressWarnings("unused")
    private String horario;

    public Mentoria(String nome, String mentor) {
        this.nome = nome;
        this.mentor = mentor;
        this.horario = null;
    }

    public void agendar(String horario) {
        this.horario = horario;
        System.out.println("Mentoria " + nome + " agendada para " + horario + ".");
    }

    public String getNome() {
        return nome;
    }
}

// Classe Devs
class Devs {
    private String nome;
    @SuppressWarnings("unused")
    private Curso cursoAtual;
    @SuppressWarnings("unused")
    private Mentoria mentoriaAtual;

    public Devs(String nome) {
        this.nome = nome;
        this.cursoAtual = null;
        this.mentoriaAtual = null;
    }

    public void inscreverCurso(Curso curso) {
        this.cursoAtual = curso;
        System.out.println(nome + " inscrito no curso " + curso.getTitulo() + ".");
    }

    public void agendarMentoria(Mentoria mentoria) {
        this.mentoriaAtual = mentoria;
        System.out.println(nome + " agendou a mentoria " + mentoria.getNome() + ".");
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        // Criando instâncias
        Bootcamp bootcampPython = new Bootcamp("Bootcamp de Python", "01/07/2024");

        Curso cursoPython = new Curso("Python Fundamentals", "Maria Silva");
        Mentoria mentoriaCodeReview = new Mentoria("Code Review", "João Souza");

        // Adicionando curso e mentoria ao bootcamp
        bootcampPython.adicionarCurso(cursoPython);
        bootcampPython.adicionarMentoria(mentoriaCodeReview);

        // Criando desenvolvedor
        Devs desenvolvedor1 = new Devs("Carlos");

        // Inscrevendo no curso e agendando mentoria
        desenvolvedor1.inscreverCurso(cursoPython);
        desenvolvedor1.agendarMentoria(mentoriaCodeReview);
    }
}

