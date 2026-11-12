package vz1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.model.TrainingStatusReportDTO;
import gl1.y;
import i3.mc;
import j20.x;
import java.util.ArrayList;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p13.c0;
import p13.h0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import sk0.k1;
import sz1.t;
import vn2.b1;
import vv0.u;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(DateTime dateTime, DateTime dateTime2, t tVar, mc mcVar, b0 b0Var, oz1.a aVar, p3.m mVar, int i14) {
        int i15;
        u82.f fVar;
        p1 p1VarC;
        b0Var.getClass();
        aVar.getClass();
        int i16 = aVar.f134492c;
        o0 o0VarE = mVar.E(-1026035705);
        int i17 = (i14 & 6) == 0 ? (o0VarE.r(dateTime) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.r(dateTime2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.r(tVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.r(b0Var) ? 16384 : 8192;
        }
        int i18 = 196608;
        if ((i14 & 196608) == 0) {
            i17 |= (262144 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 131072 : 65536;
        }
        int i19 = i17;
        if (o0VarE.n(i19 & 1, (74899 & i19) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            if (dateTime == null || dateTime2 == null) {
                i18 = 196608;
                i15 = 1;
                o0VarE.C(653212327);
                o0VarE.g0(false);
                fVar = null;
            } else {
                o0VarE.C(653194998);
                u82.a aVar2 = tVar != null ? tVar.f161579f : null;
                if (aVar2 == null) {
                    o0VarE.C(652998736);
                    o0VarE.g0(false);
                    p1VarC = null;
                    i15 = 1;
                } else {
                    o0VarE.C(1822179793);
                    i15 = 1;
                    p1VarC = aVar2.c(new o82.a(g22.k.z(dateTime).b(), g22.k.z(dateTime2).b()), o0VarE);
                    o0VarE.g0(false);
                }
                fVar = p1VarC != null ? (u82.f) p1VarC.getF182175a() : null;
                o0VarE.g0(false);
            }
            TrainingStatusReportDTO trainingStatusReportDTO = fVar != null ? (TrainingStatusReportDTO) fVar.a() : null;
            l22.a aVar3 = new l22.a(context);
            pi0.e eVar = new pi0.e(context);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListC = trainingStatusReportDTO != null ? trainingStatusReportDTO.C() : null;
            if (arrayListC != null) {
                for (com.garmin.android.apps.connectmobile.performance.model.c cVar : h0.Z(arrayListC)) {
                    double dI = cVar.I();
                    Double D = cVar.D();
                    double dDoubleValue = D != null ? D.doubleValue() : Double.NaN;
                    double d14 = cVar.B;
                    boolean z14 = cVar.f39959r;
                    double d15 = !z14 ? cVar.f39965z : cVar.f39946e;
                    double d16 = !z14 ? cVar.f39964y : cVar.f39945d;
                    DateTime dateTimeC = cVar.C();
                    String strA = eVar.a(cVar.C(), qi0.a.NUMERIC_YEAR_MONTH_DAY);
                    a61.e eVar2 = a61.e.f1563a;
                    double dI2 = cVar.I();
                    eVar2.getClass();
                    String strC = a61.e.c(aVar3, dI2);
                    Double D2 = cVar.D();
                    String strC2 = a61.e.c(aVar3, D2 != null ? D2.doubleValue() : Double.NaN);
                    boolean z15 = cVar.f39957p;
                    String str = cVar.f39961v;
                    String str2 = str == null ? "" : str;
                    String str3 = cVar.f39962w;
                    arrayList.add(new a71.d(dI, dDoubleValue, d14, d15, d16, dateTimeC, strA, strC, strC2, z15, str2, str3 == null ? "" : str3, !cVar.f39959r, a61.e.d(aVar3, cVar.I(), cVar.G(), cVar.f39957p)));
                    context = context;
                }
            }
            Context context2 = context;
            if (arrayList.size() > i15) {
                c0.u(arrayList, new b());
            }
            a71.e eVar3 = new a71.e(arrayList, "", "", null, "", "", "", "", true, false, true, false, null, new b1(20), false, null, false);
            a71.d dVar = (a71.d) h0.n0(eVar3.f1751a);
            Double dValueOf = dVar != null ? Double.valueOf(dVar.f1739c) : null;
            oz1.d.f134527c.getClass();
            String strD = x.d(aVar.f134491b, StringUtils.SPACE, y.Q(o0VarE, R.string.symbol_dash), StringUtils.SPACE, y.Q(o0VarE, oz1.d.a.b(i16, dValueOf).f134538a));
            String strQ = y.Q(o0VarE, oz1.d.a.b(i16, dValueOf).f134539b);
            if (oz1.d.a.a(i16) != oz1.d.NONE) {
                o0VarE.C(654120596);
                int i24 = i19 >> 6;
                i.a(R.string.tr_factor_acute_load, mcVar, b0Var, strD, strQ, z3.f.c(527711775, new k1(dateTime, dateTime2, context2, eVar3, 27), o0VarE), o0VarE, (i24 & 112) | i18 | (i24 & 896));
                o0VarE.g0(false);
            } else {
                o0VarE.C(657196013);
                s62.a.f157643a.getClass();
                u4.d dVarA = f72.a.a(t62.c.f162799a);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new u(20);
                    o0VarE.K(objQ);
                }
                int i25 = i19 >> 9;
                l.a(mcVar, b0Var, R.string.tr_factor_acute_load, dVarA, R.string.no_data_on_device, null, R.string.tr_feedback_acute_load_no_data, (e23.a) objQ, o0VarE, (i25 & 14) | 12779520 | (i25 & 112));
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(dateTime, dateTime2, tVar, mcVar, b0Var, aVar, i14, 0);
        }
    }
}
