public class Main {
    public static void main(String[] args) {
        //Primera parte
        int numeroIf = 2;//Declaramos la variable Int númeroIf y le damos valor 2
        if (numeroIf < 0) {//Usando un if, creamos una condición que compara si la variable numeroIf es negativo
            System.out.println("Número Negativo");//En caso de ser negativo nos mostraría en pantalla "Número Negativo"
        }
        if (numeroIf == 0) {//Usando un if, creamos una condición que compara si la variable numeroIf es 0
            System.out.println("Cero");//En caso de ser igual a 0 nos mostraría en pantalla "Cero"
        }
        if (numeroIf > 0) {//Usando un if, creamos una condición que compara si la variable numeroIf es positivo
            System.out.println("Número positivo");//En caso de ser positivo nos mostraría en pantalla "Número Positivo"
        }
        //Segunda parte
        int numeroWhile = 1;//Delaramos la variable numeroWhile y le damos valor 1
        while (numeroWhile < 3){//Creamos el bucle While cuya condición es que numeroWhile sea inferior a 3
            System.out.println (numeroWhile);//Mostramos por pantalla el valor de la variable numeroWhile
            numeroWhile = numeroWhile +1;//Sumamos 1 a la variable numeroWhile
        }
        //Tercera parte
        int numeroDo = 1;//Delaramos la variable numeroDo y le damos valor 1
        do {//Creamos el bucle Do (más adelante estableceremos a condición)
            System.out.println(numeroDo);//Mostramos por pantalla el valor de la variable numeroDo
            numeroDo = numeroDo + 1;//Sumamos 1 a la variable numeroDo
            break;//break hace que el bucle sólo se ejecute una vez
        }    while (numeroDo < 3);//Establecemos la condición del bucle Do por la cual numeroDo debe ser inferior a 3
        //Cuarta parte
        for (int númeroFor = 0;númeroFor <= 3; númeroFor = númeroFor + 1) {//Creamos el bucle For...
            //...declarando la variable númeroFor y dándole valor 0, creando la condición, y sumándole 1 en cada iteración.
            System.out.println (númeroFor);//Mostramos por pantalla el valor de la variable númeroFor
        }
        //Quinta parte
        var estacion = "Verano";//Declaramos la variable estación y le asignamos el valor verano
        switch (estacion)  {//creamos un Swich de la variabe estacion
            case "Primavera"://Creamos el case Primavera
                System.out.println ("Es Primavera!");//Mostramos por pantalla "Es Primavera!"
                break;//Usamos un break para detener el bucle en caso de que se cumpla la condición
            case "Verano"://Creamos el case Verano
                System.out.println ("Es Verano!");//Mostramos por pantalla "Es Verano!"
                break;//Usamos un break para detener el bucle en caso de que se cumpla la condición
            case "Otoño"://Creamos el case Otoño
                System.out.println ("Es Otoño!");//Mostramos por pantalla "Es Otoño!"
                break;//Usamos un break para detener el bucle en caso de que se cumpla la condición
            case "Invierno"://Creamos el case Invierno
                System.out.println ("Es Invierno!");//Mostramos por pantalla "Es Invierno!"
                break;//Usamos un break para detener el bucle en caso de que se cumpla la condición
            default://Creamos un default
                System.out.println ("No es una estacion");//Mostramos por pantalla "No es una estacion"
        }
    }

}