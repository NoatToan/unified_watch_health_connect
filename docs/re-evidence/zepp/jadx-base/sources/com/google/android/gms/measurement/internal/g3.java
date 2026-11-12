package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class g3 implements Runnable {
    public final /* synthetic */ zzjn a;

    public g3(zzjn zzjnVar) {
        this.a = zzjnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.c = null;
        this.a.c.f();
    }
}
