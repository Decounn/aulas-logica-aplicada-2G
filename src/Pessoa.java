public class Pessoa extends Animal {
    // Atributo

    String sobrenome;
    // Métodos da classe
    public void falar(){
        System.out.println("falei");
    }
    // Sobreacarga de método
    public void falar(String volume){
        System.out.println("falei" + volume);
    }
    public String falar(String volume, String tom){
        return "falei " + volume;
    }
    // Sobrescrita de método
    public void comer(){
        System.out.println("Comer como pessoa");
    }

}
