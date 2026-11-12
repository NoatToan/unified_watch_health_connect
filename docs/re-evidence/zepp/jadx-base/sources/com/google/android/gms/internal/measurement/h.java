package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class h implements i {
    private final zzg a;
    private final String b;

    public h(zzg zzgVar, String str) {
        this.a = zzgVar;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final zzg a(zzap zzapVar) {
        zzg zzgVarZza = this.a.zza();
        zzgVarZza.zze(this.b, zzapVar);
        return zzgVarZza;
    }
}
