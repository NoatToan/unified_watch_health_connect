package ya1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p008y1.y0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lya1/d;", "", "Landroid/view/View;", "rootView", "Lkotlin/Function1;", "Lza1/c;", "", "onClickChart", "<init>", "(Landroid/view/View;Le23/l;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<za1.c, Unit> f195542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f195543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f195544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f195545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f195546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CustomLineChart f195547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final za1.b f195548g;

    /* JADX WARN: Multi-variable type inference failed */
    public d(View view2, e23.l<? super za1.c, Unit> lVar) {
        view2.getClass();
        lVar.getClass();
        this.f195542a = lVar;
        Context context = view2.getContext();
        this.f195543b = context;
        TextView textView = (TextView) view2.findViewById(R.id.chart_title);
        this.f195544c = view2.findViewById(R.id.chart_help);
        this.f195545d = (TextView) view2.findViewById(R.id.avg_power);
        this.f195546e = (TextView) view2.findViewById(R.id.max_power);
        CustomLineChart customLineChart = (CustomLineChart) view2.findViewById(R.id.chart_view);
        this.f195547f = customLineChart;
        customLineChart.getClass();
        this.f195548g = new za1.b(customLineChart);
        TextView textView2 = (TextView) view2.findViewById(R.id.distance_legend_item);
        textView.setText(context.getString(R.string.string_space_string_bracket_pattern, context.getString(R.string.power_guide_title), context.getString(R.string.common_watts)));
        boolean z14 = am.j.z(f12.l.f68084a);
        l3.f23124b.getClass();
        textView2.setText(context.getString(R.string.chart_distance_title, l3.a.E1(context, z14, true)));
        v22.d.d(textView2, new y0(28));
    }

    public final void a(ab1.f fVar) {
        fVar.getClass();
        Context context = this.f195543b;
        context.getClass();
        za1.c cVarA = za1.d.a(fVar, context);
        if (cVarA != null) {
            String string = context.getString(R.string.devices_lbl_watts_with_format, String.valueOf(cVarA.f203289b));
            TextView textView = this.f195545d;
            textView.setText(string);
            v22.d.d(textView, new y0(26));
            String string2 = context.getString(R.string.devices_lbl_watts_with_format, String.valueOf(cVarA.f203290c));
            TextView textView2 = this.f195546e;
            textView2.setText(string2);
            v22.d.d(textView2, new y0(27));
            this.f195548g.a(cVarA);
            this.f195547f.setOnClickListener(new wv2.h(12, this, cVarA));
            this.f195544c.setOnClickListener(new xp0.d(this, 9));
        }
    }
}
