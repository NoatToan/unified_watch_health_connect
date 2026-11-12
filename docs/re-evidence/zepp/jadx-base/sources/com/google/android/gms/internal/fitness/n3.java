package com.google.android.gms.internal.fitness;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class n3<T> implements x3<T> {
    private final zzik a;
    private final n4<?, ?> b;
    private final boolean c;
    private final m2<?> d;

    private n3(n4<?, ?> n4Var, m2<?> m2Var, zzik zzikVar) {
        this.b = n4Var;
        this.c = m2Var.f(zzikVar);
        this.d = m2Var;
        this.a = zzikVar;
    }

    public static <T> n3<T> f(n4<?, ?> n4Var, m2<?> m2Var, zzik zzikVar) {
        return new n3<>(n4Var, m2Var, zzikVar);
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final void a(T t) {
        this.b.c(t);
        this.d.e(t);
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final int b(T t) {
        n4<?, ?> n4Var = this.b;
        int iH = n4Var.h(n4Var.g(t)) + 0;
        return this.c ? iH + this.d.c(t).p() : iH;
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final void c(T t, T t2) {
        z3.f(this.b, t, t2);
        if (this.c) {
            z3.d(this.d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final boolean d(T t) {
        return this.d.c(t).c();
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final void e(T t, d5 d5Var) throws IOException {
        Iterator itD = this.d.c(t).d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            zzgv zzgvVar = (zzgv) entry.getKey();
            if (zzgvVar.zzbm() != zzkj.MESSAGE || zzgvVar.zzbn() || zzgvVar.zzbo()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof v2) {
                d5Var.e(zzgvVar.zzc(), ((v2) entry).a().zzam());
            } else {
                d5Var.e(zzgvVar.zzc(), entry.getValue());
            }
        }
        n4<?, ?> n4Var = this.b;
        n4Var.b(n4Var.g(t), d5Var);
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final boolean equals(T t, T t2) {
        if (!this.b.g(t).equals(this.b.g(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.c(t).equals(this.d.c(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.fitness.x3
    public final int hashCode(T t) {
        int iHashCode = this.b.g(t).hashCode();
        return this.c ? (iHashCode * 53) + this.d.c(t).hashCode() : iHashCode;
    }
}
