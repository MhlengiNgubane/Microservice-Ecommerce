package com.ecommerce.ecommerce.payment;

import java.math.BigDecimal;

import com.ecommerce.ecommerce.customer.CustomerResponse;
import com.ecommerce.ecommerce.order.PaymentMethod;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer) {
}