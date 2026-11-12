package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class HMNFCCardConfig implements Serializable {
    private static final long serialVersionUID = 1;
    private HMNFCCardCtl a;
    private HMNFCCardIdent b;

    public HMNFCCardConfig() {
        this.a = HMNFCCardCtl.ACTIVATE;
        this.b = null;
    }

    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HMNFCCardCtl hMNFCCardCtl = this.a;
        if (hMNFCCardCtl == null) {
            return null;
        }
        byteArrayOutputStream.write(hMNFCCardCtl.getValue());
        HMNFCCardIdent hMNFCCardIdent = this.b;
        if (hMNFCCardIdent == null) {
            return byteArrayOutputStream.toByteArray();
        }
        byte[] bytes = hMNFCCardIdent.getBytes();
        if (bytes != null && bytes.length > 0) {
            byteArrayOutputStream.write(bytes, 0, bytes.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public HMNFCCardIdent getCardIdent() {
        return this.b;
    }

    public HMNFCCardCtl getOperation() {
        return this.a;
    }

    public void setCardIdent(HMNFCCardIdent cardIdent) {
        this.b = cardIdent;
    }

    public void setOperation(HMNFCCardCtl operation) {
        this.a = operation;
    }

    public String toString() {
        return "HMNFCCardConfig{cardCtl=" + this.a + ", cardIdent=" + this.b + '}';
    }

    public HMNFCCardConfig(HMNFCCardCtl cardCtl) {
        this.a = HMNFCCardCtl.ACTIVATE;
        this.b = null;
        this.a = cardCtl;
    }

    public HMNFCCardConfig(HMNFCCardCtl cardCtl, HMNFCCardIdent cardIdent) {
        this.a = HMNFCCardCtl.ACTIVATE;
        this.b = null;
        this.a = cardCtl;
        this.b = cardIdent;
    }
}
