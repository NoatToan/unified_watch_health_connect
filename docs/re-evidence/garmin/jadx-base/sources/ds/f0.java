package ds;

import a3.a1;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import l72.v2;
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
public final class f0 {
    /* JADX WARN: Code duplicated, block: B:102:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:108:0x0208  */
    /* JADX WARN: Code duplicated, block: B:110:0x0216  */
    /* JADX WARN: Code duplicated, block: B:113:0x0222  */
    /* JADX WARN: Code duplicated, block: B:114:0x0238  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:127:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:131:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:78:0x0108  */
    /* JADX WARN: Code duplicated, block: B:79:0x011c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0122  */
    /* JADX WARN: Code duplicated, block: B:83:0x012d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0135  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:91:0x015c  */
    /* JADX WARN: Code duplicated, block: B:94:0x016f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x0185  */
    /* JADX WARN: Code duplicated, block: B:99:0x0187  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final String str2, final Integer num, final Integer num2, h4.r rVar, long j8, long j14, long j15, final float f14, w5.q qVar, p3.m mVar, final int i14, final int i15) {
        final long jD;
        int i16;
        final w5.q qVar2;
        int i17;
        int i18;
        boolean z14;
        final h4.r rVar2;
        final long j16;
        final long j17;
        p2 p2VarI0;
        h4.r rVar3;
        long jD2;
        int i19;
        long jD3;
        int i24;
        w5.q qVarB;
        long j18;
        long j19;
        boolean z15;
        boolean z16;
        j92.b bVar;
        j92.e eVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        h4.r rVar4;
        h5.g.a.f fVar;
        h5.g.a.C1623g c1623g2;
        long j24;
        h5.g.a.b bVar3;
        int i25;
        Throwable th3;
        h5.e0.a aVar2;
        h4.r.a aVar3;
        c2.z zVarA;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, -267721149);
        p3.c<?> cVar = o0VarK.f135177b;
        int i26 = (o0VarK.B(str) ? 4 : 2) | i14 | (o0VarK.B(str2) ? 32 : 16) | (o0VarK.B(num) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i26 |= o0VarK.B(num2) ? 2048 : 1024;
        }
        int i27 = i26 | 24576 | (((i15 & 32) == 0 && o0VarK.l(j8)) ? 131072 : 65536) | (((i15 & 64) == 0 && o0VarK.l(j14)) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if ((i15 & 128) == 0) {
            jD = j15;
            int i28 = o0VarK.l(jD) ? 8388608 : 4194304;
            int i29 = i27 | i28;
            if (o0VarK.i(f14)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            int i30 = i29 | i16;
            if ((i15 & 512) == 0) {
                qVar2 = qVar;
                int i34 = o0VarK.B(qVar2) ? 536870912 : 268435456;
                i17 = i30 | i34;
                i18 = 1;
                if ((306783379 & i17) != 306783378) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarK.n(i17 & 1, z14)) {
                    o0VarK.G0();
                    if ((i14 & 1) != 0 || o0VarK.o0()) {
                        rVar3 = h4.r.S;
                        if ((i15 & 32) != 0) {
                            d92.b.f58623a.getClass();
                            jD2 = d92.b.a(o0VarK).k().d();
                            i17 &= -458753;
                        } else {
                            jD2 = j8;
                        }
                        if ((i15 & 64) != 0) {
                            i19 = 0;
                            jD3 = e0.d(d92.b.f58623a, o0VarK);
                            i17 &= -3670017;
                        } else {
                            i19 = 0;
                            jD3 = j14;
                        }
                        if ((i15 & 128) != 0) {
                            jD = e0.d(d92.b.f58623a, o0VarK);
                            i17 &= -29360129;
                        }
                        if ((i15 & 512) != 0) {
                            w5.p[] pVarArr = new w5.p[1];
                            pVarArr[i19] = w5.v.a(R.font.roboto_regular, null, 14);
                            i24 = i17 & (-1879048193);
                            qVarB = w5.r.b(pVarArr);
                        } else {
                            i24 = i17;
                            qVarB = qVar2;
                        }
                        j18 = jD3;
                        j19 = jD2;
                    } else {
                        o0VarK.e();
                        if ((i15 & 32) != 0) {
                            i17 &= -458753;
                        }
                        if ((i15 & 64) != 0) {
                            i17 &= -3670017;
                        }
                        if ((i15 & 128) != 0) {
                            i17 &= -29360129;
                        }
                        if ((i15 & 512) != 0) {
                            i17 &= -1879048193;
                        }
                        rVar3 = rVar;
                        j19 = j8;
                        j18 = j14;
                        i24 = i17;
                        jD = jD;
                        qVarB = qVar2;
                        i19 = 0;
                    }
                    o0VarK.h0();
                    x1 x1Var = p3.n.f135158a;
                    g6.f.a aVar4 = g6.f.f75994b;
                    float f15 = 88 + f14;
                    if (num2 != null) {
                        z15 = 1;
                    } else {
                        z15 = i19;
                    }
                    h4.r rVarF = x2.f(v2.a(rVar3, z15, new a1(f15, i18), o0VarK, 6), 1.0f);
                    if (num2 != null) {
                        z16 = 1;
                    } else {
                        z16 = i19;
                    }
                    int i35 = i19;
                    h4.r rVarA = v2.a(rVarF, z16, new c0(num2, i35), o0VarK, i35);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarC3 = c2.l.C(c2.l.A(rVarA, eVar.f97920e, 0.0f, 2), 0.0f, f14, 0.0f, 0.0f, 13);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar4 = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2VarA = q2.a(c2.j.f22692b, bVar4, o0VarK, 48);
                    iHashCode = Long.hashCode(o0VarK.U);
                    i2VarA0 = o0VarK.a0();
                    rVarC = h4.k.c(rVarC3, o0VarK);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarK.z();
                    if (o0VarK.T) {
                        o0VarK.M(aVar);
                    } else {
                        o0VarK.c();
                    }
                    eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, s2VarA, o0VarK);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarK);
                    bVar2 = h5.g.a.f81813j;
                    rVar4 = rVar3;
                    if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarK);
                    u2 u2Var = u2.f22900a;
                    if (num == null) {
                        o0VarK.C(-80508614);
                        o0VarK.g0(false);
                        j24 = jD;
                        c1623g2 = c1623g;
                        bVar3 = bVar2;
                        th3 = null;
                        i25 = 0;
                        aVar2 = aVar;
                    } else {
                        o0VarK.C(-80508613);
                        t4.d dVarA = n5.c.a(num.intValue(), o0VarK, 0);
                        o4.r rVarA2 = o4.e0.a.a(o4.e0.f128843b, jD);
                        h4.r.a aVar5 = h4.r.S;
                        bVar.getClass();
                        h4.r rVarQ = x2.q(aVar5, j92.b.f97901d.f97905d);
                        c1623g2 = c1623g;
                        j24 = jD;
                        bVar3 = bVar2;
                        i25 = 0;
                        th3 = null;
                        aVar2 = aVar;
                        y0.a(dVarA, null, rVarQ, null, null, 0.0f, rVarA2, o0VarK, 48, 56);
                        Unit unit = Unit.INSTANCE;
                        o0VarK.g0(false);
                    }
                    aVar3 = h4.r.S;
                    bVar.getClass();
                    float f16 = eVar.f97920e;
                    bVar.getClass();
                    h4.r rVarC4 = c2.l.C(aVar3, f16, 0.0f, eVar.f97921f, 0.0f, 10);
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarK, i25);
                    iHashCode2 = Long.hashCode(o0VarK.U);
                    i2VarA1 = o0VarK.a0();
                    rVarC2 = h4.k.c(rVarC4, o0VarK);
                    if (cVar != null) {
                        p0.l();
                        throw th3;
                    }
                    o0VarK.z();
                    if (o0VarK.T) {
                        o0VarK.M(aVar2);
                    } else {
                        o0VarK.c();
                    }
                    b4.c(eVar2, zVarA, o0VarK);
                    b4.c(c1623g2, i2VarA1, o0VarK);
                    if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarK, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC2, o0VarK);
                    c2.b0 b0Var = c2.b0.f22601a;
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    x0 x0Var = j92.f.f97930g;
                    w5.f0.f182097b.getClass();
                    x0 x0VarA = x0.a(x0Var, j18, 0L, w5.f0.f182104i, qVarB, 0L, null, null, 0, 0L, null, null, 16777178);
                    long j25 = j18;
                    w5.q qVar3 = qVarB;
                    d6.p.f57793b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA, o0VarK, i24 & 14, 24960, 110590);
                    fVar2.getClass();
                    long j26 = j19;
                    x0 x0VarA2 = x0.a(j92.f.f97933j, j26, 0L, null, qVar3, 0L, null, null, 0, 0L, null, null, 16777182);
                    bVar.getClass();
                    mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0VarK, (i24 >> 3) & 14, 0, 131068);
                    o0VarK = o0VarK;
                    o0VarK.g0(true);
                    o0VarK.g0(true);
                    j16 = j26;
                    qVar2 = qVar3;
                    j17 = j25;
                    rVar2 = rVar4;
                    jD = j24;
                } else {
                    o0VarK.e();
                    rVar2 = rVar;
                    j16 = j8;
                    j17 = j14;
                }
                p2VarI0 = o0VarK.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: ds.d0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iT = p0.t(i14 | 1);
                            f0.a(str, str2, num, num2, rVar2, j16, j17, jD, f14, qVar2, (p3.m) obj, iT, i15);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            qVar2 = qVar;
            i17 = i30 | i34;
            i18 = 1;
            if ((306783379 & i17) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarK.n(i17 & 1, z14)) {
                o0VarK.G0();
                if ((i14 & 1) != 0) {
                    rVar3 = h4.r.S;
                    if ((i15 & 32) != 0) {
                        d92.b.f58623a.getClass();
                        jD2 = d92.b.a(o0VarK).k().d();
                        i17 &= -458753;
                    } else {
                        jD2 = j8;
                    }
                    if ((i15 & 64) != 0) {
                        i19 = 0;
                        jD3 = e0.d(d92.b.f58623a, o0VarK);
                        i17 &= -3670017;
                    } else {
                        i19 = 0;
                        jD3 = j14;
                    }
                    if ((i15 & 128) != 0) {
                        jD = e0.d(d92.b.f58623a, o0VarK);
                        i17 &= -29360129;
                    }
                    if ((i15 & 512) != 0) {
                        w5.p[] pVarArr2 = new w5.p[1];
                        pVarArr2[i19] = w5.v.a(R.font.roboto_regular, null, 14);
                        i24 = i17 & (-1879048193);
                        qVarB = w5.r.b(pVarArr2);
                    } else {
                        i24 = i17;
                        qVarB = qVar2;
                    }
                    j18 = jD3;
                    j19 = jD2;
                } else {
                    rVar3 = h4.r.S;
                    if ((i15 & 32) != 0) {
                        d92.b.f58623a.getClass();
                        jD2 = d92.b.a(o0VarK).k().d();
                        i17 &= -458753;
                    } else {
                        jD2 = j8;
                    }
                    if ((i15 & 64) != 0) {
                        i19 = 0;
                        jD3 = e0.d(d92.b.f58623a, o0VarK);
                        i17 &= -3670017;
                    } else {
                        i19 = 0;
                        jD3 = j14;
                    }
                    if ((i15 & 128) != 0) {
                        jD = e0.d(d92.b.f58623a, o0VarK);
                        i17 &= -29360129;
                    }
                    if ((i15 & 512) != 0) {
                        w5.p[] pVarArr3 = new w5.p[1];
                        pVarArr3[i19] = w5.v.a(R.font.roboto_regular, null, 14);
                        i24 = i17 & (-1879048193);
                        qVarB = w5.r.b(pVarArr3);
                    } else {
                        i24 = i17;
                        qVarB = qVar2;
                    }
                    j18 = jD3;
                    j19 = jD2;
                }
                o0VarK.h0();
                x1 x1Var2 = p3.n.f135158a;
                g6.f.a aVar6 = g6.f.f75994b;
                float f17 = 88 + f14;
                if (num2 != null) {
                    z15 = 1;
                } else {
                    z15 = i19;
                }
                h4.r rVarF2 = x2.f(v2.a(rVar3, z15, new a1(f17, i18), o0VarK, 6), 1.0f);
                if (num2 != null) {
                    z16 = 1;
                } else {
                    z16 = i19;
                }
                int i36 = i19;
                h4.r rVarA3 = v2.a(rVarF2, z16, new c0(num2, i36), o0VarK, i36);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarC5 = c2.l.C(c2.l.A(rVarA3, eVar.f97920e, 0.0f, 2), 0.0f, f14, 0.0f, 0.0f, 13);
                h4.d.f81522a.getClass();
                h4.g.b bVar5 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2VarA = q2.a(c2.j.f22692b, bVar5, o0VarK, 48);
                iHashCode = Long.hashCode(o0VarK.U);
                i2VarA0 = o0VarK.a0();
                rVarC = h4.k.c(rVarC5, o0VarK);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar);
                } else {
                    o0VarK.c();
                }
                eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, s2VarA, o0VarK);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarK);
                bVar2 = h5.g.a.f81813j;
                rVar4 = rVar3;
                if (o0VarK.T) {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarK);
                u2 u2Var2 = u2.f22900a;
                if (num == null) {
                    o0VarK.C(-80508614);
                    o0VarK.g0(false);
                    j24 = jD;
                    c1623g2 = c1623g;
                    bVar3 = bVar2;
                    th3 = null;
                    i25 = 0;
                    aVar2 = aVar;
                } else {
                    o0VarK.C(-80508613);
                    t4.d dVarA2 = n5.c.a(num.intValue(), o0VarK, 0);
                    o4.r rVarA4 = o4.e0.a.a(o4.e0.f128843b, jD);
                    h4.r.a aVar7 = h4.r.S;
                    bVar.getClass();
                    h4.r rVarQ2 = x2.q(aVar7, j92.b.f97901d.f97905d);
                    c1623g2 = c1623g;
                    j24 = jD;
                    bVar3 = bVar2;
                    i25 = 0;
                    th3 = null;
                    aVar2 = aVar;
                    y0.a(dVarA2, null, rVarQ2, null, null, 0.0f, rVarA4, o0VarK, 48, 56);
                    Unit unit2 = Unit.INSTANCE;
                    o0VarK.g0(false);
                }
                aVar3 = h4.r.S;
                bVar.getClass();
                float f18 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC6 = c2.l.C(aVar3, f18, 0.0f, eVar.f97921f, 0.0f, 10);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarK, i25);
                iHashCode2 = Long.hashCode(o0VarK.U);
                i2VarA1 = o0VarK.a0();
                rVarC2 = h4.k.c(rVarC6, o0VarK);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar2);
                } else {
                    o0VarK.c();
                }
                b4.c(eVar2, zVarA, o0VarK);
                b4.c(c1623g2, i2VarA1, o0VarK);
                if (o0VarK.T) {
                    v.h.A(iHashCode2, o0VarK, iHashCode2, bVar3);
                } else {
                    v.h.A(iHashCode2, o0VarK, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarK);
                c2.b0 b0Var2 = c2.b0.f22601a;
                j92.f fVar3 = d92.b.f58624b;
                fVar3.getClass();
                x0 x0Var2 = j92.f.f97930g;
                w5.f0.f182097b.getClass();
                x0 x0VarA3 = x0.a(x0Var2, j18, 0L, w5.f0.f182104i, qVarB, 0L, null, null, 0, 0L, null, null, 16777178);
                long j27 = j18;
                w5.q qVar4 = qVarB;
                d6.p.f57793b.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA3, o0VarK, i24 & 14, 24960, 110590);
                fVar3.getClass();
                long j28 = j19;
                x0 x0VarA4 = x0.a(j92.f.f97933j, j28, 0L, null, qVar4, 0L, null, null, 0, 0L, null, null, 16777182);
                bVar.getClass();
                mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA4, o0VarK, (i24 >> 3) & 14, 0, 131068);
                o0VarK = o0VarK;
                o0VarK.g0(true);
                o0VarK.g0(true);
                j16 = j28;
                qVar2 = qVar4;
                j17 = j27;
                rVar2 = rVar4;
                jD = j24;
            } else {
                o0VarK.e();
                rVar2 = rVar;
                j16 = j8;
                j17 = j14;
            }
            p2VarI0 = o0VarK.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: ds.d0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i14 | 1);
                        f0.a(str, str2, num, num2, rVar2, j16, j17, jD, f14, qVar2, (p3.m) obj, iT, i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        jD = j15;
        int i210 = i27 | i28;
        if (o0VarK.i(f14)) {
            i16 = 67108864;
        } else {
            i16 = 33554432;
        }
        int i37 = i210 | i16;
        if ((i15 & 512) == 0) {
            qVar2 = qVar;
            if (o0VarK.B(qVar2)) {
            }
            i17 = i37 | i34;
            i18 = 1;
            if ((306783379 & i17) != 306783378) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarK.n(i17 & 1, z14)) {
                o0VarK.G0();
                if ((i14 & 1) != 0) {
                    rVar3 = h4.r.S;
                    if ((i15 & 32) != 0) {
                        d92.b.f58623a.getClass();
                        jD2 = d92.b.a(o0VarK).k().d();
                        i17 &= -458753;
                    } else {
                        jD2 = j8;
                    }
                    if ((i15 & 64) != 0) {
                        i19 = 0;
                        jD3 = e0.d(d92.b.f58623a, o0VarK);
                        i17 &= -3670017;
                    } else {
                        i19 = 0;
                        jD3 = j14;
                    }
                    if ((i15 & 128) != 0) {
                        jD = e0.d(d92.b.f58623a, o0VarK);
                        i17 &= -29360129;
                    }
                    if ((i15 & 512) != 0) {
                        w5.p[] pVarArr4 = new w5.p[1];
                        pVarArr4[i19] = w5.v.a(R.font.roboto_regular, null, 14);
                        i24 = i17 & (-1879048193);
                        qVarB = w5.r.b(pVarArr4);
                    } else {
                        i24 = i17;
                        qVarB = qVar2;
                    }
                    j18 = jD3;
                    j19 = jD2;
                } else {
                    rVar3 = h4.r.S;
                    if ((i15 & 32) != 0) {
                        d92.b.f58623a.getClass();
                        jD2 = d92.b.a(o0VarK).k().d();
                        i17 &= -458753;
                    } else {
                        jD2 = j8;
                    }
                    if ((i15 & 64) != 0) {
                        i19 = 0;
                        jD3 = e0.d(d92.b.f58623a, o0VarK);
                        i17 &= -3670017;
                    } else {
                        i19 = 0;
                        jD3 = j14;
                    }
                    if ((i15 & 128) != 0) {
                        jD = e0.d(d92.b.f58623a, o0VarK);
                        i17 &= -29360129;
                    }
                    if ((i15 & 512) != 0) {
                        w5.p[] pVarArr5 = new w5.p[1];
                        pVarArr5[i19] = w5.v.a(R.font.roboto_regular, null, 14);
                        i24 = i17 & (-1879048193);
                        qVarB = w5.r.b(pVarArr5);
                    } else {
                        i24 = i17;
                        qVarB = qVar2;
                    }
                    j18 = jD3;
                    j19 = jD2;
                }
                o0VarK.h0();
                x1 x1Var3 = p3.n.f135158a;
                g6.f.a aVar8 = g6.f.f75994b;
                float f19 = 88 + f14;
                if (num2 != null) {
                    z15 = 1;
                } else {
                    z15 = i19;
                }
                h4.r rVarF3 = x2.f(v2.a(rVar3, z15, new a1(f19, i18), o0VarK, 6), 1.0f);
                if (num2 != null) {
                    z16 = 1;
                } else {
                    z16 = i19;
                }
                int i38 = i19;
                h4.r rVarA5 = v2.a(rVarF3, z16, new c0(num2, i38), o0VarK, i38);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarC7 = c2.l.C(c2.l.A(rVarA5, eVar.f97920e, 0.0f, 2), 0.0f, f14, 0.0f, 0.0f, 13);
                h4.d.f81522a.getClass();
                h4.g.b bVar6 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2VarA = q2.a(c2.j.f22692b, bVar6, o0VarK, 48);
                iHashCode = Long.hashCode(o0VarK.U);
                i2VarA0 = o0VarK.a0();
                rVarC = h4.k.c(rVarC7, o0VarK);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar);
                } else {
                    o0VarK.c();
                }
                eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, s2VarA, o0VarK);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarK);
                bVar2 = h5.g.a.f81813j;
                rVar4 = rVar3;
                if (o0VarK.T) {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarK);
                u2 u2Var3 = u2.f22900a;
                if (num == null) {
                    o0VarK.C(-80508614);
                    o0VarK.g0(false);
                    j24 = jD;
                    c1623g2 = c1623g;
                    bVar3 = bVar2;
                    th3 = null;
                    i25 = 0;
                    aVar2 = aVar;
                } else {
                    o0VarK.C(-80508613);
                    t4.d dVarA3 = n5.c.a(num.intValue(), o0VarK, 0);
                    o4.r rVarA6 = o4.e0.a.a(o4.e0.f128843b, jD);
                    h4.r.a aVar9 = h4.r.S;
                    bVar.getClass();
                    h4.r rVarQ3 = x2.q(aVar9, j92.b.f97901d.f97905d);
                    c1623g2 = c1623g;
                    j24 = jD;
                    bVar3 = bVar2;
                    i25 = 0;
                    th3 = null;
                    aVar2 = aVar;
                    y0.a(dVarA3, null, rVarQ3, null, null, 0.0f, rVarA6, o0VarK, 48, 56);
                    Unit unit3 = Unit.INSTANCE;
                    o0VarK.g0(false);
                }
                aVar3 = h4.r.S;
                bVar.getClass();
                float f110 = eVar.f97920e;
                bVar.getClass();
                h4.r rVarC8 = c2.l.C(aVar3, f110, 0.0f, eVar.f97921f, 0.0f, 10);
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarK, i25);
                iHashCode2 = Long.hashCode(o0VarK.U);
                i2VarA1 = o0VarK.a0();
                rVarC2 = h4.k.c(rVarC8, o0VarK);
                if (cVar != null) {
                    p0.l();
                    throw th3;
                }
                o0VarK.z();
                if (o0VarK.T) {
                    o0VarK.M(aVar2);
                } else {
                    o0VarK.c();
                }
                b4.c(eVar2, zVarA, o0VarK);
                b4.c(c1623g2, i2VarA1, o0VarK);
                if (o0VarK.T) {
                    v.h.A(iHashCode2, o0VarK, iHashCode2, bVar3);
                } else {
                    v.h.A(iHashCode2, o0VarK, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarK);
                c2.b0 b0Var3 = c2.b0.f22601a;
                j92.f fVar4 = d92.b.f58624b;
                fVar4.getClass();
                x0 x0Var3 = j92.f.f97930g;
                w5.f0.f182097b.getClass();
                x0 x0VarA5 = x0.a(x0Var3, j18, 0L, w5.f0.f182104i, qVarB, 0L, null, null, 0, 0L, null, null, 16777178);
                long j29 = j18;
                w5.q qVar5 = qVarB;
                d6.p.f57793b.getClass();
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA5, o0VarK, i24 & 14, 24960, 110590);
                fVar4.getClass();
                long j210 = j19;
                x0 x0VarA6 = x0.a(j92.f.f97933j, j210, 0L, null, qVar5, 0L, null, null, 0, 0L, null, null, 16777182);
                bVar.getClass();
                mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA6, o0VarK, (i24 >> 3) & 14, 0, 131068);
                o0VarK = o0VarK;
                o0VarK.g0(true);
                o0VarK.g0(true);
                j16 = j210;
                qVar2 = qVar5;
                j17 = j29;
                rVar2 = rVar4;
                jD = j24;
            } else {
                o0VarK.e();
                rVar2 = rVar;
                j16 = j8;
                j17 = j14;
            }
            p2VarI0 = o0VarK.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: ds.d0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p0.t(i14 | 1);
                        f0.a(str, str2, num, num2, rVar2, j16, j17, jD, f14, qVar2, (p3.m) obj, iT, i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        qVar2 = qVar;
        i17 = i37 | i34;
        i18 = 1;
        if ((306783379 & i17) != 306783378) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarK.n(i17 & 1, z14)) {
            o0VarK.G0();
            if ((i14 & 1) != 0) {
                rVar3 = h4.r.S;
                if ((i15 & 32) != 0) {
                    d92.b.f58623a.getClass();
                    jD2 = d92.b.a(o0VarK).k().d();
                    i17 &= -458753;
                } else {
                    jD2 = j8;
                }
                if ((i15 & 64) != 0) {
                    i19 = 0;
                    jD3 = e0.d(d92.b.f58623a, o0VarK);
                    i17 &= -3670017;
                } else {
                    i19 = 0;
                    jD3 = j14;
                }
                if ((i15 & 128) != 0) {
                    jD = e0.d(d92.b.f58623a, o0VarK);
                    i17 &= -29360129;
                }
                if ((i15 & 512) != 0) {
                    w5.p[] pVarArr6 = new w5.p[1];
                    pVarArr6[i19] = w5.v.a(R.font.roboto_regular, null, 14);
                    i24 = i17 & (-1879048193);
                    qVarB = w5.r.b(pVarArr6);
                } else {
                    i24 = i17;
                    qVarB = qVar2;
                }
                j18 = jD3;
                j19 = jD2;
            } else {
                rVar3 = h4.r.S;
                if ((i15 & 32) != 0) {
                    d92.b.f58623a.getClass();
                    jD2 = d92.b.a(o0VarK).k().d();
                    i17 &= -458753;
                } else {
                    jD2 = j8;
                }
                if ((i15 & 64) != 0) {
                    i19 = 0;
                    jD3 = e0.d(d92.b.f58623a, o0VarK);
                    i17 &= -3670017;
                } else {
                    i19 = 0;
                    jD3 = j14;
                }
                if ((i15 & 128) != 0) {
                    jD = e0.d(d92.b.f58623a, o0VarK);
                    i17 &= -29360129;
                }
                if ((i15 & 512) != 0) {
                    w5.p[] pVarArr7 = new w5.p[1];
                    pVarArr7[i19] = w5.v.a(R.font.roboto_regular, null, 14);
                    i24 = i17 & (-1879048193);
                    qVarB = w5.r.b(pVarArr7);
                } else {
                    i24 = i17;
                    qVarB = qVar2;
                }
                j18 = jD3;
                j19 = jD2;
            }
            o0VarK.h0();
            x1 x1Var4 = p3.n.f135158a;
            g6.f.a aVar10 = g6.f.f75994b;
            float f111 = 88 + f14;
            if (num2 != null) {
                z15 = 1;
            } else {
                z15 = i19;
            }
            h4.r rVarF4 = x2.f(v2.a(rVar3, z15, new a1(f111, i18), o0VarK, 6), 1.0f);
            if (num2 != null) {
                z16 = 1;
            } else {
                z16 = i19;
            }
            int i39 = i19;
            h4.r rVarA7 = v2.a(rVarF4, z16, new c0(num2, i39), o0VarK, i39);
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            h4.r rVarC9 = c2.l.C(c2.l.A(rVarA7, eVar.f97920e, 0.0f, 2), 0.0f, f14, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            h4.g.b bVar7 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2VarA = q2.a(c2.j.f22692b, bVar7, o0VarK, 48);
            iHashCode = Long.hashCode(o0VarK.U);
            i2VarA0 = o0VarK.a0();
            rVarC = h4.k.c(rVarC9, o0VarK);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar);
            } else {
                o0VarK.c();
            }
            eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarK);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarK);
            bVar2 = h5.g.a.f81813j;
            rVar4 = rVar3;
            if (o0VarK.T) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar2);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarK);
            u2 u2Var4 = u2.f22900a;
            if (num == null) {
                o0VarK.C(-80508614);
                o0VarK.g0(false);
                j24 = jD;
                c1623g2 = c1623g;
                bVar3 = bVar2;
                th3 = null;
                i25 = 0;
                aVar2 = aVar;
            } else {
                o0VarK.C(-80508613);
                t4.d dVarA4 = n5.c.a(num.intValue(), o0VarK, 0);
                o4.r rVarA8 = o4.e0.a.a(o4.e0.f128843b, jD);
                h4.r.a aVar11 = h4.r.S;
                bVar.getClass();
                h4.r rVarQ4 = x2.q(aVar11, j92.b.f97901d.f97905d);
                c1623g2 = c1623g;
                j24 = jD;
                bVar3 = bVar2;
                i25 = 0;
                th3 = null;
                aVar2 = aVar;
                y0.a(dVarA4, null, rVarQ4, null, null, 0.0f, rVarA8, o0VarK, 48, 56);
                Unit unit4 = Unit.INSTANCE;
                o0VarK.g0(false);
            }
            aVar3 = h4.r.S;
            bVar.getClass();
            float f112 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC10 = c2.l.C(aVar3, f112, 0.0f, eVar.f97921f, 0.0f, 10);
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarK, i25);
            iHashCode2 = Long.hashCode(o0VarK.U);
            i2VarA1 = o0VarK.a0();
            rVarC2 = h4.k.c(rVarC10, o0VarK);
            if (cVar != null) {
                p0.l();
                throw th3;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar2);
            } else {
                o0VarK.c();
            }
            b4.c(eVar2, zVarA, o0VarK);
            b4.c(c1623g2, i2VarA1, o0VarK);
            if (o0VarK.T) {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar3);
            } else {
                v.h.A(iHashCode2, o0VarK, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarK);
            c2.b0 b0Var4 = c2.b0.f22601a;
            j92.f fVar5 = d92.b.f58624b;
            fVar5.getClass();
            x0 x0Var4 = j92.f.f97930g;
            w5.f0.f182097b.getClass();
            x0 x0VarA7 = x0.a(x0Var4, j18, 0L, w5.f0.f182104i, qVarB, 0L, null, null, 0, 0L, null, null, 16777178);
            long j211 = j18;
            w5.q qVar6 = qVarB;
            d6.p.f57793b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, d6.p.f57795d, false, 2, 0, null, x0VarA7, o0VarK, i24 & 14, 24960, 110590);
            fVar5.getClass();
            long j212 = j19;
            x0 x0VarA8 = x0.a(j92.f.f97933j, j212, 0L, null, qVar6, 0L, null, null, 0, 0L, null, null, 16777182);
            bVar.getClass();
            mh.c(str2, c2.l.C(aVar3, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA8, o0VarK, (i24 >> 3) & 14, 0, 131068);
            o0VarK = o0VarK;
            o0VarK.g0(true);
            o0VarK.g0(true);
            j16 = j212;
            qVar2 = qVar6;
            j17 = j211;
            rVar2 = rVar4;
            jD = j24;
        } else {
            o0VarK.e();
            rVar2 = rVar;
            j16 = j8;
            j17 = j14;
        }
        p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: ds.d0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    f0.a(str, str2, num, num2, rVar2, j16, j17, jD, f14, qVar2, (p3.m) obj, iT, i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
