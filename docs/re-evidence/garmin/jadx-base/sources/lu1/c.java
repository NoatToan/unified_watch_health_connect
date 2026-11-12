package lu1;

import c2.b0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f02.c0;
import f72.t0;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.gf;
import i3.i7;
import i3.m8;
import i3.mh;
import j23.t;
import j92.f;
import java.util.ArrayList;
import java.util.List;
import k2.i;
import kotlin.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import p5.v;
import s5.x0;
import v.h;
import v62.g1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final void a(r rVar, boolean z14, boolean z15, String str, String str2, u4.d dVar, m mVar, int i14) {
        int i15;
        String str3;
        long jH;
        x0 x0VarF;
        o0 o0VarE = mVar.E(1134825801);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            str3 = str2;
            i15 |= o0VarE.B(str3) ? 16384 : 8192;
        } else {
            str3 = str2;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(dVar) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                o0VarE.C(-354090478);
                d92.b.f58623a.getClass();
                jH = d92.b.a(o0VarE).f().d();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-354089488);
                jH = fb1.c.h(d92.b.f58623a, o0VarE, false);
            }
            if (z14 || z15) {
                o0VarE.C(-354086951);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.f(f.f97933j, o0VarE);
            } else {
                o0VarE.C(-354085705);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.b(f.f97933j, o0VarE);
            }
            o0VarE.g0(false);
            x0 x0Var = x0VarF;
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            h4.d.f81522a.getClass();
            g.b bVar = h4.d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (dVar != null) {
                o0VarE.C(-801216946);
                r.a aVar2 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                r rVarC2 = l.C(aVar2, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11);
                bVar3.getClass();
                float f14 = j92.b.f97901d.f97904c * f75992b;
                g6.f.a aVar3 = g6.f.f75994b;
                i7.b(dVar, str3, x2.q(rVarC2, f14), jH, o0VarE, ((i16 >> 15) & 14) | ((i16 >> 9) & 112), 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-800885091);
                o0VarE.g0(false);
            }
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, (i16 >> 9) & 14, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(rVar, z14, z15, str, str2, dVar, i14, 5);
        }
    }

    public static final void b(i53.c cVar, Float f14, long j8, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-13583683);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.l(j8) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            float f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.c cVar2 = j92.b.f97901d;
            float f15 = ((g6.f) t.i(g6.f.a(cVar2.f97906e * f75992b), j23.s.a(g6.f.a(40), g6.f.a(80)))).f75997a;
            bVar.getClass();
            float f16 = cVar2.f97906e * f75992b * 0.075f;
            m.a aVar = m.f135153a;
            if (f14 != null) {
                o0VarE.C(-944218082);
                r rVarQ = x2.q(r.S, f15);
                Object objQ = o0VarE.q();
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new lq1.a(22);
                    o0VarE.K(objQ);
                }
                int i16 = i15 << 3;
                z72.k.d(f14.floatValue(), f16, 12.0f, (i16 & 7168) | (i16 & 112) | 1597440 | (i16 & 896), 128, j8, null, v.b(rVarQ, (e23.l) objQ), cVar, o0VarE, true);
                o0VarE.g0(false);
            } else {
                int i17 = i15;
                o0VarE.C(-943798311);
                r rVarQ2 = x2.q(r.S, f15);
                Object objQ2 = o0VarE.q();
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new lq1.a(23);
                    o0VarE.K(objQ2);
                }
                z72.k.c(v.b(rVarQ2, (e23.l) objQ2), cVar, null, null, f16, 0.0f, null, o0VarE, (i17 << 3) & 112, 220);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.m(cVar, f14, j8, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01b6  */
    public static final void c(final r rVar, final boolean z14, final boolean z15, final u4.d dVar, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final i53.c cVar, long j8, final Float f14, List list, final boolean z16, final e23.a aVar, m mVar, final int i14) {
        boolean z17;
        u4.d dVar2;
        final long j14;
        long jA;
        int i15;
        long j15;
        c82.h dVar3;
        c82.h gVar;
        c82.h hVar;
        final List<e> list2 = list;
        hb.a.p(str2, str3, str4, str5, str6);
        cVar.getClass();
        list2.getClass();
        o0 o0VarE = mVar.E(-364302152);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i16 = (i14 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            z17 = z15;
            i16 |= o0VarE.h(z17) ? 256 : 128;
        } else {
            z17 = z15;
        }
        if ((i14 & 3072) == 0) {
            dVar2 = dVar;
            i16 |= o0VarE.B(dVar2) ? 2048 : 1024;
        } else {
            dVar2 = dVar;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(str) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.B(str2) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.B(str3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.B(str4) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.B(str5) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.B(str6) ? 536870912 : 268435456;
        }
        int i17 = (o0VarE.B(cVar) ? 4 : 2) | 16 | (o0VarE.B(f14) ? 256 : 128) | (o0VarE.r(list2) ? 2048 : 1024) | (o0VarE.h(z16) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (74899 & i17) == 74898) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                c0.f67727a.getClass();
                jA = c0.a(o0VarE);
                i15 = i17 & (-113);
            } else {
                o0VarE.e();
                i15 = i17 & (-113);
                jA = j8;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            int i18 = i16;
            long jA2 = am.j.A(d92.b.f58623a, o0VarE);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            int i19 = i15;
            r rVarE = u1.n.e(rVar, jA2, i.a(j92.b.f97900c.f97911c));
            boolean z18 = aVar != null;
            boolean z19 = (i19 & 458752) == 131072;
            Object objQ = o0VarE.q();
            if (z19) {
                objQ = new m8(aVar, 17);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new m8(aVar, 17);
                    o0VarE.K(objQ);
                }
            }
            r rVarA = wz1.i.a((e23.l) objQ, rVarE, z18);
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f15 = eVar.f97920e;
            float f16 = eVar.f97920e;
            r rVarA2 = l.A(rVarA, 0.0f, f15, 1);
            j.i iVarG = r1.q2.g(bVar, j.f22691a, f16);
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarG, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar3 = r.S;
            bVar.getClass();
            a(x2.x(x2.f(l.A(aVar3, f16, 0.0f, 2), 1.0f), null, 3), z14, z17, str2, str, dVar2, o0VarE, (i18 & 1008) | ((i18 >> 6) & 7168) | (57344 & i18) | ((i18 << 6) & 458752));
            o0VarE = o0VarE;
            y3 y3Var = t1.f91490h;
            g.b bVar3 = ((double) ((g6.c) o0VarE.A(y3Var)).getF75992b()) >= 1.5d ? h4.d.a.f81533k : h4.d.a.f81534l;
            bVar.getClass();
            r rVarA3 = l.A(aVar3, f16, 0.0f, 2);
            bVar.getClass();
            s2 s2VarA = q2.a(j.i(eVar.f97919d), bVar3, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarA3, o0VarE);
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (z16) {
                o0VarE.C(-1282233896);
                float f75992b = ((g6.c) o0VarE.A(y3Var)).getF75992b();
                bVar.getClass();
                float f17 = ((g6.f) t.i(g6.f.a(j92.b.f97901d.f97906e * f75992b), j23.s.a(g6.f.a(40), g6.f.a(80)))).f75997a;
                s62.a.f157643a.getClass();
                u4.d dVarA = g1.a(t62.b.f162798a);
                bVar.getClass();
                i7.b(dVarA, null, x2.q(l.C(aVar3, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11), f17), d92.b.a(o0VarE).f().e(), o0VarE, 48, 0);
                o0VarE = o0VarE;
                o0VarE.g0(false);
                j15 = jA;
            } else {
                o0VarE.C(-1281706121);
                j15 = jA;
                b(cVar, f14, j15, o0VarE, (i19 & 14) | ((i19 >> 3) & 112));
                o0VarE.g0(false);
            }
            g02.e0.a(str3, str5, null, null, false, false, true, str4, str6, null, null, null, o0VarE, ((i18 >> 18) & 14) | 1597440 | ((i18 >> 21) & 112) | (i18 & 29360128) | (234881024 & (i18 >> 3)), 0, 3628);
            o0VarE.g0(true);
            if (list.isEmpty() || z16) {
                list2 = list;
                o0VarE.C(813642228);
                o0VarE.g0(false);
            } else {
                o0VarE.C(813229959);
                list2 = list;
                ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
                for (e eVar3 : list2) {
                    if (eVar3.f115007c) {
                        dVar3 = new c82.h.a(null, 1, null);
                    } else if (eVar3.f115008d || eVar3.f115013i) {
                        s62.a.f157643a.getClass();
                        dVar3 = new c82.h.d(t0.a(t62.c.f162799a));
                    } else {
                        m52.k kVar = eVar3.f115005a;
                        if ((kVar != null ? kVar.f116772h : null) != null) {
                            gVar = new c82.h.d(kVar.f116772h);
                        } else {
                            Integer num = eVar3.f115011g;
                            if (num != null) {
                                gVar = new c82.h.g(num.intValue());
                            } else {
                                dVar3 = c82.h.f.f25735a;
                            }
                        }
                        hVar = gVar;
                        arrayList.add(new c82.i(g22.k.z(eVar3.f115006b).b(), hVar, false, 4, null));
                    }
                    hVar = dVar3;
                    arrayList.add(new c82.i(g22.k.z(eVar3.f115006b).b(), hVar, false, 4, null));
                }
                List listB1 = h0.b1(arrayList);
                r.a aVar4 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar4 = d92.b.f58625c;
                bVar4.getClass();
                j92.e eVar4 = j92.b.f97899b;
                r rVarA4 = l.A(aVar4, eVar4.f97920e, 0.0f, 2);
                bVar4.getClass();
                c82.g.c(x2.f(l.C(rVarA4, 0.0f, eVar4.f97918c, 0.0f, 0.0f, 13), 1.0f), listB1, o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
            j14 = j15;
        } else {
            o0VarE.e();
            j14 = j8;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: lu1.b
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    c.c(rVar, z14, z15, dVar, str, str2, str3, str4, str5, str6, cVar, j14, f14, list2, z16, aVar, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
