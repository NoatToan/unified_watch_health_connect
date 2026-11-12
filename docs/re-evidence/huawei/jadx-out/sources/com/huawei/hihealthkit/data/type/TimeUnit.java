package com.huawei.hihealthkit.data.type;

/* JADX INFO: loaded from: classes2.dex */
public enum TimeUnit {
    MINUTE(1),
    HOUR(2),
    DAY(3),
    WEEK(4),
    MONTH(5),
    YEAR(6),
    NATURAL_WEEK(9);

    private final int code;

    TimeUnit(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
