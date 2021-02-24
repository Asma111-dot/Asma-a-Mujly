/**
 * Created by EBH on 24/02/21.
 */
public class Reversearrays {
    public <E> void re(E arr1[],E arr2[]){
        int s=0;
        for (int i = arr1.length; i >0 ; i--,s++) {
            arr2[s]=arr1[i-1];
        }
    }
    public <E> void print(E arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args) {
        Reversearrays r=new Reversearrays();
        Double arr1[]={7.7,4.1};
        Double arr2[]=new Double[2];
        r.re(arr1,arr2);
        r.print(arr2);
    }
}
