package xq1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import po2.o;
import vd0.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:65:0x0120  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r0v36 */
    public static final void a(jq1.i iVar, LocalDate localDate, LocalDate localDate2, yd1.b bVar, p3.m mVar, int i14) {
        String strF;
        Integer num;
        Throwable th3;
        Integer numValueOf;
        String strF2;
        ?? ValueOf;
        String strF3;
        b92.a aVarI;
        Integer numB;
        Integer numB2;
        Integer numValueOf2;
        bVar.getClass();
        o0 o0VarE = mVar.E(1449679250);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 4 : 2) | (o0VarE.r(localDate) ? 32 : 16) | (o0VarE.r(localDate2) ? 256 : 128) | (o0VarE.k(bVar.ordinal()) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p0.n(new pq1.d(context));
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            ((pq1.d) p1Var.getF182175a()).getClass();
            yd1.b bVar2 = yd1.b.MONTHLY;
            int iAbs = bVar == bVar2 ? 364 : Math.abs(Days.daysBetween(localDate, localDate2).getDays());
            ((pq1.d) p1Var.getF182175a()).getClass();
            int i16 = bVar == bVar2 ? 52 : 12;
            pq1.d dVar = (pq1.d) p1Var.getF182175a();
            Integer numB3 = iVar != null ? iVar.b() : null;
            if (numB3 != null) {
                dVar.getClass();
                strF = pq1.d.b(numB3.intValue());
            } else {
                strF = dVar.f();
            }
            String str = strF;
            if (iVar != null) {
                List<jq1.j> list = iVar.f100019a;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jq1.j.d dVar2 = ((jq1.j) it.next()).f100023b;
                        Double d14 = dVar2 != null ? dVar2.f100027c : null;
                        if (d14 != null) {
                            arrayList.add(d14);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    int iDoubleValue = 0;
                    while (it3.hasNext()) {
                        iDoubleValue += (int) ((Number) it3.next()).doubleValue();
                    }
                    numValueOf2 = Integer.valueOf(iDoubleValue);
                    if (iDoubleValue <= 0) {
                        numValueOf2 = null;
                    }
                } else {
                    numValueOf2 = null;
                }
                num = numValueOf2;
            } else {
                num = null;
            }
            String strA = ((pq1.d) p1Var.getF182175a()).a(num, ((pq1.d) p1Var.getF182175a()).f());
            pq1.d dVar3 = (pq1.d) p1Var.getF182175a();
            if (iVar == null || (numB2 = iVar.b()) == null) {
                th3 = null;
                numValueOf = null;
            } else {
                int iIntValue = numB2.intValue();
                th3 = null;
                int i17 = iVar.f100020b;
                if (i17 > 0) {
                    iAbs = i17;
                }
                numValueOf = Integer.valueOf(iIntValue / iAbs);
            }
            if (numValueOf != null) {
                dVar3.getClass();
                strF2 = pq1.d.b(numValueOf.intValue());
            } else {
                strF2 = dVar3.f();
            }
            String str2 = strF2;
            pq1.d dVar4 = (pq1.d) p1Var.getF182175a();
            if (iVar == null || (numB = iVar.b()) == null) {
                ValueOf = th3;
            } else {
                int iIntValue2 = numB.intValue();
                int i18 = iVar.f100021c;
                if (i18 > 0) {
                    i16 = i18;
                }
                ValueOf = Integer.valueOf(iIntValue2 / i16);
            }
            if (ValueOf != 0) {
                dVar4.getClass();
                strF3 = pq1.d.b(ValueOf.intValue());
            } else {
                strF3 = dVar4.f();
            }
            yd1.b bVar3 = yd1.b.MONTHLY;
            String strJ = bVar == bVar3 ? com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1499549287, R.string.lbl_average_monthly, o0VarE, false) : com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1499627624, R.string.lbl_average_weekly, o0VarE, false);
            if (bVar == bVar3) {
                pq1.d dVar5 = (pq1.d) p1Var.getF182175a();
                dVar5.getClass();
                Context context2 = dVar5.f139569a;
                String strO = xy2.b.O(context2, strF3);
                aVarI = wz1.a.a(oi0.c.A(context2, new o(12), context2.getString(R.string.lbl_average_monthly)) + StringUtils.SPACE + strO);
            } else {
                aVarI = ((pq1.d) p1Var.getF182175a()).i(strF3);
            }
            b92.a aVar = aVarI;
            r.a aVar2 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw th3;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0 x0Var = x0.f111346a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarC2 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
            z3.e eVarC = z3.f.c(-1254858655, new f0((Object) str, (Object) strA, (Object) num, p1Var, 6), o0VarE);
            int i19 = (x0.f111348c << 6) | 48;
            x0Var.e(rVarC2, eVarC, o0VarE, i19, 0);
            x0Var.e(null, z3.f.c(-1911367208, new x91.n(str2, strF3, strJ, aVar, p1Var, 1), o0VarE), o0VarE, i19, 1);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(iVar, localDate, localDate2, bVar, i14, 0);
        }
    }
}
