package q30;

import android.content.Context;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq30/g;", "Lqz/f;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class g implements qz.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomLineChart f142390b;

    static {
        int i14 = CustomLineChart.f31344h;
    }

    public g(CustomLineChart customLineChart) {
        customLineChart.getClass();
        this.f142390b = customLineChart;
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        List<LegendEntry> listA;
        if (list == null || (listA = xz.b.a(list)) == null) {
            return;
        }
        Legend f31351g = this.f142390b.getF31351g();
        f31351g.getClass();
        ((a00.a) f31351g).setCustom(listA);
    }

    @Override // qz.f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a00.a b() {
        a00.a aVar = new a00.a();
        aVar.setEnabled(true);
        aVar.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f142390b.getContext();
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
