package com.service.mi.wallet.entity.tds;

/* JADX INFO: loaded from: classes6.dex */
public class UnRegisterReq {
    private String authenticationCode;
    private String tokenUniqueReference;

    public String getAuthenticationCode() {
        return this.authenticationCode;
    }

    public String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public void setAuthenticationCode(String str) {
        this.authenticationCode = str;
    }

    public void setTokenUniqueReference(String str) {
        this.tokenUniqueReference = str;
    }
}
