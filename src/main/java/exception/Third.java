package exception;

public class Third {
    public static void main(String[] args) throws CustomException{
        start();
    }

    private static void start() throws CustomException {
        makeSome(false);

        try {
            makeSome(true);
        }
        catch(CustomException e) {
            System.out.println(e);
        }

        makeSome(true);
    }

    private static void makeSome(boolean doDirt) throws CustomException{
        if(doDirt)
            throw new CustomException("dirt");
        System.out.println("Ok");
    }
}
