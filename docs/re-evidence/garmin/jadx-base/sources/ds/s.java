package ds;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class s {
    /* JADX WARN: Code duplicated, block: B:101:0x0263  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[PHI: r1 r3 r10
      0x00c1: PHI (r1v19 h4.r) = (r1v5 h4.r), (r1v21 h4.r) binds: [B:67:0x00d1, B:59:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r3v32 int) = (r3v12 int), (r3v33 int) binds: [B:67:0x00d1, B:59:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r10v17 g6.q) = (r10v5 g6.q), (r10v3 g6.q) binds: [B:67:0x00d1, B:59:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x011e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0185  */
    /* JADX WARN: Code duplicated, block: B:87:0x0189  */
    /* JADX WARN: Code duplicated, block: B:90:0x0196  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:99:0x025f  */
    public static final void a(h4.r rVar, final String str, final String str2, final Integer num, final long j8, g6.q qVar, float f14, p3.m mVar, final int i14, final int i15) {
        h4.r rVar2;
        int i16;
        g6.q qVar2;
        float f15;
        int i17;
        boolean z14;
        final h4.r rVar3;
        final g6.q qVar3;
        final float f16;
        p2 p2VarI0;
        h4.r rVar4;
        float f17;
        g6.q qVar4;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h4.r rVar5;
        h5.g.a.f fVar;
        h4.r.a aVar2;
        float f18;
        int i18;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        boolean z15;
        o0 o0Var;
        long jB;
        str.getClass();
        o0 o0VarE = mVar.E(-1154427088);
        p3.c<?> cVar = o0VarE.f135177b;
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        }
        int i24 = i16 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(num) ? 2048 : 1024) | (o0VarE.l(j8) ? 16384 : 8192);
        int i25 = i15 & 32;
        if (i25 == 0) {
            if ((i14 & 196608) == 0) {
                qVar2 = qVar;
                i24 |= o0VarE.B(qVar2) ? 131072 : 65536;
            }
            if ((i15 & 64) == 0) {
                f15 = f14;
                int i26 = o0VarE.i(f15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                i17 = i24 | i26;
                if ((599187 & i17) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i17 & 1, z14)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i19 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        }
                        if ((i15 & 64) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            i17 &= -3670017;
                            f17 = j92.b.f97899b.f97918c;
                            qVar4 = qVar2;
                        }
                        o0VarE.h0();
                        x1 x1Var = p3.n.f135158a;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVar4, o0VarE);
                        h5.g.V.getClass();
                        aVar = h5.g.a.f81805b;
                        if (cVar == null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar);
                        } else {
                            o0VarE.c();
                        }
                        eVar = h5.g.a.f81810g;
                        b4.c(eVar, zVarA, o0VarE);
                        c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarA0, o0VarE);
                        bVar = h5.g.a.f81813j;
                        if (o0VarE.T) {
                            rVar5 = rVar4;
                        } else {
                            rVar5 = rVar4;
                            if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            }
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC, o0VarE);
                            c2.b0 b0Var = c2.b0.f22601a;
                            aVar2 = h4.r.S;
                            h4.r rVarC3 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
                            f18 = f17;
                            i18 = i17;
                            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                            iHashCode2 = Long.hashCode(o0VarE.U);
                            i2VarA1 = o0VarE.a0();
                            rVarC2 = h4.k.c(rVarC3, o0VarE);
                            if (cVar != null) {
                                p0.l();
                                throw null;
                            }
                            o0VarE.z();
                            if (o0VarE.T) {
                                o0VarE.M(aVar);
                            } else {
                                o0VarE.c();
                            }
                            b4.c(eVar, s2VarA, o0VarE);
                            b4.c(c1623g, i2VarA1, o0VarE);
                            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                            }
                            b4.c(fVar, rVarC2, o0VarE);
                            u2 u2Var = u2.f22900a;
                            if (num == null) {
                                o0VarE.C(2093004373);
                                o0VarE.g0(false);
                                o0Var = o0VarE;
                                z15 = true;
                            } else {
                                o0VarE.C(2093004374);
                                t4.d dVarA = n5.c.a(num.intValue(), o0VarE, 0);
                                o4.r rVarA = o4.e0.a.a(o4.e0.f128843b, j8);
                                d92.b.f58623a.getClass();
                                j92.b bVar2 = d92.b.f58625c;
                                bVar2.getClass();
                                h4.r rVarQ = x2.q(aVar2, j92.b.f97901d.f97905d);
                                bVar2.getClass();
                                z15 = true;
                                y0.a(dVarA, null, c2.l.C(rVarQ, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA, o0VarE, 48, 56);
                                w.f61056a.getClass();
                                x0 x0VarA = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                d6.p.f57793b.getClass();
                                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                                o0Var = o0VarE;
                                Unit unit = Unit.INSTANCE;
                                o0Var.g0(false);
                            }
                            o0Var.g0(z15);
                            w.f61056a.getClass();
                            x0 x0Var = w.f61058c;
                            if (qVar4 != null) {
                                jB = qVar4.f76021a;
                            } else {
                                jB = o53.f0.B(17);
                            }
                            o0 o0Var2 = o0Var;
                            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var2, (i18 >> 6) & 14, 0, 131070);
                            o0VarE = o0Var2;
                            o0VarE.g0(z15);
                            rVar3 = rVar5;
                            qVar3 = qVar4;
                            f16 = f18;
                        }
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        aVar2 = h4.r.S;
                        h4.r rVarC4 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
                        f18 = f17;
                        i18 = i17;
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarC4, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, s2VarA, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        u2 u2Var2 = u2.f22900a;
                        if (num == null) {
                            o0VarE.C(2093004373);
                            o0VarE.g0(false);
                            o0Var = o0VarE;
                            z15 = true;
                        } else {
                            o0VarE.C(2093004374);
                            t4.d dVarA2 = n5.c.a(num.intValue(), o0VarE, 0);
                            o4.r rVarA2 = o4.e0.a.a(o4.e0.f128843b, j8);
                            d92.b.f58623a.getClass();
                            j92.b bVar3 = d92.b.f58625c;
                            bVar3.getClass();
                            h4.r rVarQ2 = x2.q(aVar2, j92.b.f97901d.f97905d);
                            bVar3.getClass();
                            z15 = true;
                            y0.a(dVarA2, null, c2.l.C(rVarQ2, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA2, o0VarE, 48, 56);
                            w.f61056a.getClass();
                            x0 x0VarA2 = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            d6.p.f57793b.getClass();
                            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA2, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                            o0Var = o0VarE;
                            Unit unit2 = Unit.INSTANCE;
                            o0Var.g0(false);
                        }
                        o0Var.g0(z15);
                        w.f61056a.getClass();
                        x0 x0Var2 = w.f61058c;
                        if (qVar4 != null) {
                            jB = qVar4.f76021a;
                        } else {
                            jB = o53.f0.B(17);
                        }
                        o0 o0Var3 = o0Var;
                        mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var2, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var3, (i18 >> 6) & 14, 0, 131070);
                        o0VarE = o0Var3;
                        o0VarE.g0(z15);
                        rVar3 = rVar5;
                        qVar3 = qVar4;
                        f16 = f18;
                    } else {
                        o0VarE.e();
                        if ((i15 & 64) != 0) {
                            i17 &= -3670017;
                        }
                        rVar4 = rVar2;
                    }
                    qVar4 = qVar2;
                    f17 = f15;
                    o0VarE.h0();
                    x1 x1Var2 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar4, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        rVar5 = rVar4;
                        if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        aVar2 = h4.r.S;
                        h4.r rVarC5 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
                        f18 = f17;
                        i18 = i17;
                        s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = h4.k.c(rVarC5, o0VarE);
                        if (cVar != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, s2VarA, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        } else {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        u2 u2Var3 = u2.f22900a;
                        if (num == null) {
                            o0VarE.C(2093004373);
                            o0VarE.g0(false);
                            o0Var = o0VarE;
                            z15 = true;
                        } else {
                            o0VarE.C(2093004374);
                            t4.d dVarA3 = n5.c.a(num.intValue(), o0VarE, 0);
                            o4.r rVarA3 = o4.e0.a.a(o4.e0.f128843b, j8);
                            d92.b.f58623a.getClass();
                            j92.b bVar4 = d92.b.f58625c;
                            bVar4.getClass();
                            h4.r rVarQ3 = x2.q(aVar2, j92.b.f97901d.f97905d);
                            bVar4.getClass();
                            z15 = true;
                            y0.a(dVarA3, null, c2.l.C(rVarQ3, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA3, o0VarE, 48, 56);
                            w.f61056a.getClass();
                            x0 x0VarA3 = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            d6.p.f57793b.getClass();
                            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA3, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                            o0Var = o0VarE;
                            Unit unit3 = Unit.INSTANCE;
                            o0Var.g0(false);
                        }
                        o0Var.g0(z15);
                        w.f61056a.getClass();
                        x0 x0Var3 = w.f61058c;
                        if (qVar4 != null) {
                            jB = qVar4.f76021a;
                        } else {
                            jB = o53.f0.B(17);
                        }
                        o0 o0Var4 = o0Var;
                        mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var3, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var4, (i18 >> 6) & 14, 0, 131070);
                        o0VarE = o0Var4;
                        o0VarE.g0(z15);
                        rVar3 = rVar5;
                        qVar3 = qVar4;
                        f16 = f18;
                    } else {
                        rVar5 = rVar4;
                    }
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    aVar2 = h4.r.S;
                    h4.r rVarC6 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
                    f18 = f17;
                    i18 = i17;
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC6, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u2 u2Var4 = u2.f22900a;
                    if (num == null) {
                        o0VarE.C(2093004373);
                        o0VarE.g0(false);
                        o0Var = o0VarE;
                        z15 = true;
                    } else {
                        o0VarE.C(2093004374);
                        t4.d dVarA4 = n5.c.a(num.intValue(), o0VarE, 0);
                        o4.r rVarA4 = o4.e0.a.a(o4.e0.f128843b, j8);
                        d92.b.f58623a.getClass();
                        j92.b bVar5 = d92.b.f58625c;
                        bVar5.getClass();
                        h4.r rVarQ4 = x2.q(aVar2, j92.b.f97901d.f97905d);
                        bVar5.getClass();
                        z15 = true;
                        y0.a(dVarA4, null, c2.l.C(rVarQ4, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA4, o0VarE, 48, 56);
                        w.f61056a.getClass();
                        x0 x0VarA4 = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        d6.p.f57793b.getClass();
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA4, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                        o0Var = o0VarE;
                        Unit unit4 = Unit.INSTANCE;
                        o0Var.g0(false);
                    }
                    o0Var.g0(z15);
                    w.f61056a.getClass();
                    x0 x0Var4 = w.f61058c;
                    if (qVar4 != null) {
                        jB = qVar4.f76021a;
                    } else {
                        jB = o53.f0.B(17);
                    }
                    o0 o0Var5 = o0Var;
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var4, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var5, (i18 >> 6) & 14, 0, 131070);
                    o0VarE = o0Var5;
                    o0VarE.g0(z15);
                    rVar3 = rVar5;
                    qVar3 = qVar4;
                    f16 = f18;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    qVar3 = qVar2;
                    f16 = f15;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: ds.r
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            s.a(rVar3, str, str2, num, j8, qVar3, f16, (p3.m) obj, p0.t(i14 | 1), i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            f15 = f14;
            i17 = i24 | i26;
            if ((599187 & i17) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    }
                    if ((i15 & 64) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i17 &= -3670017;
                        f17 = j92.b.f97899b.f97918c;
                        qVar4 = qVar2;
                    } else {
                        qVar4 = qVar2;
                        f17 = f15;
                    }
                } else {
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    }
                    if ((i15 & 64) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i17 &= -3670017;
                        f17 = j92.b.f97899b.f97918c;
                        qVar4 = qVar2;
                    } else {
                        qVar4 = qVar2;
                        f17 = f15;
                    }
                }
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar4, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    rVar5 = rVar4;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    aVar2 = h4.r.S;
                    h4.r rVarC7 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
                    f18 = f17;
                    i18 = i17;
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC7, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u2 u2Var5 = u2.f22900a;
                    if (num == null) {
                        o0VarE.C(2093004373);
                        o0VarE.g0(false);
                        o0Var = o0VarE;
                        z15 = true;
                    } else {
                        o0VarE.C(2093004374);
                        t4.d dVarA5 = n5.c.a(num.intValue(), o0VarE, 0);
                        o4.r rVarA5 = o4.e0.a.a(o4.e0.f128843b, j8);
                        d92.b.f58623a.getClass();
                        j92.b bVar6 = d92.b.f58625c;
                        bVar6.getClass();
                        h4.r rVarQ5 = x2.q(aVar2, j92.b.f97901d.f97905d);
                        bVar6.getClass();
                        z15 = true;
                        y0.a(dVarA5, null, c2.l.C(rVarQ5, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA5, o0VarE, 48, 56);
                        w.f61056a.getClass();
                        x0 x0VarA5 = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        d6.p.f57793b.getClass();
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA5, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                        o0Var = o0VarE;
                        Unit unit5 = Unit.INSTANCE;
                        o0Var.g0(false);
                    }
                    o0Var.g0(z15);
                    w.f61056a.getClass();
                    x0 x0Var5 = w.f61058c;
                    if (qVar4 != null) {
                        jB = qVar4.f76021a;
                    } else {
                        jB = o53.f0.B(17);
                    }
                    o0 o0Var6 = o0Var;
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var5, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var6, (i18 >> 6) & 14, 0, 131070);
                    o0VarE = o0Var6;
                    o0VarE.g0(z15);
                    rVar3 = rVar5;
                    qVar3 = qVar4;
                    f16 = f18;
                } else {
                    rVar5 = rVar4;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var6 = c2.b0.f22601a;
                aVar2 = h4.r.S;
                h4.r rVarC8 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
                f18 = f17;
                i18 = i17;
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC8, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var6 = u2.f22900a;
                if (num == null) {
                    o0VarE.C(2093004373);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                    z15 = true;
                } else {
                    o0VarE.C(2093004374);
                    t4.d dVarA6 = n5.c.a(num.intValue(), o0VarE, 0);
                    o4.r rVarA6 = o4.e0.a.a(o4.e0.f128843b, j8);
                    d92.b.f58623a.getClass();
                    j92.b bVar7 = d92.b.f58625c;
                    bVar7.getClass();
                    h4.r rVarQ6 = x2.q(aVar2, j92.b.f97901d.f97905d);
                    bVar7.getClass();
                    z15 = true;
                    y0.a(dVarA6, null, c2.l.C(rVarQ6, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA6, o0VarE, 48, 56);
                    w.f61056a.getClass();
                    x0 x0VarA6 = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.p.f57793b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA6, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                    o0Var = o0VarE;
                    Unit unit6 = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                o0Var.g0(z15);
                w.f61056a.getClass();
                x0 x0Var6 = w.f61058c;
                if (qVar4 != null) {
                    jB = qVar4.f76021a;
                } else {
                    jB = o53.f0.B(17);
                }
                o0 o0Var7 = o0Var;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var6, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var7, (i18 >> 6) & 14, 0, 131070);
                o0VarE = o0Var7;
                o0VarE.g0(z15);
                rVar3 = rVar5;
                qVar3 = qVar4;
                f16 = f18;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                qVar3 = qVar2;
                f16 = f15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: ds.r
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        s.a(rVar3, str, str2, num, j8, qVar3, f16, (p3.m) obj, p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i24 |= 196608;
        qVar2 = qVar;
        if ((i15 & 64) == 0) {
            f15 = f14;
            if (o0VarE.i(f15)) {
            }
            i17 = i24 | i26;
            if ((599187 & i17) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i17 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    }
                    if ((i15 & 64) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i17 &= -3670017;
                        f17 = j92.b.f97899b.f97918c;
                        qVar4 = qVar2;
                    } else {
                        qVar4 = qVar2;
                        f17 = f15;
                    }
                } else {
                    if (i19 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    }
                    if ((i15 & 64) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i17 &= -3670017;
                        f17 = j92.b.f97899b.f97918c;
                        qVar4 = qVar2;
                    } else {
                        qVar4 = qVar2;
                        f17 = f15;
                    }
                }
                o0VarE.h0();
                x1 x1Var4 = p3.n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.k kVar4 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar4, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    rVar5 = rVar4;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var7 = c2.b0.f22601a;
                    aVar2 = h4.r.S;
                    h4.r rVarC9 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
                    f18 = f17;
                    i18 = i17;
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC9, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u2 u2Var7 = u2.f22900a;
                    if (num == null) {
                        o0VarE.C(2093004373);
                        o0VarE.g0(false);
                        o0Var = o0VarE;
                        z15 = true;
                    } else {
                        o0VarE.C(2093004374);
                        t4.d dVarA7 = n5.c.a(num.intValue(), o0VarE, 0);
                        o4.r rVarA7 = o4.e0.a.a(o4.e0.f128843b, j8);
                        d92.b.f58623a.getClass();
                        j92.b bVar8 = d92.b.f58625c;
                        bVar8.getClass();
                        h4.r rVarQ7 = x2.q(aVar2, j92.b.f97901d.f97905d);
                        bVar8.getClass();
                        z15 = true;
                        y0.a(dVarA7, null, c2.l.C(rVarQ7, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA7, o0VarE, 48, 56);
                        w.f61056a.getClass();
                        x0 x0VarA7 = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        d6.p.f57793b.getClass();
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA7, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                        o0Var = o0VarE;
                        Unit unit7 = Unit.INSTANCE;
                        o0Var.g0(false);
                    }
                    o0Var.g0(z15);
                    w.f61056a.getClass();
                    x0 x0Var7 = w.f61058c;
                    if (qVar4 != null) {
                        jB = qVar4.f76021a;
                    } else {
                        jB = o53.f0.B(17);
                    }
                    o0 o0Var8 = o0Var;
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var7, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var8, (i18 >> 6) & 14, 0, 131070);
                    o0VarE = o0Var8;
                    o0VarE.g0(z15);
                    rVar3 = rVar5;
                    qVar3 = qVar4;
                    f16 = f18;
                } else {
                    rVar5 = rVar4;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var8 = c2.b0.f22601a;
                aVar2 = h4.r.S;
                h4.r rVarC10 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
                f18 = f17;
                i18 = i17;
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC10, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var8 = u2.f22900a;
                if (num == null) {
                    o0VarE.C(2093004373);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                    z15 = true;
                } else {
                    o0VarE.C(2093004374);
                    t4.d dVarA8 = n5.c.a(num.intValue(), o0VarE, 0);
                    o4.r rVarA8 = o4.e0.a.a(o4.e0.f128843b, j8);
                    d92.b.f58623a.getClass();
                    j92.b bVar9 = d92.b.f58625c;
                    bVar9.getClass();
                    h4.r rVarQ8 = x2.q(aVar2, j92.b.f97901d.f97905d);
                    bVar9.getClass();
                    z15 = true;
                    y0.a(dVarA8, null, c2.l.C(rVarQ8, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA8, o0VarE, 48, 56);
                    w.f61056a.getClass();
                    x0 x0VarA8 = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.p.f57793b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA8, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                    o0Var = o0VarE;
                    Unit unit8 = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                o0Var.g0(z15);
                w.f61056a.getClass();
                x0 x0Var8 = w.f61058c;
                if (qVar4 != null) {
                    jB = qVar4.f76021a;
                } else {
                    jB = o53.f0.B(17);
                }
                o0 o0Var9 = o0Var;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var8, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var9, (i18 >> 6) & 14, 0, 131070);
                o0VarE = o0Var9;
                o0VarE.g0(z15);
                rVar3 = rVar5;
                qVar3 = qVar4;
                f16 = f18;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                qVar3 = qVar2;
                f16 = f15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: ds.r
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        s.a(rVar3, str, str2, num, j8, qVar3, f16, (p3.m) obj, p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        f15 = f14;
        i17 = i24 | i26;
        if ((599187 & i17) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i17 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i25 != 0) {
                    qVar2 = null;
                }
                if ((i15 & 64) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i17 &= -3670017;
                    f17 = j92.b.f97899b.f97918c;
                    qVar4 = qVar2;
                } else {
                    qVar4 = qVar2;
                    f17 = f15;
                }
            } else {
                if (i19 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i25 != 0) {
                    qVar2 = null;
                }
                if ((i15 & 64) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    i17 &= -3670017;
                    f17 = j92.b.f97899b.f97918c;
                    qVar4 = qVar2;
                } else {
                    qVar4 = qVar2;
                    f17 = f15;
                }
            }
            o0VarE.h0();
            x1 x1Var5 = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar5 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar5, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar4, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                rVar5 = rVar4;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var9 = c2.b0.f22601a;
                aVar2 = h4.r.S;
                h4.r rVarC11 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
                f18 = f17;
                i18 = i17;
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC11, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var9 = u2.f22900a;
                if (num == null) {
                    o0VarE.C(2093004373);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                    z15 = true;
                } else {
                    o0VarE.C(2093004374);
                    t4.d dVarA9 = n5.c.a(num.intValue(), o0VarE, 0);
                    o4.r rVarA9 = o4.e0.a.a(o4.e0.f128843b, j8);
                    d92.b.f58623a.getClass();
                    j92.b bVar10 = d92.b.f58625c;
                    bVar10.getClass();
                    h4.r rVarQ9 = x2.q(aVar2, j92.b.f97901d.f97905d);
                    bVar10.getClass();
                    z15 = true;
                    y0.a(dVarA9, null, c2.l.C(rVarQ9, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA9, o0VarE, 48, 56);
                    w.f61056a.getClass();
                    x0 x0VarA9 = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.p.f57793b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA9, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                    o0Var = o0VarE;
                    Unit unit9 = Unit.INSTANCE;
                    o0Var.g0(false);
                }
                o0Var.g0(z15);
                w.f61056a.getClass();
                x0 x0Var9 = w.f61058c;
                if (qVar4 != null) {
                    jB = qVar4.f76021a;
                } else {
                    jB = o53.f0.B(17);
                }
                o0 o0Var10 = o0Var;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var9, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var10, (i18 >> 6) & 14, 0, 131070);
                o0VarE = o0Var10;
                o0VarE.g0(z15);
                rVar3 = rVar5;
                qVar3 = qVar4;
                f16 = f18;
            } else {
                rVar5 = rVar4;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var10 = c2.b0.f22601a;
            aVar2 = h4.r.S;
            h4.r rVarC12 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f17, 7);
            f18 = f17;
            i18 = i17;
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC12, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var10 = u2.f22900a;
            if (num == null) {
                o0VarE.C(2093004373);
                o0VarE.g0(false);
                o0Var = o0VarE;
                z15 = true;
            } else {
                o0VarE.C(2093004374);
                t4.d dVarA10 = n5.c.a(num.intValue(), o0VarE, 0);
                o4.r rVarA10 = o4.e0.a.a(o4.e0.f128843b, j8);
                d92.b.f58623a.getClass();
                j92.b bVar11 = d92.b.f58625c;
                bVar11.getClass();
                h4.r rVarQ10 = x2.q(aVar2, j92.b.f97901d.f97905d);
                bVar11.getClass();
                z15 = true;
                y0.a(dVarA10, null, c2.l.C(rVarQ10, 0.0f, 0.0f, j92.b.f97899b.f97917b, 0.0f, 11), null, null, 0.0f, rVarA10, o0VarE, 48, 56);
                w.f61056a.getClass();
                x0 x0VarA10 = x0.a(w.f61057b, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                d6.p.f57793b.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA10, o0VarE, (i18 >> 3) & 14, 24960, 110590);
                o0Var = o0VarE;
                Unit unit10 = Unit.INSTANCE;
                o0Var.g0(false);
            }
            o0Var.g0(z15);
            w.f61056a.getClass();
            x0 x0Var10 = w.f61058c;
            if (qVar4 != null) {
                jB = qVar4.f76021a;
            } else {
                jB = o53.f0.B(17);
            }
            o0 o0Var11 = o0Var;
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(x0Var10, j8, jB, null, null, 0L, null, null, 0, 0L, null, null, 16777212), o0Var11, (i18 >> 6) & 14, 0, 131070);
            o0VarE = o0Var11;
            o0VarE.g0(z15);
            rVar3 = rVar5;
            qVar3 = qVar4;
            f16 = f18;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            qVar3 = qVar2;
            f16 = f15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: ds.r
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s.a(rVar3, str, str2, num, j8, qVar3, f16, (p3.m) obj, p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
