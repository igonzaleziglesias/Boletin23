package boletin23;

public class Persona {
    private int idade;
    private float precio;


    public Persona(int idade) {
        this.idade = idade;
        obtenerPrecio();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "\nidade=" + idade;
    }
    
    public void obtenerPrecio(){
        if ((idade>=5)&&(idade<=10)){
            this.precio=1;
        }else if ((idade>=11)&&(idade<=17)){
            this.precio=(float) 2.50;
        }else if (idade>=18) {
            this.precio=(float) 3.50;
        }
    }
}
