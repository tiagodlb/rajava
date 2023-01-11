public class App {
    public static void main(String[] args) throws Exception {
        Alunos aluno = new Alunos();
        Cadeiras cadeira = new Cadeiras();
        System.out.println("\nBuscando informações do aluno....\n");
        aluno.setAssinante();
        aluno.setNome("Joseph");
        aluno.setCurso("Engineer");
        aluno.setPeriodo(3);
        aluno.setUniversidade("Cambridge University");
        aluno.getAssinante();
        aluno.getCurso();
        aluno.getNome();
        aluno.getPeriodo();
        aluno.getUniversidade();
        aluno.setAddPeriodo();
        aluno.getPeriodo();
        aluno.cadeiras = cadeira;
        System.out.println("\nPegando as cadeiras....\n");
        cadeira.getCadeiras();
    }
}
