package atividade1somadosimpares;

public abstract class Atividade1SomadosImpares {

    public static void main(String[] args) {

        int contador = 0, numImpar = 0, numDeImpar = 0;
        float media = 0f;


        
        while (contador < 1000) {  //variavel contador ira contar até 1000
            if (contador % 2 != 0) {  // quando contdor for numero impar será somado a variavel numImpar
                numImpar += contador;
                numDeImpar++;  // Essa variavel numDeImpar ira receber quantos numeros impar terá de 1 a 1000
            }
            contador++;
        }
        System.out.println("São " + numDeImpar + " numeros impares entre 1 e 1000.");
        System.out.println("--------------------------------------");
        System.out.println("A soma dos numeros Impares é: " + numImpar);
        System.out.println("--------------------------------------");

        media = numImpar / numDeImpar;  //tendo a quantidade de impar, tiramos a media dividindo a soma dos numeros pela quantidade de numeros.

        System.out.println("A media da soma de todos os numeros impares é: " + media);
        System.out.println("--------------------------------------");

    }

}
