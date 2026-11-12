package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class v1 implements Runnable {
    public final /* synthetic */ zzag a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzia e;

    public v1(zzia zziaVar, zzag zzagVar, int i, long j, boolean z) {
        this.e = zziaVar;
        this.a = zzagVar;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.i(this.a);
        zzia.n(this.e, this.a, this.b, this.c, false, this.d);
    }
}
