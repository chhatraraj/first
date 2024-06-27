import java.net.*;
import java.io.*;
class first {
    public static void main ( String [] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
    System.out.println("Server running on 4000");
    Socket s = ss.accept ();
    DataInputStream dis = new DataInputStream(s.getInputStream());
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    System.out.println("Client connected: "+ s.getPort());
int number = dis.readInt();
    String response = (number%2 == 0 ) ? "even" : "odd";
    dos.writeUTF(response);
    dos.close();
    dis.close();
    s.close();
    ss.close();

    }
}


