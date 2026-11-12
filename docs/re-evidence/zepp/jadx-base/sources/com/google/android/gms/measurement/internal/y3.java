package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class y3 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b = "_err";
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ z3 d;

    public y3(z3 z3Var, String str, String str2, Bundle bundle) {
        this.d = z3Var;
        this.a = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.e((zzat) Preconditions.checkNotNull(this.d.a.zzv().S(this.a, this.b, this.c, "auto", this.d.a.zzav().currentTimeMillis(), false, true)), this.a);
    }
}
