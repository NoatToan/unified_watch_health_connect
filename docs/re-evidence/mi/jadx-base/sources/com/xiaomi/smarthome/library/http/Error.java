package com.xiaomi.smarthome.library.http;

/* JADX INFO: loaded from: classes2.dex */
public class Error {
    private int mCode;
    private String mDetail;

    public Error(int i, String str) {
        this.mCode = i;
        this.mDetail = str;
    }

    public final int getCode() {
        return this.mCode;
    }

    public final String getDetail() {
        return this.mDetail;
    }
}
