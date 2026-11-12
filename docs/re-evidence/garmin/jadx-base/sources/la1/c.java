package la1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomLineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;
import qz.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lla1/c;", "Lqz/f;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "", "intervalLabel", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;Ljava/lang/String;)V", "a", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomLineChart f111626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f111627c;

    static {
        new a(null);
    }

    public c(CustomLineChart customLineChart, String str) {
        customLineChart.getClass();
        str.getClass();
        this.f111626b = customLineChart;
        LegendEntry legendEntry = new LegendEntry();
        legendEntry.label = customLineChart.getContext().getString(R.string.power_curve_interval_length);
        legendEntry.form = Legend.LegendForm.NONE;
        LegendEntry legendEntry2 = new LegendEntry();
        legendEntry2.label = str;
        legendEntry2.formColor = a7.b.getColor(customLineChart.getContext(), R.color.blue_10_static);
        Legend.LegendForm legendForm = Legend.LegendForm.CIRCLE;
        legendEntry2.form = legendForm;
        Unit unit = Unit.INSTANCE;
        LegendEntry legendEntry3 = new LegendEntry();
        legendEntry3.label = customLineChart.getContext().getString(R.string.power_curve_record_label);
        legendEntry3.formColor = a7.b.getColor(customLineChart.getContext(), R.color.gcm_chart_mark);
        legendEntry3.form = legendForm;
        this.f111627c = x.m(legendEntry, legendEntry2, legendEntry3);
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        Legend f31342c = this.f111626b.getF31342c();
        f31342c.getClass();
        a00.a aVar = (a00.a) f31342c;
        aVar.setCustom(this.f111627c);
        aVar.f37a = new int[]{1};
    }

    @Override // qz.f
    public final Legend b() {
        a00.a aVar = new a00.a();
        aVar.setEnabled(true);
        aVar.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f111626b.getContext();
        f.f148595a.getClass();
        aVar.setTextColor(a7.b.getColor(context, f.a.f148597b));
        aVar.setTextSize(12.0f);
        aVar.setFormSize(16.0f);
        aVar.setWordWrapEnabled(true);
        aVar.setXEntrySpace(25.0f);
        aVar.setYEntrySpace(5.0f);
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lla1/c$a;", "", "<init>", "()V", "", "LEGEND_TITLE_ITEMS_COUNT", "I", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
