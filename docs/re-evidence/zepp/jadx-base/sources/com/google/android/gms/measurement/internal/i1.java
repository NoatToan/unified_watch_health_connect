package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class i1 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzia b;

    public i1(zzia zziaVar, long j) {
        this.b = zziaVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f(this.a, true);
        this.b.zzs.zzt().zzu(new AtomicReference<>());
    }
}
