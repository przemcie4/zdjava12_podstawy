package exercises;

public class ArraysPointers {



    public static void main(String []args){
        int[] testArray = {123,312,323,444,556,231};

        funnyshowArray(testArray);
    }

    private static void funnyshowArray(int[] array) {



        int start = 0;
        int end = array.length - 1;

        while(start <= end){
            if(start != end) {
                System.out.println("Para argumentów:");
                System.out.println(array[start]);
                System.out.println(array[end]);
            }else{
                System.out.println(array[end]);
            }
            start++; // inkrementacja
            end--;

        }


    }
//[123,312,323,444,556] length = 5, last index = 4


}
