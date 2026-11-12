package com.service.mi.wallet.entity.tds;

/* JADX INFO: loaded from: classes6.dex */
public class TransactionParams {
    private String authenticationCode;
    private String lastUpdatedTag;
    private String tokenUniqueReference;

    public String getAuthenticationCode() {
        return this.authenticationCode;
    }

    public String getLastUpdatedTag() {
        return this.lastUpdatedTag;
    }

    public String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public void setAuthenticationCode(String str) {
        this.authenticationCode = str;
    }

    public void setLastUpdatedTag(String str) {
        this.lastUpdatedTag = str;
    }

    public void setTokenUniqueReference(String str) {
        this.tokenUniqueReference = str;
    }
}
