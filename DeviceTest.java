import java.time.*;

/**
 Questo programma testa la classe Device
 @version 1.1 2022-02-22
 @author Antonio Esposito
 */

 public class DeviceTest
 {
     public static void main(String[] args)
     {
         //riempi l'array installato con tre device object
         Device[] installato = new Device[3];

         installato[0] = new Device("mivpe015", 10000, 2022, 02, 22);
         installato[1] = new Device("mivpe016", 10000, 2022, 02, 22);
         installato[2] = new Device("mivpe035", 10000, 2022, 02, 22);

         for (Device e : installato)
            System.out.println("name=" + e.getName());

     }
 }

class Device
{
    //instance field
    private String name;
    private double prezzo;
    private LocalDate hireDay;
    
    //costructor
    public Device(String n, double s, int year, int month, int day)
    {
        name = n;
        prezzo = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // a method
    public String getName()
    {
        return name;
    }



}