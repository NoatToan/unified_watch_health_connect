package com.google.android.gms.internal.measurement;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgw {
    private static volatile boolean a = !zza();

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
