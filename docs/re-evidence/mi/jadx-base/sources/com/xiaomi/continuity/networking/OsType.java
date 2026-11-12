package com.xiaomi.continuity.networking;

/* JADX INFO: loaded from: classes7.dex */
public enum OsType {
    OsTypeUnknown,
    OsTypeAndroid,
    OsTypeLinux,
    OsTypeWindows;

    public static OsType fromInteger(int i) {
        return values()[i];
    }

    public int toInteger() {
        return ordinal();
    }
}
