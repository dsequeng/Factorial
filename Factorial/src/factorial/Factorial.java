/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author dany
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(String.format("El factorial de 3 es %f", factorial(3)));
        System.out.println(String.format("El factorial de 7 es %f", factorial(7)));
        System.out.println(String.format("El factorial de 35 es %f", factorial(35)));
    }
    
    public static double factorial(long numero)
    {
        if(numero >=0 && numero <= 100)  
        {
            //f
            double factorial=1;
            for (int i=1; i<numero+1; i++)
            {
                factorial = factorial * i;
            }
            return factorial;
        }
        else
        {
            return 0;
        }
    }
    
}