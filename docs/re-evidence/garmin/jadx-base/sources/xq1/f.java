package xq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.p;
import c2.b0;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import l72.f3;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i53.c<jq1.j> cVar, p3.m mVar, int i14) {
        p pVar;
        p2 p2VarI0;
        String strF;
        Double d14;
        o0 o0VarE = mVar.E(-677392777);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (cVar == null || cVar.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new p(cVar, i14, 16);
                }
            } else {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = kg.f.b(o0VarE);
                }
                a2.j jVar = (a2.j) objQ;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(new pq1.d(context));
                    o0VarE.K(objQ2);
                }
                p1 p1Var = (p1) objQ2;
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(new pi0.e(context));
                    o0VarE.K(objQ3);
                }
                p1 p1Var2 = (p1) objQ3;
                r rVarE = u1.n.e(r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                d92.b.f58625c.getClass();
                r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new xh0.d(1);
                    o0VarE.K(objQ4);
                }
                r rVarD = wz1.i.d(rVarC, jVar, (e23.a) objQ4);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC2 = h4.k.c(rVarD, o0VarE);
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
                b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
                b0 b0Var = b0.f22601a;
                o0VarE.C(1891057979);
                for (jq1.j jVar2 : h0.G0(cVar)) {
                    String str = jVar2.f100022a;
                    LocalDate localDateV = str != null ? g22.k.v(str, "yyyy-MM-dd") : null;
                    if (localDateV != null) {
                        pi0.e eVar = (pi0.e) p1Var2.getF182175a();
                        DateTime dateTimeAtStartOfDay = localDateV.toDateTimeAtStartOfDay();
                        dateTimeAtStartOfDay.getClass();
                        strF = eVar.a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_NO_DAY);
                    } else {
                        strF = null;
                    }
                    pq1.d dVar = (pq1.d) p1Var.getF182175a();
                    jq1.j.d dVar2 = jVar2.f100023b;
                    int iDoubleValue = (dVar2 == null || (d14 = dVar2.f100025a) == null) ? 0 : (int) d14.doubleValue();
                    dVar.getClass();
                    String strB = pq1.d.b(iDoubleValue);
                    if (strF == null) {
                        strF = ((pq1.d) p1Var.getF182175a()).f();
                    }
                    String str2 = strF;
                    pq1.d dVar3 = (pq1.d) p1Var.getF182175a();
                    dVar3.getClass();
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("value", dVar3.g(strB));
                    b92.a aVarB = c0235a.b();
                    int i16 = b92.a.f16960b;
                    f3.a(str2, null, strB, aVarB, null, o0VarE, 0, 18);
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var2 = n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new p(cVar, i14, 17);
            p2VarI0.f135219d = pVar;
        }
    }
}
