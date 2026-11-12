package qm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.chartingv2.charts.PieChart;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated(since = "4.71")
public class v implements zm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f145461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm.p f145462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f145463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f145464d;

    public v(Context context, zm.p pVar) {
        this.f145461a = context;
        this.f145463c = new z(context, 0);
        this.f145464d = new z(context, 1);
        this.f145462b = pVar;
    }

    @Override // zm.q
    public final void a(LinearLayout linearLayout) {
        View view2;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            linearLayout.setVisibility(0);
            View viewInflate = LayoutInflater.from(this.f145461a).inflate(R.layout.gcm3_power_phase_balance_legend, (ViewGroup) linearLayout, false);
            im.y yVar = new im.y(viewInflate);
            com.garmin.android.apps.connectmobile.activities.newmodel.o oVarQ1 = this.f145462b.Q1();
            if (oVarQ1 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.c) {
                com.garmin.android.apps.connectmobile.activities.newmodel.o.c cVar = (com.garmin.android.apps.connectmobile.activities.newmodel.o.c) oVarQ1;
                double d14 = cVar.f29605a;
                double d15 = cVar.f29606b;
                double d16 = cVar.f29609e;
                double d17 = cVar.f29610f;
                double d18 = cVar.f29611g;
                double d19 = cVar.f29612h;
                double d24 = cVar.f29615k;
                double d25 = cVar.f29616l;
                Context context = yVar.f94192a;
                ns.o oVar = new ns.o(new l22.a(context), new ms.a0());
                String strB = oVar.b(9, Double.valueOf(d14), false);
                String strB2 = oVar.b(12, Double.valueOf(d14), false);
                h32.n.a aVar = yVar.f94193b;
                String str = yVar.f94205n;
                h32.n.a(aVar, strB, str, strB2);
                String strB3 = oVar.b(9, Double.valueOf(d15), false);
                String strB4 = oVar.b(12, Double.valueOf(d15), false);
                h32.n.a aVar2 = yVar.f94194c;
                String str2 = yVar.f94206o;
                h32.n.a(aVar2, strB3, str2, strB4);
                String strB5 = oVar.b(9, Double.valueOf(d16), false);
                String strB6 = oVar.b(12, Double.valueOf(d16), false);
                h32.n.a aVar3 = yVar.f94195d;
                String str3 = yVar.f94207p;
                h32.n.a(aVar3, strB5, str3, strB6);
                String strB7 = oVar.b(9, Double.valueOf(d17), false);
                String strB8 = oVar.b(12, Double.valueOf(d17), false);
                h32.n.a aVar4 = yVar.f94196e;
                String str4 = yVar.f94208q;
                h32.n.a(aVar4, strB7, str4, strB8);
                ns.o oVar2 = new ns.o(new l22.a(context), new ms.a0());
                h32.n.a(yVar.f94197f, oVar2.b(9, Double.valueOf(d18), false), str, oVar2.b(12, Double.valueOf(d18), false));
                h32.n.a(yVar.f94198g, oVar2.b(9, Double.valueOf(d19), false), str2, oVar2.b(12, Double.valueOf(d19), false));
                h32.n.a(yVar.f94199h, oVar2.b(9, Double.valueOf(d24), false), str3, oVar2.b(12, Double.valueOf(d24), false));
                h32.n.a(yVar.f94200i, oVar2.b(9, Double.valueOf(d25), false), str4, oVar2.b(12, Double.valueOf(d25), false));
                view2 = viewInflate;
            } else {
                view2 = viewInflate;
            }
            linearLayout.addView(view2);
        }
    }

    @Override // zm.q
    public final void b() {
    }

    @Override // zm.q
    public final void c(LinearLayout linearLayout) {
    }

    @Override // zm.q
    public final View d(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f145461a).inflate(R.layout.gcm3_phase_balance_chart_view, viewGroup, false);
        PieChart pieChart = (PieChart) viewInflate.findViewById(R.id.chart_right);
        PieChart pieChart2 = (PieChart) viewInflate.findViewById(R.id.chart_left);
        t.c(pieChart);
        t.c(pieChart2);
        z zVar = this.f145463c;
        zVar.a(pieChart2);
        z zVar2 = this.f145464d;
        zVar2.a(pieChart);
        com.garmin.android.apps.connectmobile.activities.newmodel.o oVarQ1 = this.f145462b.Q1();
        if (oVarQ1 instanceof com.garmin.android.apps.connectmobile.activities.newmodel.o.c) {
            com.garmin.android.apps.connectmobile.activities.newmodel.o.c cVar = (com.garmin.android.apps.connectmobile.activities.newmodel.o.c) oVarQ1;
            float f14 = (float) cVar.f29605a;
            float f15 = (float) cVar.f29606b;
            float f16 = (float) cVar.f29609e;
            float f17 = (float) cVar.f29610f;
            float f18 = (float) cVar.f29611g;
            float f19 = (float) cVar.f29612h;
            float f22 = (float) cVar.f29615k;
            float f24 = (float) cVar.f29616l;
            zVar.b(f14, f15, f16, f17);
            zVar2.b(f18, f19, f22, f24);
        }
        return viewInflate;
    }
}
