package com.huawei.ui.main.stories.health.bloodpressure.chart;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser;
import defpackage.fqx;
import defpackage.qlt;
import defpackage.qqn;
import defpackage.utp;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class BloodPressureChartHolder extends HwHealthLineScrollChartHolder implements HighlightedEntryParser {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final utp f27820c;

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        if (f > 300.0f) {
            return 300.0f;
        }
        float f3 = f + (f % 2.0f != 0.0f ? 3.0f : 2.0f);
        if (f3 < 200.0f) {
            return 200.0f;
        }
        return f3;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        float f3 = f2 - (f2 % 2.0f != 0.0f ? 3.0f : 2.0f);
        if (f3 > 40.0f) {
            return 40.0f;
        }
        return f3;
    }

    public BloodPressureChartHolder(Context context) {
        super(context);
        this.f27820c = new utp();
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        return new fqx(BaseApplication.getContext(), new ArrayList(16), "", "", "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public HwHealthLineDataSet onFakeDataSet(HwHealthChartHolder.c cVar) {
        return new HwHealthLineDataSet(BaseApplication.getContext(), new ArrayList(16), "", "", "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos) {
        hwHealthLineChart.makeReverse(true);
        hwHealthLineChart.setGridColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color), qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color));
        hwHealthLineChart.setLabelColor(qqn.b(BaseApplication.getContext(), R.color.health_chart_default_text_color));
        hwHealthLineChart.setAvoidFirstLastClipping(false);
        hwHealthLineChart.enableOnlyShowMinutes(true);
        hwHealthLineChart.enableOneMinuteOmit(true);
        hwHealthLineChart.getAxisFirstParty().setAxisMinimum(30.0f);
        hwHealthLineChart.getAxisFirstParty().setAxisMaximum(300.0f);
        hwHealthLineChart.getAxisSecondParty().setEnabled(false);
        hwHealthLineChart.getAxisFirstParty().setValueFormatter(new qlt());
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f27820c;
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.chart.HighlightedEntryParser
    public String parse(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 0);
    }
}
