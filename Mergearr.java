import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by EBH on 24/02/21.
 */
public class Mergearr {
    public  static  <T> Object[] c(T a[],T b[]){
        return Stream.of(a,b)
                .flatMap(Stream::of)
                .toArray();

    }

    public static void main(String[] args) {
        Integer []a=new Integer[]{1,2};
        Integer []b=new Integer[]{3,4};
        Object[]d=c(a,b);
        System.out.println("Merged object array :"+Arrays.toString(d));
    }
}
