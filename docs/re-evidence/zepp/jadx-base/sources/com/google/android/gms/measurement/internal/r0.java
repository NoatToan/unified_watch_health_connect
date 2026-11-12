package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class r0 implements Runnable {
    public final /* synthetic */ zzat a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zzgn c;

    public r0(zzgn zzgnVar, zzat zzatVar, String str) {
        this.c = zzgnVar;
        this.a = zzatVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a.a();
        this.c.a.e(this.a, this.b);
    }
}
