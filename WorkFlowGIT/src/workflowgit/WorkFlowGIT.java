/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workflowgit;

/**
 *
 * @author danie
 */
public class WorkFlowGIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Adicion de la Feature numero 1 en la rama feature 1
        
        // Hotfix Branch - ordenamiento burbuja 
        int a[] = {5,3,2,7,10,1};
        for (int x = 0; x < a.length; x++) {
            for (int i = 0; i < a.length-x-1; i++) {
                if(a[i] < a[i+1]){
                    int tmp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = tmp;
                }
            }
        }
        
    }
    
}
