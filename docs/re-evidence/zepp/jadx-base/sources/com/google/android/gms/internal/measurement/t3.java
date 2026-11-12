package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class t3<T> implements a4<T> {
    private final zzlc a;
    private final o4<?, ?> b;
    private final boolean c;
    private final x2<?> d;

    private t3(o4<?, ?> o4Var, x2<?> x2Var, zzlc zzlcVar) {
        this.b = o4Var;
        this.c = x2Var.c(zzlcVar);
        this.d = x2Var;
        this.a = zzlcVar;
    }

    public static <T> t3<T> i(o4<?, ?> o4Var, x2<?> x2Var, zzlc zzlcVar) {
        return new t3<>(o4Var, x2Var, zzlcVar);
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final boolean a(T t) {
        this.d.a(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final void b(T t) {
        this.b.g(t);
        this.d.b(t);
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final int c(T t) {
        int iHashCode = this.b.c(t).hashCode();
        if (!this.c) {
            return iHashCode;
        }
        this.d.a(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final int d(T t) {
        o4<?, ?> o4Var = this.b;
        int iB = o4Var.b(o4Var.c(t));
        if (!this.c) {
            return iB;
        }
        this.d.a(t);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.a4
    public final void e(T t, byte[] bArr, int i, int i2, g2 g2Var) throws IOException {
        zzjx zzjxVar = (zzjx) t;
        if (zzjxVar.zzc == zzmc.zzc()) {
            zzjxVar.zzc = zzmc.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final void f(T t, T t2) {
        c4.f(this.b, t, t2);
        if (this.c) {
            c4.e(this.d, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final boolean g(T t, T t2) {
        if (!this.b.c(t).equals(this.b.c(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.d.a(t);
        this.d.a(t2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final void h(T t, u2 u2Var) throws IOException {
        this.d.a(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.a4
    public final T zze() {
        return (T) this.a.zzbC().zzaC();
    }
}
