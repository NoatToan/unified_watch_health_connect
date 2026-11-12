package b02;

import a3.e;
import as.s;
import c2.j;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import h5.g;
import i3.i7;
import j92.c;
import k2.i;
import l4.k;
import l72.v2;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import u1.w;
import u4.d;
import u4.o;
import u4.p;
import v.h;
import v62.e1;
import v62.o1;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    public static final void a(int i14, e23.a aVar, String str, m mVar, d dVar, boolean z14) {
        long jB;
        long jB2;
        o0 o0VarE = mVar.E(824392375);
        int i15 = 2;
        int i16 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            c cVar = j92.b.f97901d;
            r rVarQ = x2.q(aVar2, cVar.f97906e);
            bVar.getClass();
            r rVarB = k.b(rVarQ, i.a(j92.b.f97900c.f97910b));
            if (z14) {
                o0VarE.C(1967100766);
                jB = d92.b.a(o0VarE).d().a().a();
            } else {
                o0VarE.C(1967101920);
                jB = d92.b.a(o0VarE).d().a().b();
            }
            o0VarE.g0(false);
            r rVarE = u1.n.e(rVarB, jB, m1.f128891a);
            boolean z15 = (i16 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new as.n(aVar, 13);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new as.n(aVar, 13);
                    o0VarE.K(objQ);
                }
            }
            r rVarA = v2.a(w.d(rVarE, false, null, null, (e23.a) objQ, 15), str != null, new s(str, i15), o0VarE, 0);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
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
            b4.c(g.a.f81810g, z0VarD, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar2 = g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            o oVarB = p.b(dVar, o0VarE);
            if (z14) {
                jB2 = zl.a.b(o0VarE, 1118465192, o0VarE).f63508c;
            } else {
                o0VarE.C(1118466244);
                jB2 = d92.b.a(o0VarE).f().b();
            }
            o0VarE.g0(false);
            bVar.getClass();
            i7.a(oVarB, null, uVar.c(x2.q(aVar2, cVar.f97903b), h4.d.a.f81528f), jB2, o0VarE, 56, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(dVar, z14, str, aVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x0189  */
    public static final void b(Boolean bool, String str, l<? super Boolean, Unit> lVar, m mVar, int i14) {
        String strJ;
        String strJ2;
        o0 o0VarE = mVar.E(1661579512);
        int i15 = i14 | (o0VarE.B(bool) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            j jVar = j.f22691a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            jVar.getClass();
            j.i iVarI = j.i(f14);
            r.a aVar = r.S;
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new defpackage.b(str, 15);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new defpackage.b(str, 15);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((l) objQ, aVar, true);
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            s62.a.f157643a.getClass();
            t62.b bVar2 = t62.b.f162798a;
            d dVarA = o1.a(bVar2);
            Boolean bool2 = Boolean.FALSE;
            boolean zG = p005kotlin.jvm.internal.s.g(bool, bool2);
            if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
                o0VarE.C(1468302812);
                strJ = y.P(R.string.lbl_logged_value, new Object[]{y.Q(o0VarE, R.string.lbl_no)}, o0VarE);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1468412986, R.string.lbl_press_to_log_no, o0VarE, false);
            }
            String str2 = strJ;
            int i16 = i15 & 896;
            boolean z15 = i16 == 256;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new a40.a(lVar, 7);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new a40.a(lVar, 7);
                    o0VarE.K(objQ2);
                }
            }
            a(0, (e23.a) objQ2, str2, o0VarE, dVarA, zG);
            d dVarA2 = e1.a(bVar2);
            Boolean bool3 = Boolean.TRUE;
            boolean zG2 = p005kotlin.jvm.internal.s.g(bool, bool3);
            if (p005kotlin.jvm.internal.s.g(bool, bool3)) {
                o0VarE.C(1468711547);
                strJ2 = y.P(R.string.lbl_logged_value, new Object[]{y.Q(o0VarE, R.string.lbl_yes)}, o0VarE);
                o0VarE.g0(false);
            } else {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1468822713, R.string.lbl_press_to_log_yes, o0VarE, false);
            }
            String str3 = strJ2;
            boolean z16 = i16 == 256;
            Object objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new a40.a(lVar, 8);
                o0VarE.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new a40.a(lVar, 8);
                    o0VarE.K(objQ3);
                }
            }
            a(0, (e23.a) objQ3, str3, o0VarE, dVarA2, zG2);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(bool, str, lVar, i14, 13);
        }
    }

    public static final void c(r rVar, Boolean bool, l lVar, e23.p pVar, z3.e eVar, m mVar, int i14) {
        int i15;
        Object obj;
        Object obj2;
        lVar.getClass();
        o0 o0VarE = mVar.E(777638504);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            obj = bool;
            i15 |= o0VarE.B(obj) ? 32 : 16;
        } else {
            obj = bool;
        }
        if ((i14 & 384) == 0) {
            obj2 = lVar;
            i15 |= o0VarE.r(obj2) ? 256 : 128;
        } else {
            obj2 = lVar;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            l72.l.c(f.c(-712317386, new a42.y(pVar, obj, obj2, false, eVar, 7), o0VarE), null, x2.f(rVar, 1.0f), null, false, null, o0VarE, 6, 58);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(rVar, bool, lVar, pVar, eVar, i14, 4);
        }
    }
}
