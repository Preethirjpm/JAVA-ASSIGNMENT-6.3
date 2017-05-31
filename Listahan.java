import javax.swing.*;
import java.util.Arrays;

public class Listahan {

    public static void main(String[] args){
        int list1[] = {1,3,2,5,7,8,5,6,9,4};
        int list2[] = {2,1,4,3,2,1,4,2,0,2};
        int list3[] = new int[10];
        int a;

        System.out.print("List1: ");
        for(a=0; a<10; a++){
            System.out.print(list1[a]+" ");
        }
        System.out.print("\nList2: ");
        for(a=0; a<10; a++){
            System.out.print(list2[a]+" ");
        }
        System.out.print("\nList3: ");
        for(a=0; a<10; a++){
            list3[a]=list1[a]+list2[a];
            System.out.print(list3[a]+" ");
        }

        int searchValue = Integer.parseInt(JOptionPane.showInputDialog("Input a value to search in List3: "));
        int Result = Arrays.binarySearch(list3,searchValue);

        if(Result!=-3){
            System.out.println("\n\nThe value "+searchValue+" is in List3!");
            System.out.println("There are "+Result+" of it in List3.");

        }else{
            System.out.println("\n"+searchValue+" cannot be found in List3.");
        }
    }


}