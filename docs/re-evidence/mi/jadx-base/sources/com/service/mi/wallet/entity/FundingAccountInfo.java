package com.service.mi.wallet.entity;

/* JADX INFO: loaded from: classes6.dex */
public class FundingAccountInfo {
    private EncryptedPayload encryptedPayload;
    private String pushAccountReceipt;

    public FundingAccountInfo() {
    }

    public EncryptedPayload getEncryptedPayload() {
        return this.encryptedPayload;
    }

    public String getPushAccountReceipt() {
        return this.pushAccountReceipt;
    }

    public void setEncryptedPayload(EncryptedPayload encryptedPayload) {
        this.encryptedPayload = encryptedPayload;
    }

    public void setPushAccountReceipt(String str) {
        this.pushAccountReceipt = str;
    }

    public FundingAccountInfo(EncryptedPayload encryptedPayload) {
        this.encryptedPayload = encryptedPayload;
    }
}
