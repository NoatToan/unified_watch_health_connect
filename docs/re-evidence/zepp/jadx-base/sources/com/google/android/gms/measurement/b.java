package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzib;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class b extends c {
    private final zzib a;

    public b(zzib zzibVar) {
        super(null);
        Preconditions.checkNotNull(zzibVar);
        this.a = zzibVar;
    }

    @Override // com.google.android.gms.measurement.c
    public final Boolean a() {
        return (Boolean) this.a.zzg(4);
    }

    @Override // com.google.android.gms.measurement.c
    public final Double b() {
        return (Double) this.a.zzg(2);
    }

    @Override // com.google.android.gms.measurement.c
    public final Integer c() {
        return (Integer) this.a.zzg(3);
    }

    @Override // com.google.android.gms.measurement.c
    public final Long d() {
        return (Long) this.a.zzg(1);
    }

    @Override // com.google.android.gms.measurement.c
    public final String e() {
        return (String) this.a.zzg(0);
    }

    @Override // com.google.android.gms.measurement.c
    public final Map<String, Object> f(boolean z) {
        return this.a.zzo(null, null, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final int zza(String str) {
        return this.a.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final long zzb() {
        return this.a.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final Object zzg(int i) {
        return this.a.zzg(i);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final String zzh() {
        return this.a.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final String zzi() {
        return this.a.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final String zzj() {
        return this.a.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final String zzk() {
        return this.a.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final List<Bundle> zzm(String str, String str2) {
        return this.a.zzm(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final Map<String, Object> zzo(String str, String str2, boolean z) {
        return this.a.zzo(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzp(String str) {
        this.a.zzp(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzq(String str, String str2, Bundle bundle) {
        this.a.zzq(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzr(String str) {
        this.a.zzr(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzs(String str, String str2, Bundle bundle) {
        this.a.zzs(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzt(String str, String str2, Bundle bundle, long j) {
        this.a.zzt(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzu(zzgw zzgwVar) {
        this.a.zzu(zzgwVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzv(Bundle bundle) {
        this.a.zzv(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzw(zzgv zzgvVar) {
        this.a.zzw(zzgvVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzib
    public final void zzx(zzgw zzgwVar) {
        this.a.zzx(zzgwVar);
    }
}
