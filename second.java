import java.net.*;
import java.io.*;
import java.util.Scanner;
class second {
    public static void main ( String [] args) throws Exception {
        Socket s = new Socket("localhost",4000);
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the numbrt");
    String msg = scan.next();
    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());

    
    dos.writeUTF(msg.toUpperCase());
    String reply = dis.readUTF();
    System.out.println("Server reply:"+ reply);

    dos.close();
    dis.close();
    s.close();

    }
}