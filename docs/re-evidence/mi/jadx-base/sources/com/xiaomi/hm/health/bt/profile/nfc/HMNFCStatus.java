package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class HMNFCStatus implements Serializable {
    public static final int DISCONNECT_NEAR = 1;
    public static final int DISCONNECT_TIMEOUT = 2;
    public static final int INIT_FAILED = 4;
    public static final int NFC_ERROR = 3;
    public static final int NFC_NEAR = 37;
    public static final int NFC_UNFINISH = 38;
    public static final byte OTHER = -1;
    public static final int SUCCESS = 0;
    private static final long serialVersionUID = 1;
    private int mStatus;

    public HMNFCStatus() {
        this.mStatus = 0;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public boolean isSuccess() {
        return this.mStatus == 0;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public String toString() {
        return "HMNFCStatus{mStatus=" + this.mStatus + AbstractJsonLexerKt.END_OBJ;
    }

    public HMNFCStatus(int i) {
        this.mStatus = i;
    }
}
