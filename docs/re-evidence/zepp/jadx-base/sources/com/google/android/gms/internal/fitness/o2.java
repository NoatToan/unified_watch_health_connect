package com.google.android.gms.internal.fitness;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class o2 extends m2<zzgy.a> {
    @Override // com.google.android.gms.internal.fitness.m2
    public final int a(Map.Entry<?, ?> entry) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.fitness.m2
    public final void b(d5 d5Var, Map.Entry<?, ?> entry) throws IOException {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.fitness.m2
    public final q2<zzgy.a> c(Object obj) {
        return ((zzgy.zzd) obj).zzya;
    }

    @Override // com.google.android.gms.internal.fitness.m2
    public final q2<zzgy.a> d(Object obj) {
        zzgy.zzd zzdVar = (zzgy.zzd) obj;
        if (zzdVar.zzya.b()) {
            zzdVar.zzya = (q2) zzdVar.zzya.clone();
        }
        return zzdVar.zzya;
    }

    @Override // com.google.android.gms.internal.fitness.m2
    public final void e(Object obj) {
        c(obj).k();
    }

    @Override // com.google.android.gms.internal.fitness.m2
    public final boolean f(zzik zzikVar) {
        return zzikVar instanceof zzgy.zzd;
    }
}
