package bt0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.Legend;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbt0/e;", "Lqz/f;", "Lcom/github/mikephil/charting/charts/Chart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/Chart;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements qz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Chart<?> f21053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xs0.b f21054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a00.b> f21055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<a00.b> f21056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a00.b> f21057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a00.b> f21058g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21059a;

        static {
            int[] iArr = new int[xs0.b.values().length];
            try {
                iArr[xs0.b.PACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xs0.b.POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xs0.b.POWER_PER_KG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xs0.b.HEART_RATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21059a = iArr;
        }
    }

    public e(Chart<?> chart) {
        chart.getClass();
        this.f21053b = chart;
        this.f21054c = xs0.b.PACE;
        a00.b bVar = new a00.b();
        bVar.label = chart.getContext().getString(R.string.lbl_pace);
        Legend.LegendForm legendForm = Legend.LegendForm.DEFAULT;
        bVar.form = legendForm;
        bVar.formColor = a7.b.getColor(chart.getContext(), R.color.palette_blue_26);
        bVar.f42d = chart.getContext().getDrawable(R.drawable.chart_icon_sport_specific_lt_legend_pace);
        this.f21055d = w.c(bVar);
        a00.b bVar2 = new a00.b();
        bVar2.label = chart.getContext().getString(R.string.lbl_heart_rate_cap);
        bVar2.form = legendForm;
        bVar2.formColor = a7.b.getColor(chart.getContext(), R.color.palette_ruby_5);
        bVar2.f42d = chart.getContext().getDrawable(R.drawable.chart_icon_sport_specific_lt_legend_heart_rate);
        this.f21056e = w.c(bVar2);
        a00.b bVar3 = new a00.b();
        bVar3.label = chart.getContext().getString(R.string.lbl_power_cap);
        bVar3.form = legendForm;
        bVar3.formColor = a7.b.getColor(chart.getContext(), R.color.violet_50_static);
        bVar3.f42d = chart.getContext().getDrawable(R.drawable.chart_icon_sport_specific_lt_legend_power);
        this.f21057f = w.c(bVar3);
        a00.b bVar4 = new a00.b();
        bVar4.label = chart.getContext().getString(R.string.lbl_power_watts_per_kilogram_abbreviation);
        bVar4.form = legendForm;
        bVar4.formColor = a7.b.getColor(chart.getContext(), R.color.violet_50_static);
        bVar4.f42d = chart.getContext().getDrawable(R.drawable.chart_icon_sport_specific_lt_legend_power_per_weight);
        this.f21058g = w.c(bVar4);
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        xs0.b bVar = this.f21054c;
        int i14 = bVar == null ? -1 : a.f21059a[bVar.ordinal()];
        List<a00.b> list2 = this.f21056e;
        Chart<?> chart = this.f21053b;
        if (i14 == 1) {
            Legend f31342c = chart.getF31342c();
            if (f31342c != null) {
                f31342c.setCustom(h0.C0(list2, this.f21055d));
                return;
            }
            return;
        }
        if (i14 == 2) {
            Legend f31342c2 = chart.getF31342c();
            if (f31342c2 != null) {
                f31342c2.setCustom(h0.C0(list2, this.f21057f));
                return;
            }
            return;
        }
        if (i14 == 3) {
            Legend f31342c3 = chart.getF31342c();
            if (f31342c3 != null) {
                f31342c3.setCustom(h0.C0(list2, this.f21058g));
                return;
            }
            return;
        }
        if (i14 != 4) {
            Legend f31342c4 = chart.getF31342c();
            if (f31342c4 != null) {
                f31342c4.setCustom(j0.f134944a);
                return;
            }
            return;
        }
        Legend f31342c5 = chart.getF31342c();
        if (f31342c5 != null) {
            f31342c5.setCustom(list2);
        }
    }

    @Override // qz.f
    public final Legend b() {
        a00.a aVar = new a00.a();
        aVar.setEnabled(true);
        aVar.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f21053b.getContext();
        qz.f.f148595a.getClass();
        aVar.setTextColor(a7.b.getColor(context, qz.f.a.f148597b));
        aVar.setTextSize(12.0f);
        aVar.setFormSize(16.0f);
        aVar.setXEntrySpace(25.0f);
        return aVar;
    }
}
