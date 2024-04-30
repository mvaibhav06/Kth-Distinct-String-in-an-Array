import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctString {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> temp = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            String s = arr[i];
            if(temp.containsKey(s)){
                temp.put(s,0);
            }else{
                temp.put(s,1);
            }
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            String s = arr[i];
            if(temp.get(s)==1){
                count++;
                if(count == k){
                    return s;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr,2));
    }
}
