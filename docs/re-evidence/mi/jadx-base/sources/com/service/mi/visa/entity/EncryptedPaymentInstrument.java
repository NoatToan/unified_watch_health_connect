package com.service.mi.visa.entity;

/* JADX INFO: loaded from: classes6.dex */
public class EncryptedPaymentInstrument {
    private String accountNumber;
    private String cvv2;
    private ExpirationDate expirationDate;
    private String name;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getCvv2() {
        return this.cvv2;
    }

    public ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    public String getName() {
        return this.name;
    }

    public void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    public void setCvv2(String str) {
        this.cvv2 = str;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setName(String str) {
        this.name = str;
    }
}
