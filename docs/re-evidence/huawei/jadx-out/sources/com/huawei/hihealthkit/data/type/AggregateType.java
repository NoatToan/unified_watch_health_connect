package com.huawei.hihealthkit.data.type;

/* JADX INFO: loaded from: classes2.dex */
public enum AggregateType {
    SUM(1),
    COUNT(2),
    AVG(3),
    MAX(4),
    MIN(5);

    private final int code;

    AggregateType(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
