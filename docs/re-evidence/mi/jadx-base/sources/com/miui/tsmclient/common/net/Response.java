package com.miui.tsmclient.common.net;

/* JADX INFO: loaded from: classes4.dex */
public class Response<T> {
    private ErrorInfo mErrorInfo;
    private int mHttpStatusCode;
    private T mResult;

    private Response(T t, ErrorInfo errorInfo) {
        this.mResult = t;
        this.mErrorInfo = errorInfo;
    }

    public static <T> Response<T> error(int i, String str) {
        return new Response<>(null, new ErrorInfo(i, str));
    }

    public static <T> Response<T> success(T t) {
        return new Response<>(t, new ErrorInfo(200, null));
    }

    public ErrorInfo getErrorInfo() {
        return this.mErrorInfo;
    }

    public int getHttpStatusCode() {
        return this.mHttpStatusCode;
    }

    public T getResult() {
        return this.mResult;
    }

    public boolean isHttpRequestSuccessful() {
        int i = this.mHttpStatusCode;
        return i >= 200 && i < 300;
    }

    public boolean isSuccess() {
        return this.mErrorInfo.mErrorCode == 200;
    }

    public void setHttpStatusCode(int i) {
        this.mHttpStatusCode = i;
    }

    public String toString() {
        T t = this.mResult;
        return t != null ? t.toString() : this.mErrorInfo.toString();
    }
}
