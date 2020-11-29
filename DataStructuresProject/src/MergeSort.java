public class MergeSort
{
   public int[] mergesort(int[] A){
       if(A.length<=1)return A;
       else{
           int q = A.length/2;
           int[] B = new int[q];
           int[] C = new int[A.length-q];
           for(int i=0; i<B.length; i++){
               B[i]=A[i];
            }
           for(int z=0; z<C.length; z++){
               C[z]=A[q+z];
            }
           B = mergesort(B);
           C = mergesort(C);
           int[] D = new int [A.length];
           D = merge(B,C);
           return D;
        }
    }
   public int[] merge(int[] E, int[] F){
       int i=0;
       int j=0;
       int k=0;
       int[] fin = new int[E.length+F.length];
       while(i<E.length && j<F.length){
           if(E[i]<F[j]){
               fin[k]=E[i];
               i++;
               k++;
            }
            else{
                fin[k]=F[j];
                j++;
                k++;
            }
        }
       if(i<E.length){
           while(i<E.length){
               fin[k]=E[i];
               i++;
               k++;
            }
        }
        else{
            while(j<F.length){
                fin[k]=F[j];
                j++;
                k++;
            }
        } 
        return fin;
    }
}