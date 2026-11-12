package com.ximalaya.ting.android.sdkdownloader.exception;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes22.dex */
public class HttpException extends BaseException {
    private static final long serialVersionUID = 1;
    private int a;
    private String b;
    private String c;
    private String d;

    public HttpException(int i, String str) {
        super(str);
        this.a = i;
    }

    public int getCode() {
        return this.a;
    }

    public String getErrorCode() {
        String str = this.b;
        return str == null ? String.valueOf(this.a) : str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return !TextUtils.isEmpty(this.c) ? this.c : super.getMessage();
    }

    public String getResult() {
        return this.d;
    }

    public void setCode(int i) {
        this.a = i;
    }

    public void setErrorCode(String str) {
        this.b = str;
    }

    public void setMessage(String str) {
        this.c = str;
    }

    public void setResult(String str) {
        this.d = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "errorCode: " + getErrorCode() + ", msg: " + getMessage() + ", result: " + this.d;
    }
}
