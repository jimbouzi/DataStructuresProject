import java.lang.*;
import java.util.*;
public class intFile
{
    private Formatter f;
    public void createFile(){
        try{
            f = new Formatter("Integers_Sorted.txt");
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    public void writeFile(int[] Res){
        for(int i=0; i<Res.length; i++){
            f.format("%d %n", Res[i]);
        }
    }
    public void closeFile(){
        f.close();
    }
}
