package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMNFCCardStatus implements Serializable {
    public static final byte FAILED = 1;
    public static final byte NONE = 2;
    public static final byte SUCCESS = 0;
    private static final long serialVersionUID = 1;
    private HMNFCCardCtl cardCtl = HMNFCCardCtl.ACTIVATE;
    private HMNFCCardIdent cardIdent = null;
    private byte status = 0;

    public HMNFCCardCtl getCardCtl() {
        return this.cardCtl;
    }

    public HMNFCCardIdent getCardIdent() {
        return this.cardIdent;
    }

    public byte getStatus() {
        return this.status;
    }

    public void setCardCtl(HMNFCCardCtl hMNFCCardCtl) {
        this.cardCtl = hMNFCCardCtl;
    }

    public void setCardIdent(HMNFCCardIdent hMNFCCardIdent) {
        this.cardIdent = hMNFCCardIdent;
    }

    public void setStatus(byte b2) {
        this.status = b2;
    }

    public String toString() {
        return "HMNFCCardStatus{cardCtl=" + this.cardCtl + ", cardIdent=" + this.cardIdent + ", status=" + ((int) this.status) + AbstractJsonLexerKt.END_OBJ;
    }
}
