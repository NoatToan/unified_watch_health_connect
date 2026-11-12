package g52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.u;
import c2.y;
import c2.z;
import f5.z0;
import h5.e0;
import l72.f3;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v32 */
    public static final void a(i53.c<z42.j> cVar, p3.m mVar, int i14) {
        b82.p pVar;
        p2 p2VarI0;
        String strF;
        Integer totalPushes;
        o0 o0VarE = mVar.E(2108116928);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        boolean z14 = false;
        int i16 = 8;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (cVar == null || cVar.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    pVar = new b82.p(cVar, i14, 7);
                }
            } else {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new d52.e(context);
                    o0VarE.K(objQ);
                }
                d52.e eVar = (d52.e) objQ;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new pi0.e(context);
                    o0VarE.K(objQ2);
                }
                pi0.e eVar2 = (pi0.e) objQ2;
                h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                if (cVar2 == null) {
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
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = kg.f.b(o0VarE);
                }
                a2.j jVar = (a2.j) objQ3;
                o0VarE.C(-1979960467);
                for (z42.j jVar2 : h0.G0(cVar)) {
                    LocalDate localDateB = jVar2.b();
                    if (localDateB != null) {
                        DateTime dateTimeAtStartOfDay = localDateB.toDateTimeAtStartOfDay();
                        dateTimeAtStartOfDay.getClass();
                        strF = eVar2.a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_NO_DAY);
                    } else {
                        strF = null;
                    }
                    z42.l values = jVar2.getValues();
                    ?? IntValue = (values == null || (totalPushes = values.getTotalPushes()) == null) ? z14 : totalPushes.intValue();
                    eVar.getClass();
                    String strB = d52.e.b(IntValue);
                    h4.r.a aVar2 = h4.r.S;
                    Object objQ4 = o0VarE.q();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new g12.m(i16);
                        o0VarE.K(objQ4);
                    }
                    h4.r rVarD = wz1.i.d(aVar2, jVar, (e23.a) objQ4);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, z14);
                    x1 x1Var2 = p3.n.f135158a;
                    int iHashCode2 = Long.hashCode(o0VarE.U);
                    i2 i2VarA1 = o0VarE.a0();
                    h4.r rVarC3 = h4.k.c(rVarD, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (cVar2 == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, o0VarE);
                    u uVar = u.f22885a;
                    if (strF == null) {
                        strF = eVar.f();
                    }
                    b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                    c0235a.f16962a.put("value", eVar.g(strB));
                    b92.a aVarB = c0235a.b();
                    int i17 = b92.a.f16960b;
                    f3.a(strF, null, strB, aVarB, null, o0VarE, 0, 18);
                    o0VarE.g0(true);
                    jVar = jVar;
                    z14 = false;
                    i16 = 8;
                }
                o0VarE.g0(z14);
                o0VarE.g0(true);
                x1 x1Var3 = p3.n.f135158a;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            pVar = new b82.p(cVar, i14, 8);
            p2VarI0.f135219d = pVar;
        }
    }
}
