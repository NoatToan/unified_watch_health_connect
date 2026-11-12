package w12;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.q;
import c.w;
import c2.x2;
import e23.l;
import e23.p;
import g.h;
import h4.r;
import i3.e5;
import i3.i7;
import lp1.j;
import m4.b0;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.d3;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f181275a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f181275a = 72;
    }

    public static final void a(m mVar, int i14) {
        o0 o0VarE = mVar.E(-1534191306);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = d3.a(t62.b.f162798a);
            d92.b.f58623a.getClass();
            long jD = d92.b.a(o0VarE).f().d();
            r.a aVar = r.S;
            d92.b.f58625c.getClass();
            i7.b(dVarA, null, x2.q(aVar, j92.b.f97901d.f97904c), jD, o0VarE, 48, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vp1.a(i14, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(boolean z14, o12.d dVar, l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, m mVar, int i14) {
        o0 o0Var;
        dVar.getClass();
        boolean z15 = dVar.f128544e;
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-406328434);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(dVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.j(o0VarE);
            }
            b0 b0Var = (b0) objQ2;
            boolean zH = o0VarE.h(z15);
            Object objQ3 = o0VarE.q();
            if (zH || objQ3 == c2565a) {
                objQ3 = hb.a.n(z15, o0VarE);
            }
            p1 p1Var2 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ4;
            h hVar = new h();
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ5 = o0VarE.q();
            if (z16 || objQ5 == c2565a) {
                objQ5 = new rx1.m(aVar, 18);
                o0VarE.K(objQ5);
            }
            q qVarC = w.c(hVar, (l) objQ5, o0VarE, 0);
            Boolean bool = (Boolean) p1Var.getF182175a();
            bool.getClass();
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new f(b0Var, p1Var, null);
                o0VarE.K(objQ6);
            }
            l0.e((p) objQ6, bool, o0VarE);
            o0Var = o0VarE;
            z02.d.a(dVar.f128541b, z3.f.c(1438621139, new j(aVar2, context, 2), o0VarE), null, null, null, z3.f.c(850672855, new ci0.g(dVar, context, aVar3, qVarC, z14, b0Var, lVar, p1Var, p1Var2, n1Var), o0VarE), o0Var, 196656, 28);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(z14, dVar, lVar, aVar, aVar2, aVar3, i14);
        }
    }
}
