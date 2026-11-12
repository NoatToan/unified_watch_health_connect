package com.service.mi.wallet.entity;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class TokenInfo implements Serializable {
    private String accountPanExpiry;
    private String accountPanSuffix;
    private String alternateAccountIdentifierSuffix;
    private boolean dsrpCapable;
    private String financialAccountSuffix;
    private int productCategory;
    private String tokenExpiry;
    private String tokenPanSuffix;

    public String getAccountPanExpiry() {
        return this.accountPanExpiry;
    }

    public String getAccountPanSuffix() {
        return this.accountPanSuffix;
    }

    public String getAlternateAccountIdentifierSuffix() {
        return this.alternateAccountIdentifierSuffix;
    }

    public String getFinancialAccountSuffix() {
        return this.financialAccountSuffix;
    }

    public int getProductCategory() {
        return this.productCategory;
    }

    public String getTokenExpiry() {
        return this.tokenExpiry;
    }

    public String getTokenPanSuffix() {
        return this.tokenPanSuffix;
    }

    public boolean isDsrpCapable() {
        return this.dsrpCapable;
    }

    public void setAccountPanExpiry(String str) {
        this.accountPanExpiry = str;
    }

    public void setAccountPanSuffix(String str) {
        this.accountPanSuffix = str;
    }

    public void setAlternateAccountIdentifierSuffix(String str) {
        this.alternateAccountIdentifierSuffix = str;
    }

    public void setDsrpCapable(boolean z) {
        this.dsrpCapable = z;
    }

    public void setFinancialAccountSuffix(String str) {
        this.financialAccountSuffix = str;
    }

    public void setProductCategory(int i) {
        this.productCategory = i;
    }

    public void setTokenExpiry(String str) {
        this.tokenExpiry = str;
    }

    public void setTokenPanSuffix(String str) {
        this.tokenPanSuffix = str;
    }
}
