package com.google.android.exoplayer2.source;

import defpackage.bu5;
import defpackage.fxp;
import defpackage.nag;
import defpackage.oag;
import defpackage.r61;
import defpackage.ra4;
import defpackage.rk1;
import defpackage.z1a;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MergingMediaSource extends c<Integer> {
    public static final com.google.android.exoplayer2.m u = new com.google.android.exoplayer2.m.c().h("MergingMediaSource").a();
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8074k;
    public final k[] l;
    public final com.google.android.exoplayer2.v[] m;
    public final ArrayList<k> n;
    public final ra4 o;
    public final Map<Object, Long> p;
    public final nag<Object, b> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8075r;
    public long[][] s;
    public IllegalMergeException t;

    public static final class IllegalMergeException extends IOException {
        public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
        public final int reason;

        public IllegalMergeException(int i) {
            this.reason = i;
        }
    }

    public static final class a extends z1a {
        public final long[] d;
        public final long[] e;

        public a(com.google.android.exoplayer2.v vVar, Map<Object, Long> map) {
            super(vVar);
            int iP = vVar.p();
            this.e = new long[vVar.p()];
            com.google.android.exoplayer2.v.c cVar = new com.google.android.exoplayer2.v.c();
            for (int i = 0; i < iP; i++) {
                this.e[i] = vVar.n(i, cVar).n;
            }
            int i2 = vVar.i();
            this.d = new long[i2];
            com.google.android.exoplayer2.v.b bVar = new com.google.android.exoplayer2.v.b();
            for (int i3 = 0; i3 < i2; i3++) {
                vVar.g(i3, bVar, true);
                long jLongValue = ((Long) rk1.e(map.get(bVar.f8447b))).longValue();
                long[] jArr = this.d;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.d : jLongValue;
                jArr[i3] = jLongValue;
                long j = bVar.d;
                if (j != -9223372036854775807L) {
                    long[] jArr2 = this.e;
                    int i4 = bVar.c;
                    jArr2[i4] = jArr2[i4] - (j - jLongValue);
                }
            }
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.b g(int i, com.google.android.exoplayer2.v.b bVar, boolean z) {
            super.g(i, bVar, z);
            bVar.d = this.d[i];
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.c o(int i, com.google.android.exoplayer2.v.c cVar, long j) {
            long jMin;
            super.o(i, cVar, j);
            long j2 = this.e[i];
            cVar.n = j2;
            if (j2 != -9223372036854775807L) {
                long j3 = cVar.m;
                if (j3 == -9223372036854775807L) {
                    jMin = cVar.m;
                } else {
                    jMin = Math.min(j3, j2);
                }
            } else {
                jMin = cVar.m;
            }
            cVar.m = jMin;
            return cVar;
        }
    }

    public MergingMediaSource(k... kVarArr) {
        this(false, kVarArr);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        super.B(fxpVar);
        for (int i = 0; i < this.l.length; i++) {
            M(Integer.valueOf(i), this.l[i]);
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void D() {
        super.D();
        Arrays.fill(this.m, (Object) null);
        this.f8075r = -1;
        this.t = null;
        this.n.clear();
        Collections.addAll(this.n, this.l);
    }

    public final void O() {
        com.google.android.exoplayer2.v.b bVar = new com.google.android.exoplayer2.v.b();
        for (int i = 0; i < this.f8075r; i++) {
            long j = -this.m[0].f(i, bVar).l();
            int i2 = 1;
            while (true) {
                com.google.android.exoplayer2.v[] vVarArr = this.m;
                if (i2 < vVarArr.length) {
                    this.s[i][i2] = j - (-vVarArr[i2].f(i, bVar).l());
                    i2++;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public k.a H(Integer num, k.a aVar) {
        if (num.intValue() == 0) {
            return aVar;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void K(Integer num, k kVar, com.google.android.exoplayer2.v vVar) {
        if (this.t != null) {
            return;
        }
        if (this.f8075r == -1) {
            this.f8075r = vVar.i();
        } else if (vVar.i() != this.f8075r) {
            this.t = new IllegalMergeException(0);
            return;
        }
        if (this.s.length == 0) {
            this.s = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f8075r, this.m.length);
        }
        this.n.remove(kVar);
        this.m[num.intValue()] = vVar;
        if (this.n.isEmpty()) {
            if (this.j) {
                O();
            }
            com.google.android.exoplayer2.v aVar = this.m[0];
            if (this.f8074k) {
                R();
                aVar = new a(aVar, this.p);
            }
            C(aVar);
        }
    }

    public final void R() {
        com.google.android.exoplayer2.v[] vVarArr;
        com.google.android.exoplayer2.v.b bVar = new com.google.android.exoplayer2.v.b();
        for (int i = 0; i < this.f8075r; i++) {
            int i2 = 0;
            long j = Long.MIN_VALUE;
            while (true) {
                vVarArr = this.m;
                if (i2 >= vVarArr.length) {
                    break;
                }
                long jH = vVarArr[i2].f(i, bVar).h();
                if (jH != -9223372036854775807L) {
                    long j2 = jH + this.s[i][i2];
                    if (j == Long.MIN_VALUE || j2 < j) {
                        j = j2;
                    }
                }
                i2++;
            }
            Object objM = vVarArr[0].m(i);
            this.p.put(objM, Long.valueOf(j));
            Iterator<b> it = this.q.get(objM).iterator();
            while (it.hasNext()) {
                it.next().v(0L, j);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public com.google.android.exoplayer2.m c() {
        k[] kVarArr = this.l;
        return kVarArr.length > 0 ? kVarArr[0].c() : u;
    }

    @Override // com.google.android.exoplayer2.source.k
    public j d(k.a aVar, r61 r61Var, long j) {
        int length = this.l.length;
        j[] jVarArr = new j[length];
        int iB = this.m[0].b(aVar.f27977a);
        for (int i = 0; i < length; i++) {
            jVarArr[i] = this.l[i].d(aVar.c(this.m[i].m(iB)), r61Var, j - this.s[iB][i]);
        }
        m mVar = new m(this.o, this.s[iB], jVarArr);
        if (!this.f8074k) {
            return mVar;
        }
        b bVar = new b(mVar, true, 0L, ((Long) rk1.e(this.p.get(aVar.f27977a))).longValue());
        this.q.put(aVar.f27977a, bVar);
        return bVar;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.k
    public void f() throws IOException {
        IllegalMergeException illegalMergeException = this.t;
        if (illegalMergeException != null) {
            throw illegalMergeException;
        }
        super.f();
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        if (this.f8074k) {
            b bVar = (b) jVar;
            for (Map.Entry<Object, b> entry : this.q.entries()) {
                if (entry.getValue().equals(bVar)) {
                    this.q.remove(entry.getKey(), entry.getValue());
                    break;
                }
            }
            jVar = bVar.f8082a;
        }
        m mVar = (m) jVar;
        int i = 0;
        while (true) {
            k[] kVarArr = this.l;
            if (i >= kVarArr.length) {
                return;
            }
            kVarArr[i].j(mVar.d(i));
            i++;
        }
    }

    public MergingMediaSource(boolean z, k... kVarArr) {
        this(z, false, kVarArr);
    }

    public MergingMediaSource(boolean z, boolean z2, k... kVarArr) {
        this(z, z2, new bu5(), kVarArr);
    }

    public MergingMediaSource(boolean z, boolean z2, ra4 ra4Var, k... kVarArr) {
        this.j = z;
        this.f8074k = z2;
        this.l = kVarArr;
        this.o = ra4Var;
        this.n = new ArrayList<>(Arrays.asList(kVarArr));
        this.f8075r = -1;
        this.m = new com.google.android.exoplayer2.v[kVarArr.length];
        this.s = new long[0][];
        this.p = new HashMap();
        this.q = oag.a().a().e();
    }
}
