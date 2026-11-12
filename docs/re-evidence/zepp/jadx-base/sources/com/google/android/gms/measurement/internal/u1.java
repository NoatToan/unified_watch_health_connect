package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class u1 implements Runnable {
    public final /* synthetic */ zzag a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ zzia f;

    public u1(zzia zziaVar, zzag zzagVar, long j, int i, long j2, boolean z) {
        this.f = zziaVar;
        this.a = zzagVar;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.i(this.a);
        this.f.f(this.b, false);
        zzia.n(this.f, this.a, this.c, this.d, true, this.e);
    }
}
