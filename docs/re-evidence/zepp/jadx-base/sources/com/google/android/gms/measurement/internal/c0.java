package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class c0 implements Thread.UncaughtExceptionHandler {
    private final String a;
    public final /* synthetic */ zzfs b;

    public c0(zzfs zzfsVar, String str) {
        this.b = zzfsVar;
        Preconditions.checkNotNull(str);
        this.a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.b.zzs.zzay().zzd().zzb(this.a, th);
    }
}
