package xq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import java.text.NumberFormat;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
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
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    public static final void a(i53.c<jq1.e> cVar, e23.l<? super LocalDate, Unit> lVar, p3.m mVar, int i14) {
        ?? r14;
        int iIntValue;
        Integer num;
        Integer num2;
        int iIntValue2;
        lVar.getClass();
        o0 o0VarE = mVar.E(1936844380);
        int i15 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        boolean z14 = false;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            if (cVar == null || cVar.isEmpty()) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d50.f(cVar, lVar, i14, 6);
                    return;
                }
                return;
            }
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(new pq1.d(context));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(new pi0.e(context));
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(aVar, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(-1634021375);
            for (jq1.e eVar : h0.G0(cVar)) {
                String str = eVar.f99995a;
                LocalDate localDateV = str != null ? g22.k.v(str, "yyyy-MM-dd") : null;
                jq1.e.d dVar = eVar.f99996b;
                if (localDateV == null) {
                    localDateV = DateTime.now().toLocalDate();
                }
                if (dVar == null || (num2 = dVar.f99998a) == null) {
                    r14 = z14;
                } else {
                    iIntValue2 = num2.intValue();
                }
                if (dVar == null || (num = dVar.f100000c) == null) {
                    r14 = iIntValue2;
                    r14 = iIntValue2;
                    iIntValue = 1;
                } else {
                    r14 = iIntValue2;
                    iIntValue = num.intValue();
                }
                pi0.e eVar2 = (pi0.e) p1Var2.getF182175a();
                localDateV.getClass();
                String strD = eVar2.d(localDateV, qi0.a.WEEKDAY);
                String strD2 = ((pi0.e) p1Var2.getF182175a()).d(localDateV, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                int i16 = (r14 * 100) / (iIntValue > 0 ? iIntValue : 1);
                ((pq1.d) p1Var.getF182175a()).getClass();
                String strB = pq1.d.b(r14);
                r.a aVar3 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar3 = j92.b.f97899b;
                float f14 = eVar3.f97918c;
                bVar2.getClass();
                r rVarZ = c2.l.z(aVar3, eVar3.f97920e, f14);
                pq1.d dVar2 = (pq1.d) p1Var.getF182175a();
                dVar2.getClass();
                int i17 = i15;
                String string = dVar2.f139569a.getString(R.string.lbl_value_percent, NumberFormat.getIntegerInstance().format(i16));
                String strC = zl.a.c(string, strD2, " • ", string);
                z3.e eVarC = z3.f.c(1479165796, new db0.d((int) r14, iIntValue, strB, p1Var), o0VarE);
                boolean zR = ((i17 & 112) == 32) | o0VarE.r(localDateV);
                Object objQ3 = o0VarE.q();
                if (zR || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new di0.e(lVar, localDateV, 10);
                    o0VarE.K(objQ3);
                }
                l72.l.d(strD, strC, eVarC, rVarZ, null, false, (e23.a) objQ3, o0VarE, 384, 48);
                p1Var = p1Var;
                i15 = i17;
                z14 = false;
            }
            o0VarE.g0(z14);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new d50.f(cVar, lVar, i14, 7);
        }
    }
}
