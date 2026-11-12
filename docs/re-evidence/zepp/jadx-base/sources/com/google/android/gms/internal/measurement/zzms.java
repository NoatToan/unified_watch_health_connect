package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public enum zzms {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzix.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzms(Object obj) {
        this.zzk = obj;
    }
}
