package com.service.mi.visa.entity;

import com.google.gson.Gson;
import com.service.mi.wallet.entity.ProductConfig;
import com.service.mi.wallet.entity.TokenInfo;

/* JADX INFO: loaded from: classes6.dex */
public class VisaCardDetail {
    private String appletInstanceAid;
    private CardMetaData cardMetaData;
    private int cardType = 1;
    private ProductConfig productConfig;
    private String tdsRegistrationUrl;
    private String tdsUrl;
    private TokenInfo tokenInfo;
    private int tokenStatus;
    private String tokenUniqueReference;

    public static VisaCardDetail fromJson(String str) {
        return (VisaCardDetail) new Gson().fromJson(str, VisaCardDetail.class);
    }

    public String getAppletInstanceAid() {
        return this.appletInstanceAid;
    }

    public CardMetaData getCardMetaData() {
        return this.cardMetaData;
    }

    public int getCardType() {
        return this.cardType;
    }

    public ProductConfig getProductConfig() {
        return this.productConfig;
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

    public void setCardMetaData(CardMetaData cardMetaData) {
        this.cardMetaData = cardMetaData;
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setProductConfig(ProductConfig productConfig) {
        this.productConfig = productConfig;
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
