package com.huawei.healthcloud.plugintrack.ui.view.sharegroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import defpackage.jpq;
import defpackage.jqp;
import defpackage.njy;
import defpackage.qjm;
import defpackage.qjp;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SpeedPercentView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f11384b;
    private Context d;

    public SpeedPercentView(Context context) {
        this(context, null);
    }

    public SpeedPercentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeedPercentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context;
        d();
    }

    private void d() {
        this.f11384b = View.inflate(this.d, R.layout.speed_percent_chart_show_layout, this);
    }

    public void setData(jqp jqpVar) {
        List<Integer> listB;
        char c2;
        if (jqpVar == null || jqpVar.d() == null) {
            LogUtil.e("Track_SpeedPercentView", "simplify is null");
            return;
        }
        boolean zD = jpq.d(jqpVar.d().requestSportType(), jqpVar.d().requestSportDataSource());
        LogUtil.a("Track_SpeedPercentView", "isResistance", Boolean.valueOf(zD), "data source", Integer.valueOf(jqpVar.d().requestSportDataSource()), "requestSportType", Integer.valueOf(jqpVar.d().requestSportType()));
        ArrayList<Float> arrayList = new ArrayList<>(16);
        e(arrayList, zD);
        List<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>(16);
        if (zD) {
            b(jqpVar, arrayList3);
            List<Double> arrayList4 = new ArrayList<>(5);
            b(arrayList3, arrayList4);
            List<Integer> listRequestResistanceList = jqpVar.b().requestResistanceList();
            listB = jpq.a(arrayList4, listRequestResistanceList, true);
            arrayList2 = jpq.a(arrayList4, listRequestResistanceList, false);
            c2 = 1;
        } else {
            listB = jpq.b(jqpVar);
            c2 = 2;
        }
        if (njy.e(listB) || (njy.e(arrayList2) && c2 == 1)) {
            LogUtil.j("Track_SpeedPercentView", "rankedList simplify is empty");
            return;
        }
        HealthRingChart healthRingChart = (HealthRingChart) this.f11384b.findViewById(R.id.moving_speed_circle);
        if (!zD) {
            arrayList2 = listB;
        }
        d(zD, healthRingChart, a(arrayList, arrayList2, arrayList3));
    }

    private void d(boolean z, HealthRingChart healthRingChart, List<qjp> list) {
        HealthRingChartAdapter.DataFormatter dataFormatter;
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.d, new qjm().b(false).c(true), list);
        if (z) {
            dataFormatter = new HealthRingChartAdapter.DataFormatter() { // from class: jtc
                @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
                public final String format(qjp qjpVar) {
                    return this.d.a(qjpVar);
                }
            };
        } else {
            dataFormatter = new HealthRingChartAdapter.DataFormatter() { // from class: jte
                @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
                public final String format(qjp qjpVar) {
                    return UnitUtil.e(qjpVar.f(), 2, 0);
                }
            };
        }
        healthRingChartAdapter.d(dataFormatter);
        healthRingChart.setAdapter(healthRingChartAdapter);
        if (LanguageUtil.o(this.d)) {
            healthRingChart.setDesc(this.d.getResources().getString(z ? R.string.IDS_indoor_equip_resistance : R.string.IDS_aw_version2_moving_speed));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String a(qjp qjpVar) {
        return this.d.getResources().getQuantityString(R.plurals.IDS_motiontrack_detail_fm_heart_min_unit, (int) qjpVar.f(), Integer.valueOf((int) qjpVar.f()));
    }

    private void b(ArrayList<Integer> arrayList, List<Double> list) {
        if (njy.e(arrayList, 8)) {
            LogUtil.j("Track_SpeedPercentView", "initRankList resistanceLevels.size < 9.");
            return;
        }
        list.add(Double.valueOf(arrayList.get(0).intValue()));
        list.add(Double.valueOf(arrayList.get(2).intValue()));
        list.add(Double.valueOf(arrayList.get(4).intValue()));
        list.add(Double.valueOf(arrayList.get(6).intValue()));
        list.add(Double.valueOf(arrayList.get(8).intValue()));
    }

    private void b(jqp jqpVar, ArrayList<Integer> arrayList) {
        int i;
        Map<String, String> mapRequestExtendDataMap = jqpVar.d().requestExtendDataMap();
        int i2 = 15;
        if (mapRequestExtendDataMap.containsKey("minRes")) {
            try {
                i = Integer.parseInt(mapRequestExtendDataMap.get("minRes"));
                try {
                    i2 = Integer.parseInt(mapRequestExtendDataMap.get("maxRes"));
                } catch (NumberFormatException e) {
                    e = e;
                    LogUtil.e("Track_SpeedPercentView", LogAnonymous.b(e));
                }
            } catch (NumberFormatException e2) {
                e = e2;
                i = 1;
            }
        } else {
            i = 1;
        }
        int i3 = i2 % 5;
        if (i3 != 0) {
            i2 += 5 - i3;
        }
        if (i == 0) {
            i = 1;
        }
        arrayList.add(Integer.valueOf(i));
        int i4 = i2 / 5;
        arrayList.add(Integer.valueOf(i4));
        arrayList.add(Integer.valueOf(i4 + 1));
        int i5 = i4 * 2;
        arrayList.add(Integer.valueOf(i5));
        arrayList.add(Integer.valueOf(i5 + 1));
        int i6 = i4 * 3;
        arrayList.add(Integer.valueOf(i6));
        arrayList.add(Integer.valueOf(i6 + 1));
        int i7 = i4 * 4;
        arrayList.add(Integer.valueOf(i7));
        arrayList.add(Integer.valueOf(i7 + 1));
        arrayList.add(Integer.valueOf(i2));
    }

    private List<qjp> a(List<Float> list, List<Integer> list2, List<Integer> list3) {
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        ArrayList arrayList2 = new ArrayList();
        c(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        c(list, list3, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = list2.size();
        int i = 0;
        while (i < size) {
            arrayList4.add(new qjp(i < arrayList3.size() ? arrayList3.get(i) : "", list2.get(i).intValue(), i < arrayList.size() ? arrayList.get(i).intValue() : 0, i < arrayList2.size() ? arrayList2.get(i).intValue() : 0));
            i++;
        }
        return arrayList4;
    }

    private void c(List<Integer> list) {
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_extreme_color_begin)));
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_anaerobic_color_begin)));
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_aerobic_color_begin)));
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_fatburn_color_begin)));
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_warmup_color_begin)));
    }

    private void d(List<Integer> list) {
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_extreme_color_end)));
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_anaerobic_color_end)));
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_aerobic_color_end)));
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_fatburn_color_end)));
        list.add(Integer.valueOf(ContextCompat.getColor(this.d, R.color.pie_sector_heart_rate_warmup_color_end)));
    }

    private void c(List<Float> list, List<Integer> list2, List<String> list3) {
        if (list2.size() != 0) {
            for (int size = list2.size() / 2; size > 0; size--) {
                int i = size * 2;
                list3.add(this.d.getResources().getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(list2.get(i - 2).intValue(), 1, 0), UnitUtil.e(list2.get(i - 1).intValue(), 1, 0)));
            }
            return;
        }
        if (njy.e(list, 3)) {
            LogUtil.j("Track_SpeedPercentView", "initTitles init.size  < 4.");
            return;
        }
        list3.add(String.format(this.d.getResources().getString(R.string.IDS_aw_version2_compare_bigger_one), 5, UnitUtil.e(list.get(3).floatValue(), 1, 1)));
        list3.add(String.format(this.d.getResources().getString(R.string.IDS_aw_version2_compare_bigger_two), 4, UnitUtil.e(list.get(2).floatValue(), 1, 1), UnitUtil.e(list.get(3).floatValue(), 1, 1)));
        list3.add(String.format(this.d.getResources().getString(R.string.IDS_aw_version2_compare_bigger_two), 3, UnitUtil.e(list.get(1).floatValue(), 1, 1), UnitUtil.e(list.get(2).floatValue(), 1, 1)));
        list3.add(String.format(this.d.getResources().getString(R.string.IDS_aw_version2_compare_bigger_two), 2, UnitUtil.e(list.get(0).floatValue(), 1, 1), UnitUtil.e(list.get(1).floatValue(), 1, 1)));
        list3.add(String.format(this.d.getResources().getString(R.string.IDS_aw_version2_compare_smaller), 1, UnitUtil.e(list.get(0).floatValue(), 1, 1)));
    }

    private void e(ArrayList<Float> arrayList, boolean z) {
        Float fValueOf = Float.valueOf(3.0f);
        if (!z) {
            if (UnitUtil.f()) {
                arrayList.add(Float.valueOf((float) UnitUtil.e(1.0d, 0)));
                arrayList.add(Float.valueOf((float) UnitUtil.e(3.0d, 0)));
                arrayList.add(Float.valueOf((float) UnitUtil.e(5.0d, 0)));
                arrayList.add(Float.valueOf((float) UnitUtil.e(7.0d, 0)));
                return;
            }
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(fValueOf);
            arrayList.add(Float.valueOf(5.0f));
            arrayList.add(Float.valueOf(7.0f));
            return;
        }
        arrayList.add(fValueOf);
        arrayList.add(Float.valueOf(6.0f));
        arrayList.add(Float.valueOf(9.0f));
        arrayList.add(Float.valueOf(12.0f));
    }
}
