package com.ecommerce.ecommerce.kafka;



import java.math.BigDecimal;
import java.util.List;

import com.ecommerce.ecommerce.customer.CustomerResponse;
import com.ecommerce.ecommerce.order.PaymentMethod;
import com.ecommerce.ecommerce.product.PurchaseResponse;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}