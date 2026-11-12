package com.service.mi.visa.entity.transactionresp;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class EncTransactionInfo {
    private String amount;
    private String atc;
    private String currencyCode;
    private String industryCatgCode;
    private String industryCatgName;
    private String industryCode;
    private String industryName;
    private String merchantCity;
    private String merchantName;
    private String merchantZipCode;
    private String transactionDate;
    private String transactionID;
    private String transactionStatus;
    private String transactionType;
    private boolean usingThisToken;
    private String vProvisionedTokenID;

    public String getAmount() {
        return this.amount;
    }

    public String getAtc() {
        return this.atc;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getIndustryCatgCode() {
        return this.industryCatgCode;
    }

    public String getIndustryCatgName() {
        return this.industryCatgName;
    }

    public String getIndustryCode() {
        return this.industryCode;
    }

    public String getIndustryName() {
        return this.industryName;
    }

    public String getMerchantCity() {
        return this.merchantCity;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getMerchantZipCode() {
        return this.merchantZipCode;
    }

    public String getTransactionDate() {
        return this.transactionDate;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public String getTransactionStatus() {
        return this.transactionStatus;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public String getvProvisionedTokenID() {
        return this.vProvisionedTokenID;
    }

    public boolean isUsingThisToken() {
        return this.usingThisToken;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setAtc(String str) {
        this.atc = str;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setIndustryCatgCode(String str) {
        this.industryCatgCode = str;
    }

    public void setIndustryCatgName(String str) {
        this.industryCatgName = str;
    }

    public void setIndustryCode(String str) {
        this.industryCode = str;
    }

    public void setIndustryName(String str) {
        this.industryName = str;
    }

    public void setMerchantCity(String str) {
        this.merchantCity = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setMerchantZipCode(String str) {
        this.merchantZipCode = str;
    }

    public void setTransactionDate(String str) {
        this.transactionDate = str;
    }

    public void setTransactionID(String str) {
        this.transactionID = str;
    }

    public void setTransactionStatus(String str) {
        this.transactionStatus = str;
    }

    public void setTransactionType(String str) {
        this.transactionType = str;
    }

    public void setUsingThisToken(boolean z) {
        this.usingThisToken = z;
    }

    public void setvProvisionedTokenID(String str) {
        this.vProvisionedTokenID = str;
    }

    public String toString() {
        return "EncTransactionInfo{vProvisionedTokenID='" + this.vProvisionedTokenID + "', transactionID='" + this.transactionID + "', transactionType='" + this.transactionType + "', transactionDate='" + this.transactionDate + "', currencyCode='" + this.currencyCode + "', merchantName='" + this.merchantName + "', amount='" + this.amount + "', transactionStatus='" + this.transactionStatus + "', industryCatgCode='" + this.industryCatgCode + "', industryCatgName='" + this.industryCatgName + "', industryCode='" + this.industryCode + "', industryName='" + this.industryName + "', merchantZipCode='" + this.merchantZipCode + "', merchantCity='" + this.merchantCity + "', atc='" + this.atc + "', usingThisToken=" + this.usingThisToken + AbstractJsonLexerKt.END_OBJ;
    }
}
