package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class p4 extends o4<zzmc, zzmc> {
    @Override // com.google.android.gms.internal.measurement.o4
    public final /* synthetic */ int a(zzmc zzmcVar) {
        return zzmcVar.zza();
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final /* synthetic */ int b(zzmc zzmcVar) {
        return zzmcVar.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final /* synthetic */ zzmc c(Object obj) {
        return ((zzjx) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final /* bridge */ /* synthetic */ zzmc d(zzmc zzmcVar, zzmc zzmcVar2) {
        zzmc zzmcVar3 = zzmcVar2;
        return zzmcVar3.equals(zzmc.zzc()) ? zzmcVar : zzmc.a(zzmcVar, zzmcVar3);
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final /* synthetic */ zzmc e() {
        return zzmc.b();
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final /* bridge */ /* synthetic */ void f(zzmc zzmcVar, int i, long j) {
        zzmcVar.d(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final void g(Object obj) {
        ((zzjx) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final /* synthetic */ void h(Object obj, zzmc zzmcVar) {
        ((zzjx) obj).zzc = zzmcVar;
    }

    @Override // com.google.android.gms.internal.measurement.o4
    public final /* synthetic */ void i(zzmc zzmcVar, u2 u2Var) throws IOException {
        zzmcVar.zzi(u2Var);
    }
}
