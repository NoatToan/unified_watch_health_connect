package ha0;

import a11.g0;
import a3.q;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import da0.p;
import e23.l;
import g2.m1;
import h4.r;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mh;
import java.util.List;
import java.util.Map;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import v62.e1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    public static final void a(List<d.b> list, l<? super zf2.d, Unit> lVar, m mVar, int i14) {
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1100255388);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1608266544);
            o0VarE.C(1608267185);
            int i16 = 0;
            for (Object obj : list) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    x.q();
                    throw null;
                }
                d.b bVar2 = (d.b) obj;
                boolean z14 = i16 == 0;
                boolean z15 = i16 == list.size() - 1;
                boolean z16 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z16) {
                    objQ = new fb0.d(lVar, 15);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new fb0.d(lVar, 15);
                        o0VarE.K(objQ);
                    }
                }
                b(z14, z15, bVar2, (l) objQ, o0VarE, 0);
                i16 = i17;
            }
            e5.u(o0VarE, false, false, true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.e0(lVar, i14, 4, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    public static final void b(boolean z14, boolean z15, d.b bVar, l<? super zf2.d, Unit> lVar, m mVar, int i14) {
        long jB;
        float f14;
        float f15;
        float f16;
        float f17;
        bVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-468594135);
        int i15 = 16;
        int i16 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.h(z15) ? 32 : 16) | (o0VarE.r(bVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            boolean zR = ((i16 & 7168) == 2048) | o0VarE.r(bVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new gp.f(i15, lVar, bVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new gp.f(i15, lVar, bVar);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarF, false, null, null, (e23.a) objQ, 15);
            if (bVar.f82631c) {
                o0VarE.C(652614001);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().g();
                o0VarE.g0(false);
            } else {
                o0VarE.C(652615185);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            }
            if (z14) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f14 = j92.b.f97900c.f97911c;
            } else {
                f14 = 0;
                g6.f.a aVar2 = g6.f.f75994b;
            }
            if (z14) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97900c.f97911c;
            } else {
                f15 = 0;
                g6.f.a aVar3 = g6.f.f75994b;
            }
            if (z15) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f16 = j92.b.f97900c.f97911c;
            } else {
                f16 = 0;
                g6.f.a aVar4 = g6.f.f75994b;
            }
            if (z15) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f17 = j92.b.f97900c.f97911c;
            } else {
                f17 = 0;
                g6.f.a aVar5 = g6.f.f75994b;
            }
            r rVarE = u1.n.e(rVarD, jB, k2.i.b(f14, f15, f17, f16));
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f18 = eVar.f97920e;
            bVar2.getClass();
            r rVarC = c2.l.C(rVarE, f18, 0.0f, eVar.f97920e, 0.0f, 10);
            bVar2.getClass();
            r rVarA = c2.l.A(rVarC, 0.0f, eVar.f97920e, 1);
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String strInvoke = bVar.f82629a.invoke((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            d92.b.f58624b.getClass();
            mh.c(strInvoke, u2Var.a(aVar, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            s62.a.f157643a.getClass();
            u4.d dVarA = e1.a(t62.b.f162798a);
            long jS = hb.a.s(o0VarE);
            o0VarE = o0VarE;
            i7.b(dVarA, null, l4.k.a(aVar, bVar.f82631c ? 1.0f : 0.0f), jS, o0VarE, 48, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(i14, 0, bVar, lVar, z14, z15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(Map<d.a, ? extends List<d.b>> map, l<? super zf2.d, Unit> lVar, m mVar, int i14) {
        o0 o0Var;
        Object obj;
        map.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1937020329);
        char c14 = ' ';
        int i15 = i14 | (o0VarE.r(map) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        char c15 = 18;
        boolean z14 = false;
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            o0 o0Var2 = o0VarE;
            for (Map.Entry<d.a, ? extends List<d.b>> entry : map.entrySet()) {
                d.a key = entry.getKey();
                List<d.b> value = entry.getValue();
                String strG = g22.n.g(key.f82628a.invoke(context));
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97933j, o0Var2);
                r.a aVar = r.S;
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                o0 o0Var3 = o0Var2;
                Context context2 = context;
                boolean z15 = i16;
                int i17 = i15;
                mh.c(strG, c2.l.A(aVar, 0.0f, eVar.f97919d, i16), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var3, 0, 0, 131068);
                o0 o0Var4 = o0Var3;
                r rVarF = x2.f(aVar, 1.0f);
                bVar.getClass();
                r rVarC = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0Var4, 0);
                x1 x1Var2 = n.f135158a;
                int iHashCode = Long.hashCode(o0Var4.U);
                i2 i2VarA0 = o0Var4.a0();
                r rVarC2 = h4.k.c(rVarC, o0Var4);
                h5.g.V.getClass();
                e0.a aVar2 = h5.g.a.f81805b;
                if (o0Var4.f135177b == null) {
                    p0.l();
                    throw null;
                }
                o0Var4.z();
                if (o0Var4.T) {
                    o0Var4.M(aVar2);
                } else {
                    o0Var4.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0Var4);
                b4.c(h5.g.a.f81809f, i2VarA0, o0Var4);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0Var4.T || !s.g(o0Var4.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0Var4, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0Var4);
                b0 b0Var = b0.f22601a;
                o0Var4.C(656335378);
                int i18 = 0;
                for (Object obj2 : value) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        x.q();
                        throw null;
                    }
                    d.b bVar3 = (d.b) obj2;
                    if (bVar3.f82631c) {
                        o0Var4.C(1250314976);
                        o0Var4.g0(false);
                    } else {
                        o0Var4.C(1250168904);
                        boolean z16 = i18 == 0 ? z15 ? 1 : 0 : false;
                        boolean z17 = i18 == value.size() - (z15 ? 1 : 0) ? z15 ? 1 : 0 : false;
                        boolean z18 = (i17 & 112) == 32 ? z15 ? 1 : 0 : false;
                        Object objQ = o0Var4.q();
                        if (z18) {
                            obj = objQ;
                            Object dVar = new fb0.d(lVar, 14);
                            o0Var4.K(dVar);
                            obj = dVar;
                        } else {
                            m.f135153a.getClass();
                            if (objQ == m.a.f135155b) {
                                obj = objQ;
                                Object dVar2 = new fb0.d(lVar, 14);
                                o0Var4.K(dVar2);
                                obj = dVar2;
                            }
                        }
                        obj = objQ;
                        b(z16, z17, bVar3, (l) obj, o0Var4, 0);
                        o0Var4.g0(false);
                    }
                    i18 = i19;
                }
                o0Var4.g0(false);
                o0Var4.g0(z15);
                c15 = 18;
                i15 = i17;
                i16 = z15 ? 1 : 0;
                c14 = ' ';
                z14 = false;
                context = context2;
                o0Var2 = o0Var4;
            }
            x1 x1Var3 = n.f135158a;
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g80.e(map, lVar, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(k kVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        kVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1907983407);
        int i15 = i14 | (o0VarE.r(kVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(kVar.f82656j, o0VarE);
            List<d.b> list = ((g) p1VarC.getF182175a()).f82638b;
            List<d.b> list2 = ((g) p1VarC.getF182175a()).f82639c;
            Map<d.a, List<d.b>> map = ((g) p1VarC.getF182175a()).f82640d;
            boolean z14 = false;
            int i16 = kVar.f82654h;
            boolean z15 = ((g) p1VarC.getF182175a()).f82637a;
            boolean zR = o0VarE.r(kVar) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (zR) {
                objQ = new m1(17, kVar, context);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new m1(17, kVar, context);
                    o0VarE.K(objQ);
                }
            }
            l lVar = (l) objQ;
            boolean zR2 = o0VarE.r(kVar);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new g12.f(kVar, 25);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new g12.f(kVar, 25);
                    o0VarE.K(objQ2);
                }
            }
            l lVar2 = (l) objQ2;
            boolean zR3 = o0VarE.r(kVar);
            if ((i15 & 112) == 32) {
                z14 = true;
            }
            boolean z16 = zR3 | z14;
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new gp.f(15, kVar, aVar);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new gp.f(15, kVar, aVar);
                    o0VarE.K(objQ3);
                }
            }
            e(list, list2, map, i16, z15, lVar, lVar2, (e23.a) objQ3, aVar2, o0VarE, (i15 << 18) & 234881024);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gw1.c(kVar, aVar, aVar2, i14, 3);
        }
    }

    public static final void e(List<d.b> list, List<d.b> list2, Map<d.a, ? extends List<d.b>> map, int i14, boolean z14, l<? super String, Unit> lVar, l<? super zf2.d, Unit> lVar2, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i15) {
        int i16;
        o0 o0Var;
        o0 o0VarE = mVar.E(-496702830);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.r(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(list2) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(map) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.k(i14) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i16 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i16 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i15) == 0) {
            i16 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i16 |= o0VarE.r(aVar2) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i16 & 1, (38347923 & i16) != 38347922)) {
            x1 x1Var = n.f135158a;
            o0Var = o0VarE;
            p.d("select_favorite_activities_screen", z14, aVar2, null, null, null, z3.f.c(592411497, new g0(i14, lVar, list2, lVar2, list, map, aVar), o0VarE), o0Var, ((i16 >> 9) & 112) | 12582918 | ((i16 >> 18) & 896), 120);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(list, list2, map, i14, z14, lVar, lVar2, aVar, aVar2, i15);
        }
    }
}
