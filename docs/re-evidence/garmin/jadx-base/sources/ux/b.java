package ux;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.j;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import o53.f0;
import org.joda.time.LocalDate;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:65:0x01c2  */
    public static final void a(int i14, l lVar, List list, LocalDate localDate, LocalDate localDate2, m mVar) {
        bx.f fVar;
        Object next;
        List list2 = list;
        lVar.getClass();
        o0 o0VarE = mVar.E(-66287174);
        int i15 = i14 | (o0VarE.r(list2) ? 4 : 2) | (o0VarE.r(localDate) ? 32 : 16) | (o0VarE.r(localDate2) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        boolean z14 = true;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            pi0.e eVar = new pi0.e(context);
            rx.a aVar = new rx.a(context);
            r rVarE = u1.n.e(x2.d(r.S, 1.0f), h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            r rVarC = c2.l.C(rVarE, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1547330893);
            LocalDate localDatePlusDays = localDate2.plusDays(1);
            localDatePlusDays.getClass();
            for (LocalDate localDate3 : h0.G0(f0.I(localDate, jg.b.J(localDatePlusDays)))) {
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!g22.k.g(((bx.f) next).b(), localDate3));
                    fVar = (bx.f) next;
                } else {
                    fVar = null;
                }
                String strD = eVar.d(localDate3, qi0.a.WEEKDAY);
                String strD2 = eVar.d(localDate3, qi0.a.RELATIVE_YEAR_MONTH_DAY);
                String strB = aVar.b(fVar != null ? fVar.d() : null);
                String strB2 = aVar.b(fVar != null ? fVar.f() : null);
                Context context2 = aVar.f154899a;
                String string = context2.getString(R.string.gcm_body_battery_lbl_high);
                String strD3 = p6.b.d(context2, R.string.gcm_body_battery_lbl_low, string);
                r.a aVar3 = r.S;
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97920e;
                bVar2.getClass();
                float f15 = eVar2.f97920e;
                bVar2.getClass();
                r rVarC3 = c2.l.C(aVar3, f14, eVar2.f97920e, f15, 0.0f, 8);
                boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(localDate3);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new di0.e(lVar, localDate3, 9);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new di0.e(lVar, localDate3, 9);
                        o0VarE.K(objQ);
                    }
                }
                l72.l.e(strD, strD2, strB, string, strB2, strD3, rVarC3, null, false, (e23.a) objQ, o0VarE, 0, 384);
                z14 = true;
                aVar = aVar;
                eVar = eVar;
                list2 = list;
            }
            o0VarE.g0(false);
            o0VarE.g0(z14);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(list, localDate, localDate2, lVar, i14);
        }
    }
}
