package m00;

import am.x0;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lm00/b;", "Lqz/f;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomLineChart;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomLineChart f115520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f115521c;

    static {
        new a(null);
    }

    public b(CustomLineChart customLineChart) {
        customLineChart.getClass();
        this.f115520b = customLineChart;
        LegendEntry legendEntry = new LegendEntry();
        Context context = customLineChart.getContext();
        legendEntry.label = context != null ? context.getString(R.string.chart_distance_title, customLineChart.getContext().getString(ar.b.b(x0.f4312o, null).f23164e)) : null;
        legendEntry.form = Legend.LegendForm.NONE;
        Unit unit = Unit.INSTANCE;
        LegendEntry legendEntry2 = new LegendEntry();
        Context context2 = customLineChart.getContext();
        legendEntry2.label = context2 != null ? context2.getString(R.string.less_than_string_pattern, "3") : null;
        Context context3 = customLineChart.getContext();
        legendEntry2.label = context3 != null ? context3.getString(R.string.lbl_value_percent, legendEntry2.label) : null;
        Legend.LegendForm legendForm = Legend.LegendForm.CIRCLE;
        legendEntry2.form = legendForm;
        legendEntry2.formColor = a7.b.getColor(customLineChart.getContext(), R.color.lime_20_static);
        String str = null;
        LegendEntry legendEntry3 = new LegendEntry();
        Context context4 = customLineChart.getContext();
        legendEntry3.label = context4 != null ? context4.getString(R.string.string_line_string_pattern_no_space, "3", "6") : null;
        Context context5 = customLineChart.getContext();
        legendEntry3.label = context5 != null ? context5.getString(R.string.lbl_value_percent, legendEntry3.label) : null;
        legendEntry3.form = legendForm;
        legendEntry3.formColor = a7.b.getColor(customLineChart.getContext(), R.color.yellow_50_static);
        LegendEntry legendEntry4 = new LegendEntry();
        Context context6 = customLineChart.getContext();
        legendEntry4.label = context6 != null ? context6.getString(R.string.string_line_string_pattern_no_space, "6", "9") : null;
        Context context7 = customLineChart.getContext();
        legendEntry4.label = context7 != null ? context7.getString(R.string.lbl_value_percent, legendEntry4.label) : null;
        legendEntry4.form = legendForm;
        legendEntry4.formColor = a7.b.getColor(customLineChart.getContext(), R.color.orange_30_static);
        LegendEntry legendEntry5 = new LegendEntry();
        Context context8 = customLineChart.getContext();
        legendEntry5.label = context8 != null ? context8.getString(R.string.string_line_string_pattern_no_space, "9", "12") : null;
        Context context9 = customLineChart.getContext();
        legendEntry5.label = context9 != null ? context9.getString(R.string.lbl_value_percent, legendEntry5.label) : null;
        legendEntry5.form = legendForm;
        legendEntry5.formColor = a7.b.getColor(customLineChart.getContext(), R.color.red_30_static);
        LegendEntry legendEntry6 = new LegendEntry();
        Context context10 = customLineChart.getContext();
        legendEntry6.label = context10 != null ? context10.getString(R.string.lbl_greater_than_number, "12") : null;
        Context context11 = customLineChart.getContext();
        legendEntry6.label = context11 != null ? context11.getString(R.string.lbl_value_percent, legendEntry6.label) : str;
        legendEntry6.form = legendForm;
        legendEntry6.formColor = a7.b.getColor(customLineChart.getContext(), R.color.red_70_static);
        this.f115521c = x.m(legendEntry, legendEntry2, legendEntry3, legendEntry4, legendEntry5, legendEntry6);
    }

    @Override // qz.f
    public final void a(List<xz.f> list) {
        this.f115520b.getF31342c().setCustom(this.f115521c);
    }

    @Override // qz.f
    public final Legend b() {
        a00.a aVar = new a00.a();
        aVar.setEnabled(true);
        aVar.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        Context context = this.f115520b.getContext();
        f.f148595a.getClass();
        aVar.setTextColor(a7.b.getColor(context, f.a.f148597b));
        aVar.setTextSize(12.0f);
        aVar.setFormSize(16.0f);
        aVar.setXEntrySpace(25.0f);
        aVar.setYEntrySpace(5.0f);
        aVar.f37a = new int[]{1, 6};
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lm00/b$a;", "", "<init>", "()V", "", "CLIMB_LEVEL_1_MAX", "Ljava/lang/String;", "CLIMB_LEVEL_2_MAX", "CLIMB_LEVEL_3_MAX", "CLIMB_LEVEL_4_MAX", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
