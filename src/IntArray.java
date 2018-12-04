public class IntArray {
    
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int[] array = createArray(n);
        
        fillArray(array,n);
        showArray(array,n);
        array = editOrder(array,n);
        showEditedArray(array,n);
        
        
    }
    
    static int[] createArray(int size) {
        return new int[size];
    }
    
   static void fillArray (int[]array, int size) {
       for (int i = 0; i < size; i++) {
           array[i] = i + 1;
       }
    }
    
   static void showArray(int[]array,int size){
       System.out.println("Zawartość tablicy:");
       System.out.print("[");
       for (int i = 0; i <size ; i++) {
           System.out.print(array[i]);
           if (i<(size-1)){
               System.out.print(" ");
           }
       }
       System.out.println("]");
   }
   
   static int[] editOrder(int[]array,int size){
       int temp;
       for (int i = 0,j=size-1; i <size/2 ; i++,j--) {
           temp = array[i];
           array[i]=array[j];
           array[j]=temp;
       }
       return array;
   }
    
    static void showEditedArray(int[]array,int size){
        System.out.println("Zawartość tablicy po odwróceniu kolejności:");
        System.out.print("[");
        for (int i = 0; i <size ; i++) {
            System.out.print(array[i]);
            if (i<(size-1)){
                System.out.print(" ");
            }
        }
        System.out.print("]");
    }
   
   
   
   
}

    
    
