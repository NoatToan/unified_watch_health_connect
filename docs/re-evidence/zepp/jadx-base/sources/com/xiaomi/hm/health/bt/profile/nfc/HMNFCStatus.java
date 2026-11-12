package com.xiaomi.hm.health.bt.profile.nfc;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
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
    private int a;

    public HMNFCStatus() {
        this.a = 0;
    }

    public int getStatus() {
        return this.a;
    }

    public boolean isSuccess() {
        return this.a == 0;
    }

    public void setStatus(int status) {
        this.a = status;
    }

    public String toString() {
        return "HMNFCStatus{mStatus=" + this.a + '}';
    }

    public HMNFCStatus(int status) {
        this.a = 0;
        this.a = status;
    }
}
