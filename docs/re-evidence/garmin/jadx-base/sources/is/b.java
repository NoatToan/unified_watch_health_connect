package is;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.u;
import p13.y;
import ps.q0;
import ps.r0;
import ps.s0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lis/b;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f94858a = new b();

    private b() {
    }

    public static s0 a(s0 s0Var, com.garmin.android.apps.connectmobile.repcounting.model.c cVar) {
        List listI0;
        ArrayList arrayList;
        List<r0> listD;
        com.garmin.android.apps.connectmobile.repcounting.model.d dVarN;
        com.garmin.android.apps.connectmobile.repcounting.model.d[] dVarArrF;
        if (cVar == null || (dVarArrF = cVar.F()) == null || (listI0 = u.i0(dVarArrF)) == null) {
            listI0 = j0.f134944a;
        }
        if (s0Var == null || (listD = s0Var.d()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(y.r(listD, 10));
            for (r0 r0VarB : listD) {
                q0 q0VarH = r0VarB.h();
                com.garmin.android.apps.connectmobile.repcounting.model.d dVarN2 = zf.b.n(q0VarH != null ? q0VarH.getCategory() : null, r0VarB.f(), listI0);
                if (dVarN2 != null && dVarN2.f41105d) {
                    Long weight = r0VarB.getWeight();
                    if ((weight != null ? weight.longValue() : 0L) > 0 && (dVarN = zf.b.n(dVarN2.f41102a, dVarN2.f41104c, listI0)) != null) {
                        List<q0> listG = r0VarB.g();
                        ArrayList arrayList2 = listG != null ? new ArrayList(listG) : null;
                        if (arrayList2 != null) {
                        }
                        List<String> list = dVarN.f41108g;
                        List<String> list2 = dVarN.f41109h;
                        String str = dVarN.f41107f;
                        if (str == null) {
                            str = dVarN.f41103b;
                        }
                        r0VarB = r0.b(r0VarB, arrayList2, list, list2, str, Boolean.valueOf(dVarN.f41105d));
                    }
                }
                arrayList.add(r0VarB);
            }
        }
        if (s0Var != null) {
            return s0.b(s0Var, arrayList);
        }
        return null;
    }
}
