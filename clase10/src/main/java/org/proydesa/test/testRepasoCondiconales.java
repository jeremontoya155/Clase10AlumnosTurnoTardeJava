
package org.proydesa.test;

import java.util.Scanner;


public class testRepasoCondiconales {

    public static void main(String[] args) {
        //El a es una ejemplo de ingreso por teclado suponemos eso 
        int a=1;
        
//        //Si el numero es mayor a 10 menor o igual al mismo 
//        if (a>10) {
//            //bloque verdadero
//            System.out.println("Lo ingresado es mayor a 10 ");
//        } else {
//            //bloque falso
//            if (a==10) {
//                
//                System.out.println("Es igual a 10");
//                
//            } else {
//                
//                System.out.println("Es menor a 10");
//            }
//            
//        }

//        if (a>10) {//Mayor
//            System.out.println("El numero es mayor a 10");
//        } else if(a==10) {//Igual
//            System.out.println("El numero es igual a 10");
//        }else{//Menor 
//            System.out.println("El numero es menor a 10");
//        }
//                
        

//        switch (a) {
//            //Igualda multiple la diferenciamos con coma 
//            case 1,4,3:
//                System.out.println("Ingreso una de las tres primeras personas");
//                break;
//                
//            case 5:
//                System.out.println("Ingreso la quinta persona");
//                break;
//                
//            case 10:
//                System.out.println("Ingreso la decima persona");
//                break;
//                
//            case 15:
//                System.out.println("Ingreso la decimo quinta persona");
//                break;
//                
//            default:
//                System.out.println("Aca hubo un error no se ingreso ninguna opcion valida");
//        }
//        
//        switch (a) {
//            case 1,4,3 -> {
//                System.out.println("Es una de las primeras opciones");
//                System.out.println("Gracias por usar el programa ");
//            
//            }
//                
//            case 5 -> System.out.println("Ingreso la quinta persona");
//                
//            case 10 -> System.out.println("Ingreso la decima persona");
//                
//            case 15 -> System.out.println("Ingreso la decimo quinta persona");
//                
//            default -> System.out.println("Aca hubo un error no se ingreso ninguna opcion valida");
//        }
        //Igualdad multiple la diferenciamos con coma
//                
//        for (int i =0; i <= 100; i++) {
//            System.out.println(i);
//            
//        }
        
//        for (int i =100; i >= 0; i--) {
//            System.out.println(i);
//            
//        }
        

          //El array almancena elementos del mismo tipo
          //Con un espacio definido para los mismos
          
          //int[] numerosPorFuerzaBruta={1,2,3,4,5,6};[]{}
          int[] numerosPorFuerzaBruta={1,2,3,100,5,6};
          int[] numeros=new int[5];
        //      String[] nombres={"Jose","Jupiter","Javier"};
          
        //Para acceder a un elemento del array usamos
        //nombreDelArray[posicion]
        
        
        System.out.println("Elementos tres del array:"+numerosPorFuerzaBruta[3]);
        
//            for (int e : numerosPorFuerzaBruta) {
//                
//                    //Bloque de accion
//                    System.out.println(e);
//            }

//            for (int i = 0; i < numerosPorFuerzaBruta.length; i++) {
//           
//                
//                numerosPorFuerzaBruta[i]=1;
//            
//        }
//                for (int i = 0; i < numeros.length; i++) {
//                
//                    String texto="Ingrese el numero que desee para la posicion:"+(i+1);
//                    numeros[i]=cargarNumero(texto);
//        }
//        System.out.println("--------------");
//                for (int numero : numeros) {
//                    System.out.println(numero);
//        }
//       
        //a esta iniciado en 1 
        //condicional
//            while(a<10){
//                System.out.println("No hay cambio en la condicion");
//                a+=2;
//                
//            }
//            
            
//            while(true){
//                
//                System.out.println(a);
//                System.out.println("Esta todavia menor a 10");
//                
//                a++;
//                
//                
//                if(a>9){
//                break;
//                }
//                
//                
//                
//            }

//            int contador=0;
//            int numeroAnalizar=cargarNumero("Ingrese un numero");
//            while(numeroAnalizar!=5){
//                System.out.println("La persona ingreso");
//                System.out.println(numeroAnalizar);
//                
//                contador++;
//                
//                if (contador>=3) {
//                    break;
//                }
//                
//                numeroAnalizar=cargarNumero("Ingrese un numero nuevamente");
//            }

//do while


//            while(a<=10){
//                System.out.println(a);
//                a++;
//            }
            
            //Minimo una ejecucion 
            //El while no necesariamente ingresa en el bloque de accion 
            do{
                System.out.println(a);
                a++;
            }while(a<=10);
            
            //El private nos obliga a utilizar los getters y setters
            //para poder acceder a los campos 
            //public con metodos y constructores
            //Default ->es para crear clases internas
            //en pequeños entornos de trabajo
            
            
            



    }
    
    public static int cargarNumero(String texto){
        Scanner sn=new Scanner(System.in);
        System.out.println(texto);
        int retorno=sn.nextInt();
       
        return retorno;
    
    }
    
    class Perro{
        int edad;
        String nombre;

        public Perro(int edad, String nombre) {
            this.edad = edad;
            this.nombre = nombre;
        }
        
        
    
    }
}
