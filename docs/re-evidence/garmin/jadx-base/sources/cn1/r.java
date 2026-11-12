package cn1;

import c2.a0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import h5.e0;
import i3.e5;
import kotlin.t1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class r {
    public static final void a(a0 a0Var, String str, String str2, p3.m mVar, int i14) {
        int i15;
        a0Var.getClass();
        str.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(863860695);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            c(null, str, str2, o0VarE, i15 & 1008, 1);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(a0Var, str, str2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d4  */
    public static final void b(a0 a0Var, String str, String str2, String str3, String str4, String str5, String str6, p3.m mVar, int i14) {
        int i15;
        j92.e eVar;
        h5.g.a.f fVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        a0Var.getClass();
        str.getClass();
        str2.getClass();
        str4.getClass();
        str6.getClass();
        o0 o0VarE = mVar.E(-1975846406);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.B(str) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str5) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(str6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (599185 & i16) != 599184)) {
            x1 x1Var = p3.n.f135158a;
            if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() < 1.5d) {
                o0VarE.C(86786684);
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                h4.d.f81522a.getClass();
                h4.g.b bVar2 = h4.d.a.f81533k;
                h4.r.a aVar = h4.r.S;
                s2 s2VarA = q2.a(iVarI, bVar2, o0VarE, 48);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(aVar, o0VarE);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar3 = h5.g.a.f81810g;
                b4.c(eVar3, s2VarA, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA1, o0VarE);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    eVar = eVar2;
                } else {
                    eVar = eVar2;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, o0VarE);
                    u2 u2Var = u2.f22900a;
                    c(u2Var.a(aVar, 0.5f, true), str, str2, o0VarE, i16 & 1008, 0);
                    h4.r rVarA = u2Var.a(aVar, 0.5f, true);
                    bVar.getClass();
                    zVarA = y.a(c2.j.i(eVar.f97920e), h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarA, o0VarE);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar3, zVarA, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    b0 b0Var = b0.f22601a;
                    h02.d.c(null, str3, str4, o0VarE, (i16 >> 6) & 1008, 1);
                    h02.d.c(null, str5, str6, o0VarE, (i16 >> 12) & 1008, 1);
                    e5.u(o0VarE, true, true, false);
                }
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var2 = u2.f22900a;
                c(u2Var2.a(aVar, 0.5f, true), str, str2, o0VarE, i16 & 1008, 0);
                h4.r rVarA2 = u2Var2.a(aVar, 0.5f, true);
                bVar.getClass();
                zVarA = y.a(c2.j.i(eVar.f97920e), h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar3, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var2 = b0.f22601a;
                h02.d.c(null, str3, str4, o0VarE, (i16 >> 6) & 1008, 1);
                h02.d.c(null, str5, str6, o0VarE, (i16 >> 12) & 1008, 1);
                e5.u(o0VarE, true, true, false);
            } else {
                o0VarE.C(87399244);
                c(null, str, str2, o0VarE, i16 & 1008, 1);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar4 = j92.b.f97899b;
                c2.l.f(x2.q(aVar3, eVar4.f97920e), o0VarE);
                h02.d.c(null, str3, str4, o0VarE, (i16 >> 6) & 1008, 1);
                bVar4.getClass();
                c2.l.f(x2.q(aVar3, eVar4.f97920e), o0VarE);
                h02.d.c(null, str5, str6, o0VarE, (i16 >> 12) & 1008, 1);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o((Object) a0Var, (Object) str, (Object) str2, (Object) str3, (Object) str4, (Object) str5, (Object) str6, i14, 0);
        }
    }

    public static final void c(h4.r rVar, String str, String str2, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        h4.r rVar3;
        o0 o0VarK = com.nimbusds.jose.shaded.gson.internal.a.k(str, str2, mVar, 900085817);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarK.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarK.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarK.B(str2) ? 256 : 128;
        }
        if (o0VarK.n(i16 & 1, (i16 & 147) != 146)) {
            h4.r rVar4 = i17 != 0 ? h4.r.S : rVar2;
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarK, 0);
            int iHashCode = Long.hashCode(o0VarK.U);
            i2 i2VarA0 = o0VarK.a0();
            h4.r rVarC = h4.k.c(rVar4, o0VarK);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarK.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarK.z();
            if (o0VarK.T) {
                o0VarK.M(aVar);
            } else {
                o0VarK.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarK);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarK);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarK.T || !p005kotlin.jvm.internal.s.g(o0VarK.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarK, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarK);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            g02.c.a(str, null, 0L, null, 0, false, 0, d92.c.b(j92.f.f97928e, o0VarK), 0.0d, o0VarK, (i16 >> 3) & 14, 382);
            fVar.getClass();
            g02.c.a(str2, null, 0L, null, 0, false, 0, d92.c.f(j92.f.f97932i, o0VarK), 0.0d, o0VarK, (i16 >> 6) & 14, 382);
            o0VarK.g0(true);
            rVar3 = rVar4;
        } else {
            o0VarK.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarK.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(rVar3, str, str2, i14, i15, 0);
        }
    }
}
