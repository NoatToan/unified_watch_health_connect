package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class g1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ zzia e;

    public g1(zzia zziaVar, String str, String str2, Object obj, long j) {
        this.e = zziaVar;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.j(this.a, this.b, this.c, this.d);
    }
}
