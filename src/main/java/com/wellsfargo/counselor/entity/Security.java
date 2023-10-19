package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Security {
    
    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private Integer total;

    @Column(nullable = false)
    private Long portfolioId;


    public Security (long securityId, String symbol, String type, Integer quantity, Integer price, String purchaseDate, Integer total, Long portfolioId) {
        this.securityId = securityId;
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.total = total;
        this.portfolioId = portfolioId;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public Integer getTotal() {
        return total;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

}
