package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class a implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ zzd c;

    public a(zzd zzdVar, String str, long j) {
        this.c = zzdVar;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.a(this.c, this.a, this.b);
    }
}
