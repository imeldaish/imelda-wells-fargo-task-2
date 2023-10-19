package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;


    @Column(nullable = false)
    private String name;


    @Column(nullable = false)
    private Integer riskFactor;


    @Column(nullable = false)
    private Integer total;

    @Column(nullable = false)
    private Long clientId;


    public Portfolio (long portfolioId, String name, Integer riskFactor, Integer total, Long clientId) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.riskFactor = riskFactor;
        this.total = total;
        this.clientId = clientId;
    }


    public Long getPortfolioId() {
        return portfolioId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setRiskFactor(Integer riskFactor) {
        this.riskFactor = riskFactor;
    }


    public Integer getRiskFactor() {
        return riskFactor;
    }


    public void setTotal(Integer total) {
        this.total = total;
    }


    public Integer getTotal() {
        return total;
    }

    public Long getClientId(){
        return clientId;
    }
}
