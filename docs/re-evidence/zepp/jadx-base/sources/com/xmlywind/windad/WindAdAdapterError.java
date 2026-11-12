package com.xmlywind.windad;

/* JADX INFO: loaded from: classes22.dex */
public class WindAdAdapterError {
    public int a;
    public String message;

    public WindAdAdapterError(int i, String str) {
        this.a = i;
        this.message = str;
    }

    public int getErrorCode() {
        return this.a;
    }

    public String getMessage() {
        return this.message;
    }

    public void setErrorCode(int i) {
        this.a = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "{errorCode:" + this.a + ", message:'" + this.message + "'}";
    }
}
