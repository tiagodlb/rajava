public class Alunos {
    private String universidade;
    private int periodo;
    private String curso;
    private String nome;
    private Boolean assinante = false;
    Cadeiras cadeiras;

    void setAddPeriodo(){
        periodo += 1;
    }
    void setPeriodo(int i){
        periodo = i;
    }
    void getPeriodo(){
        System.out.println(periodo);
    }
    void setCurso(String s){
        curso = s;
    }
    void getCurso(){
        System.out.println(curso);
    }
    void setUniversidade(String s){
        universidade = s;
    }
    void getUniversidade(){
        System.out.println(universidade);
    }
    void setNome(String s){
        nome = s;
    }
    void getNome(){
        System.out.println(nome);
    }
    void getAssinante(){
        if(Boolean.TRUE.equals(assinante))
            System.out.println(nome + " É assinante");
    }
    void setAssinante(){
        assinante = true;
    }
}
