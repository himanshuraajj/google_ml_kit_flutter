public class Linear {
    public static void main(String[] args){
        int [] arr ={4,5,34,54,65};
        int target = 4;
        int ans = LinearSearch(arr, target);
        System.out.println("Element found at index: " + ans);

    }
    static int LinearSearch(int [] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0;index < arr.length;index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    
}
