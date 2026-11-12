package com.miui.tsmclient.net;

/* JADX INFO: loaded from: classes6.dex */
public class AuthApiException extends Exception {
    public int mErrorCode;
    public Object mErrorInfo;
    public String mErrorMsg;

    public AuthApiException() {
    }

    public AuthApiException(int i) {
        this.mErrorCode = i;
    }

    public AuthApiException(int i, String str) {
        this.mErrorCode = i;
        this.mErrorMsg = str;
    }

    public AuthApiException(int i, String str, Object obj) {
        this.mErrorCode = i;
        this.mErrorMsg = str;
        this.mErrorInfo = obj;
    }
}
