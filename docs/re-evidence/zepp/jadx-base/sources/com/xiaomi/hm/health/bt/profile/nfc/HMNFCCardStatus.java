package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class HMNFCCardStatus implements Serializable {
    public static final byte FAILED = 1;
    public static final byte NONE = 2;
    public static final byte SUCCESS = 0;
    private static final long serialVersionUID = 1;
    private HMNFCCardCtl a = HMNFCCardCtl.ACTIVATE;
    private HMNFCCardIdent b = null;
    private byte c = 0;

    public HMNFCCardCtl getCardCtl() {
        return this.a;
    }

    public HMNFCCardIdent getCardIdent() {
        return this.b;
    }

    public byte getStatus() {
        return this.c;
    }

    public void setCardCtl(HMNFCCardCtl cardCtl) {
        this.a = cardCtl;
    }

    public void setCardIdent(HMNFCCardIdent cardIdent) {
        this.b = cardIdent;
    }

    public void setStatus(byte status) {
        this.c = status;
    }

    public String toString() {
        return "HMNFCCardStatus{cardCtl=" + this.a + ", cardIdent=" + this.b + ", status=" + ((int) this.c) + '}';
    }
}
