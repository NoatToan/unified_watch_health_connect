package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class h1 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzia c;

    public h1(zzia zziaVar, AtomicReference atomicReference, boolean z) {
        this.c = zziaVar;
        this.a = atomicReference;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.zzs.zzt().zzx(this.a, this.b);
    }
}
