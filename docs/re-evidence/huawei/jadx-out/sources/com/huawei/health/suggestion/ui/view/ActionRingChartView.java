package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import defpackage.qjm;
import defpackage.qjp;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ActionRingChartView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f10166b;

    public ActionRingChartView(Context context) {
        this(context, null);
    }

    public ActionRingChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionRingChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10165a = context;
        a();
    }

    private void a() {
        this.f10166b = View.inflate(this.f10165a, R.layout.action_ring_chart_layout, this);
    }

    public void setData(double[] dArr) {
        if (dArr == null || dArr.length != 5) {
            LogUtil.j("ActionRingChartView", "datas is null or length is not equal 5");
            return;
        }
        HealthRingChart healthRingChart = (HealthRingChart) this.f10166b.findViewById(R.id.action_ring_view);
        List<qjp> listA = a(dArr);
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.f10165a, new qjm().b(true).c(false), listA);
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: idd
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return UnitUtil.e(qjpVar.f(), 2, 0);
            }
        });
        healthRingChart.setAdapter(healthRingChartAdapter);
    }

    private List<qjp> a(double[] dArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_extreme_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_anaerobic_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_aerobic_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_fatburn_color_end)));
        arrayList.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_warmup_color_end)));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_extreme_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_anaerobic_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_aerobic_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_fatburn_color_begin)));
        arrayList2.add(Integer.valueOf(ContextCompat.getColor(this.f10165a, R.color.pie_sector_heart_rate_warmup_color_begin)));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(this.f10165a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_perfect));
        arrayList3.add(this.f10165a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_great));
        arrayList3.add(this.f10165a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_good));
        arrayList3.add(this.f10165a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_comeon));
        arrayList3.add(this.f10165a.getResources().getString(com.huawei.ui.commonui.R.string.IDS_fitness_undone));
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < arrayList3.size(); i++) {
            arrayList4.add(new qjp((String) arrayList3.get(i), dArr[i], ((Integer) arrayList.get(i)).intValue(), ((Integer) arrayList2.get(i)).intValue()));
        }
        return arrayList4;
    }
}
