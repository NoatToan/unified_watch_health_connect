package com.service.mi.wallet.entity;

/* JADX INFO: loaded from: classes6.dex */
public class EncryptedPayload {
    private String encryptedData;
    private String encryptedKey;
    private String oaepHashingAlgorithm;
    private String publicKeyFingerprint;

    public String getEncryptedData() {
        return this.encryptedData;
    }

    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    public String getOaepHashingAlgorithm() {
        return this.oaepHashingAlgorithm;
    }

    public String getPublicKeyFingerprint() {
        return this.publicKeyFingerprint;
    }

    public void setEncryptedData(String str) {
        this.encryptedData = str;
    }

    public void setEncryptedKey(String str) {
        this.encryptedKey = str;
    }

    public void setOaepHashingAlgorithm(String str) {
        this.oaepHashingAlgorithm = str;
    }

    public void setPublicKeyFingerprint(String str) {
        this.publicKeyFingerprint = str;
    }
}
