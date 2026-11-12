package com.google.android.gms.common.util;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzc {
    public static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
