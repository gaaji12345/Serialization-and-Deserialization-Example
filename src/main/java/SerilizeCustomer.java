import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerilizeCustomer {
    public static void main(String[] args){
        Customer customer= new Customer("Gaaji","22","Galle");

        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writeValue(new File("customer.json"), customer);
            System.out.println("Employee serialized to 'employee.json'");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
