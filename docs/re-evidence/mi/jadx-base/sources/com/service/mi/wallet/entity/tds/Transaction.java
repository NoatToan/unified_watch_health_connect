package com.service.mi.wallet.entity.tds;

/* JADX INFO: loaded from: classes6.dex */
public class Transaction {
    private double amount;
    private String authorizationStatus;
    private String currencyCode;
    private String merchantName;
    private String merchantPostalCode;
    private String merchantType;
    private String recordId;
    private String tokenUniqueReference;
    private String transactionIdentifier;
    private String transactionTimestamp;
    private String transactionType;

    public double getAmount() {
        return this.amount;
    }

    public String getAuthorizationStatus() {
        return this.authorizationStatus;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getMerchantPostalCode() {
        return this.merchantPostalCode;
    }

    public String getMerchantType() {
        return this.merchantType;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public String getTransactionTimestamp() {
        return this.transactionTimestamp;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public void setAmount(double d) {
        this.amount = d;
    }

    public void setAuthorizationStatus(String str) {
        this.authorizationStatus = str;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setMerchantPostalCode(String str) {
        this.merchantPostalCode = str;
    }

    public void setMerchantType(String str) {
        this.merchantType = str;
    }

    public void setRecordId(String str) {
        this.recordId = str;
    }

    public void setTokenUniqueReference(String str) {
        this.tokenUniqueReference = str;
    }

    public void setTransactionIdentifier(String str) {
        this.transactionIdentifier = str;
    }

    public void setTransactionTimestamp(String str) {
        this.transactionTimestamp = str;
    }

    public void setTransactionType(String str) {
        this.transactionType = str;
    }
}
