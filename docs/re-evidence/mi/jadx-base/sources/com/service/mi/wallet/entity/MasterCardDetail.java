package com.service.mi.wallet.entity;

import com.google.gson.Gson;

/* JADX INFO: loaded from: classes6.dex */
public class MasterCardDetail {
    private String appletInstanceAid;
    private int cardType = 1;
    private ProductConfig productConfig;
    private String sdAid;
    private String tdsRegistrationUrl;
    private String tdsUrl;
    private TokenInfo tokenInfo;
    private int tokenStatus;
    private String tokenUniqueReference;

    public static MasterCardDetail fromJson(String str) {
        return (MasterCardDetail) new Gson().fromJson(str, MasterCardDetail.class);
    }

    public String getAppletInstanceAid() {
        return this.appletInstanceAid;
    }

    public int getCardType() {
        return this.cardType;
    }

    public ProductConfig getProductConfig() {
        return this.productConfig;
    }

    public String getSdAid() {
        return this.sdAid;
    }

    public String getTdsRegistrationUrl() {
        return this.tdsRegistrationUrl;
    }

    public String getTdsUrl() {
        return this.tdsUrl;
    }

    public TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public int getTokenStatus() {
        return this.tokenStatus;
    }

    public String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public void setAppletInstanceAid(String str) {
        this.appletInstanceAid = str;
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setProductConfig(ProductConfig productConfig) {
        this.productConfig = productConfig;
    }

    public void setSdAid(String str) {
        this.sdAid = str;
    }

    public void setTdsRegistrationUrl(String str) {
        this.tdsRegistrationUrl = str;
    }

    public void setTdsUrl(String str) {
        this.tdsUrl = str;
    }

    public void setTokenInfo(TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
    }

    public void setTokenStatus(int i) {
        this.tokenStatus = i;
    }

    public void setTokenUniqueReference(String str) {
        this.tokenUniqueReference = str;
    }

    public String toJson() {
        return new Gson().toJson(this);
    }
}
