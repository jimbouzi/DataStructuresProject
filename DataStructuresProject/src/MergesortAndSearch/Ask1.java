import java.io.*;
import java.util.*;
import java.lang.*;
public class Ask1{
    public static void main(String args[]){
       Scanner a1;
       Scanner a2;
       Scanner input;
       int metr = 0;
       int[] Integers;
       int i =0;
       int wanted;
       int option;
       intFile p;
       Search s = new Search();
       boolean b;
       try{
        a1 = new Scanner(new File("integers.txt"));
        }
        catch(Exception e){
            System.out.println("Error");
            a1=null;
        }
       while (a1!=null && a1.hasNext()){
           a1.next();
           metr++;
       }
       a1.close();
       Integers = new int[metr];
       try{
        a2 = new Scanner(new File("integers.txt"));
        }
        catch(Exception e){
            System.out.println("Error: File integers does not exist");
            a2=null;
        }
       while(a2!=null && a2.hasNext()){
           Integers[i] = a2.nextInt();
           i++;
        }
        a2.close();
       int[] Intsort = new int[metr];
       MergeSort x = new MergeSort();
       Intsort = x.mergesort(Integers);
       p = new intFile();
       p.createFile();
       p.writeFile(Intsort);
       p.closeFile();
       System.out.println("The integers are sorted in the file named Integers_Sorted");
       System.out.println("Give the integer you want to search");
       input = new Scanner(System.in);
       wanted = input.nextInt();
       System.out.println("How do you want to search it?\nPress 1 for Linear Search\nPress 2 for Binary Search\nPress 3 for Interpolation Search");
       input = new Scanner(System.in);
       option = input.nextInt();
       switch(option){
           case 1: s.Linear(Intsort,wanted);
                   break;
           case 2: b = s.Binary(Intsort,0,Intsort.length-1,wanted);
                   System.out.printf("You searched for %d using Binary Search\n",wanted);
                   if(b==true)System.out.println("This integer exists in the file!");
                   else System.out.println("This integer does not exist in the file.");
                   break;
           case 3: s.Interpolation(Intsort,0,Intsort.length-1,wanted);
        }
    }
}