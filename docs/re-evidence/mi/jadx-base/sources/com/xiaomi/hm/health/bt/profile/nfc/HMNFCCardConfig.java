package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMNFCCardConfig implements Serializable {
    private static final long serialVersionUID = 1;
    private HMNFCCardCtl cardCtl;
    private HMNFCCardIdent cardIdent;

    public HMNFCCardConfig() {
        this.cardCtl = HMNFCCardCtl.ACTIVATE;
        this.cardIdent = null;
    }

    public byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        HMNFCCardCtl hMNFCCardCtl = this.cardCtl;
        if (hMNFCCardCtl == null) {
            return null;
        }
        byteArrayOutputStream.write(hMNFCCardCtl.getValue());
        HMNFCCardIdent hMNFCCardIdent = this.cardIdent;
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
        return this.cardIdent;
    }

    public HMNFCCardCtl getOperation() {
        return this.cardCtl;
    }

    public void setCardIdent(HMNFCCardIdent hMNFCCardIdent) {
        this.cardIdent = hMNFCCardIdent;
    }

    public void setOperation(HMNFCCardCtl hMNFCCardCtl) {
        this.cardCtl = hMNFCCardCtl;
    }

    public String toString() {
        return "HMNFCCardConfig{cardCtl=" + this.cardCtl + ", cardIdent=" + this.cardIdent + AbstractJsonLexerKt.END_OBJ;
    }

    public HMNFCCardConfig(HMNFCCardCtl hMNFCCardCtl) {
        HMNFCCardCtl hMNFCCardCtl2 = HMNFCCardCtl.ACTIVATE;
        this.cardIdent = null;
        this.cardCtl = hMNFCCardCtl;
    }

    public HMNFCCardConfig(HMNFCCardCtl hMNFCCardCtl, HMNFCCardIdent hMNFCCardIdent) {
        HMNFCCardCtl hMNFCCardCtl2 = HMNFCCardCtl.ACTIVATE;
        this.cardCtl = hMNFCCardCtl;
        this.cardIdent = hMNFCCardIdent;
    }
}
