package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class w0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ zzgn e;

    public w0(zzgn zzgnVar, String str, String str2, String str3, long j) {
        this.e = zzgnVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        if (str == null) {
            this.e.a.O().zzs().zzy(this.b, null);
        } else {
            this.e.a.O().zzs().zzy(this.b, new zzih(this.c, str, this.d));
        }
    }
}
