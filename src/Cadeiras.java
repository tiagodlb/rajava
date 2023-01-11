public class Cadeiras {
    private String cadeiras[] = {"Física", "Cálculo I", "Cálculo II", "Cálculo III", "Química Organica", "Fisico-Química", "Algebra"};


    void getCadeiras() {
        for (int i = 0; i < cadeiras.length; i++) {
            System.out.println(cadeiras[i]);
        }
    }

    void setCadeiras(String s) {
        String newArr[] = new String[cadeiras.length+1];

        for(int i = 0; i < cadeiras.length; i++){
            newArr[i] = cadeiras[i];
        }
        
        newArr[cadeiras.length] = s;
        cadeiras = newArr;
    }
}
