package com.google.android.exoplayer2.decoder;

/* JADX INFO: loaded from: classes13.dex */
public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int i14, String str) {
        super(str);
        this.errorCode = i14;
    }
}
