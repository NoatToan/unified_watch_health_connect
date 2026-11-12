package ko0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import qz.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lko0/d;", "Lqz/f;", "Lcom/github/mikephil/charting/charts/Chart;", "chart", "<init>", "(Lcom/github/mikephil/charting/charts/Chart;)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Chart<?> f105761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f105762c;

    public d(Chart<?> chart) {
        chart.getClass();
        this.f105761b = chart;
        Context context = chart.getContext();
        LegendEntry legendEntry = new LegendEntry();
        legendEntry.label = context.getString(R.string.lbl_resting_heart_rate);
        Legend.LegendForm legendForm = Legend.LegendForm.CIRCLE;
        legendEntry.form = legendForm;
        lo0.b.f113999a.getClass();
        legendEntry.formColor = a7.b.getColor(context, lo0.b.a.f114002c);
        Unit unit = Unit.INSTANCE;
        LegendEntry legendEntry2 = new LegendEntry();
        legendEntry2.label = context.getString(R.string.lbl_heart_rate_high_long);
        legendEntry2.form = legendForm;
        legendEntry2.formColor = a7.b.getColor(context, lo0.b.a.f114001b);
        this.f105762c = x.m(legendEntry, legendEntry2);
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        Legend f31342c = this.f105761b.getF31342c();
        if (f31342c != null) {
            f31342c.setCustom(this.f105762c);
        }
    }

    @Override // qz.f
    public final Legend b() {
        a00.a aVar = new a00.a();
        aVar.setEnabled(true);
        aVar.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f105761b.getContext();
        f.f148595a.getClass();
        aVar.setTextColor(a7.b.getColor(context, f.a.f148597b));
        aVar.setTextSize(12.0f);
        aVar.setFormSize(16.0f);
        aVar.setXEntrySpace(25.0f);
        return aVar;
    }
}
