package po;

import am.f2;
import android.widget.Toast;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ps.o0;
import ps.o1;
import ps.x0;
import ps.x1;
import ps.y0;
import ps.y1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f138831b;

    public /* synthetic */ e(h hVar, int i14) {
        this.f138830a = i14;
        this.f138831b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.z0
    public final void onChanged(Object obj) {
        T t7;
        int i14 = this.f138830a;
        h hVar = this.f138831b;
        fw.m mVar = (fw.m) obj;
        switch (i14) {
            case 0:
                int i15 = h.E1;
                fw.p pVar = mVar.f73769b;
                if (pVar == fw.p.SUCCESS) {
                    T t14 = mVar.f73770c;
                    if (t14 == 0) {
                        Toast.makeText(hVar.getActivity(), R.string.txt_error_occurred, 0).show();
                    } else {
                        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar = (com.garmin.android.apps.connectmobile.activities.newmodel.a) t14;
                        hVar.T0 = aVar;
                        f2.d(aVar, hVar.V0);
                        if (!tq.k.b(hVar.f138857p.C(), hVar.U0.i())) {
                            hVar.C7();
                        } else {
                            hVar.d7();
                        }
                    }
                } else if (pVar == fw.p.ERROR) {
                    Toast.makeText(hVar.getActivity(), R.string.txt_error_occurred, 0).show();
                }
                break;
            case 1:
                int i16 = h.E1;
                fw.p pVar2 = mVar.f73769b;
                if (pVar2 == fw.p.SUCCESS) {
                    y0 y0Var = (y0) mVar.f73770c;
                    if (y0Var == null) {
                        Toast.makeText(hVar.getActivity(), R.string.txt_error_occurred, 0).show();
                    } else {
                        if (hVar.U0 == null) {
                            hVar.U0 = new ps.p();
                        }
                        ps.p pVar3 = hVar.U0;
                        long activityId = y0Var.getActivityId();
                        List<o0> listD = y0Var.d();
                        List<x0> listF = y0Var.f();
                        List<o1> listH = hVar.U0.h();
                        List<x1> listI = hVar.U0.i();
                        pVar3.getClass();
                        hVar.U0 = new ps.p(activityId, listD, listF, listH, listI);
                        if (hVar.f138843c1 == os.b.ACTIVITY_MULTISPORT_MAP || tq.k.j(hVar.f138857p.C())) {
                            hVar.g7();
                        } else {
                            hVar.C7();
                        }
                    }
                } else if (pVar2 == fw.p.ERROR) {
                    Toast.makeText(hVar.getActivity(), R.string.txt_error_occurred, 0).show();
                }
                break;
            default:
                int i17 = h.E1;
                if (mVar != null && (t7 = mVar.f73770c) != 0 && mVar.f73769b == fw.p.SUCCESS) {
                    List<x1> listD2 = ((y1) t7).d();
                    if (listD2 != null) {
                        listD2.sort(Comparator.comparing(new com.google.android.material.color.utilities.f(18)));
                    }
                    if (listD2 == null) {
                        listD2 = new ArrayList<>();
                    }
                    hVar.V0 = listD2;
                    hVar.L7();
                    f2.d(hVar.T0, hVar.V0);
                    hVar.h7();
                    break;
                } else if (mVar != null && mVar.f73769b == fw.p.ERROR) {
                    hVar.V0 = new ArrayList();
                    hVar.h7();
                    break;
                }
                break;
        }
    }
}
