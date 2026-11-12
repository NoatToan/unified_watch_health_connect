package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class DecryptLocationCipherBean extends SnRequestBean {
    private String cipherText;
    private String pubKeyHash;

    public void setPubKeyHash(String str) {
        this.pubKeyHash = str;
    }

    public void setCipherText(String str) {
        this.cipherText = str;
    }

    public String getPubKeyHash() {
        return this.pubKeyHash;
    }

    public String getCipherText() {
        return this.cipherText;
    }
}
