package com.service.mi.wallet.entity;

/* JADX INFO: loaded from: classes6.dex */
public class CardAccountData {
    private String accountNumber;
    private String expiryMonth;
    private String expiryYear;
    private String securityCode;

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    public String getExpiryYear() {
        return this.expiryYear;
    }

    public String getSecurityCode() {
        return this.securityCode;
    }

    public void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    public void setExpiryMonth(String str) {
        this.expiryMonth = str;
    }

    public void setExpiryYear(String str) {
        this.expiryYear = str;
    }

    public void setSecurityCode(String str) {
        this.securityCode = str;
    }
}
