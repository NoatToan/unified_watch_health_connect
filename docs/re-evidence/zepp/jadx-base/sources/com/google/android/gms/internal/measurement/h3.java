package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class h3 extends i3 {
    private h3() {
        super(null);
    }

    public /* synthetic */ h3(f3 f3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.i3
    public final void a(Object obj, long j) {
        ((zzke) w4.k(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.i3
    public final <E> void b(Object obj, Object obj2, long j) {
        zzke zzkeVarZzd = (zzke) w4.k(obj, j);
        zzke zzkeVar = (zzke) w4.k(obj2, j);
        int size = zzkeVarZzd.size();
        int size2 = zzkeVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzkeVarZzd.zzc()) {
                zzkeVarZzd = zzkeVarZzd.zzd(size2 + size);
            }
            zzkeVarZzd.addAll(zzkeVar);
        }
        if (size > 0) {
            zzkeVar = zzkeVarZzd;
        }
        w4.x(obj, j, zzkeVar);
    }
}
