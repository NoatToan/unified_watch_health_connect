package sl1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsl1/d;", "Lqz/f;", "Lcom/github/mikephil/charting/charts/Chart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/Chart;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Chart<?> f159982b;

    static {
        new a(null);
    }

    public d(Chart<?> chart) {
        chart.getClass();
        this.f159982b = chart;
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        ArrayList arrayList = new ArrayList();
        LegendEntry legendEntry = new LegendEntry();
        Chart<?> chart = this.f159982b;
        legendEntry.label = a7.b.getString(chart.getContext(), R.string.tr_factor_relevant_sleep_scores);
        legendEntry.form = Legend.LegendForm.CIRCLE;
        legendEntry.formColor = a7.b.getColor(chart.getContext(), R.color.gcm_sleep_chart_score_value);
        arrayList.add(legendEntry);
        Legend f31351g = chart.getF31351g();
        if (f31351g != null) {
            f31351g.setCustom(arrayList);
        }
    }

    @Override // qz.f
    public final Legend b() {
        Legend legend = new Legend();
        legend.setEnabled(true);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f159982b.getContext();
        qz.f.f148595a.getClass();
        legend.setTextColor(a7.b.getColor(context, qz.f.a.f148597b));
        legend.setTextSize(12.0f);
        legend.setFormSize(16.0f);
        legend.setXEntrySpace(17.0f);
        legend.setMaxSizePercent(1.1f);
        legend.setWordWrapEnabled(true);
        return legend;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsl1/d$a;", "", "<init>", "()V", "", "LEGEND_X_ENTRY_SPACE", "F", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
