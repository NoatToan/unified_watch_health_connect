package di0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.google.maps.android.compose.u;
import h4.r;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    public static final void a(sh0.f.d dVar, LocalDate localDate, xh0.c cVar, e23.l<? super LocalDate, Unit> lVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strM;
        String string;
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(137809368);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(dVar) : o0VarE.r(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(localDate) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(cVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            pi0.e eVar = new pi0.e((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            if (localDate != null) {
                LocalDate localDatePlusDays = localDate.plusDays(6);
                localDatePlusDays.getClass();
                strM = eVar.m(localDate, localDatePlusDays, pi0.f.SHORT_MONTH_NO_WEEKDAY);
            } else {
                strM = null;
            }
            Double d14 = dVar != null ? dVar.f159302b : null;
            if (d14 != null) {
                string = tn.k.g(xh0.c.b(d14.doubleValue()), cVar.f190979b);
            } else {
                string = cVar.f190978a.getString(R.string.no_value);
                string.getClass();
            }
            b92.a aVarC = xh0.c.c("value", cVar.d(dVar != null ? dVar.f159302b : null));
            if (strM == null) {
                strM = "";
            }
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(aVar, 0.0f, j92.b.f97899b.f97918c, 1);
            boolean zR = o0VarE.r(localDate) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new e(localDate, lVar, 1);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e(localDate, lVar, 1);
                    o0VarE.K(objQ);
                }
            }
            int i16 = b92.a.f16960b;
            o0Var = o0VarE;
            l72.l.e(strM, null, string, null, null, null, rVarA, aVarC, false, (e23.a) objQ, o0Var, 0, 314);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(dVar, localDate, cVar, lVar, i14, 12);
        }
    }
}
