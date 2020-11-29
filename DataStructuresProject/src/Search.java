public class Search
{
    private boolean e=false;
    public void Linear(int[] P ,int a){
        System.out.printf("You searched for %d using Linear Search\n", a);
        e=false;
        for(int i=0; i<P.length; i++){
            if(P[i]==a)
            e=true;
        }
        if(e==true)
        System.out.println("This integer exists in the file!");
        else
        System.out.println("This integer does not exist in the file.");
    }
    public boolean Binary(int [] P, int l, int h, int a){
        int m = (l+h)/2;
        if(P[m]==a){
                e=true;
        }
        else if(P[m]>a && l<h && e==false){
                e=false;
                Binary(P,l,m-1,a);
        }
        else if(P[m]<a && l<h && e==false){
                e=false;
                Binary(P,m+1,h,a);
        }
        return e;
    }
    public void Interpolation(int[] P,int left, int right, int a){
        e=false;
        System.out.printf("You searched for %d using Interpolation Search\n", a);
        while(left<=right && a>=P[left] && a<=P[right] && e==false){
            float temp = (((float)a-(float)P[left])/(float)(P[right]-(float)P[left]))*((float)right-(float)left)+left;
            int next = (int)temp; 
            if(P[next]==a)
            e=true;
            else if(P[next]<a)
            left = next +1;
            else if(P[next]>a)
            right = next -1;

        }
        if(e==true)
        System.out.println("This integer exists in the file!");
        else
        System.out.println("This integer does not exist in the file.");
    }
}