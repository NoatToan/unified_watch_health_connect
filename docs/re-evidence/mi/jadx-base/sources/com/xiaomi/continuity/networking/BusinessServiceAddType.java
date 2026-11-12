package com.xiaomi.continuity.networking;

/* JADX INFO: loaded from: classes7.dex */
public enum BusinessServiceAddType {
    ServiceAddTypeUnknown,
    ServiceAddTypeStatic,
    ServiceAddTypeDynamic;

    public static BusinessServiceAddType fromInteger(int i) {
        return values()[i];
    }

    public int toInteger() {
        return ordinal();
    }
}
