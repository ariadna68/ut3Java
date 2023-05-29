import java.util.Scanner;

public class Main {

   static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        pruebaCambioEnMonedas();
    }

private static void pruebaEsPositivo(){

    System.out.println("Escribe un número y te diré si es positivo");
    int num1 = scanner.nextInt();
    if (esPositivo(num1) ==true){
        System.out.println("Es positivo" );
    }
    else{
        System.out.println("Falso, es negativo.");
    }
}

//Crear una función llamada boolean esPositivo (int numero) que reciba un número por parámetro  y devuelva true si es positivo o false en caso contrario.

static boolean esPositivo(int num1) {
    if (num1>0) return true;
    else return false;
}

/*private static void pruebaCambioEnMonedas(){

    System.out.println("Introduce el precio en euros.");
    float precio€ = scanner.nextFloat();
    cambioEnMonedas((precio€));
    }
*/

    static void pruebaCambioEnMonedas(){
        System.out.println("Introduce el precio en euros.");

        float precio€ = scanner.nextFloat();
        precio€ = precio€*100;
        int precioC = (int) precio€;
        System.out.println("Tu precio en céntimos es: " + precioC + "." );
        cambioEnMonedas(precioC);

    }

    //Escriba una función llamada cambioEnMonedas, que reciba por parámetro un valor real que indica la cantidad de dinero en euros.
// El método imprime por pantalla la cantidad de monedas de cada tipo, en que se debe devolver la cantidad de dinero indicada.
    public static void cambioEnMonedas(int precioC){

        int monedasDos = 0, monedasUno = 0,monedas50 = 0, monedas20 = 0, monedas10 = 0, monedas5= 0, monedas2= 0, monedas1= 0;

        if (precioC>=200){
            monedasDos = precioC/200;
            precioC = precioC-(monedasDos*200);
            System.out.println(precioC);
        }

        if (precioC>=100){
            monedasUno = precioC/100;
            precioC = precioC-(monedasUno*100);
        }

        if (precioC>=50) {
            monedas50 = precioC/50;
            precioC = precioC-(monedas50*50);
        }

        if (precioC>=20) {
            monedas20 = precioC/20;
            precioC = precioC-(monedas20*20);
        }

        if (precioC>=10) {
            monedas10 = precioC/10;
            precioC = precioC-(monedas10*10);
        }

        if (precioC>=5) {
            monedas5 = precioC/5;
            precioC = precioC-(monedas5*5);
        }

        if (precioC>=2) {
            monedas2 = precioC/2;
            precioC = precioC-(monedas2*2);
        }

        if (precioC>=1) {
            monedas1 = precioC/1;
            precioC = precioC-(monedas1*1);
        }

        System.out.println("Tu cambio es de " + monedasDos + " monedas de 2€, "+ monedasUno + " monedas de 1€, " + monedas50 + " monedas de 0.50€, "+ monedas20 + " monedas de 0.20€, "+ monedas10+ " monedas de 0.10€, "+ monedas5 + " monedas de 0.05€, "+ monedas2 + " monedas de 0.02€, "+ monedas1 + " monedas de 0.01€.");
    //estoy muy orgullosa de este porque lo he hecho sin ayuda y me ha costado lo suyo, pero lo he hecho.
    }






















}