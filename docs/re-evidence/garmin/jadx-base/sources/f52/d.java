package f52;

import android.content.Context;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf52/d;", "Lqz/f;", "Lcom/github/mikephil/charting/charts/Chart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/Chart;)V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements qz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Chart<?> f69180b;

    public d(Chart<?> chart) {
        chart.getClass();
        this.f69180b = chart;
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        List<LegendEntry> listA;
        Legend f31342c;
        if (list == null || (listA = xz.b.a(list)) == null || (f31342c = this.f69180b.getF31342c()) == null) {
            return;
        }
        f31342c.setCustom(listA);
    }

    @Override // qz.f
    public final Legend b() {
        Legend legend = new Legend();
        legend.setEnabled(true);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f69180b.getContext();
        qz.f.f148595a.getClass();
        legend.setTextColor(a7.b.getColor(context, qz.f.a.f148597b));
        legend.setTextSize(12.0f);
        legend.setFormSize(16.0f);
        legend.setXEntrySpace(25.0f);
        return legend;
    }
}
