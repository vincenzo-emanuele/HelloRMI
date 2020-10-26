import java.rmi.Naming;

public class HelloClient {

    public static void main(String[] args) {

        try{

            Hello hello = (Hello) Naming.lookup("rmi://localhost/HelloServer");
            System.out.println(hello.dimmiQualcosa("Giacomo"));

        } catch (Exception e){

            e.printStackTrace();

        }

    }

}
