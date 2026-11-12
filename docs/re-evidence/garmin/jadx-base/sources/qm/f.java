package qm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts.CenterOffsetView;

/* JADX INFO: loaded from: classes7.dex */
public class f implements zm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f145358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm.p f145359b;

    public f(Context context, zm.p pVar) {
        this.f145358a = context;
        this.f145359b = pVar;
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f145358a).inflate(R.layout.gcm3_center_offset_chart_view, viewGroup, false);
        CenterOffsetView centerOffsetView = (CenterOffsetView) viewInflate.findViewById(R.id.power_offset_gauge_left);
        CenterOffsetView centerOffsetView2 = (CenterOffsetView) viewInflate.findViewById(R.id.power_offset_gauge_right);
        com.garmin.android.apps.connectmobile.activities.newmodel.o oVarQ1 = this.f145359b.Q1();
        if (oVarQ1 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.a) {
            com.garmin.android.apps.connectmobile.activities.newmodel.o.a aVar = (com.garmin.android.apps.connectmobile.activities.newmodel.o.a) oVarQ1;
            int i14 = (int) aVar.f29602a;
            centerOffsetView.f28932c = i14;
            if (i14 < -30) {
                centerOffsetView.f28932c = -30;
            } else if (i14 > 30) {
                centerOffsetView.f28932c = 30;
            }
            centerOffsetView.f28935f = 0;
            centerOffsetView.invalidate();
            int i15 = (int) aVar.f29603b;
            centerOffsetView2.f28932c = i15;
            if (i15 < -30) {
                centerOffsetView2.f28932c = -30;
            } else if (i15 > 30) {
                centerOffsetView2.f28932c = 30;
            }
            centerOffsetView2.f28935f = 1;
            centerOffsetView2.invalidate();
        }
        return viewInflate;
    }
}
