/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble.sort;

/**
 *
 * @author Glen Aurora
 */
public class BubbleSort {
    public static void main(String[] args) {
    int data[]={20,10,30,40,50};
    System.out.println("Bubble sort");
    System.out.print("Data Awal : ");
    for(int i=0; i<data.length; i++){
        System.out.print(data[i]+" ");
    }
    System.out.println(" ");
    for(int i=0; i<data.length;i++){
    boolean swap=false;
    for(int j=0;j<data.length-1;j++){
    if(data[j]>data[j+1]){
        if(data[j]>data[j+1]){
            int temp=data[j];
            data[j]=data[j+1];
            data[j+1]=temp;
            swap=true;
        }//end if
    }//end loop j
    System.out.println("i= "+i); //cek loop i
    if(swap=false);
    break;
    }
    }//end loop i
    System.out.print("Data Akhir : ");
    for(int i=0; i<data.length;i++){
        System.out.print(data[i]+"");
    }
    System.out.println("");
    }//end main
}//end class
    
        
    
    
    

