package im;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;

/* JADX INFO: loaded from: classes7.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f94192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h32.n.a f94193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h32.n.a f94194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h32.n.a f94195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h32.n.a f94196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h32.n.a f94197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h32.n.a f94198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h32.n.a f94199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h32.n.a f94200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f94201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f94202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f94203l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f94204m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f94205n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f94206o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f94207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f94208q;

    public y(View view2) {
        View viewFindViewById = view2.findViewById(R.id.stats_l_power_phase);
        View viewFindViewById2 = view2.findViewById(R.id.stats_r_power_phase);
        View viewFindViewById3 = view2.findViewById(R.id.stats_l_peak_power_phase);
        View viewFindViewById4 = view2.findViewById(R.id.stats_r_peak_power_phase);
        View viewFindViewById5 = view2.findViewById(R.id.l_power_phase_legend_label);
        View viewFindViewById6 = view2.findViewById(R.id.r_power_phase_legend_label);
        View viewFindViewById7 = view2.findViewById(R.id.l_peak_power_phase_legend_label);
        View viewFindViewById8 = view2.findViewById(R.id.r_peak_power_phase_legend_label);
        this.f94193b = new h32.n.a(viewFindViewById.findViewById(R.id.stats_start_angle));
        this.f94194c = new h32.n.a(viewFindViewById.findViewById(R.id.stats_end_angle));
        this.f94197f = new h32.n.a(viewFindViewById2.findViewById(R.id.stats_start_angle));
        this.f94198g = new h32.n.a(viewFindViewById2.findViewById(R.id.stats_end_angle));
        this.f94195d = new h32.n.a(viewFindViewById3.findViewById(R.id.stats_start_angle));
        this.f94196e = new h32.n.a(viewFindViewById3.findViewById(R.id.stats_end_angle));
        this.f94199h = new h32.n.a(viewFindViewById4.findViewById(R.id.stats_start_angle));
        this.f94200i = new h32.n.a(viewFindViewById4.findViewById(R.id.stats_end_angle));
        View viewFindViewById9 = viewFindViewById5.findViewById(R.id.ppb_legend_color);
        this.f94201j = viewFindViewById9;
        TextView textView = (TextView) viewFindViewById5.findViewById(R.id.ppb_legend_label);
        View viewFindViewById10 = viewFindViewById6.findViewById(R.id.ppb_legend_color);
        this.f94202k = viewFindViewById10;
        TextView textView2 = (TextView) viewFindViewById6.findViewById(R.id.ppb_legend_label);
        View viewFindViewById11 = viewFindViewById7.findViewById(R.id.ppb_legend_color);
        this.f94203l = viewFindViewById11;
        TextView textView3 = (TextView) viewFindViewById7.findViewById(R.id.ppb_legend_label);
        View viewFindViewById12 = viewFindViewById8.findViewById(R.id.ppb_legend_color);
        this.f94204m = viewFindViewById12;
        TextView textView4 = (TextView) viewFindViewById8.findViewById(R.id.ppb_legend_label);
        Context context = view2.getContext();
        this.f94192a = context;
        String string = context.getString(R.string.lbl_start);
        String string2 = context.getString(R.string.common_end);
        String string3 = context.getString(R.string.activities_average_power_phase);
        String string4 = context.getString(R.string.activities_average_peak_power_phase);
        this.f94205n = e5.g(string3, "\n", string);
        this.f94206o = e5.g(string3, "\n", string2);
        this.f94207p = e5.g(string4, "\n", string);
        this.f94208q = e5.g(string4, "\n", string2);
        context.getString(R.string.no_value);
        a(viewFindViewById9, textView, x.L_POWER_PHASE);
        a(viewFindViewById10, textView2, x.R_POWER_PHASE);
        a(viewFindViewById11, textView3, x.L_PEAK_POWER_PHASE);
        a(viewFindViewById12, textView4, x.R_PEAK_POWER_PHASE);
    }

    public final void a(View view2, TextView textView, x xVar) {
        view2.setBackgroundColor(a7.b.getColor(this.f94192a, xVar.f94190a));
        textView.setText(xVar.f94191b);
    }
}
