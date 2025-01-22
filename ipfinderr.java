import java.net.*;
import java.util.*;
public class ipfinderr{
    public static void main(String[] args) {
        String host;
        try{
            host=InetAddress.getLocalHost().getHostName();
            System.out.println("host name:"+host);
        }
        catch(UnknownHostException e){
            System.out.println("could not found host");
        }
    }
} 