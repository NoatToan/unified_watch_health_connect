package ar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import ps.x1;
import zm.p;
import zm.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar/f;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f12521a = new f();

    private f() {
    }

    public static final q a(FullscreenChartActivity fullscreenChartActivity, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, p pVar, p pVar2, fz.c cVar) {
        q qVarF;
        LinearLayout linearLayout4;
        boolean z14;
        ArrayList arrayList;
        List<x1> list;
        linearLayout.getClass();
        linearLayout2.getClass();
        linearLayout3.getClass();
        pVar.getClass();
        cVar.getClass();
        linearLayout.removeAllViews();
        if (((pVar2 == null || !im.a.i(pVar2.getB1())) && !im.a.i(pVar.getB1())) || !(((z14 = pVar instanceof lm.c)) || (pVar2 instanceof lm.c))) {
            linearLayout4 = linearLayout2;
            qVarF = e.f(fullscreenChartActivity, linearLayout, linearLayout2, linearLayout3, pVar, -1, pVar2, null, true, null, null, cVar);
        } else {
            tm.a aVar = new tm.a(fullscreenChartActivity, pVar, pVar2, true, cVar);
            if (z14 && (pVar2 instanceof lm.c)) {
                List<x1> list2 = ((lm.c) pVar).f113495e1;
                if (list2 == null || !(!list2.isEmpty())) {
                    List<x1> list3 = ((lm.c) pVar2).f113495e1;
                    arrayList = list3 != null ? new ArrayList(list3) : new ArrayList();
                } else {
                    arrayList = new ArrayList(list2);
                }
            } else if (z14) {
                List<x1> list4 = ((lm.c) pVar).f113495e1;
                arrayList = list4 != null ? new ArrayList(list4) : new ArrayList();
            } else {
                arrayList = (!(pVar2 instanceof lm.c) || (list = ((lm.c) pVar2).f113495e1) == null) ? new ArrayList() : new ArrayList(list);
            }
            aVar.B = arrayList;
            lm.d dVar = pVar instanceof lm.d ? (lm.d) pVar : null;
            aVar.C = dVar != null ? dVar.E1 : null;
            aVar.S();
            linearLayout4 = linearLayout2;
            qVarF = aVar;
        }
        if (qVarF != null) {
            if (qVarF instanceof zm.c) {
                if (sm.c.d(pVar)) {
                    ((zm.c) qVarF).f205216o = sm.c.f160062a;
                }
                ((zm.c) qVarF).f205217p = true;
            }
            nm.c cVar2 = new nm.c(fullscreenChartActivity, pVar, pVar2, null, null, true);
            linearLayout4.removeAllViews();
            linearLayout4.addView(cVar2.b());
            qVarF.a(linearLayout4);
            qVarF.c(linearLayout3);
            View viewD = qVarF.d(linearLayout);
            f12521a.getClass();
            linearLayout.addView(viewD, new ViewGroup.LayoutParams(-1, -1));
        }
        return qVarF;
    }
}
