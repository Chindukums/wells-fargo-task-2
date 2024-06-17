package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;
    @Column(nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;
    @OneToMany(mappedBy = "portfolio")
    private List<Securities> securities;

    public Portfolio(String name, Client client) {
        this.name = name;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Securities> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Securities> securities) {
        this.securities = securities;
    }
}
