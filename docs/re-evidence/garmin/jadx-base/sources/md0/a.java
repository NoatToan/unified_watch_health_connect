package md0;

import c2.b0;
import c2.j;
import c2.l;
import c2.q;
import c2.u;
import c2.x2;
import c2.y;
import c2.z;
import f5.z0;
import h4.r;
import h5.e0;
import i3.e5;
import i3.mh;
import java.util.List;
import l30.i0;
import l72.f0;
import l72.r1;
import m72.o;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import r1.g0;
import r1.v1;
import tn.k;
import xd2.m0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static final void a(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1980039999);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            d(o0VarE, 0);
            e(o0VarE, 0);
            f(o0VarE, 0);
            b(o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(i14, 9);
        }
    }

    public static final void b(m mVar, int i14) {
        o0 o0VarE = mVar.E(145487252);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            List listK = x.k("Loading…", "Error", "Content Ready");
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ;
            r1.b("contentSwap — AnimatedContent cross-fade with SizeTransform", null, o0VarE, 6, 2);
            f0 f0Var = f0.f110999a;
            String strF = org.apache.commons.lang3.e.f("Next State (", ")", listK.get(n1Var.getIntValue()));
            r.a aVar = r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarA = l.A(aVar, f14, 0.0f, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new i0(23, listK, n1Var);
                o0VarE.K(objQ2);
            }
            f0Var.d(24960, 9, (e23.a) objQ2, rVarA, strF, o0VarE, null, false);
            l.f(x2.h(aVar, 8), o0VarE);
            int intValue = n1Var.getIntValue();
            xz1.a.f192853a.getClass();
            r1.b.a(Integer.valueOf(intValue), l.A(aVar, f14, 0.0f, 2), new m0(14), null, "contentSwap", null, z3.f.c(1781890014, new a6.c(listK, 11), o0VarE), o0VarE, 1597488, 40);
            o0VarE = o0VarE;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(i14, 13);
        }
    }

    public static final void c(String str, String str2, m mVar, int i14) {
        String str3;
        String str4;
        o0 o0VarE = mVar.E(1292147485);
        if (o0VarE.n(i14 & 1, (i14 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            str3 = str;
            str4 = str2;
            l72.l.d(str3, str4, null, l.A(r.S, 16, 0.0f, 2), null, false, null, o0VarE, 3126, 116);
        } else {
            str3 = str;
            str4 = str2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.o(str3, str4, i14, 22);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(m mVar, int i14) {
        o0 o0VarE = mVar.E(1619492395);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r1.b("ItemEnter / ItemExit — fade + vertical expand/shrink from top", null, o0VarE, 6, 2);
            f0 f0Var = f0.f110999a;
            String str = ((Boolean) p1Var.getF182175a()).booleanValue() ? "Hide Item" : "Show Item";
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarA = l.A(aVar, 16, 0.0f, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ly0.f(p1Var, 4);
                o0VarE.K(objQ2);
            }
            f0Var.d(24960, 9, (e23.a) objQ2, rVarA, str, o0VarE, null, false);
            l.f(x2.h(aVar, 8), o0VarE);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            xz1.a.f192853a.getClass();
            v1 v1Var = xz1.a.f192854b;
            r1.x1 x1Var2 = xz1.a.f192855c;
            b.f117889a.getClass();
            c0.e(zBooleanValue, null, v1Var, x1Var2, null, b.f117890b, o0VarE, 196608, 18);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(i14, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(m mVar, int i14) {
        o0 o0VarE = mVar.E(-608349367);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r1.b("PopEnter / PopExit — fade + scale for overlays", null, o0VarE, 6, 2);
            f0 f0Var = f0.f110999a;
            String str = ((Boolean) p1Var.getF182175a()).booleanValue() ? "Dismiss Overlay" : "Show Overlay";
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarA = l.A(aVar, 16, 0.0f, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ly0.f(p1Var, 5);
                o0VarE.K(objQ2);
            }
            f0Var.d(24960, 9, (e23.a) objQ2, rVarA, str, o0VarE, null, false);
            l.f(x2.h(aVar, 8), o0VarE);
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            xz1.a.f192853a.getClass();
            v1 v1Var = xz1.a.f192856d;
            r1.x1 x1Var2 = xz1.a.f192857e;
            b.f117889a.getClass();
            c0.e(zBooleanValue, null, v1Var, x1Var2, null, b.f117891c, o0VarE, 196608, 18);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(i14, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(m mVar, int i14) {
        o0 o0VarE = mVar.E(-71225298);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r1.b("SizeTransformSpec — animateContentSize for widget resize", null, o0VarE, 6, 2);
            f0 f0Var = f0.f110999a;
            String str = ((Boolean) p1Var.getF182175a()).booleanValue() ? "Collapse" : "Expand";
            r.a aVar = r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarA = l.A(aVar, f14, 0.0f, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ly0.f(p1Var, 6);
                o0VarE.K(objQ2);
            }
            f0Var.d(24960, 9, (e23.a) objQ2, rVarA, str, o0VarE, null, false);
            float f15 = 8;
            l.f(x2.h(aVar, f15), o0VarE);
            r rVarF = x2.f(l.A(aVar, f14, 0.0f, 2), 1.0f);
            xz1.a.f192853a.getClass();
            r rVarY = l.y(u1.n.e(g0.a(rVarF, xz1.a.f192858f, 2), k.b(d92.b.f58623a, o0VarE), k2.i.a(f15)), f14);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u uVar = u.f22885a;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(aVar, o0VarE);
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
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c("SizeTransformSpec", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97931h), o0VarE, 6, 0, 131070);
            o0VarE = o0VarE;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(1605398047);
                l.f(x2.h(aVar, f15), o0VarE);
                fVar2.getClass();
                mh.c("This extra content animates in/out using AnimationDefaults.ContentResize (SizeTransform tween). The container smoothly resizes as content changes.", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1605760344);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(i14, 12);
        }
    }
}
