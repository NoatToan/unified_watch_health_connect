package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class s0 extends zzch {
    private final com.google.android.gms.measurement.internal.zzgv a;

    public s0(com.google.android.gms.measurement.internal.zzgv zzgvVar) {
        this.a = zzgvVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.a);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.a.interceptEvent(str, str2, bundle, j);
    }
}
