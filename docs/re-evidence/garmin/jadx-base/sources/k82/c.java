package k82;

import a2.j;
import a42.a0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import c2.q;
import c2.q1;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import da0.b0;
import e23.p;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.e5;
import i3.fb;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import k2.i;
import l72.b2;
import l72.c2;
import l72.f0;
import l72.v2;
import o4.m1;
import o72.x3;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.h0;
import p5.k0;
import p5.v;
import s5.x0;
import u1.w;
import u1.y0;
import v.h;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final void a(int i14, e23.a aVar, String str, m mVar, u4.d dVar) {
        int i15;
        e23.a aVar2;
        String str2;
        u4.d dVar2;
        o0 o0Var;
        o0 o0VarE = mVar.E(527626273);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            r.a aVar3 = r.S;
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            r rVarY = l.y(aVar3, j92.b.f97899b.f97919d);
            bVar.getClass();
            j92.c cVar = j92.b.f97901d;
            r rVarQ = x2.q(rVarY, cVar.f97905d);
            p5.l.f136032b.getClass();
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            bVar.getClass();
            float f14 = cVar.f97905d / 2;
            g6.f.a aVar4 = g6.f.f75994b;
            aVar2 = aVar;
            str2 = str;
            dVar2 = dVar;
            o0Var = o0VarE;
            i7.b(dVar2, str2, w.b(rVarQ, (j) objQ, fb.a(f14, 4, 0L, false), true, null, p5.l.a(0), aVar, 8), jD, o0Var, (i16 & 14) | ((i16 >> 3) & 112), 0);
        } else {
            aVar2 = aVar;
            str2 = str;
            dVar2 = dVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b0(aVar2, dVar2, str2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x0182  */
    /* JADX WARN: Code duplicated, block: B:66:0x0193  */
    /* JADX WARN: Code duplicated, block: B:68:0x0198  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void b(r rVar, u4.d dVar, e23.a aVar, u4.d dVar2, e23.a aVar2, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        u4.d dVar3;
        int i17;
        e23.a aVar3;
        int i18;
        boolean z14;
        e23.a aVar4;
        r rVar3;
        u4.d dVar4;
        e23.a aVar5;
        p2 p2VarI0;
        r rVar4;
        u4.d dVar5;
        e23.a aVar6;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar7;
        g.a.b bVar;
        boolean z15;
        Object objQ;
        aVar.getClass();
        o0 o0VarE = mVar.E(223220629);
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        }
        int i24 = i16 | (o0VarE.B(dVar) ? 32 : 16);
        int i25 = i15 & 8;
        if (i25 != 0) {
            i17 = i24 | 3072;
            dVar3 = dVar2;
        } else {
            dVar3 = dVar2;
            i17 = i24 | (o0VarE.B(dVar3) ? 2048 : 1024);
        }
        int i26 = i15 & 16;
        if (i26 == 0) {
            if ((i14 & 24576) == 0) {
                aVar3 = aVar2;
                i17 |= o0VarE.r(aVar3) ? 16384 : 8192;
            }
            i18 = i17 | 196608;
            if ((74899 & i18) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                if (i19 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i25 != 0) {
                    dVar5 = null;
                } else {
                    dVar5 = dVar3;
                }
                if (i26 != 0) {
                    objQ = o0VarE.q();
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new k62.l(7);
                        o0VarE.K(objQ);
                    }
                    aVar3 = (e23.a) objQ;
                }
                x1 x1Var = n.f135158a;
                r rVarE = l.E(rVar4, q1.Min);
                d92.b.f58623a.getClass();
                long j8 = d92.b.a(o0VarE).e().f63500e;
                float f14 = 8;
                g6.f.a aVar8 = g6.f.f75994b;
                float f15 = 4;
                aVar6 = aVar3;
                r rVarE2 = u1.n.e(v2.c(rVarE, j8, 0.25f, f14, f15, f15, 0, o0VarE, 1797504, 0), ds.e0.f(o0VarE), i.a(f14));
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarE2, o0VarE);
                g.V.getClass();
                aVar7 = g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(g.a.f81810g, zVarA, o0VarE);
                b4.c(g.a.f81809f, i2VarA0, o0VarE);
                bVar = g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                aVar4 = aVar;
                a((i18 >> 3) & 126, aVar4, null, o0VarE, dVar);
                if (dVar5 != null) {
                    o0VarE.C(-45932286);
                    z15 = true;
                    l.f(u1.n.e(x2.f(x2.h(r.S, 1), 1.0f), sn.a.c(o0VarE), m1.f128891a), o0VarE);
                    a((i18 >> 9) & 126, aVar6, null, o0VarE, dVar5);
                    o0VarE.g0(false);
                } else {
                    z15 = true;
                    o0VarE.C(-45531549);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
                dVar4 = dVar5;
                aVar5 = aVar6;
                rVar3 = rVar4;
            } else {
                aVar4 = aVar;
                o0VarE.e();
                rVar3 = rVar2;
                dVar4 = dVar3;
                aVar5 = aVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a0(rVar3, dVar, aVar4, dVar4, aVar5, i14, i15);
            }
        }
        i17 |= 24576;
        aVar3 = aVar2;
        i18 = i17 | 196608;
        if ((74899 & i18) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i18 & 1, z14)) {
            if (i19 != 0) {
                rVar4 = r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i25 != 0) {
                dVar5 = null;
            } else {
                dVar5 = dVar3;
            }
            if (i26 != 0) {
                objQ = o0VarE.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k62.l(7);
                    o0VarE.K(objQ);
                }
                aVar3 = (e23.a) objQ;
            }
            x1 x1Var2 = n.f135158a;
            r rVarE3 = l.E(rVar4, q1.Min);
            d92.b.f58623a.getClass();
            long j14 = d92.b.a(o0VarE).e().f63500e;
            float f16 = 8;
            g6.f.a aVar9 = g6.f.f75994b;
            float f17 = 4;
            aVar6 = aVar3;
            r rVarE4 = u1.n.e(v2.c(rVarE3, j14, 0.25f, f16, f17, f17, 0, o0VarE, 1797504, 0), ds.e0.f(o0VarE), i.a(f16));
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarE4, o0VarE);
            g.V.getClass();
            aVar7 = g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            bVar = g.a.f81813j;
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            aVar4 = aVar;
            a((i18 >> 3) & 126, aVar4, null, o0VarE, dVar);
            if (dVar5 != null) {
                o0VarE.C(-45932286);
                z15 = true;
                l.f(u1.n.e(x2.f(x2.h(r.S, 1), 1.0f), sn.a.c(o0VarE), m1.f128891a), o0VarE);
                a((i18 >> 9) & 126, aVar6, null, o0VarE, dVar5);
                o0VarE.g0(false);
            } else {
                z15 = true;
                o0VarE.C(-45531549);
                o0VarE.g0(false);
            }
            o0VarE.g0(z15);
            dVar4 = dVar5;
            aVar5 = aVar6;
            rVar3 = rVar4;
        } else {
            aVar4 = aVar;
            o0VarE.e();
            rVar3 = rVar2;
            dVar4 = dVar3;
            aVar5 = aVar3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a0(rVar3, dVar, aVar4, dVar4, aVar5, i14, i15);
        }
    }

    public static final void c(r rVar, u4.d dVar, boolean z14, e23.a aVar, m mVar, int i14) {
        boolean z15;
        aVar.getClass();
        o0 o0VarE = mVar.E(2054221510);
        int i15 = i14 | (o0VarE.B(dVar) ? 32 : 16) | 3456;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            f0.f110999a.c(rVar, dVar, c2.ELEVATED, b2.LARGE, true, null, null, aVar, o0VarE, (i15 & 112) | 12610950, 64);
            z15 = true;
        } else {
            o0VarE.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g((Object) rVar, (Object) dVar, z15, (Object) aVar, i14, 24);
        }
    }

    public static final void d(int i14, p pVar, r rVar, m mVar) {
        p pVar2;
        pVar.getClass();
        o0 o0VarE = mVar.E(2021400688);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            long jD = o4.f0.d(4294967295L);
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            g6.f.a aVar2 = g6.f.f75994b;
            float f14 = 4;
            r rVarD = l4.k.d(v2.c(l.y(aVar, j92.b.f97899b.f97918c), d92.b.a(o0VarE).e().f63500e, 0.25f, 16, f14, f14, 0, o0VarE, 1797504, 0), new j82.d(jD, 3));
            bVar.getClass();
            r rVarThen = rVar.then(u1.n.e(l4.k.b(rVarD, i.a(j92.b.f97900c.f97911c)), jD, m1.f128891a));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarThen, o0VarE);
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            pVar2 = pVar;
            e5.q(6, pVar2, o0VarE, true);
        } else {
            pVar2 = pVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k41.e(rVar, pVar2, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0328 A[LOOP:1: B:98:0x0322->B:100:0x0328, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:102:0x037c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0380  */
    /* JADX WARN: Code duplicated, block: B:106:0x0384  */
    /* JADX WARN: Code duplicated, block: B:108:0x0388  */
    /* JADX WARN: Code duplicated, block: B:110:0x038c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0397  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x017d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0197  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01db  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0231  */
    /* JADX WARN: Code duplicated, block: B:75:0x0238  */
    /* JADX WARN: Code duplicated, block: B:76:0x023c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0249  */
    /* JADX WARN: Code duplicated, block: B:81:0x0257  */
    /* JADX WARN: Code duplicated, block: B:85:0x026d A[LOOP:0: B:83:0x0267->B:85:0x026d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:90:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:94:0x0300  */
    /* JADX WARN: Code duplicated, block: B:96:0x030e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void e(String str, p<? super m, ? super Integer, Unit> pVar, List<o13.p<String, String>> list, m mVar, int i14, int i15) {
        String str2;
        int i16;
        p<? super m, ? super Integer, Unit> pVar2;
        boolean z14;
        p<? super m, ? super Integer, Unit> pVar3;
        o0 o0Var;
        p2 p2VarI0;
        String str3;
        x0 x0VarA;
        x0 x0VarA2;
        h4.g.a aVar;
        r.a aVar2;
        float f14;
        c2.j.k kVar;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar3;
        g.a.e eVar;
        g.a.C1623g c1623g;
        g.a.b bVar;
        String str4;
        g.a.f fVar;
        c2.b0 b0Var;
        String str5;
        g.a.f fVar2;
        p3.c<?> cVar;
        r.a aVar4;
        p<? super m, ? super Integer, Unit> pVar4;
        float f15;
        g.a.e eVar2;
        c2.j.k kVar2;
        g.a.C1623g c1623g2;
        g.a.b bVar2;
        e0.a aVar5;
        o0 o0Var2;
        ?? r14;
        p<? super m, ? super Integer, Unit> pVar5;
        o0 o0Var3;
        s2 s2VarA;
        int iHashCode2;
        i2 i2VarA1;
        r.a aVar6;
        r rVarC2;
        e0.a aVar7;
        g.a.e eVar3;
        g.a.C1623g c1623g3;
        g.a.b bVar3;
        g.a.f fVar3;
        z zVarA2;
        int iHashCode3;
        i2 i2VarA2;
        r rVarC3;
        Iterator<T> it;
        o0 o0Var4;
        p<? super m, ? super Integer, Unit> pVar6;
        boolean z15;
        z zVarA3;
        int iHashCode4;
        i2 i2VarA3;
        r rVarC4;
        e0.a aVar8;
        g.a.b bVar4;
        Iterator<T> it3;
        o0 o0Var5;
        list.getClass();
        o0 o0VarE = mVar.E(-1741139696);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            str2 = str;
        } else if ((i14 & 6) == 0) {
            str2 = str;
            i16 = i14 | (o0VarE.B(str2) ? 4 : 2);
        } else {
            str2 = str;
            i16 = i14;
        }
        int i18 = i15 & 2;
        if (i18 == 0) {
            if ((i14 & 48) == 0) {
                pVar2 = pVar;
                i16 |= o0VarE.r(pVar2) ? 32 : 16;
            }
            if ((i16 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i17 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i18 != 0) {
                    pVar2 = null;
                }
                x1 x1Var = n.f135158a;
                d92.b.f58623a.getClass();
                j92.f fVar4 = d92.b.f58624b;
                fVar4.getClass();
                x0 x0Var = j92.f.f97931h;
                x0VarA = x0.a(x0Var, o4.f0.d(4285295724L), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                fVar4.getClass();
                x0VarA2 = x0.a(x0Var, o4.f0.d(4279242768L), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                h4.d.f81522a.getClass();
                aVar = h4.d.a.f81537o;
                aVar2 = r.S;
                f14 = 8;
                g6.f.a aVar9 = g6.f.f75994b;
                r rVarY = l.y(aVar2, f14);
                c2.j.f22691a.getClass();
                kVar = c2.j.f22694d;
                zVarA = y.a(kVar, aVar, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVarY, o0VarE);
                g.V.getClass();
                aVar3 = g.a.f81805b;
                if (cVar2 != 0) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                eVar = g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = g.a.f81813j;
                if (o0VarE.T) {
                    str4 = str3;
                } else {
                    str4 = str3;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0Var = c2.b0.f22601a;
                    if (str4 != null) {
                        o0VarE.C(-912508791);
                        f15 = f14;
                        cVar = cVar2;
                        fVar2 = fVar;
                        aVar4 = aVar2;
                        eVar2 = eVar;
                        kVar2 = kVar;
                        c1623g2 = c1623g;
                        bVar2 = bVar;
                        aVar5 = aVar3;
                        String str6 = str4;
                        r14 = 0;
                        mh.c(str6, b0Var.b(aVar2, aVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0VarE, i16 & 14, 0, 131068);
                        str5 = str6;
                        o0 o0Var6 = o0VarE;
                        o0Var6.g0(false);
                        pVar5 = pVar2;
                        o0Var3 = o0Var6;
                    } else {
                        str5 = str4;
                        fVar2 = fVar;
                        cVar = cVar2;
                        aVar4 = aVar2;
                        pVar4 = pVar2;
                        f15 = f14;
                        eVar2 = eVar;
                        kVar2 = kVar;
                        c1623g2 = c1623g;
                        bVar2 = bVar;
                        aVar5 = aVar3;
                        o0Var2 = o0VarE;
                        r14 = 0;
                        r14 = 0;
                        if (pVar4 != null) {
                            o0Var2.C(-912374654);
                            pVar5 = pVar4;
                            e5.q((i16 >> 3) & 14, pVar5, o0Var2, false);
                            o0Var3 = o0Var2;
                        } else {
                            pVar5 = pVar4;
                            o0Var2.C(-912338136);
                            o0Var2.g0(false);
                            o0Var3 = o0Var2;
                        }
                    }
                    s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0Var3, r14);
                    iHashCode2 = Long.hashCode(o0Var3.U);
                    i2VarA1 = o0Var3.a0();
                    aVar6 = aVar4;
                    rVarC2 = k.c(aVar6, o0Var3);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        aVar7 = aVar5;
                        o0Var3.M(aVar7);
                    } else {
                        aVar7 = aVar5;
                        o0Var3.c();
                    }
                    eVar3 = eVar2;
                    b4.c(eVar3, s2VarA, o0Var3);
                    c1623g3 = c1623g2;
                    b4.c(c1623g3, i2VarA1, o0Var3);
                    if (o0Var3.T && s.g(o0Var3.q(), Integer.valueOf(iHashCode2))) {
                        bVar3 = bVar2;
                    } else {
                        bVar3 = bVar2;
                        h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
                    }
                    fVar3 = fVar2;
                    b4.c(fVar3, rVarC2, o0Var3);
                    u2 u2Var = u2.f22900a;
                    r rVarC5 = l.C(aVar6, 0.0f, 0.0f, 24, 0.0f, 11);
                    zVarA2 = y.a(kVar2, h4.d.a.f81536n, o0Var3, r14);
                    iHashCode3 = Long.hashCode(o0Var3.U);
                    i2VarA2 = o0Var3.a0();
                    rVarC3 = k.c(rVarC5, o0Var3);
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var3.z();
                    if (o0Var3.T) {
                        o0Var3.M(aVar7);
                    } else {
                        o0Var3.c();
                    }
                    b4.c(eVar3, zVarA2, o0Var3);
                    b4.c(c1623g3, i2VarA2, o0Var3);
                    if (o0Var3.T || !s.g(o0Var3.q(), Integer.valueOf(iHashCode3))) {
                        h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
                    }
                    b4.c(fVar3, rVarC3, o0Var3);
                    o0Var3.C(-721030388);
                    it = list.iterator();
                    o0Var4 = o0Var3;
                    while (it.hasNext()) {
                        o0 o0Var7 = o0Var4;
                        mh.c((String) ((o13.p) it.next()).f128594a, l.C(r.S, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0Var7, 48, 0, 131068);
                        o0Var4 = o0Var7;
                        pVar5 = pVar5;
                    }
                    pVar6 = pVar5;
                    o0Var4.g0(r14);
                    z15 = true;
                    o0Var4.g0(true);
                    r.a aVar10 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA3 = y.a(kVar3, h4.d.a.f81536n, o0Var4, r14);
                    x1 x1Var2 = n.f135158a;
                    iHashCode4 = Long.hashCode(o0Var4.U);
                    i2VarA3 = o0Var4.a0();
                    rVarC4 = k.c(aVar10, o0Var4);
                    g.V.getClass();
                    aVar8 = g.a.f81805b;
                    if (cVar != null) {
                        p0.l();
                        throw null;
                    }
                    o0Var4.z();
                    if (o0Var4.T) {
                        o0Var4.M(aVar8);
                    } else {
                        o0Var4.c();
                    }
                    b4.c(g.a.f81810g, zVarA3, o0Var4);
                    b4.c(g.a.f81809f, i2VarA3, o0Var4);
                    bVar4 = g.a.f81813j;
                    if (o0Var4.T || !s.g(o0Var4.q(), Integer.valueOf(iHashCode4))) {
                        h.A(iHashCode4, o0Var4, iHashCode4, bVar4);
                    }
                    b4.c(g.a.f81807d, rVarC4, o0Var4);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    o0Var4.C(-241451338);
                    it3 = list.iterator();
                    o0Var5 = o0Var4;
                    while (it3.hasNext()) {
                        o0 o0Var8 = o0Var5;
                        mh.c((String) ((o13.p) it3.next()).f128595b, l.C(r.S, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var8, 48, 0, 131068);
                        o0Var5 = o0Var8;
                        z15 = true;
                    }
                    o0Var5.g0(r14);
                    o0Var5.g0(true);
                    o0Var5.g0(true);
                    o0Var5.g0(true);
                    x1 x1Var3 = n.f135158a;
                    str2 = str5;
                    pVar3 = pVar6;
                    o0Var = o0Var5;
                }
                h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                if (str4 != null) {
                    o0VarE.C(-912508791);
                    f15 = f14;
                    cVar = cVar2;
                    fVar2 = fVar;
                    aVar4 = aVar2;
                    eVar2 = eVar;
                    kVar2 = kVar;
                    c1623g2 = c1623g;
                    bVar2 = bVar;
                    aVar5 = aVar3;
                    String str7 = str4;
                    r14 = 0;
                    mh.c(str7, b0Var.b(aVar2, aVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0VarE, i16 & 14, 0, 131068);
                    str5 = str7;
                    o0 o0Var9 = o0VarE;
                    o0Var9.g0(false);
                    pVar5 = pVar2;
                    o0Var3 = o0Var9;
                } else {
                    str5 = str4;
                    fVar2 = fVar;
                    cVar = cVar2;
                    aVar4 = aVar2;
                    pVar4 = pVar2;
                    f15 = f14;
                    eVar2 = eVar;
                    kVar2 = kVar;
                    c1623g2 = c1623g;
                    bVar2 = bVar;
                    aVar5 = aVar3;
                    o0Var2 = o0VarE;
                    r14 = 0;
                    r14 = 0;
                    if (pVar4 != null) {
                        o0Var2.C(-912374654);
                        pVar5 = pVar4;
                        e5.q((i16 >> 3) & 14, pVar5, o0Var2, false);
                        o0Var3 = o0Var2;
                    } else {
                        pVar5 = pVar4;
                        o0Var2.C(-912338136);
                        o0Var2.g0(false);
                        o0Var3 = o0Var2;
                    }
                }
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0Var3, r14);
                iHashCode2 = Long.hashCode(o0Var3.U);
                i2VarA1 = o0Var3.a0();
                aVar6 = aVar4;
                rVarC2 = k.c(aVar6, o0Var3);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    aVar7 = aVar5;
                    o0Var3.M(aVar7);
                } else {
                    aVar7 = aVar5;
                    o0Var3.c();
                }
                eVar3 = eVar2;
                b4.c(eVar3, s2VarA, o0Var3);
                c1623g3 = c1623g2;
                b4.c(c1623g3, i2VarA1, o0Var3);
                if (o0Var3.T) {
                    bVar3 = bVar2;
                    h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
                } else {
                    bVar3 = bVar2;
                    h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
                }
                fVar3 = fVar2;
                b4.c(fVar3, rVarC2, o0Var3);
                u2 u2Var2 = u2.f22900a;
                r rVarC6 = l.C(aVar6, 0.0f, 0.0f, 24, 0.0f, 11);
                zVarA2 = y.a(kVar2, h4.d.a.f81536n, o0Var3, r14);
                iHashCode3 = Long.hashCode(o0Var3.U);
                i2VarA2 = o0Var3.a0();
                rVarC3 = k.c(rVarC6, o0Var3);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    o0Var3.M(aVar7);
                } else {
                    o0Var3.c();
                }
                b4.c(eVar3, zVarA2, o0Var3);
                b4.c(c1623g3, i2VarA2, o0Var3);
                if (o0Var3.T) {
                    h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
                } else {
                    h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
                }
                b4.c(fVar3, rVarC3, o0Var3);
                o0Var3.C(-721030388);
                it = list.iterator();
                o0Var4 = o0Var3;
                while (it.hasNext()) {
                    o0 o0Var10 = o0Var4;
                    mh.c((String) ((o13.p) it.next()).f128594a, l.C(r.S, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0Var10, 48, 0, 131068);
                    o0Var4 = o0Var10;
                    pVar5 = pVar5;
                }
                pVar6 = pVar5;
                o0Var4.g0(r14);
                z15 = true;
                o0Var4.g0(true);
                r.a aVar11 = r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar4 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA3 = y.a(kVar4, h4.d.a.f81536n, o0Var4, r14);
                x1 x1Var4 = n.f135158a;
                iHashCode4 = Long.hashCode(o0Var4.U);
                i2VarA3 = o0Var4.a0();
                rVarC4 = k.c(aVar11, o0Var4);
                g.V.getClass();
                aVar8 = g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var4.z();
                if (o0Var4.T) {
                    o0Var4.M(aVar8);
                } else {
                    o0Var4.c();
                }
                b4.c(g.a.f81810g, zVarA3, o0Var4);
                b4.c(g.a.f81809f, i2VarA3, o0Var4);
                bVar4 = g.a.f81813j;
                if (o0Var4.T) {
                    h.A(iHashCode4, o0Var4, iHashCode4, bVar4);
                } else {
                    h.A(iHashCode4, o0Var4, iHashCode4, bVar4);
                }
                b4.c(g.a.f81807d, rVarC4, o0Var4);
                c2.b0 b0Var3 = c2.b0.f22601a;
                o0Var4.C(-241451338);
                it3 = list.iterator();
                o0Var5 = o0Var4;
                while (it3.hasNext()) {
                    o0 o0Var11 = o0Var5;
                    mh.c((String) ((o13.p) it3.next()).f128595b, l.C(r.S, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var11, 48, 0, 131068);
                    o0Var5 = o0Var11;
                    z15 = true;
                }
                o0Var5.g0(r14);
                o0Var5.g0(true);
                o0Var5.g0(true);
                o0Var5.g0(true);
                x1 x1Var5 = n.f135158a;
                str2 = str5;
                pVar3 = pVar6;
                o0Var = o0Var5;
            } else {
                o0 o0Var12 = o0VarE;
                o0Var12.e();
                pVar3 = pVar2;
                o0Var = o0Var12;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new an1.d(str2, pVar3, list, i14, i15);
            }
        }
        i16 |= 48;
        pVar2 = pVar;
        if ((i16 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i17 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i18 != 0) {
                pVar2 = null;
            }
            x1 x1Var6 = n.f135158a;
            d92.b.f58623a.getClass();
            j92.f fVar5 = d92.b.f58624b;
            fVar5.getClass();
            x0 x0Var2 = j92.f.f97931h;
            x0VarA = x0.a(x0Var2, o4.f0.d(4285295724L), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            fVar5.getClass();
            x0VarA2 = x0.a(x0Var2, o4.f0.d(4279242768L), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
            h4.d.f81522a.getClass();
            aVar = h4.d.a.f81537o;
            aVar2 = r.S;
            f14 = 8;
            g6.f.a aVar12 = g6.f.f75994b;
            r rVarY2 = l.y(aVar2, f14);
            c2.j.f22691a.getClass();
            kVar = c2.j.f22694d;
            zVarA = y.a(kVar, aVar, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVarY2, o0VarE);
            g.V.getClass();
            aVar3 = g.a.f81805b;
            if (cVar2 != 0) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            eVar = g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = g.a.f81813j;
            if (o0VarE.T) {
                str4 = str3;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                if (str4 != null) {
                    o0VarE.C(-912508791);
                    f15 = f14;
                    cVar = cVar2;
                    fVar2 = fVar;
                    aVar4 = aVar2;
                    eVar2 = eVar;
                    kVar2 = kVar;
                    c1623g2 = c1623g;
                    bVar2 = bVar;
                    aVar5 = aVar3;
                    String str8 = str4;
                    r14 = 0;
                    mh.c(str8, b0Var.b(aVar2, aVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0VarE, i16 & 14, 0, 131068);
                    str5 = str8;
                    o0 o0Var13 = o0VarE;
                    o0Var13.g0(false);
                    pVar5 = pVar2;
                    o0Var3 = o0Var13;
                } else {
                    str5 = str4;
                    fVar2 = fVar;
                    cVar = cVar2;
                    aVar4 = aVar2;
                    pVar4 = pVar2;
                    f15 = f14;
                    eVar2 = eVar;
                    kVar2 = kVar;
                    c1623g2 = c1623g;
                    bVar2 = bVar;
                    aVar5 = aVar3;
                    o0Var2 = o0VarE;
                    r14 = 0;
                    r14 = 0;
                    if (pVar4 != null) {
                        o0Var2.C(-912374654);
                        pVar5 = pVar4;
                        e5.q((i16 >> 3) & 14, pVar5, o0Var2, false);
                        o0Var3 = o0Var2;
                    } else {
                        pVar5 = pVar4;
                        o0Var2.C(-912338136);
                        o0Var2.g0(false);
                        o0Var3 = o0Var2;
                    }
                }
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0Var3, r14);
                iHashCode2 = Long.hashCode(o0Var3.U);
                i2VarA1 = o0Var3.a0();
                aVar6 = aVar4;
                rVarC2 = k.c(aVar6, o0Var3);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    aVar7 = aVar5;
                    o0Var3.M(aVar7);
                } else {
                    aVar7 = aVar5;
                    o0Var3.c();
                }
                eVar3 = eVar2;
                b4.c(eVar3, s2VarA, o0Var3);
                c1623g3 = c1623g2;
                b4.c(c1623g3, i2VarA1, o0Var3);
                if (o0Var3.T) {
                    bVar3 = bVar2;
                    h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
                } else {
                    bVar3 = bVar2;
                    h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
                }
                fVar3 = fVar2;
                b4.c(fVar3, rVarC2, o0Var3);
                u2 u2Var3 = u2.f22900a;
                r rVarC7 = l.C(aVar6, 0.0f, 0.0f, 24, 0.0f, 11);
                zVarA2 = y.a(kVar2, h4.d.a.f81536n, o0Var3, r14);
                iHashCode3 = Long.hashCode(o0Var3.U);
                i2VarA2 = o0Var3.a0();
                rVarC3 = k.c(rVarC7, o0Var3);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var3.z();
                if (o0Var3.T) {
                    o0Var3.M(aVar7);
                } else {
                    o0Var3.c();
                }
                b4.c(eVar3, zVarA2, o0Var3);
                b4.c(c1623g3, i2VarA2, o0Var3);
                if (o0Var3.T) {
                    h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
                } else {
                    h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
                }
                b4.c(fVar3, rVarC3, o0Var3);
                o0Var3.C(-721030388);
                it = list.iterator();
                o0Var4 = o0Var3;
                while (it.hasNext()) {
                    o0 o0Var14 = o0Var4;
                    mh.c((String) ((o13.p) it.next()).f128594a, l.C(r.S, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0Var14, 48, 0, 131068);
                    o0Var4 = o0Var14;
                    pVar5 = pVar5;
                }
                pVar6 = pVar5;
                o0Var4.g0(r14);
                z15 = true;
                o0Var4.g0(true);
                r.a aVar13 = r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar5 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA3 = y.a(kVar5, h4.d.a.f81536n, o0Var4, r14);
                x1 x1Var7 = n.f135158a;
                iHashCode4 = Long.hashCode(o0Var4.U);
                i2VarA3 = o0Var4.a0();
                rVarC4 = k.c(aVar13, o0Var4);
                g.V.getClass();
                aVar8 = g.a.f81805b;
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0Var4.z();
                if (o0Var4.T) {
                    o0Var4.M(aVar8);
                } else {
                    o0Var4.c();
                }
                b4.c(g.a.f81810g, zVarA3, o0Var4);
                b4.c(g.a.f81809f, i2VarA3, o0Var4);
                bVar4 = g.a.f81813j;
                if (o0Var4.T) {
                    h.A(iHashCode4, o0Var4, iHashCode4, bVar4);
                } else {
                    h.A(iHashCode4, o0Var4, iHashCode4, bVar4);
                }
                b4.c(g.a.f81807d, rVarC4, o0Var4);
                c2.b0 b0Var4 = c2.b0.f22601a;
                o0Var4.C(-241451338);
                it3 = list.iterator();
                o0Var5 = o0Var4;
                while (it3.hasNext()) {
                    o0 o0Var15 = o0Var5;
                    mh.c((String) ((o13.p) it3.next()).f128595b, l.C(r.S, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var15, 48, 0, 131068);
                    o0Var5 = o0Var15;
                    z15 = true;
                }
                o0Var5.g0(r14);
                o0Var5.g0(true);
                o0Var5.g0(true);
                o0Var5.g0(true);
                x1 x1Var8 = n.f135158a;
                str2 = str5;
                pVar3 = pVar6;
                o0Var = o0Var5;
            } else {
                str4 = str3;
            }
            h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0Var = c2.b0.f22601a;
            if (str4 != null) {
                o0VarE.C(-912508791);
                f15 = f14;
                cVar = cVar2;
                fVar2 = fVar;
                aVar4 = aVar2;
                eVar2 = eVar;
                kVar2 = kVar;
                c1623g2 = c1623g;
                bVar2 = bVar;
                aVar5 = aVar3;
                String str9 = str4;
                r14 = 0;
                mh.c(str9, b0Var.b(aVar2, aVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0VarE, i16 & 14, 0, 131068);
                str5 = str9;
                o0 o0Var16 = o0VarE;
                o0Var16.g0(false);
                pVar5 = pVar2;
                o0Var3 = o0Var16;
            } else {
                str5 = str4;
                fVar2 = fVar;
                cVar = cVar2;
                aVar4 = aVar2;
                pVar4 = pVar2;
                f15 = f14;
                eVar2 = eVar;
                kVar2 = kVar;
                c1623g2 = c1623g;
                bVar2 = bVar;
                aVar5 = aVar3;
                o0Var2 = o0VarE;
                r14 = 0;
                r14 = 0;
                if (pVar4 != null) {
                    o0Var2.C(-912374654);
                    pVar5 = pVar4;
                    e5.q((i16 >> 3) & 14, pVar5, o0Var2, false);
                    o0Var3 = o0Var2;
                } else {
                    pVar5 = pVar4;
                    o0Var2.C(-912338136);
                    o0Var2.g0(false);
                    o0Var3 = o0Var2;
                }
            }
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0Var3, r14);
            iHashCode2 = Long.hashCode(o0Var3.U);
            i2VarA1 = o0Var3.a0();
            aVar6 = aVar4;
            rVarC2 = k.c(aVar6, o0Var3);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var3.z();
            if (o0Var3.T) {
                aVar7 = aVar5;
                o0Var3.M(aVar7);
            } else {
                aVar7 = aVar5;
                o0Var3.c();
            }
            eVar3 = eVar2;
            b4.c(eVar3, s2VarA, o0Var3);
            c1623g3 = c1623g2;
            b4.c(c1623g3, i2VarA1, o0Var3);
            if (o0Var3.T) {
                bVar3 = bVar2;
                h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
            } else {
                bVar3 = bVar2;
                h.A(iHashCode2, o0Var3, iHashCode2, bVar3);
            }
            fVar3 = fVar2;
            b4.c(fVar3, rVarC2, o0Var3);
            u2 u2Var4 = u2.f22900a;
            r rVarC8 = l.C(aVar6, 0.0f, 0.0f, 24, 0.0f, 11);
            zVarA2 = y.a(kVar2, h4.d.a.f81536n, o0Var3, r14);
            iHashCode3 = Long.hashCode(o0Var3.U);
            i2VarA2 = o0Var3.a0();
            rVarC3 = k.c(rVarC8, o0Var3);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var3.z();
            if (o0Var3.T) {
                o0Var3.M(aVar7);
            } else {
                o0Var3.c();
            }
            b4.c(eVar3, zVarA2, o0Var3);
            b4.c(c1623g3, i2VarA2, o0Var3);
            if (o0Var3.T) {
                h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
            } else {
                h.A(iHashCode3, o0Var3, iHashCode3, bVar3);
            }
            b4.c(fVar3, rVarC3, o0Var3);
            o0Var3.C(-721030388);
            it = list.iterator();
            o0Var4 = o0Var3;
            while (it.hasNext()) {
                o0 o0Var17 = o0Var4;
                mh.c((String) ((o13.p) it.next()).f128594a, l.C(r.S, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA2, o0Var17, 48, 0, 131068);
                o0Var4 = o0Var17;
                pVar5 = pVar5;
            }
            pVar6 = pVar5;
            o0Var4.g0(r14);
            z15 = true;
            o0Var4.g0(true);
            r.a aVar14 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar6 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA3 = y.a(kVar6, h4.d.a.f81536n, o0Var4, r14);
            x1 x1Var9 = n.f135158a;
            iHashCode4 = Long.hashCode(o0Var4.U);
            i2VarA3 = o0Var4.a0();
            rVarC4 = k.c(aVar14, o0Var4);
            g.V.getClass();
            aVar8 = g.a.f81805b;
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0Var4.z();
            if (o0Var4.T) {
                o0Var4.M(aVar8);
            } else {
                o0Var4.c();
            }
            b4.c(g.a.f81810g, zVarA3, o0Var4);
            b4.c(g.a.f81809f, i2VarA3, o0Var4);
            bVar4 = g.a.f81813j;
            if (o0Var4.T) {
                h.A(iHashCode4, o0Var4, iHashCode4, bVar4);
            } else {
                h.A(iHashCode4, o0Var4, iHashCode4, bVar4);
            }
            b4.c(g.a.f81807d, rVarC4, o0Var4);
            c2.b0 b0Var5 = c2.b0.f22601a;
            o0Var4.C(-241451338);
            it3 = list.iterator();
            o0Var5 = o0Var4;
            while (it3.hasNext()) {
                o0 o0Var18 = o0Var5;
                mh.c((String) ((o13.p) it3.next()).f128595b, l.C(r.S, 0.0f, f15, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, o0Var18, 48, 0, 131068);
                o0Var5 = o0Var18;
                z15 = true;
            }
            o0Var5.g0(r14);
            o0Var5.g0(true);
            o0Var5.g0(true);
            o0Var5.g0(true);
            x1 x1Var10 = n.f135158a;
            str2 = str5;
            pVar3 = pVar6;
            o0Var = o0Var5;
        } else {
            o0 o0Var19 = o0VarE;
            o0Var19.e();
            pVar3 = pVar2;
            o0Var = o0Var19;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(str2, pVar3, list, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(r rVar, e eVar, final boolean z14, Double d14, Double d15, String str, Double d16, x3 x3Var, m mVar, int i14) {
        g.a.b bVar;
        g.a.f fVar;
        g.a.e eVar2;
        e0.a aVar;
        boolean z15;
        boolean z16;
        boolean z17;
        Object dVar;
        String str2;
        o0 o0VarE = mVar.E(2090595537);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | 113246208 | (o0VarE.B(x3Var) ? 536870912 : 268435456);
        if (o0VarE.n(i15 & 1, (306783379 & i15) != 306783378)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(new d(context, x3Var));
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            float f14 = 20;
            g6.f.a aVar2 = g6.f.f75994b;
            float f15 = 4;
            r rVarC = v2.c(rVar, 0L, 0.2f, f14, f15, f15, 0, o0VarE, (i15 & 14) | 1797504, 1);
            o0VarE = o0VarE;
            r rVarE = u1.n.e(l4.k.b(rVarC, i.a(f14)), am.j.A(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f16 = eVar3.f97920e;
            float f17 = eVar3.f97917b;
            org.apache.commons.lang3.e.j(bVar2);
            r rVarB = l.B(rVarE, f16, f17, f17, f17);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(r1.q2.g(bVar2, c2.j.f22691a, f17), h4.d.a.f81534l, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarB, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            g.a.e eVar4 = g.a.f81810g;
            b4.c(eVar4, s2VarA, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            g.a.b bVar3 = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            g.a.f fVar2 = g.a.f81807d;
            b4.c(fVar2, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            if (d14 == null) {
                o0VarE.C(223970423);
                o0VarE.g0(false);
                cVar = cVar;
                z15 = false;
                fVar = fVar2;
                bVar = bVar3;
                aVar = aVar3;
                eVar2 = eVar4;
            } else {
                o0VarE.C(223970424);
                final double dDoubleValue = d14.doubleValue();
                d dVar2 = (d) p1Var.getF182175a();
                dVar2.getClass();
                String strG = tn.k.g(d.f103395c.format(z14 ? dVar2.f103397b.b(dDoubleValue) : dDoubleValue), dVar2.f103396a.getString(R.string.lbl_degree_sign));
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                r.a aVar4 = r.S;
                boolean zM = o0VarE.m(dDoubleValue);
                Object objQ2 = o0VarE.q();
                if (zM || objQ2 == c2565a) {
                    objQ2 = new e23.l() { // from class: k82.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            k0 k0Var = (k0) obj;
                            k0Var.getClass();
                            f fVar3 = ((d) p1Var.getF182175a()).f103397b;
                            h0.n(k0Var, fVar3.e(fVar3.b(dDoubleValue), z14));
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ2);
                }
                r rVarC3 = v.c((e23.l) objQ2, aVar4, false);
                bVar = bVar3;
                fVar = fVar2;
                eVar2 = eVar4;
                aVar = aVar3;
                mh.c(strG, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                z15 = false;
                o0VarE.g0(false);
            }
            if (eVar == null) {
                o0VarE.C(224366541);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(224366542);
                y0.b(eVar.f103401a, gl1.y.Q(o0VarE, eVar.f103402b), x2.q(r.S, 32), null, o0VarE, 384, 120);
                Unit unit2 = Unit.INSTANCE;
                z15 = false;
                o0VarE.g0(false);
            }
            if (d16 != null) {
                o0VarE.C(224639590);
                d dVar3 = (d) p1Var.getF182175a();
                double dDoubleValue2 = d16.doubleValue();
                f fVar3 = dVar3.f103397b;
                double d17 = fVar3.d(dDoubleValue2);
                if (z14) {
                    d17 = fVar3.c(d17);
                }
                String strValueOf = String.valueOf(MathKt.d(d17));
                h4.g gVar = h4.d.a.f81528f;
                r.a aVar5 = r.S;
                boolean zB = o0VarE.B(strValueOf);
                Object objQ3 = o0VarE.q();
                if (zB || objQ3 == c2565a) {
                    str2 = strValueOf;
                    dVar = new dt1.d(str2, str, z14, p1Var, 3);
                    o0VarE.K(dVar);
                } else {
                    str2 = strValueOf;
                    dVar = objQ3;
                }
                r rVarC4 = v.c((e23.l) dVar, aVar5, z15);
                z0 z0VarD = q.d(gVar, z15);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                r rVarC5 = k.c(rVarC4, o0VarE);
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
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC5, o0VarE);
                u uVar = u.f22885a;
                g(d15 != null ? d15.doubleValue() : 0.0d, o0VarE, z15);
                d92.b.f58624b.getClass();
                o0 o0Var = o0VarE;
                z16 = z15;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97935l, o0VarE), o0Var, 0, 0, 131070);
                o0VarE = o0Var;
                z17 = true;
                o0VarE.g0(true);
                o0VarE.g0(z16);
            } else {
                z16 = z15;
                z17 = true;
                o0VarE.C(225207541);
                o0VarE.g0(z16);
            }
            o0VarE.C(225609301);
            o0VarE.g0(z16);
            o0VarE.g0(z17);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e11.n(rVar, eVar, z14, d14, d15, str, d16, x3Var, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d  */
    public static final void g(double d14, m mVar, int i14) {
        o0 o0VarE = mVar.E(-2050500543);
        int i15 = (o0VarE.m(d14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            long jD = hb.a.d(d92.b.f58623a, o0VarE);
            g6.f.a aVar = g6.f.f75994b;
            r rVarQ = x2.q(l4.k.g(r.S, (float) d14), 32);
            boolean zL = o0VarE.l(jD);
            Object objQ = o0VarE.q();
            if (zL) {
                objQ = new j82.d(jD, 2);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j82.d(jD, 2);
                    o0VarE.K(objQ);
                }
            }
            u1.n.b(rVarQ, (e23.l) objQ, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(i14, 0, d14);
        }
    }
}
