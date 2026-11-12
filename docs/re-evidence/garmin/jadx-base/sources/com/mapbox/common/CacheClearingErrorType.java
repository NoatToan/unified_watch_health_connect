package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public enum CacheClearingErrorType {
    DATABASE_ERROR("DatabaseError"),
    OTHER_ERROR("OtherError");

    private String str;

    CacheClearingErrorType(String str) {
        this.str = str;
    }

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }
}
