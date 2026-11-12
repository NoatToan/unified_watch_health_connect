package qn1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b10.d;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import c42.e0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import h4.k;
import h4.r;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import mm1.g;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import pi0.e;
import pi0.f;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((g) t14).getWeekEndDate(), ((g) t7).getWeekEndDate());
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(List<g> list, l<? super LocalDate, Unit> lVar, m mVar, int i14) {
        e0 e0Var;
        p2 p2VarI0;
        Double averageSleepSeconds;
        o0 o0VarE = mVar.E(615221497);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i16 = 1;
        int i17 = 17;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (list == null || list.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    e0Var = new e0(lVar, i14, 16, list);
                }
            } else {
                y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                d dVar = new d((Context) o0VarE.A(y3Var));
                e eVar = new e((Context) o0VarE.A(y3Var));
                r.a aVar = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarY = c2.l.y(aVar, j92.b.f97899b.f97920e);
                j.f22691a.getClass();
                j.k kVar = j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                r rVarC = k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar2 = h5.g.a.f81805b;
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
                    h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                o0VarE.C(-2006873163);
                for (g gVar : list) {
                    LocalDate localDateY = gl1.y.y(gVar);
                    String weekEndDate = gVar.getWeekEndDate();
                    LocalDate localDateW = weekEndDate != null ? g22.k.w(weekEndDate, "yyyy-MM-dd") : null;
                    String strB = (localDateY == null || localDateW == null) ? dVar.b() : eVar.m(localDateY, localDateW, f.SHORT_MONTH_NO_WEEKDAY);
                    g.a values = gVar.getValues();
                    Integer numValueOf = (values == null || (averageSleepSeconds = values.getAverageSleepSeconds()) == null) ? null : Integer.valueOf((int) averageSleepSeconds.doubleValue());
                    if (numValueOf != null && numValueOf.intValue() < 60) {
                        numValueOf = 0;
                    }
                    z3.e eVarC = z3.f.c(-1473480358, new o72.b(i17, dVar.d(numValueOf), gVar), o0VarE);
                    g6.f.a aVar3 = g6.f.f75994b;
                    r rVarA = c2.l.A(r.S, 0.0f, 8, i16);
                    int i18 = (o0VarE.r(localDateY) ? 1 : 0) | ((i15 & 112) == 32 ? i16 : 0);
                    Object objQ = o0VarE.q();
                    if (i18 == 0) {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new di0.e(localDateY, lVar, 8);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new di0.e(localDateY, lVar, 8);
                        o0VarE.K(objQ);
                    }
                    l72.l.d(strB, null, eVarC, rVarA, null, false, (e23.a) objQ, o0VarE, 3456, 50);
                    i16 = i16;
                    dVar = dVar;
                    i15 = i15;
                    eVar = eVar;
                    i17 = 17;
                }
                o0VarE.g0(false);
                o0VarE.g0(i16);
                x1 x1Var2 = n.f135158a;
            }
            p2VarI0.f135219d = e0Var;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            e0Var = new e0(lVar, i14, 17, list);
            p2VarI0.f135219d = e0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [pi0.e] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [b92.a, kotlin.jvm.internal.j] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r5v10, types: [b10.d] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [org.joda.time.LocalDate] */
    public static final void b(List<g> list, l<? super LocalDate, Unit> lVar, m mVar, int i14) {
        ?? r14;
        String strB;
        Double averageSleepSeconds;
        LocalDate localDateW;
        o0 o0VarE = mVar.E(-837146456);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            d dVar = new d((Context) o0VarE.A(y3Var));
            e eVar = new e((Context) o0VarE.A(y3Var));
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarA = c2.l.A(aVar, 0.0f, eVar2.f97918c, 1);
            bVar.getClass();
            float f14 = eVar2.f97918c;
            bVar.getClass();
            r rVarC = c2.l.C(aVar, 0.0f, f14, 0.0f, eVar2.f97920e, 5);
            bVar.getClass();
            r rVarA2 = c2.l.A(rVarC, eVar2.f97920e, 0.0f, 2);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarA2, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            ?? r15 = 0;
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1553564412);
            ?? r16 = dVar;
            ?? r17 = eVar;
            for (g gVar : list) {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                LocalDate localDateY = gl1.y.y(gVar);
                String weekEndDate = gVar.getWeekEndDate();
                if (weekEndDate != null) {
                    localDateW = g22.k.w(weekEndDate, "yyyy-MM-dd");
                } else {
                    r14 = r15;
                }
                if (localDateY == null || r14 == 0) {
                    r14 = localDateW;
                    strB = r16.b();
                } else {
                    strB = r17.m(localDateY, r14, f.SHORT_MONTH_NO_WEEKDAY);
                }
                g.a values = gVar.getValues();
                String strE = r16.e(values != null ? values.getAverageSleepScore() : r15);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_avg_score);
                g.a values2 = gVar.getValues();
                String strD = r16.d((values2 == null || (averageSleepSeconds = values2.getAverageSleepSeconds()) == null) ? r15 : Integer.valueOf((int) averageSleepSeconds.doubleValue()));
                String strQ2 = gl1.y.Q(o0VarE, R.string.pregnancy_avg_duration);
                int i16 = i15;
                b92.a.C0235a c0235a = new b92.a.C0235a(r15, 1, r15);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new qc.c(20);
                    o0VarE.K(objQ);
                }
                String strA = oi0.c.A(context, (l) objQ, strD);
                LinkedHashMap linkedHashMap = c0235a.f16962a;
                linkedHashMap.put("value", strA);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new qc.c(21);
                    o0VarE.K(objQ2);
                }
                linkedHashMap.put("value_secondary", oi0.c.A(context, (l) objQ2, strQ2));
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new qc.c(22);
                    o0VarE.K(objQ3);
                }
                linkedHashMap.put("value_2", oi0.c.A(context, (l) objQ3, strE));
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new qc.c(19);
                    o0VarE.K(objQ4);
                }
                linkedHashMap.put("value_2_secondary", oi0.c.A(context, (l) objQ4, strQ));
                b92.a aVarB = c0235a.b();
                boolean zR = o0VarE.r(localDateY) | ((i16 & 112) == 32);
                Object objQ5 = o0VarE.q();
                if (zR || objQ5 == c2565a) {
                    objQ5 = new di0.e(localDateY, lVar, 7);
                    o0VarE.K(objQ5);
                }
                int i17 = b92.a.f16960b;
                ?? r24 = r17;
                r rVar = rVarA;
                l72.l.e(strB, null, strE, strQ, strD, strQ2, rVar, aVarB, false, (e23.a) objQ5, o0VarE, 0, 258);
                rVarA = rVar;
                i15 = i16;
                r15 = 0;
                r16 = r16;
                r17 = r24;
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e0(lVar, i14, 15, list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0149  */
    /* JADX WARN: Code duplicated, block: B:66:0x0175  */
    public static final void c(mm1.f fVar, DateTime dateTime, DateTime dateTime2, l<? super LocalDate, Unit> lVar, m mVar, int i14) {
        List listN0;
        List<g> listB;
        lVar.getClass();
        o0 o0VarE = mVar.E(2094770243);
        int i15 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(dateTime2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r rVarE = u1.n.e(x2.d(r.S, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
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
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            LocalDate localDate = dateTime.toLocalDate();
            LocalDate localDate2 = dateTime2.toLocalDate();
            sn1.b.f160414a.getClass();
            if (sn1.b.g()) {
                o0VarE.C(-213555020);
                localDate.getClass();
                localDate2.getClass();
                rn1.n.a(fVar, localDate, localDate2, o0VarE, (i15 & 14) | 8);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-213442583);
                o0VarE.g0(false);
            }
            localDate.getClass();
            localDate2.getClass();
            int i16 = (i15 & 14) | 8;
            rn1.h.a(fVar, localDate, localDate2, o0VarE, i16);
            rn1.e.a(fVar, localDate, localDate2, o0VarE, i16);
            if (fVar == null || (listB = fVar.b()) == null || (listN0 = h0.N0(listB, new a())) == null) {
                listN0 = j0.f134944a;
            }
            boolean zG = sn1.b.g();
            m.a aVar2 = m.f135153a;
            if (zG) {
                o0VarE.C(-213083510);
                boolean z14 = (i15 & 7168) == 2048;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new qe2.c(lVar, 3);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new qe2.c(lVar, 3);
                        o0VarE.K(objQ);
                    }
                }
                b(listN0, (l) objQ, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-212983287);
                boolean z15 = (i15 & 7168) == 2048;
                Object objQ2 = o0VarE.q();
                if (z15) {
                    objQ2 = new qe2.c(lVar, 4);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new qe2.c(lVar, 4);
                        o0VarE.K(objQ2);
                    }
                }
                a(listN0, (l) objQ2, o0VarE, 0);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a((Object) fVar, (Object) dateTime, (Object) dateTime2, (l) lVar, i14, 27);
        }
    }
}
