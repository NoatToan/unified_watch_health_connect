package com.metv.airkan_sdk.exception;

/* JADX INFO: loaded from: classes5.dex */
public class CbcKeyLengthException extends Exception {
    public CbcKeyLengthException() {
        super("cbc key and iv length must be 16");
    }

    public CbcKeyLengthException(String str) {
        super("cbc key and iv length must be 16;" + str);
    }

    public CbcKeyLengthException(String str, Throwable th) {
        super("cbc key and iv length must be 16;" + str, th);
    }
}
