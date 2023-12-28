package exception;

public class Second {

    public static void main(String[] args) {
        // todo write demo
        doLogic(true);
        doLogic(false);
    }

    private static void doLogic(boolean safeMod) {
        if(safeMod){

            try {
                justThrow();
            }
            catch (RuntimeException e){
                System.out.println(e);
            }

            try {
                nullObject();
            }
            catch (NullPointerException e){
                System.out.println(e);
            }

            try {
                exitToArray();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

            try {
                divideByZero();
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
        }
        else {
            justThrow();
            nullObject();
            exitToArray();
            divideByZero();

        }
    }

    public static void divideByZero() {
        int a = 1;
        int b = (int)(3d + 3d * 0d + 1d) * 0;
        double result = a/b;
        System.out.println(result);
    }

    public static void exitToArray() {
        int index = 40;
        int[] a = new int[index];
        var b = a[index];
    }

    public static void justThrow() {
        throw  new RuntimeException("easy throw");
    }

    public static void nullObject() {
        String s = null;
        s.getBytes();
    }
}
