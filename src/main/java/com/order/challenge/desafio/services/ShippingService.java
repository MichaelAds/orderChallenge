package com.order.challenge.desafio.services;

import com.order.challenge.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        double totalWithoutShipping = order.getBasic() - order.getBasic() * (order.getDiscount() / 100);
        if(totalWithoutShipping < 100.00){
            return 20.00;
        } else if (totalWithoutShipping >= 100.00 && totalWithoutShipping <= 200.00) {
            return 12.00;
        } else {
            return 00.00;
        }
    }
}
