package com.huawei.hms.ads.jsb.inner.data;

/* JADX INFO: loaded from: classes10.dex */
public class JsbCallBackData<T> {
    private String callBackName;
    private boolean complete;
    private T data;

    public JsbCallBackData(T t, boolean z, String str) {
        this.complete = z;
        this.data = t;
        this.callBackName = str;
    }
}
