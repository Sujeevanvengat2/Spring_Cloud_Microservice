package com.learn.microservices.currencyconversionservices;

import java.math.BigDecimal;

public class CurrencyConversion {

	private long id;

	private String from;

	private String to;

	private BigDecimal quantity;

	private BigDecimal conversionMultiple;

	private BigDecimal totalCalculatedAmount;

	private String Environment;

	public CurrencyConversion(long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple,
			BigDecimal totalCalculatedAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.conversionMultiple = conversionMultiple;
		this.totalCalculatedAmount = totalCalculatedAmount;
		Environment = environment;
	}

	public CurrencyConversion() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public String getEnvironment() {
		return Environment;
	}

	public void setEnvironment(String environment) {
		Environment = environment;
	}

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", quantity=" + quantity
				+ ", conversionMultiple=" + conversionMultiple + ", totalCalculatedAmount=" + totalCalculatedAmount
				+ ", Environment=" + Environment + "]";
	}

}
