package g52;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import java.text.NumberFormat;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    public static final void a(i53.c<z42.e> cVar, e23.l<? super DateTime, Unit> lVar, p3.m mVar, int i14) {
        d50.f fVar;
        p2 p2VarI0;
        String string;
        lVar.getClass();
        o0 o0VarE = mVar.E(-58237235);
        int i15 = 2;
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(cVar) ? 4 : 2) | i14 : i14;
        int i17 = 32;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(lVar) ? 32 : 16;
        }
        boolean z14 = false;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            if (cVar == null || cVar.isEmpty()) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    fVar = new d50.f(cVar, lVar, i14, 1);
                }
            } else {
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(new d52.e(context));
                    o0VarE.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(new pi0.e(context));
                    o0VarE.K(objQ2);
                }
                p1 p1Var2 = (p1) objQ2;
                h4.r rVarD = x2.d(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC = c2.l.C(rVarD, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
                o0VarE.C(678391801);
                for (z42.e eVar : h0.G0(cVar)) {
                    LocalDate localDateB = eVar.b();
                    DateTime dateTimeAtStartOfDay = localDateB != null ? localDateB.toDateTimeAtStartOfDay() : null;
                    z42.e.b values = eVar.getValues();
                    Integer totalPushes = values != null ? values.getTotalPushes() : null;
                    z42.e.b values2 = eVar.getValues();
                    Integer pushGoal = values2 != null ? values2.getPushGoal() : null;
                    String strA = dateTimeAtStartOfDay != null ? ((pi0.e) p1Var2.getF182175a()).a(dateTimeAtStartOfDay, qi0.a.WEEKDAY) : null;
                    String strA2 = dateTimeAtStartOfDay != null ? ((pi0.e) p1Var2.getF182175a()).a(dateTimeAtStartOfDay, qi0.a.RELATIVE_YEAR_MONTH_DAY) : null;
                    ?? IntValue = pushGoal != null ? ((totalPushes != null ? totalPushes.intValue() : z14) * 100) / (pushGoal.intValue() > 0 ? pushGoal.intValue() : 1) : z14;
                    if (strA2 != null) {
                        d52.e eVar2 = (d52.e) p1Var.getF182175a();
                        eVar2.getClass();
                        String string2 = eVar2.f57568a.getString(R.string.lbl_value_percent, NumberFormat.getIntegerInstance().format((long) IntValue));
                        string = zl.a.c(string2, strA2, " • ", string2);
                    } else {
                        string = null;
                    }
                    d52.e eVar3 = (d52.e) p1Var.getF182175a();
                    int iIntValue = totalPushes != null ? totalPushes.intValue() : 0;
                    eVar3.getClass();
                    String strB = d52.e.b(iIntValue);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f14 = eVar4.f97918c;
                    bVar2.getClass();
                    h4.r rVarZ = c2.l.z(aVar2, eVar4.f97920e, f14);
                    if (strA == null) {
                        strA = ((d52.e) p1Var.getF182175a()).f57568a.getString(R.string.no_value);
                        strA.getClass();
                    }
                    if (string == null) {
                        string = ((d52.e) p1Var.getF182175a()).f57568a.getString(R.string.no_value);
                        string.getClass();
                    }
                    z3.e eVarC = z3.f.c(-77050336, new fb0.b(totalPushes, strB, pushGoal, p1Var, 4), o0VarE);
                    boolean zR = o0VarE.r(dateTimeAtStartOfDay) | ((i16 & 112) == i17);
                    Object objQ3 = o0VarE.q();
                    if (zR || objQ3 == p3.m.a.f135155b) {
                        objQ3 = new ci0.e(dateTimeAtStartOfDay, lVar, i15);
                        o0VarE.K(objQ3);
                    }
                    l72.l.d(strA, string, eVarC, rVarZ, null, false, (e23.a) objQ3, o0VarE, 384, 48);
                    z14 = false;
                    i15 = 2;
                    i17 = 32;
                }
                o0VarE.g0(z14);
                o0VarE.g0(true);
                x1 x1Var2 = p3.n.f135158a;
            }
            p2VarI0.f135219d = fVar;
        }
        o0VarE.e();
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            fVar = new d50.f(cVar, lVar, i14, 2);
            p2VarI0.f135219d = fVar;
        }
    }
}
