package com.miot.spec.exception;

/* JADX INFO: loaded from: classes.dex */
public class SpecException extends Exception {
    private int errorCode;

    public SpecException(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public SpecException(String str) {
        super(str);
        this.errorCode = 0;
    }
}
