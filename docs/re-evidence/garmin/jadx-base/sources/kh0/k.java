package kh0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.y;
import c2.z;
import h5.e0;
import java.util.List;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:62:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:0x0211  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r14v0, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v19 */
    public static final void a(ih0.s sVar, List<dh0.i> list, DateTime dateTime, DateTime dateTime2, e23.l<? super b63.o, Unit> lVar, p3.m mVar, int i14) {
        ?? r14;
        ih0.i iVar;
        Object obj;
        ?? r15;
        Object obj2;
        e23.l<? super b63.o, Unit> lVar2 = lVar;
        sVar.getClass();
        lVar2.getClass();
        ?? E = mVar.E(702196653);
        int i15 = 16;
        int i16 = i14 | (E.r(sVar) ? 4 : 2) | (E.r(list) ? 32 : 16) | (E.r(dateTime) ? 256 : 128) | (E.r(dateTime2) ? 2048 : 1024) | (E.r(lVar2) ? 16384 : 8192);
        ?? r16 = 0;
        if (E.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            ih0.i iVar2 = new ih0.i((Context) E.A(AndroidCompositionLocals_androidKt.f6042b));
            p1 p1VarG = f0.G(sVar.f93489h, E);
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, E, 0);
            int iHashCode = Long.hashCode(E.U);
            i2 i2VarA0 = E.a0();
            h4.r rVarC = h4.k.c(aVar, E);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (E.f135177b == null) {
                p0.l();
                throw null;
            }
            E.z();
            if (E.T) {
                E.M(aVar2);
            } else {
                E.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, E);
            b4.c(h5.g.a.f81809f, i2VarA0, E);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (E.T || !p005kotlin.jvm.internal.s.g(E.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, E, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, E);
            b0 b0Var = b0.f22601a;
            int i17 = i16 >> 3;
            a.a(list, dateTime, dateTime2, false, 0, E, (i17 & 14) | 27648 | (i17 & 112) | (i17 & 896));
            List<dh0.i> listG0 = list != null ? h0.G0(list) : null;
            p3.m.a aVar3 = p3.m.f135153a;
            if (listG0 == null) {
                E.C(-950199557);
                E.g0(false);
                r15 = 0;
            } else {
                E.C(-950199556);
                E.C(662086509);
                for (dh0.i iVar3 : listG0) {
                    LocalDate localDate = iVar3.f59601a;
                    DateTime dateTimeAtStartOfDay = localDate != null ? localDate.toDateTimeAtStartOfDay() : null;
                    if (dateTimeAtStartOfDay != null) {
                        E.C(18402332);
                        DateTime dateTimePlusDays = dateTimeAtStartOfDay.plusDays(6);
                        dateTimePlusDays.getClass();
                        String strL = iVar2.f93455b.l(dateTimeAtStartOfDay, dateTimePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
                        String strB = iVar2.b(iVar3.f59602b);
                        b63.o oVar = new b63.o(dateTimeAtStartOfDay.getYear(), dateTimeAtStartOfDay.getMonthOfYear(), dateTimeAtStartOfDay.getDayOfMonth());
                        h4.r.a aVar4 = h4.r.S;
                        float f14 = i15;
                        g6.f.a aVar5 = g6.f.f75994b;
                        float f15 = 8;
                        h4.r rVarB = c2.l.B(aVar4, f14, f15, f14, f15);
                        int i18 = ((57344 & i16) == 16384 ? 1 : r16) | (E.r(oVar) ? 1 : 0);
                        Object objQ = E.q();
                        if (i18 == 0) {
                            aVar3.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                obj = objQ;
                                j jVar = new j(lVar2, oVar, r16);
                                E.K(jVar);
                                obj = jVar;
                            }
                        } else {
                            obj = objQ;
                            j jVar2 = new j(lVar2, oVar, r16);
                            E.K(jVar2);
                            obj = jVar2;
                        }
                        obj = objQ;
                        iVar = iVar2;
                        r14 = r16 == true ? 1 : 0;
                        l72.l.e(strL, null, strB, null, null, null, rVarB, null, false, (e23.a) obj, E, 0, 442);
                        E.g0(r14);
                    } else {
                        r14 = r16;
                        iVar = iVar2;
                        E.C(19023138);
                        E.g0(r14);
                    }
                    r16 = r14;
                    iVar2 = iVar;
                    i15 = i15;
                    i16 = i16;
                    lVar2 = lVar;
                }
                ?? r17 = r16;
                E.g0(r17);
                E.g0(r17);
                r15 = r17;
            }
            v60.a aVar6 = (v60.a) p1VarG.getF182175a();
            if (aVar6 == null || !aVar6.f175792a) {
                E.C(-949171317);
                E.g0(r15);
            } else {
                E.C(-949316428);
                v60.a aVar7 = (v60.a) p1VarG.getF182175a();
                String str = aVar7 != null ? aVar7.f175793b : null;
                boolean zR = E.r(sVar);
                Object objQ2 = E.q();
                if (zR) {
                    obj2 = objQ2;
                    ih0.r rVar = new ih0.r(sVar, 3);
                    E.K(rVar);
                    obj2 = rVar;
                } else {
                    aVar3.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        obj2 = objQ2;
                        ih0.r rVar2 = new ih0.r(sVar, 3);
                        E.K(rVar2);
                        obj2 = rVar2;
                    }
                }
                obj2 = objQ2;
                l.a(r15, (e23.a) obj2, str, E);
                E.g0(r15);
            }
            E.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            E.e();
        }
        p2 p2VarI0 = E.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(sVar, list, dateTime, dateTime2, lVar, i14, 10);
        }
    }
}
