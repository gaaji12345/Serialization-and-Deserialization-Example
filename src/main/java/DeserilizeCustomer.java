import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DeserilizeCustomer {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Customer customer = mapper.readValue(new File("customer.json"), Customer.class);
            System.out.println("Customer deserialized from 'customer.json'");
            System.out.println(customer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    }

