package di0;

import a42.y;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.f0;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    public static final void a(sh0.b.d dVar, int i14, LocalDate localDate, xh0.c cVar, e23.l<? super LocalDate, Unit> lVar, m mVar, int i15) {
        int i16;
        o0 o0Var;
        String string;
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(2047959137);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(localDate) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.r(cVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        int i17 = i16;
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            pi0.e eVar = new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            LocalDate localDateMinusDays = localDate.minusDays(i14);
            Integer num = dVar != null ? dVar.f159278b : null;
            Integer num2 = dVar != null ? dVar.f159277a : null;
            localDateMinusDays.getClass();
            String strD = eVar.d(localDateMinusDays, qi0.a.WEEKDAY);
            String strD2 = eVar.d(localDateMinusDays, qi0.a.RELATIVE_YEAR_MONTH_DAY);
            Double dValueOf = num != null ? Double.valueOf(num.intValue()) : null;
            if (dValueOf != null) {
                string = tn.k.g(xh0.c.b(dValueOf.doubleValue()), cVar.f190979b);
            } else {
                string = cVar.f190978a.getString(R.string.no_value);
                string.getClass();
            }
            String str = string;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(aVar, 0.0f, j92.b.f97899b.f97918c, 1);
            z3.e eVarC = z3.f.c(-1756842411, new y(cVar, num, str, num2, 17), o0VarE);
            boolean zR = o0VarE.r(localDateMinusDays) | ((57344 & i17) == 16384);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e(lVar, localDateMinusDays, 0);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e(lVar, localDateMinusDays, 0);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            l72.l.d(strD, strD2, eVarC, rVarA, null, false, (e23.a) objQ, o0Var, 384, 48);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(dVar, i14, localDate, cVar, lVar, i15);
        }
    }
}
