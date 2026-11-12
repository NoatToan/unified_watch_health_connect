package c40;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.l;
import c2.y;
import c2.z;
import c22.l3;
import e23.q;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.List;
import l72.x0;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.u;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static final void a(e50.i iVar, m mVar, int i14) {
        z3.e eVarC;
        z3.e eVarC2;
        z3.e eVarC3;
        Double d14 = iVar.f63038e;
        Double d15 = iVar.f63036c;
        o0 o0VarE = mVar.E(1815105011);
        int i15 = (o0VarE.B(iVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            l3.a aVar = l3.f23124b;
            boolean z14 = iVar.f63043j;
            aVar.getClass();
            String strH1 = l3.a.H1(context, z14);
            Integer num = iVar.f63035b;
            boolean z15 = (num == null || d15 == null || (num.intValue() <= 0 && d15.doubleValue() <= 0.0d)) ? false : true;
            Integer num2 = iVar.f63037d;
            boolean z16 = (num2 == null || d14 == null || (num2.intValue() <= 0 && d14.doubleValue() <= 0.0d)) ? false : true;
            z3.e eVarC4 = z3.f.c(1467647189, new d(context, iVar, strH1, 4), o0VarE);
            z3.e eVarC5 = z3.f.c(-1656111436, new d(context, iVar, strH1, 5), o0VarE);
            if (z15) {
                o0VarE.C(156354252);
                eVarC = z3.f.c(882408728, new e(iVar, 3), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(156702227);
                o0VarE.g0(false);
                eVarC = null;
            }
            if (z16) {
                o0VarE.C(156774395);
                eVarC2 = z3.f.c(2053617399, new e(iVar, 4), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(157138707);
                o0VarE.g0(false);
                eVarC2 = null;
            }
            if (iVar.f63044k != null) {
                o0VarE.C(157211247);
                eVarC3 = z3.f.c(-1070141226, new e(iVar, 5), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(157433331);
                o0VarE.g0(false);
                eVarC3 = null;
            }
            ArrayList arrayListC = u.C(new q[]{eVarC4, eVarC5, eVarC, eVarC2, eVarC3});
            if (arrayListC.size() % 2 != 0) {
                b.f24311a.getClass();
                arrayListC = h0.D0(arrayListC, b.f24312b);
            }
            r rVarE = u1.n.e(r.S, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            r rVarA = l.A(rVarE, 0.0f, j92.b.f97899b.f97918c, 1);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1531181451);
            for (List list : h0.i1(arrayListC, 2, 2, true)) {
                x0 x0Var = x0.f111346a;
                r.a aVar3 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar2.getClass();
                x0Var.e(l.z(aVar3, f14, eVar.f97918c), z3.f.c(-32035443, new a31.a(list, 4), o0VarE), o0VarE, (x0.f111348c << 6) | 48, 0);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(iVar, i14, 1);
        }
    }
}
