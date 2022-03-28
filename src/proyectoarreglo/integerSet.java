/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoarreglo;

/**
 *
 * @author aarbonag
 */
public class integerSet {
    int[] numeroEnteros= {1,22,3,44,5,66,7,88,9,100};
    Boolean[] matrizA = new Boolean[10];
    
    public integerSet(){
         //Arrays.fill(matrizA, Boolean.FALSE);
         for(int i=0; i<10;i++){ 
                matrizA[i] = false;
        }
    }
    
    public int[] arreglo(){
        return numeroEnteros;
    }
    
    public Boolean[] matriz(){
        return matrizA;
    }
}
