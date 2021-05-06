package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
    private String sellerName;
    private Double soma;

    public SaleSumDTO(){

    }

    public SaleSumDTO(Seller seller, Double soma) {
        this.sellerName = seller.getName();
        this.soma = soma;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSoma() {
        return this.soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }

}
