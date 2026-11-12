package ka0;

import c2.b0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import da0.y;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import i3.m8;
import i3.mh;
import java.util.List;
import l72.i3;
import o4.m1;
import o4.r1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.w;
import u62.t;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    public static final void a(int i14, e23.a aVar, String str, r1 r1Var, m mVar, boolean z14) {
        o0 o0Var;
        long jB;
        o0 o0VarE = mVar.E(-1738599350);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.B(r1Var) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            if (z14) {
                o0VarE.C(-51691438);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarE).c().g();
                o0VarE.g0(false);
            } else {
                o0VarE.C(-51690254);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarE, false);
            }
            r rVarE = u1.n.e(x2.f(r.S, 1.0f), jB, r1Var);
            boolean z15 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new j22.d(aVar, 23);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new j22.d(aVar, 23);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarY = l.y(rVarD, j92.b.f97899b.f97920e);
            j.f22691a.getClass();
            j.g gVar = j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0Var = o0VarE;
            if (z14) {
                o0Var.C(1771320726);
                y.a(null, 0.0f, o0Var, 0, 3);
                o0Var.g0(false);
            } else {
                o0Var.C(1771357244);
                o0Var.g0(false);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(z14, str, aVar, r1Var, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    public static final void b(List<j90.n> list, p<? super Integer, ? super j90.n, Unit> pVar, e23.l<? super la0.b, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        list.getClass();
        pVar.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-458470151);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_choose_activity_profiles);
            s62.a.f157643a.getClass();
            u4.d dVarA = t.a(t62.a.f162797a);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_next);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_skip_button);
            i53.f fVarA = i53.a.a(new i3("MENU_ITEM_HELP", gl1.y.Q(o0VarE, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
            int i16 = i15 & 896;
            boolean z14 = i16 == 256;
            Object objQ = o0VarE.q();
            m.a aVar3 = m.f135153a;
            if (z14) {
                objQ = new gt1.k(lVar, 13);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new gt1.k(lVar, 13);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            boolean z15 = i16 == 256;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new gt1.k(lVar, 14);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new gt1.k(lVar, 14);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar5 = (e23.a) objQ2;
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new m8(aVar, 10);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new m8(aVar, 10);
                    o0VarE.K(objQ3);
                }
            }
            o0Var = o0VarE;
            da0.p.b("choose_activity_profiles_screen", strQ, dVarA, null, null, strQ2, aVar4, false, strQ3, aVar5, false, null, null, false, false, aVar2, fVarA, (e23.l) objQ3, null, null, null, z3.f.c(1903609849, new hv0.d(14, list, pVar), o0VarE), o0Var, 6, ((i15 << 3) & 458752) | 2097152, 384, 3832984);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(list, pVar, lVar, aVar, aVar2, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    public static final void c(r rVar, p pVar, List list, p pVar2, m mVar, int i14) {
        r rVar2;
        p pVar3;
        r1 r1VarC;
        o0 o0VarE = mVar.E(350497295);
        int i15 = 2048;
        int i16 = i14 | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(pVar2) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            rVar2 = rVar;
            r rVarC = k.c(rVar2, o0VarE);
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
            pVar3 = pVar;
            pVar3.invoke(o0VarE, 6);
            o0VarE.C(1887459917);
            int i17 = 0;
            for (Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    x.q();
                    throw null;
                }
                j90.n nVar = (j90.n) obj;
                if (s.g(nVar, h0.b0(list))) {
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97918c;
                    bVar2.getClass();
                    r1VarC = k2.i.c(f14, eVar.f97918c, 0.0f, 0.0f, 12);
                } else if (s.g(nVar, h0.m0(list))) {
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f15 = eVar2.f97918c;
                    bVar3.getClass();
                    r1VarC = k2.i.c(0.0f, 0.0f, eVar2.f97918c, f15, 3);
                } else {
                    r1VarC = m1.f128891a;
                }
                r1 r1Var = r1VarC;
                boolean z14 = nVar.f97843d;
                String str = nVar.f97842c;
                boolean zK = ((i16 & 7168) == i15) | o0VarE.k(i17) | o0VarE.B(nVar);
                Object objQ = o0VarE.q();
                if (zK) {
                    objQ = new a83.a(pVar2, i17, nVar, 9);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a83.a(pVar2, i17, nVar, 9);
                        o0VarE.K(objQ);
                    }
                }
                a(0, (e23.a) objQ, str, r1Var, o0VarE, z14);
                i17 = i18;
                i15 = 2048;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            rVar2 = rVar;
            pVar3 = pVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(rVar2, pVar3, list, pVar2, i14, 10);
        }
    }
}
