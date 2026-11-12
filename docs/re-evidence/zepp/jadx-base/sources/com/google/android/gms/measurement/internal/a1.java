package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
final class a1 implements zzef {
    public final /* synthetic */ zzfv a;

    public a1(zzgy zzgyVar, zzfv zzfvVar) {
        this.a = zzfvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzef
    public final boolean zza() {
        return this.a.zzL() && Log.isLoggable(this.a.zzay().zzq(), 3);
    }
}
