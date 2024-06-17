package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue
    private long clientId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String status;
    @ManyToOne
    @JoinColumn(name = "financialAdvisorId")
    private FinancialAdvisor financialAdvisor;
    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    public Client(String name, String email, String phone, String status, FinancialAdvisor financialAdvisor) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.financialAdvisor = financialAdvisor;
    }

    public long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }
}
