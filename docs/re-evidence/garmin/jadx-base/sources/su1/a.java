package su1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import f12.l;
import f72.sd;
import gl1.y;
import h4.r;
import o61.q;
import o70.t;
import org.joda.time.LocalDate;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz1.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:38:0x00ad A[PHI: r13
      0x00ad: PHI (r13v12 double) = (r13v3 double), (r13v4 double) binds: [B:37:0x00ab, B:40:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, q qVar, m mVar, int i14) {
        int i15;
        rVar.getClass();
        o0 o0VarE = mVar.E(1644048781);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(qVar) : o0VarE.r(qVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            int i17 = i15;
            t tVar = t.M0;
            String strQ = y.Q(o0VarE, R.string.lbl_vo2_max);
            s62.a.f157643a.getClass();
            u4.d dVarA = sd.a(t62.c.f162799a);
            String strQ2 = y.Q(o0VarE, R.string.vo2max_card_no_data_state_message);
            u uVar = u.SUCCESS;
            o32.a aVar = new o32.a(new yz1.d(uVar, null, false, 6, null), null, null, null, null, 16, null);
            if (qVar != null) {
                LocalDate localDateB = qVar.b();
                LocalDate localDatePlusMonths = localDateB != null ? localDateB.plusMonths(6) : null;
                if (localDatePlusMonths != null && !LocalDate.now().isAfter(localDatePlusMonths)) {
                    double vo2MaxPreciseValue = qVar.getVo2MaxPreciseValue();
                    double d14 = 20.0d;
                    if (vo2MaxPreciseValue < 20.0d) {
                        vo2MaxPreciseValue = d14;
                    } else {
                        d14 = 60.0d;
                        if (vo2MaxPreciseValue > 60.0d) {
                            vo2MaxPreciseValue = d14;
                        }
                    }
                    l.f68084a.getClass();
                    l lVarA = l.a.a();
                    int iU = lVarA.u();
                    boolean zEquals = lVarA.w().equals(UserSettingsDTO.c.MALE.f43537a);
                    a61.e.f1563a.getClass();
                    double[] dArrH = a61.e.h(iU, zEquals);
                    q71.a aVarB = a61.e.b(vo2MaxPreciseValue, dArrH);
                    double vo2MaxPreciseValue2 = qVar.getVo2MaxPreciseValue();
                    aVar = new o32.a(new yz1.d(uVar, null, false, 6, null), aVarB, Integer.valueOf((int) qVar.getVo2MaxValue()), Float.valueOf(((Number) oi0.c.I(vo2MaxPreciseValue2, oi0.c.j(new p13.q(dArrH), vo2MaxPreciseValue2)).f128595b).floatValue() / 100.0f), null, 16, null);
                }
            }
            q32.c.a(rVar, tVar, strQ, dVarA, strQ2, aVar, o0VarE, (i17 & 14) | 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(rVar, qVar, i14, i16);
        }
    }
}
