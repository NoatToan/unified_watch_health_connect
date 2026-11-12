package xq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [pi0.e] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [b92.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, org.joda.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v34, types: [org.joda.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    public static final void a(i53.c<jq1.j> cVar, e23.l<? super LocalDate, Unit> lVar, p3.m mVar, int i14) {
        p2 p2VarI0;
        d50.f fVar;
        ?? localDate;
        ?? M;
        LocalDate localDateV;
        Double d14;
        lVar.getClass();
        ?? E = mVar.E(-1456059682);
        int i15 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? E.B(cVar) : E.r(cVar) ? 4 : 2) | i14 : i14;
        int i16 = 32;
        if ((i14 & 48) == 0) {
            i15 |= E.r(lVar) ? 32 : 16;
        }
        int i17 = 1;
        boolean z14 = false;
        if (E.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (cVar == null || cVar.isEmpty()) {
                p2VarI0 = E.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    fVar = new d50.f(cVar, lVar, i14, 8);
                }
            } else {
                Context context = (Context) E.A(AndroidCompositionLocals_androidKt.f6042b);
                Object objQ = E.q();
                p3.m.f135153a.getClass();
                Object obj = p3.m.a.f135155b;
                if (objQ == obj) {
                    objQ = p0.n(new pq1.d(context));
                    E.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                Object objQ2 = E.q();
                if (objQ2 == obj) {
                    objQ2 = p0.n(new pi0.e(context));
                    E.K(objQ2);
                }
                p1 p1Var2 = (p1) objQ2;
                r rVarE = u1.n.e(r.S, vb.h.f(d92.b.f58623a, E), m1.f128891a);
                d92.b.f58625c.getClass();
                r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, E, 0);
                int iHashCode = Long.hashCode(E.U);
                i2 i2VarA0 = E.a0();
                r rVarC2 = h4.k.c(rVarC, E);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                ?? r14 = 0;
                if (E.f135177b == null) {
                    p0.l();
                    throw null;
                }
                E.z();
                if (E.T) {
                    E.M(aVar);
                } else {
                    E.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, E);
                b4.c(h5.g.a.f81809f, i2VarA0, E);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (E.T || !s.g(E.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, E, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC2, E);
                b0 b0Var = b0.f22601a;
                E.C(2031971078);
                for (jq1.j jVar : h0.G0(cVar)) {
                    pq1.d dVar = (pq1.d) p1Var.getF182175a();
                    jq1.j.d dVar2 = jVar.f100023b;
                    ?? DoubleValue = (dVar2 == null || (d14 = dVar2.f100025a) == null) ? z14 : (int) d14.doubleValue();
                    dVar.getClass();
                    String strB = pq1.d.b(DoubleValue);
                    String str = jVar.f100022a;
                    if (str != null) {
                        localDateV = g22.k.v(str, "yyyy-MM-dd");
                    } else {
                        localDate = r14;
                    }
                    if (localDate == 0) {
                        localDate = localDateV;
                        localDate = DateTime.now().toLocalDate();
                    }
                    if (localDate != 0) {
                        LocalDate localDatePlusDays = localDate.plusDays(6);
                        ?? r15 = (pi0.e) p1Var2.getF182175a();
                        localDatePlusDays.getClass();
                        M = r15.m(localDate, localDatePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                    } else {
                        M = r14;
                    }
                    if (M == 0) {
                        M = "";
                    }
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97918c;
                    bVar2.getClass();
                    r rVarZ = c2.l.z(aVar2, eVar.f97920e, f14);
                    pq1.d dVar3 = (pq1.d) p1Var.getF182175a();
                    dVar3.getClass();
                    b92.a.C0235a c0235a = new b92.a.C0235a(r14, i17, r14);
                    c0235a.f16962a.put("value", dVar3.g(strB));
                    b92.a aVarB = c0235a.b();
                    boolean zR = ((i15 & 112) == i16 ? true : z14) | E.r(localDate);
                    Object objQ3 = E.q();
                    if (zR || objQ3 == p3.m.a.f135155b) {
                        objQ3 = new di0.e(lVar, (LocalDate) localDate, 11);
                        E.K(objQ3);
                    }
                    int i18 = b92.a.f16960b;
                    l72.l.e(M, null, strB, null, null, null, rVarZ, aVarB, false, (e23.a) objQ3, E, 0, 314);
                    z14 = z14;
                    i16 = i16;
                    r14 = r14;
                    i17 = 1;
                    i15 = i15;
                }
                E.g0(z14);
                E.g0(true);
                x1 x1Var2 = n.f135158a;
            }
            p2VarI0.f135219d = fVar;
        }
        E.e();
        p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            fVar = new d50.f(cVar, lVar, i14, 9);
            p2VarI0.f135219d = fVar;
        }
    }
}
