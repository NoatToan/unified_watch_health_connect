package iy0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy0/n;", "Lqz/f;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class n implements qz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomLineChart f95813b;

    static {
        int i14 = CustomLineChart.f31344h;
    }

    public n(CustomLineChart customLineChart) {
        customLineChart.getClass();
        this.f95813b = customLineChart;
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        List<LegendEntry> listA;
        if (list == null || (listA = xz.b.a(list)) == null) {
            return;
        }
        Legend f31342c = this.f95813b.getF31342c();
        f31342c.getClass();
        ((a00.a) f31342c).setCustom(listA);
    }

    @Override // qz.f
    public final Legend b() {
        a00.a aVar = new a00.a();
        aVar.setEnabled(true);
        aVar.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f95813b.getContext();
        qz.f.f148595a.getClass();
        aVar.setTextColor(a7.b.getColor(context, qz.f.a.f148597b));
        aVar.setTextSize(12.0f);
        aVar.setFormSize(16.0f);
        aVar.setXEntrySpace(25.0f);
        aVar.setYEntrySpace(5.0f);
        aVar.f37a = new int[]{1, 6};
        return aVar;
    }
}
