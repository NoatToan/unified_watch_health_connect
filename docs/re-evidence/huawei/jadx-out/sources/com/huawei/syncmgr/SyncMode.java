package com.huawei.syncmgr;

/* JADX INFO: loaded from: classes15.dex */
public enum SyncMode {
    INCREMENTAL(0),
    FULL(1),
    CUSTOM(2);

    int mValue;

    SyncMode(int i) {
        this.mValue = i;
    }

    public int getValue() {
        return this.mValue;
    }
}
