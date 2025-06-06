package com.order.lifecycle.common.libs.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderValidatedEvent {
	
	private String orderId;
	private String userId;
	private BigDecimal amount;
	private FraudCheckResult result;
	private LocalDateTime validatedAt;
}
