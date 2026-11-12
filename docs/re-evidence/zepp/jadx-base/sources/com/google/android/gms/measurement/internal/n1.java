package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class n1 implements Runnable {
    public final /* synthetic */ AtomicReference a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzia e;

    public n1(zzia zziaVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.e = zziaVar;
        this.a = atomicReference;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.zzs.zzt().zzz(this.a, null, this.b, this.c, this.d);
    }
}
