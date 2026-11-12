package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class k0 implements Callable<List<b4>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzgn d;

    public k0(zzgn zzgnVar, String str, String str2, String str3) {
        this.d = zzgnVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<b4> call() throws Exception {
        this.d.a.a();
        return this.d.a.zzi().S(this.a, this.b, this.c);
    }
}
