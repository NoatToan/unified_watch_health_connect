package g52;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.y;
import c2.z;
import h5.e0;
import o4.m1;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [b92.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @SuppressLint({"RememberReturnType"})
    public static final void a(i53.c<z42.j> cVar, e23.l<? super LocalDate, Unit> lVar, p3.m mVar, int i14) {
        p2 p2VarI0;
        d50.f fVar;
        Object obj;
        ?? r14;
        char c14;
        String strM;
        Integer totalPushes;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1038024173);
        int i15 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (cVar == null || cVar.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    fVar = new d50.f(cVar, lVar, i14, 3);
                }
            } else {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    obj = objQ;
                    d52.e eVar = new d52.e(context);
                    o0VarE.K(eVar);
                    obj = eVar;
                }
                obj = objQ;
                d52.e eVar2 = (d52.e) obj;
                Object objQ2 = o0VarE.q();
                Object obj2 = objQ2;
                if (objQ2 == c2565a) {
                    pi0.e eVar3 = new pi0.e(context);
                    o0VarE.K(eVar3);
                    obj2 = eVar3;
                }
                pi0.e eVar4 = (pi0.e) obj2;
                h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(rVarE, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
                h5.g.V.getClass();
                e0.a aVar = h5.g.a.f81805b;
                ?? r15 = 0;
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
                o0VarE.C(-284022834);
                for (z42.j jVar : h0.G0(cVar)) {
                    z42.l values = jVar.getValues();
                    int iIntValue = (values == null || (totalPushes = values.getTotalPushes()) == null) ? 0 : totalPushes.intValue();
                    eVar2.getClass();
                    String strB = d52.e.b(iIntValue);
                    LocalDate localDateB = jVar.b();
                    if (localDateB != null) {
                        LocalDate localDatePlusDays = localDateB.plusDays(6);
                        localDatePlusDays.getClass();
                        strM = eVar4.m(localDateB, localDatePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                    } else {
                        r14 = r15;
                    }
                    if (r14 == 0) {
                        r14 = strM;
                        r14 = "";
                    }
                    r14 = strM;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar5 = j92.b.f97899b;
                    float f14 = eVar5.f97918c;
                    bVar2.getClass();
                    h4.r rVarZ = c2.l.z(aVar2, eVar5.f97920e, f14);
                    b92.a.C0235a c0235a = new b92.a.C0235a(r15, i16, r15);
                    c0235a.f16962a.put("value", eVar2.g(strB));
                    b92.a aVarB = c0235a.b();
                    int i17 = (o0VarE.r(localDateB) ? 1 : 0) | ((i15 & 112) == 32 ? i16 : 0);
                    Object objQ3 = o0VarE.q();
                    if (i17 != 0 || objQ3 == p3.m.a.f135155b) {
                        c14 = 2;
                        objQ3 = new di0.e(localDateB, lVar, 2);
                        o0VarE.K(objQ3);
                    } else {
                        c14 = 2;
                    }
                    int i18 = b92.a.f16960b;
                    l72.l.e(r14, null, strB, null, null, null, rVarZ, aVarB, false, (e23.a) objQ3, o0VarE, 0, 314);
                    i15 = i15;
                    r15 = 0;
                    eVar4 = eVar4;
                    eVar2 = eVar2;
                    i16 = 1;
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = fVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            fVar = new d50.f(cVar, lVar, i14, 4);
            p2VarI0.f135219d = fVar;
        }
    }
}
