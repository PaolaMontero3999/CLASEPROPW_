public class Main {


    public static void main(String[] args) {
        System.out.println("Primer programa en JAVA");
        String miNombre = "Paola"; //null
        final String DNI = "49560053K";


        Character letraCompleja = 'K';
        char letraDNI = 'K';

        letraDNI = 'P';
        int edad = 26;
        double altura = 1.65;
        float peso = 62.5f;
        boolean experiencia = true;


        peso = 65.8f;
        experiencia = false;


        System.out.println("Mi nombre es:" + miNombre);
        System.out.println("La letra de mi DNI es:" + letraDNI);
        System.out.println("Mi edad es:" + edad);
        System.out.println("Mi altura es:" + altura);
        System.out.println("Mi peso es :" + peso);
        System.out.println("Mi experiencia es:" + experiencia);
        System.out.println("El numero de mi DNI es:" + DNI);
        System.out.println("El numero PI es:" + Math.PI);
        System.out.println("El valor del numero E:" + Math.E);
        System.out.println("El valor maximo de un int es:" + Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int es:" + Integer.MIN_VALUE);


    }
}
