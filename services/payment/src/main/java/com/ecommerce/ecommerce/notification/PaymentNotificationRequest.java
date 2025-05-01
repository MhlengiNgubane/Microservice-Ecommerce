package com.ecommerce.ecommerce.notification;

import java.math.BigDecimal;

import com.ecommerce.ecommerce.payment.PaymentMethod;

public record PaymentNotificationRequest(
        String orderReference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerFirstname,
        String customerLastname,
        String customerEmail) {
}
