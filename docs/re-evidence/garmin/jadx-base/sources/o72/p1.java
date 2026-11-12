package o72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.e5;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class p1 {
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(778796707);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            c2.l.f(c2.l.A(aVar, 0.0f, 8, 1), o0VarE);
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            b(i53.a.a(new t82.a("1d", "One Day"), new t82.a("7d", "Seven Days"), new t82.a("4w", "Four Weeks"), new t82.a("12m", "12 Months")), o0VarE, 0);
            float f14 = 16;
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            b(i53.a.a(new t82.a("Current", null, 2, null), new t82.a("7d", "Seven Days"), new t82.a("4w", "Four Weeks"), new t82.a("12m", "12 Months")), o0VarE, 0);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            b(i53.a.a(new t82.a("1d", "One Day"), new t82.a("7d", "Seven Days"), new t82.a("4w", "Four Weeks")), o0VarE, 0);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            b(i53.a.a(new t82.a("Current", null, 2, null), new t82.a("7d", "Seven Days"), new t82.a("4w", "Four Weeks")), o0VarE, 0);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            b(i53.a.a(new t82.a("1d", "One Day"), new t82.a("7d", "Seven Days")), o0VarE, 0);
            c2.l.f(c2.x2.h(aVar, f14), o0VarE);
            b(i53.a.a(new t82.a("Current", null, 2, null), new t82.a("7d", "Seven Days")), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b1(i14, 20);
        }
    }

    public static final void b(i53.c<t82.a> cVar, p3.m mVar, int i14) {
        i53.c<t82.a> cVar2;
        p3.o0 o0VarE = mVar.E(729865770);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = e5.o(0, o0VarE);
            }
            p3.n1 n1Var = (p3.n1) objQ;
            int intValue = n1Var.getIntValue();
            int i16 = i15 & 14;
            boolean zR = o0VarE.r(context) | (i16 == 4);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new ls0.h(context, 19, cVar, n1Var);
                o0VarE.K(objQ2);
            }
            cVar2 = cVar;
            t82.c.a(cVar2, null, intValue, 0.0f, (e23.l) objQ2, o0VarE, i16, 26);
        } else {
            cVar2 = cVar;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.p(cVar2, i14, 11);
        }
    }
}
