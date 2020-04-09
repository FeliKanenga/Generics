class GenericClass<T> {
 // generic class with getters and setters
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public void getT() {
        System.out.println(t);
    }

    // generic method to print out items from an Array
    public static <T> void printArrayContent ( T [] Array) {

        for (int i = 0; i < Array.length ; i++) {
            if (i == Array.length-1) {
                System.out.println(Array[i]);
            }
            else {
                System.out.print(Array[i] + " ,");
            }
        }
    }

}

public class Generics {

    public static void main(String[] args) {

        // one string and one int array to test "printArrayContent" method
        int [] numbers = new int[]{12, 324, 6, 7900};
        String [] words = new String[0];
        Object [] number = {12, 324, 6, 7900};

        // creating a string object and integer object
        GenericClass<String> stringInstance = new GenericClass<>();
        GenericClass<Integer> IntegerInstance = new GenericClass<>();

        stringInstance.setT("Test");
        stringInstance.getT();

        IntegerInstance.setT(1000);
        IntegerInstance.getT();


        /* Testing the method */
        GenericClass.printArrayContent(number);
        GenericClass.printArrayContent(words);

       // GenericClass.printArrayContent(numbers);  // doesn't work yet


    }



}
