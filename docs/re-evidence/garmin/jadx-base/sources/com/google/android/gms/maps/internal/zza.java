package com.google.android.gms.maps.internal;

/* JADX INFO: loaded from: classes14.dex */
public final class zza {
    public static byte zza(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean zzb(byte b14) {
        if (b14 == 0) {
            return Boolean.FALSE;
        }
        if (b14 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
