package com.xiaomi.yrn.env.entity.bundleload;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class YRNBundleResponseBean implements Serializable {
    private int code;
    private YRNBundleResponseInfoBean data;
    private String traceId;

    public int getCode() {
        return this.code;
    }

    public YRNBundleResponseInfoBean getData() {
        return this.data;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(YRNBundleResponseInfoBean yRNBundleResponseInfoBean) {
        this.data = yRNBundleResponseInfoBean;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }
}
