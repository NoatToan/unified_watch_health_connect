package es0;

import android.content.Context;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Les0/f;", "Lqz/f;", "Lcom/github/mikephil/charting/charts/Chart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/Chart;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Chart<?> f65195b;

    public f(Chart<?> chart) {
        chart.getClass();
        this.f65195b = chart;
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        List<LegendEntry> arrayList;
        Legend f31342c = this.f65195b.getF31342c();
        f31342c.getClass();
        a00.a aVar = (a00.a) f31342c;
        if (list == null || (arrayList = xz.b.a(list)) == null) {
            arrayList = new ArrayList<>();
        }
        aVar.setCustom(arrayList);
    }

    @Override // qz.f
    public final Legend b() {
        a00.a aVar = new a00.a();
        aVar.setEnabled(true);
        aVar.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f65195b.getContext();
        qz.f.f148595a.getClass();
        aVar.setTextColor(a7.b.getColor(context, qz.f.a.f148597b));
        aVar.setTextSize(12.0f);
        aVar.setFormSize(16.0f);
        aVar.setXEntrySpace(25.0f);
        aVar.setYEntrySpace(5.0f);
        aVar.setWordWrapEnabled(true);
        return aVar;
    }
}
