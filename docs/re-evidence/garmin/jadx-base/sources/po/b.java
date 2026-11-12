package po;

import am.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f138820b;

    public /* synthetic */ b(h hVar, int i14) {
        this.f138819a = i14;
        this.f138820b = hVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k kVarZ6;
        int i14 = this.f138819a;
        boolean z14 = false;
        h hVar = this.f138820b;
        switch (i14) {
            case 0:
                Integer num = (Integer) obj;
                int i15 = h.E1;
                qe2.h hVar2 = hVar.f148294e;
                if (hVar2 != null) {
                    hVar2.setPadding(0, 0, 0, num.intValue());
                    qe2.h hVar3 = hVar.f148294e;
                    hVar3.getClass();
                    com.garmin.android.library.mapsdkadapter.i.a.e(hVar3, true, true, 28);
                }
                break;
            case 1:
                int i16 = h.E1;
                com.garmin.android.library.mapsdkadapter.i.d f50264r = hVar.f148294e.f144584a.getF50264r();
                boolean z15 = f50264r == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE || f50264r == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX;
                am.e eVar = hVar.f138868v1;
                ArrayList arrayList = new ArrayList();
                if (hVar.q7()) {
                    arrayList.add(new qw0.u(qw0.v.TIMING_GATES, hVar.f138860q1, true));
                    qw0.v vVar = qw0.v.LAPS;
                    if (eVar.e() && !hVar.f138860q1) {
                        z14 = true;
                    }
                    arrayList.add(new qw0.u(vVar, z14, true, s1.a(hVar.f138857p.C(), hVar.V0)));
                } else {
                    arrayList.add(new qw0.u(qw0.v.LAPS, eVar.e(), true, s1.a(hVar.f138857p.C(), hVar.V0)));
                }
                ArrayList arrayListJ7 = hVar.j7();
                boolean b14 = hVar.f148294e.f144584a.getB();
                ps.h hVar4 = hVar.X0;
                int i17 = hVar.f138844d1;
                if (hVar4 == null) {
                    kVarZ6 = k.z6(Integer.valueOf(i17), f50264r, arrayList, arrayListJ7, hVar.f138853l1, b14, hVar.f138847g1, z15, false, hVar.f138846f1);
                } else {
                    Integer numValueOf = Integer.valueOf(i17);
                    List list = Collections.EMPTY_LIST;
                    kVarZ6 = k.z6(numValueOf, f50264r, list, list, null, b14, hVar.f138847g1, z15, true, hVar.f138846f1);
                }
                kVarZ6.f138918g = hVar.C1;
                kVarZ6.show(hVar.requireActivity().getSupportFragmentManager(), "");
                break;
            default:
                int i18 = h.E1;
                hVar.f148294e.g();
                break;
        }
        return Unit.INSTANCE;
    }
}
