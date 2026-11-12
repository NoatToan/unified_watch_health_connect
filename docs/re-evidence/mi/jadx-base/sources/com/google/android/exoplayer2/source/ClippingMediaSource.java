package com.google.android.exoplayer2.source;

import defpackage.fxp;
import defpackage.g83;
import defpackage.r61;
import defpackage.rk1;
import defpackage.z1a;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ClippingMediaSource extends c<Void> {
    public final k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f8072k;
    public final long l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final ArrayList<b> p;
    public final com.google.android.exoplayer2.v.c q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f8073r;
    public IllegalClippingException s;
    public long t;
    public long u;

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        /* JADX WARN: Illegal instructions before constructor call */
        public IllegalClippingException(int i) {
            String strValueOf = String.valueOf(getReasonDescription(i));
            super(strValueOf.length() != 0 ? "Illegal clipping: ".concat(strValueOf) : new String("Illegal clipping: "));
            this.reason = i;
        }

        private static String getReasonDescription(int i) {
            if (i == 0) {
                return "invalid period count";
            }
            if (i != 1) {
                return i != 2 ? "unknown" : "start exceeds end";
            }
            return "not seekable to start";
        }
    }

    public static final class a extends z1a {
        public final long d;
        public final long e;
        public final long f;
        public final boolean g;

        public a(com.google.android.exoplayer2.v vVar, long j, long j2) throws IllegalClippingException {
            super(vVar);
            boolean z = false;
            if (vVar.i() != 1) {
                throw new IllegalClippingException(0);
            }
            com.google.android.exoplayer2.v.c cVarN = vVar.n(0, new com.google.android.exoplayer2.v.c());
            long jMax = Math.max(0L, j);
            if (!cVarN.l && jMax != 0 && !cVarN.h) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? cVarN.n : Math.max(0L, j2);
            long j3 = cVarN.n;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.d = jMax;
            this.e = jMax2;
            this.f = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (cVarN.i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.g = z;
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.b g(int i, com.google.android.exoplayer2.v.b bVar, boolean z) {
            this.c.g(0, bVar, z);
            long jL = bVar.l() - this.d;
            long j = this.f;
            return bVar.n(bVar.f8446a, bVar.f8447b, 0, j == -9223372036854775807L ? -9223372036854775807L : j - jL, jL);
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.c o(int i, com.google.android.exoplayer2.v.c cVar, long j) {
            this.c.o(0, cVar, 0L);
            long j2 = cVar.q;
            long j3 = this.d;
            cVar.q = j2 + j3;
            cVar.n = this.f;
            cVar.i = this.g;
            long j4 = cVar.m;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                cVar.m = jMax;
                long j5 = this.e;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                cVar.m = jMax - this.d;
            }
            long jD = g83.d(this.d);
            long j6 = cVar.e;
            if (j6 != -9223372036854775807L) {
                cVar.e = j6 + jD;
            }
            long j7 = cVar.f;
            if (j7 != -9223372036854775807L) {
                cVar.f = j7 + jD;
            }
            return cVar;
        }
    }

    public ClippingMediaSource(k kVar, long j, long j2, boolean z, boolean z2, boolean z3) {
        rk1.a(j >= 0);
        this.j = (k) rk1.e(kVar);
        this.f8072k = j;
        this.l = j2;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = new ArrayList<>();
        this.q = new com.google.android.exoplayer2.v.c();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        super.B(fxpVar);
        M(null, this.j);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void D() {
        super.D();
        this.s = null;
        this.f8073r = null;
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void K(Void r1, k kVar, com.google.android.exoplayer2.v vVar) {
        if (this.s != null) {
            return;
        }
        P(vVar);
    }

    public final void P(com.google.android.exoplayer2.v vVar) {
        long j;
        long j2;
        vVar.n(0, this.q);
        long jE = this.q.e();
        if (this.f8073r == null || this.p.isEmpty() || this.n) {
            long j3 = this.f8072k;
            long j4 = this.l;
            if (this.o) {
                long jC = this.q.c();
                j3 += jC;
                j4 += jC;
            }
            this.t = jE + j3;
            this.u = this.l != Long.MIN_VALUE ? jE + j4 : Long.MIN_VALUE;
            int size = this.p.size();
            for (int i = 0; i < size; i++) {
                this.p.get(i).v(this.t, this.u);
            }
            j = j3;
            j2 = j4;
        } else {
            long j5 = this.t - jE;
            j2 = this.l != Long.MIN_VALUE ? this.u - jE : Long.MIN_VALUE;
            j = j5;
        }
        try {
            a aVar = new a(vVar, j, j2);
            this.f8073r = aVar;
            C(aVar);
        } catch (IllegalClippingException e) {
            this.s = e;
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public com.google.android.exoplayer2.m c() {
        return this.j.c();
    }

    @Override // com.google.android.exoplayer2.source.k
    public j d(k.a aVar, r61 r61Var, long j) {
        b bVar = new b(this.j.d(aVar, r61Var, j), this.m, this.t, this.u);
        this.p.add(bVar);
        return bVar;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.k
    public void f() throws IOException {
        IllegalClippingException illegalClippingException = this.s;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.f();
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        rk1.g(this.p.remove(jVar));
        this.j.j(((b) jVar).f8082a);
        if (!this.p.isEmpty() || this.n) {
            return;
        }
        P(((a) rk1.e(this.f8073r)).c);
    }
}
