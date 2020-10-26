import java.io.File;
import java.io.FileInputStream;
import java.net.FileNameMap;
import java.net.Socket;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class HelloImpl extends UnicastRemoteObject implements Hello{

    public HelloImpl() throws RemoteException{

        //...

    }

    @Override
    public String dimmiQualcosa(String nome) throws RemoteException {

        return "Hello " + nome + "!";

    }

    public static void main(String[] args) {

        try{

            HelloImpl hello = new HelloImpl();
            Naming.rebind("HelloServer", hello);
            System.out.println("Collegato");


        } catch (Exception e){

            e.printStackTrace();

        }

    }

}
