package com.huawei.health.h5pro.service;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class H5ProInvokeResult {

    @SerializedName("result")
    private Object e;

    public H5ProInvokeResult(Object obj) {
        this.e = obj;
    }

    public Object getResult() {
        return this.e;
    }
}
