package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfv;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzia;
import com.google.android.gms.measurement.internal.zzkv;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class a extends c {
    private final zzfv a;
    private final zzia b;

    public a(@NonNull zzfv zzfvVar) {
        super(null);
        Preconditions.checkNotNull(zzfvVar);
        this.a = zzfvVar;
        this.b = zzfvVar.zzq();
    }

    @Override // com.google.android.gms.measurement.c
    public final Boolean a() {
        return this.b.zzi();
    }

    @Override // com.google.android.gms.measurement.c
    public final Double b() {
        return this.b.zzj();
    }

    @Override // com.google.android.gms.measurement.c
    public final Integer c() {
        return this.b.zzl();
    }

    @Override // com.google.android.gms.measurement.c
    public final Long d() {
        return this.b.zzm();
    }

    @Override // com.google.android.gms.measurement.c
    public final String e() {
        return this.b.zzr();
    }

    @Override // com.google.android.gms.measurement.c
    public final Map<String, Object> f(boolean z) {
        List<zzkv> listZzt = this.b.zzt(z);
        ArrayMap arrayMap = new ArrayMap(listZzt.size());
        for (zzkv zzkvVar : listZzt) {
            Object objZza = zzkvVar.zza();
            if (objZza != null) {
                arrayMap.put(zzkvVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final int zza(String str) {
        this.b.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final long zzb() {
        return this.a.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final Object zzg(int i) {
        if (i == 0) {
            return this.b.zzr();
        }
        if (i == 1) {
            return this.b.zzm();
        }
        if (i != 2) {
            return i != 3 ? this.b.zzi() : this.b.zzl();
        }
        return this.b.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final String zzh() {
        return this.b.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final String zzi() {
        return this.b.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final String zzj() {
        return this.b.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final String zzk() {
        return this.b.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final List<Bundle> zzm(String str, String str2) {
        return this.b.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final Map<String, Object> zzo(String str, String str2, boolean z) {
        return this.b.zzu(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzp(String str) {
        this.a.zzd().zzd(str, this.a.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzq(String str, String str2, Bundle bundle) {
        this.a.zzq().zzz(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzr(String str) {
        this.a.zzd().zze(str, this.a.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzs(String str, String str2, Bundle bundle) {
        this.b.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzt(String str, String str2, Bundle bundle, long j) {
        this.b.zzE(str, str2, bundle, true, false, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzu(zzgw zzgwVar) {
        this.b.zzJ(zzgwVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzv(Bundle bundle) {
        this.b.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzw(zzgv zzgvVar) {
        this.b.zzU(zzgvVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzx(zzgw zzgwVar) {
        this.b.zzaa(zzgwVar);
    }
}
