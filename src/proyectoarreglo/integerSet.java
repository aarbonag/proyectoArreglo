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
    //int[] numeroEnteros= {1,2,30,4,50,6,7,8,9,10};
    int[] numeroEnteros= {1,22,3,44,5,66,7,88,9,100};
    int[] numeroEnterosB= {1,2,30,4,50,6,7,8,9,10};
    Boolean[] matrizA = new Boolean[10];
    Boolean[] matrizB = new Boolean[10];
    
    public integerSet(){
         //Arrays.fill(matrizA, Boolean.FALSE);
         for(int i=0; i<10;i++){ 
                matrizA[i] = false;
                matrizB[i] = false;
        }
         
        /*for(int i=0; i<10;i++){ 
                matrizB[i] = false;
        } */
    }
    
    
    
    public int[] arreglo(){
        return numeroEnteros;
    }
    public int[] arregloB(){
        return numeroEnterosB;
    }
    
    public Boolean[] matriz(){
        return matrizA;
    }
    
    public Boolean[] matrizB(){
        return matrizB;
    }
    
    public Boolean[] union(){
        integerSet objIntegerSet = new integerSet();
        int[] arregloA = objIntegerSet.arreglo();
        int[] arregloB = objIntegerSet.arregloB();
        Boolean[] matrizB = objIntegerSet.matrizB();
       
        for(int i=0; i<10;i++)
            if( arregloA[i]%2==0 || arregloB[i]%2==0){
                //JOptionPane.showMessageDialog(null, "Arreglo A:"+arreglo[i]+" "+"Arreglo B:"+arregloB[i]);
                matrizB[i]= true;
            }
        return matrizB;
    }
    
    public Boolean[] interseccion(){
        integerSet objIntegerSet = new integerSet();
        int[] arregloA = objIntegerSet.arreglo();
        int[] arregloB = objIntegerSet.arregloB();
        Boolean[] matrizB = objIntegerSet.matrizB();
       
        for(int i=0; i<10;i++)
            if( arregloA[i]%2==0 && arregloB[i]%2==0){
                //JOptionPane.showMessageDialog(null, "Arreglo A:"+arreglo[i]+" "+"Arreglo B:"+arregloB[i]);
                matrizB[i]= true;
            }
        return matrizB;
    }
    public Boolean comparaArreglos(){
        integerSet objIntegerSet = new integerSet();
        int[] arregloA = objIntegerSet.arreglo();
        int[] arregloB = objIntegerSet.arregloB();
        Boolean sonIguales = false;
       
        for(int i=0; i<10;i++){
            if( arregloA[i]==arregloB[i])
                //JOptionPane.showMessageDialog(null, "Arreglo A:"+arreglo[i]+" "+"Arreglo B:"+arregloB[i]);
                sonIguales= true;
                else
                    sonIguales= false;
        }
        return sonIguales;
    }
}
