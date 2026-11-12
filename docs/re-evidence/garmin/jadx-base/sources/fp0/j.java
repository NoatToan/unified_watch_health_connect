package fp0;

import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import ep0.c0;
import fb1.d0;
import fo.x;
import h4.r;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mh;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f73180a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f73180a = 50;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x045f  */
    /* JADX WARN: Code duplicated, block: B:190:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:193:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:195:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:197:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:198:0x0500  */
    /* JADX WARN: Code duplicated, block: B:202:0x0509  */
    public static final void a(final r rVar, final u4.d dVar, final long j8, final String str, final String str2, String str3, String str4, String str5, c0 c0Var, p pVar, e23.a aVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        int i17;
        String str6;
        int i18;
        int i19;
        int i24;
        char c14;
        String str7;
        final String str8;
        final c0 c0Var2;
        final p pVar2;
        final String str9;
        final e23.a aVar2;
        p pVar3;
        e23.a aVar3;
        p3.m.a.C2565a c2565a;
        boolean z14;
        boolean z15;
        Object objQ;
        rVar.getClass();
        str.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(1914116865);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i25 = i16 | (o0VarE.B(dVar) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024);
        if ((i14 & 24576) == 0) {
            i25 |= o0VarE.B(str2) ? 16384 : 8192;
        }
        int i26 = i15 & 32;
        if (i26 != 0) {
            i17 = i25 | 196608;
        } else {
            i17 = i25 | (o0VarE.B(str3) ? 131072 : 65536);
        }
        int i27 = i15 & 64;
        if (i27 != 0) {
            i17 |= 1572864;
            str6 = str4;
        } else {
            str6 = str4;
            if ((i14 & 1572864) == 0) {
                i17 |= o0VarE.B(str6) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        int i28 = i15 & 128;
        if (i28 != 0) {
            i18 = i17 | 12582912;
        } else {
            i18 = i17 | (o0VarE.B(str5) ? 8388608 : 4194304);
        }
        int i29 = i15 & 256;
        if (i29 != 0) {
            i19 = i18 | 100663296;
        } else {
            i19 = i18 | (o0VarE.B(c0Var) ? 67108864 : 33554432);
        }
        int i30 = i15 & 512;
        if (i30 != 0) {
            i30 = i30;
            i24 = i19 | C.ENCODING_PCM_32BIT;
        } else {
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                i19 |= o0VarE.r(pVar) ? 536870912 : 268435456;
            }
            i24 = i19;
        }
        int i34 = i15 & 1024;
        if (i34 != 0) {
            c14 = 6;
        } else {
            c14 = o0VarE.r(aVar) ? (char) 4 : (char) 2;
        }
        if (o0VarE.n(i24 & 1, ((i24 & 306783379) == 306783378 && (c14 & 3) == 2) ? false : true)) {
            String str10 = i26 != 0 ? null : str3;
            if (i27 != 0) {
                str6 = null;
            }
            String str11 = i28 != 0 ? null : str5;
            c0 c0Var3 = i29 != 0 ? null : c0Var;
            if (i30 != 0) {
                a.f73142a.getClass();
                pVar3 = a.f73143b;
            } else {
                pVar3 = pVar;
            }
            p3.m.a aVar4 = p3.m.f135153a;
            if (i34 != 0) {
                Object objQ2 = o0VarE.q();
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new d0(20);
                    o0VarE.K(objQ2);
                }
                aVar3 = (e23.a) objQ2;
            } else {
                aVar3 = aVar;
            }
            x1 x1Var = n.f135158a;
            String str12 = str10;
            r rVarF = x2.f(rVar, 1.0f);
            Object objQ3 = o0VarE.q();
            aVar4.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ3 == c2565a2) {
                objQ3 = new x(9);
                o0VarE.K(objQ3);
            }
            r rVarC = v.c((e23.l) objQ3, rVarF, true);
            boolean z16 = (c14 & 14) == 4;
            Object objQ4 = o0VarE.q();
            if (z16 || objQ4 == c2565a2) {
                objQ4 = new eu.a(aVar3, 17);
                o0VarE.K(objQ4);
            }
            r rVarD = w.d(rVarC, false, null, null, (e23.a) objQ4, 15);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            e23.a aVar5 = aVar3;
            float f15 = eVar.f97917b;
            r rVarY = c2.l.y(rVarD, f14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            c0 c0Var4 = c0Var3;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar7 = r.S;
            r rVarD2 = x2.d(aVar7, 1.0f);
            h4.g.b bVar3 = h4.d.a.f81534l;
            String str13 = str6;
            c2.j.C0343j c0343j = c2.j.f22692b;
            s2 s2VarA = q2.a(c0343j, bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarD2, o0VarE);
            if (cVar == 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            r rVarA = u2Var.a(aVar7, 1.0f, true);
            bVar.getClass();
            s2 s2VarA2 = q2.a(c2.j.i(f15), bVar3, o0VarE, 48);
            p pVar4 = pVar3;
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            r rVarC4 = h4.k.c(rVarA, o0VarE);
            if (cVar == 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(fVar, rVarC4, o0VarE);
            bVar.getClass();
            j92.c cVar2 = j92.b.f97901d;
            r rVarQ = x2.q(aVar7, cVar2.f97905d);
            bVar.getClass();
            float f16 = 2;
            g6.f.a aVar8 = g6.f.f75994b;
            i7.b(dVar, null, c2.l.y(rVarQ, f15 / f16), j8, o0VarE, ((i24 << 3) & 7168) | ((i24 >> 3) & 14) | 48, 0);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97932i;
            mh.c(str, aVar7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, ((i24 >> 9) & 14) | 48, 0, 131068);
            o0VarE.g0(true);
            r rVarA2 = u2Var.a(aVar7, 1.0f, true);
            bVar.getClass();
            r rVarC5 = c2.l.C(rVarA2, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
            s2 s2VarA3 = q2.a(c0343j, bVar3, o0VarE, 48);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            r rVarC6 = h4.k.c(rVarC5, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA3, o0VarE);
            b4.c(c1623g, i2VarA3, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
            }
            b4.c(fVar, rVarC6, o0VarE);
            bVar.getClass();
            r rVarC7 = c2.l.C(aVar7, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
            boolean z17 = (i24 & 458752) == 131072;
            Object objQ5 = o0VarE.q();
            if (z17) {
                c2565a = c2565a2;
            } else {
                c2565a = c2565a2;
                if (objQ5 != c2565a) {
                    str7 = str12;
                }
                r rVarC8 = v.c((e23.l) objQ5, rVarC7, false);
                fVar2.getClass();
                mh.c(str2, rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i24 >> 12) & 14, 0, 131068);
                j70.x.a aVar9 = j70.x.f97667d;
                Integer numValueOf = c0Var4 != null ? Integer.valueOf(c0Var4.f64870a) : null;
                aVar9.getClass();
                j70.x xVarA = j70.x.a.a(numValueOf);
                o0VarE.C(-938332133);
                if (c0Var4 != null || xVarA == null) {
                    z14 = false;
                } else {
                    t4.d dVarA = n5.c.a(xVarA.f97674c, o0VarE, 0);
                    long jY = sn.a.y(o0VarE);
                    r rVarC9 = x2.c(aVar7, 1.0f);
                    bVar.getClass();
                    r rVarQ2 = x2.q(rVarC9, cVar2.f97904c);
                    bVar.getClass();
                    z14 = false;
                    i7.a(dVarA, null, c2.l.y(rVarQ2, f15 / f16), jY, o0VarE, 48, 0);
                    Unit unit = Unit.INSTANCE;
                }
                o0VarE.g0(z14);
                if (str13 == null) {
                    o0VarE.C(977057502);
                    o0VarE.g0(z14);
                } else {
                    o0VarE.C(977057503);
                    c2.l.f(u2Var.a(aVar7, 1.0f, true), o0VarE);
                    bVar.getClass();
                    r rVarC10 = c2.l.C(aVar7, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
                    if ((i24 & 29360128) == 8388608) {
                        z15 = true;
                    } else {
                        z15 = z14;
                    }
                    objQ = o0VarE.q();
                    if (z15 || objQ == c2565a) {
                        objQ = new c(str11, 4);
                        o0VarE.K(objQ);
                    }
                    r rVarC11 = v.c((e23.l) objQ, rVarC10, z14);
                    fVar2.getClass();
                    mh.c(str13, rVarC11, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i24 >> 18) & 14, 0, 131068);
                    Unit unit2 = Unit.INSTANCE;
                    o0VarE.g0(z14);
                }
                c2.l.f(u2Var.a(aVar7, 1.0f, true), o0VarE);
                e5.r((i24 >> 27) & 14, pVar4, o0VarE, true, true);
                o0VarE.g0(true);
                str8 = str11;
                pVar2 = pVar4;
                str9 = str13;
                c0Var2 = c0Var4;
                aVar2 = aVar5;
            }
            str7 = str12;
            objQ5 = new c(str7, 3);
            o0VarE.K(objQ5);
            r rVarC12 = v.c((e23.l) objQ5, rVarC7, false);
            fVar2.getClass();
            mh.c(str2, rVarC12, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i24 >> 12) & 14, 0, 131068);
            j70.x.a aVar10 = j70.x.f97667d;
            if (c0Var4 != null) {
            }
            aVar10.getClass();
            j70.x xVarA2 = j70.x.a.a(numValueOf);
            o0VarE.C(-938332133);
            if (c0Var4 != null) {
                z14 = false;
            } else {
                z14 = false;
            }
            o0VarE.g0(z14);
            if (str13 == null) {
                o0VarE.C(977057502);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(977057503);
                c2.l.f(u2Var.a(aVar7, 1.0f, true), o0VarE);
                bVar.getClass();
                r rVarC13 = c2.l.C(aVar7, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
                if ((i24 & 29360128) == 8388608) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                objQ = o0VarE.q();
                if (z15) {
                    objQ = new c(str11, 4);
                    o0VarE.K(objQ);
                } else {
                    objQ = new c(str11, 4);
                    o0VarE.K(objQ);
                }
                r rVarC14 = v.c((e23.l) objQ, rVarC13, z14);
                fVar2.getClass();
                mh.c(str13, rVarC14, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, (i24 >> 18) & 14, 0, 131068);
                Unit unit3 = Unit.INSTANCE;
                o0VarE.g0(z14);
            }
            c2.l.f(u2Var.a(aVar7, 1.0f, true), o0VarE);
            e5.r((i24 >> 27) & 14, pVar4, o0VarE, true, true);
            o0VarE.g0(true);
            str8 = str11;
            pVar2 = pVar4;
            str9 = str13;
            c0Var2 = c0Var4;
            aVar2 = aVar5;
        } else {
            o0VarE.e();
            str7 = str3;
            str8 = str5;
            c0Var2 = c0Var;
            pVar2 = pVar;
            str9 = str6;
            aVar2 = aVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final String str14 = str7;
            p2VarI0.f135219d = new p() { // from class: fp0.i
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    j.a(rVar, dVar, j8, str, str2, str14, str9, str8, c0Var2, pVar2, aVar2, (p3.m) obj, iT, i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static r b(r rVar, float f14) {
        r rVarR;
        float f15 = 340;
        g6.f.a aVar = g6.f.f75994b;
        rVar.getClass();
        float f16 = f73180a;
        if (f14 <= 1.0f || f14 > 1.5f) {
            rVarR = f14 > 1.5f ? x2.r(rVar, f15 * 2, f16 * f14) : x2.r(rVar, f15, f16);
        } else {
            rVarR = x2.r(rVar, f15, f16 * f14);
        }
        return rVar.then(rVarR);
    }
}
