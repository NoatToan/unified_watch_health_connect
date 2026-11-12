package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes20.dex */
public class CommonFileRetryInfo {
    private int lastOffset;
    private int toKitNumber = -1;

    public int getLastOffset() {
        return this.lastOffset;
    }

    public int getToKitNumber() {
        return this.toKitNumber;
    }

    public void setLastOffset(int i) {
        this.lastOffset = i;
    }

    public void setToKitNumber(int i) {
        this.toKitNumber = i;
    }
}
