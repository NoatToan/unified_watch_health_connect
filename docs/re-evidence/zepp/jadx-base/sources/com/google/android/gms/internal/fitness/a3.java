package com.google.android.gms.internal.fitness;

/* JADX INFO: loaded from: classes3.dex */
final class a3 extends z2 {
    private a3() {
        super();
    }

    private static <E> zzhh<E> e(Object obj, long j) {
        return (zzhh) s4.G(obj, j);
    }

    @Override // com.google.android.gms.internal.fitness.z2
    public final void a(Object obj, long j) {
        e(obj, j).zzar();
    }

    @Override // com.google.android.gms.internal.fitness.z2
    public final <E> void b(Object obj, Object obj2, long j) {
        zzhh zzhhVarE = e(obj, j);
        zzhh zzhhVarE2 = e(obj2, j);
        int size = zzhhVarE.size();
        int size2 = zzhhVarE2.size();
        if (size > 0 && size2 > 0) {
            if (!zzhhVarE.zzaq()) {
                zzhhVarE = zzhhVarE.zzae(size2 + size);
            }
            zzhhVarE.addAll(zzhhVarE2);
        }
        if (size > 0) {
            zzhhVarE2 = zzhhVarE;
        }
        s4.g(obj, j, zzhhVarE2);
    }
}
