package kg0;

import am.j;
import c2.b0;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.C;
import f5.z0;
import g6.f;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.e5;
import i3.mh;
import i3.v2;
import java.util.ArrayList;
import java.util.Iterator;
import k2.i;
import kb0.p;
import kotlin.t1;
import l72.g3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.c;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;
import u1.y0;
import u4.d;
import v.h;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:143:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:159:0x027a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0281  */
    /* JADX WARN: Code duplicated, block: B:162:0x0285  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:176:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:181:0x030c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0324 A[LOOP:0: B:183:0x031e->B:185:0x0324, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x035e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0366  */
    /* JADX WARN: Code duplicated, block: B:192:0x0390  */
    /* JADX WARN: Code duplicated, block: B:194:0x0397  */
    /* JADX WARN: Code duplicated, block: B:195:0x039b  */
    /* JADX WARN: Code duplicated, block: B:200:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:205:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:209:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:211:0x0415  */
    /* JADX WARN: Code duplicated, block: B:213:0x0440  */
    /* JADX WARN: Code duplicated, block: B:216:0x047a  */
    /* JADX WARN: Code duplicated, block: B:218:0x0498  */
    /* JADX WARN: Code duplicated, block: B:220:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:222:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:224:0x04fe  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final r rVar, final Boolean bool, final ArrayList arrayList, final String str, final d dVar, final long j8, final long j14, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final boolean z14, final String str8, final Integer num, final e23.a aVar, m mVar, final int i14, final int i15) {
        int i16;
        int i17;
        c<?> cVar;
        g.a.f fVar;
        r.a aVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        Object objQ;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        Iterator it;
        r.a aVar3;
        h4.g.b bVar;
        s2 s2VarF;
        int iHashCode3;
        i2 i2VarA2;
        r rVarC3;
        e0.a aVar4;
        g.a.b bVar2;
        Object objQ2;
        m.a.C2565a c2565a;
        p1 p1Var;
        boolean z15;
        boolean z16;
        x0 x0VarB;
        Object objQ3;
        boolean z17;
        dVar.getClass();
        o0 o0VarE = mVar.E(2018304815);
        c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(bool) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(arrayList) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(dVar) ? 16384 : 8192;
        }
        int i18 = i16;
        if ((i14 & 196608) == 0) {
            i18 |= o0VarE.l(j8) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i18 |= o0VarE.l(j14) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i18 |= o0VarE.B(str2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i18 |= o0VarE.B(str3) ? 67108864 : 33554432;
        }
        int i19 = i18 | C.ENCODING_PCM_32BIT;
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.B(str4) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(str5) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(str6) ? 256 : 128;
        }
        int i24 = i17 | 3072;
        if ((i15 & 24576) == 0) {
            i24 |= o0VarE.B(str7) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i24 |= o0VarE.h(z14) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i24 |= o0VarE.B(str8) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i24 |= o0VarE.B(num) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i24 |= o0VarE.r(aVar) ? 67108864 : 33554432;
        }
        int i25 = i24;
        if (o0VarE.n(i19 & 1, ((i19 & 306783379) == 306783378 && (i25 & 38347923) == 38347922) ? false : true)) {
            x1 x1Var = n.f135158a;
            long jA = j.A(d92.b.f58623a, o0VarE);
            float f14 = 8;
            f.a aVar5 = f.f75994b;
            r rVarE = u1.n.e(rVar, jA, i.a(f14));
            boolean z18 = aVar != null;
            boolean z19 = (i25 & 234881024) == 67108864;
            Object objQ4 = o0VarE.q();
            m.a aVar6 = m.f135153a;
            if (z19) {
                objQ4 = new p(aVar, 1);
                o0VarE.K(objQ4);
            } else {
                aVar6.getClass();
                if (objQ4 == m.a.f135155b) {
                    objQ4 = new p(aVar, 1);
                    o0VarE.K(objQ4);
                }
            }
            r rVarD = w.d(rVarE, z18, null, null, (e23.a) objQ4, 14);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            r rVarC4 = k.c(rVarD, o0VarE);
            g.V.getClass();
            e0.a aVar7 = g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            g.a.e eVar = g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA3, o0VarE);
            g.a.b bVar3 = g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC4, o0VarE);
                u uVar = u.f22885a;
                c2.j.f22691a.getClass();
                c2.j.i iVarI = c2.j.i(f14);
                aVar2 = r.S;
                r rVarF = x2.f(l.y(aVar2, 16), 1.0f);
                zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarF, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar3);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                objQ = o0VarE.q();
                aVar6.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new kb0.d(17);
                    o0VarE.K(objQ);
                }
                r rVarF2 = x2.f(v.c((e23.l) objQ, aVar2, false), 1.0f);
                s2VarA = q2.a(c2.j.i(f14), h4.d.a.f81534l, o0VarE, 54);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarF2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                o0VarE.C(1243189912);
                it = arrayList.iterator();
                while (it.hasNext()) {
                    g3.a(0, 2, null, (String) it.next(), o0VarE);
                }
                o0VarE.g0(false);
                aVar3 = r.S;
                l.f(u2Var.a(aVar3, 1.0f, true), o0VarE);
                b((i25 >> 18) & 126, num, str8, o0VarE);
                o0VarE.g0(true);
                if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.5d) {
                    h4.d.f81522a.getClass();
                    bVar = h4.d.a.f81533k;
                } else {
                    h4.d.f81522a.getClass();
                    bVar = h4.d.a.f81534l;
                }
                s2VarF = hb.a.f(c2.j.f22691a, 12, bVar, o0VarE, 6);
                x1 x1Var2 = n.f135158a;
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = k.c(aVar3, o0VarE);
                g.V.getClass();
                aVar4 = g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, s2VarF, o0VarE);
                b4.c(g.a.f81809f, i2VarA2, o0VarE);
                bVar2 = g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                    h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(g.a.f81807d, rVarC3, o0VarE);
                u2 u2Var2 = u2.f22900a;
                objQ2 = o0VarE.q();
                c2565a = m.a.f135155b;
                if (objQ2 == c2565a) {
                    if (str != null) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ2 = hb.a.n(z17, o0VarE);
                }
                p1Var = (p1) objQ2;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-70188076);
                    r rVarQ = x2.q(aVar3, 40);
                    k2.h hVar = i.f102406a;
                    r rVarB = l4.k.b(rVarQ, hVar);
                    d92.b.f58623a.getClass();
                    r rVarB2 = u1.q.b(1, d92.b.a(o0VarE).j().d(), rVarB, hVar);
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new v2(p1Var, 26);
                        o0VarE.K(objQ3);
                    }
                    z16 = true;
                    z15 = false;
                    jf.r.a(str, "", rVarB2, (e23.l) objQ3, null, null, null, o0VarE, ((i19 >> 9) & 14) | 24624, 2024);
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    z16 = true;
                    o0VarE.C(-69581592);
                    int i26 = i19 >> 9;
                    g02.i.a(null, dVar, j8, j14, 40, 0.0f, null, o0VarE, (i26 & 112) | 24576 | (i26 & 896) | (i26 & 7168), 225);
                    o0VarE.g0(false);
                }
                boolean z24 = !z14;
                if (s.g(bool, Boolean.TRUE)) {
                    o0VarE.C(1660353384);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.f(d92.c.e(j92.f.f97930g), o0VarE);
                } else {
                    o0VarE.C(1660354886);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
                }
                o0VarE.g0(z15);
                int i27 = i25 << 18;
                g02.e0.a(str2, str3, null, str4, z14, false, z24, str5, str6, null, str7, x0VarB, o0VarE, ((i19 >> 21) & 1022) | ((i25 << 9) & 7168) | ((i25 >> 3) & 57344) | (29360128 & i27) | (i27 & 234881024) | (i27 & 1879048192), (i25 >> 12) & 14, 32);
                o0VarE = o0VarE;
                e5.u(o0VarE, z16, z16, z16);
            }
            h.A(iHashCode4, o0VarE, iHashCode4, bVar3);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC4, o0VarE);
            u uVar2 = u.f22885a;
            c2.j.f22691a.getClass();
            c2.j.i iVarI2 = c2.j.i(f14);
            aVar2 = r.S;
            r rVarF3 = x2.f(l.y(aVar2, 16), 1.0f);
            zVarA = y.a(iVarI2, h4.d.a.f81536n, o0VarE, 6);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarF3, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            objQ = o0VarE.q();
            aVar6.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new kb0.d(17);
                o0VarE.K(objQ);
            }
            r rVarF4 = x2.f(v.c((e23.l) objQ, aVar2, false), 1.0f);
            s2VarA = q2.a(c2.j.i(f14), h4.d.a.f81534l, o0VarE, 54);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarF4, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            } else {
                h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var3 = u2.f22900a;
            o0VarE.C(1243189912);
            it = arrayList.iterator();
            while (it.hasNext()) {
                g3.a(0, 2, null, (String) it.next(), o0VarE);
            }
            o0VarE.g0(false);
            aVar3 = r.S;
            l.f(u2Var3.a(aVar3, 1.0f, true), o0VarE);
            b((i25 >> 18) & 126, num, str8, o0VarE);
            o0VarE.g0(true);
            if (((g6.c) o0VarE.A(t1.f91490h)).getF75992b() > 1.5d) {
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81533k;
            } else {
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81534l;
            }
            s2VarF = hb.a.f(c2.j.f22691a, 12, bVar, o0VarE, 6);
            x1 x1Var3 = n.f135158a;
            iHashCode3 = Long.hashCode(o0VarE.U);
            i2VarA2 = o0VarE.a0();
            rVarC3 = k.c(aVar3, o0VarE);
            g.V.getClass();
            aVar4 = g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, s2VarF, o0VarE);
            b4.c(g.a.f81809f, i2VarA2, o0VarE);
            bVar2 = g.a.f81813j;
            if (o0VarE.T) {
                h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            } else {
                h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            }
            b4.c(g.a.f81807d, rVarC3, o0VarE);
            u2 u2Var4 = u2.f22900a;
            objQ2 = o0VarE.q();
            c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                if (str != null) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ2 = hb.a.n(z17, o0VarE);
            }
            p1Var = (p1) objQ2;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(-70188076);
                r rVarQ2 = x2.q(aVar3, 40);
                k2.h hVar2 = i.f102406a;
                r rVarB3 = l4.k.b(rVarQ2, hVar2);
                d92.b.f58623a.getClass();
                r rVarB4 = u1.q.b(1, d92.b.a(o0VarE).j().d(), rVarB3, hVar2);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new v2(p1Var, 26);
                    o0VarE.K(objQ3);
                }
                z16 = true;
                z15 = false;
                jf.r.a(str, "", rVarB4, (e23.l) objQ3, null, null, null, o0VarE, ((i19 >> 9) & 14) | 24624, 2024);
                o0VarE.g0(false);
            } else {
                z15 = false;
                z16 = true;
                o0VarE.C(-69581592);
                int i28 = i19 >> 9;
                g02.i.a(null, dVar, j8, j14, 40, 0.0f, null, o0VarE, (i28 & 112) | 24576 | (i28 & 896) | (i28 & 7168), 225);
                o0VarE.g0(false);
            }
            boolean z25 = !z14;
            if (s.g(bool, Boolean.TRUE)) {
                o0VarE.C(1660353384);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.f(d92.c.e(j92.f.f97930g), o0VarE);
            } else {
                o0VarE.C(1660354886);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            }
            o0VarE.g0(z15);
            int i29 = i25 << 18;
            g02.e0.a(str2, str3, null, str4, z14, false, z25, str5, str6, null, str7, x0VarB, o0VarE, ((i19 >> 21) & 1022) | ((i25 << 9) & 7168) | ((i25 >> 3) & 57344) | (29360128 & i29) | (i29 & 234881024) | (i29 & 1879048192), (i25 >> 12) & 14, 32);
            o0VarE = o0VarE;
            e5.u(o0VarE, z16, z16, z16);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: kg0.a
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    int iT2 = p0.t(i15);
                    b.a(rVar, bool, arrayList, str, dVar, j8, j14, str2, str3, str4, str5, str6, str7, z14, str8, num, aVar, (m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(int i14, Integer num, String str, m mVar) {
        int i15;
        int i16;
        int i17;
        boolean z14;
        r.a aVar;
        o0 o0VarE = mVar.E(1684776897);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(num) ? 32 : 16;
        }
        int i18 = i15;
        if (o0VarE.n(i18 & 1, (i18 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j jVar = c2.j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97917b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(f14);
            r.a aVar2 = r.S;
            s2 s2VarA = q2.a(iVarI, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar2, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (str != null) {
                o0VarE.C(-1073649628);
                d92.b.f58624b.getClass();
                aVar = aVar2;
                i16 = 14;
                i17 = 16;
                z14 = false;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, i18 & 14, 0, 131070);
                o0VarE.g0(false);
            } else {
                i16 = 14;
                i17 = 16;
                z14 = false;
                aVar = aVar2;
                o0VarE.C(-1073564099);
                o0VarE.g0(false);
            }
            if (num != null) {
                o0VarE = o0VarE;
                o0VarE.C(-1073512143);
                t4.d dVarA = n5.c.a(num.intValue(), o0VarE, (i18 >> 3) & 14);
                f.a aVar4 = f.f75994b;
                y0.a(dVarA, "", x2.q(aVar, i17), null, null, 0.0f, null, o0VarE, 432, 120);
                o0VarE.g0(z14);
            } else {
                o0VarE = o0VarE;
                o0VarE.C(-1073398435);
                o0VarE.g0(z14);
            }
            o0VarE.g0(true);
        } else {
            i16 = 14;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(num, i14, i16, str);
        }
    }
}
