package guruspringframework.sdjpamultidb.bootstrap;

import guruspringframework.sdjpamultidb.domain.creditcard.CreditCard;
import guruspringframework.sdjpamultidb.services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    CreditCardService creditCardService;

    @Override
    public void run(String ... args){
        CreditCard cc = CreditCard.builder()
                .firstName("Tom")
                .lastName("Smith")
                .zipCode("22201")
                .creditCardNumber("11112")
                .cvv("432")
                .expirationDate("11/25")
                .build();

        creditCardService.saveCreditCard(cc);

    }
}
