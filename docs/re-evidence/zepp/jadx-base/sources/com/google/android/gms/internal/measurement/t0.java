package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class t0 extends zzch {
    private final com.google.android.gms.measurement.internal.zzgw a;

    public t0(com.google.android.gms.measurement.internal.zzgw zzgwVar) {
        this.a = zzgwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.a.onEvent(str, str2, bundle, j);
    }
}
