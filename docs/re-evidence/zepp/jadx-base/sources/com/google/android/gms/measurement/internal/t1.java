package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class t1 implements Runnable {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ zzia b;

    public t1(zzia zziaVar, Boolean bool) {
        this.b = zziaVar;
        this.a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.l(this.a, true);
    }
}
