package com.service.mi.wallet.entity.tds;

/* JADX INFO: loaded from: classes6.dex */
public class RegisterReq {
    private String registrationHash;
    private String tokenUniqueReference;

    public String getRegistrationHash() {
        return this.registrationHash;
    }

    public String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public void setRegistrationHash(String str) {
        this.registrationHash = str;
    }

    public void setTokenUniqueReference(String str) {
        this.tokenUniqueReference = str;
    }
}
