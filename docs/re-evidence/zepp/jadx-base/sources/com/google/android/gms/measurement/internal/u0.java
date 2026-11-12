package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class u0 implements Callable<List<b4>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzgn b;

    public u0(zzgn zzgnVar, String str) {
        this.b = zzgnVar;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<b4> call() throws Exception {
        this.b.a.a();
        return this.b.a.zzi().R(this.a);
    }
}
