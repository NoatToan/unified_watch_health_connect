package com.huawei.ui.main.stories.health.lactatethreshold.chart;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import defpackage.frd;
import defpackage.qls;
import defpackage.qma;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class LacticChartHoriHolder extends LacticChartHolder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27987c;

    public LacticChartHoriHolder(Context context) {
        super(context);
    }

    public LacticChartHoriHolder(Context context, String str) {
        super(context);
        setShowDataType(str);
    }

    @Override // com.huawei.ui.main.stories.health.lactatethreshold.chart.LacticChartHolder, com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        frd frdVar = new frd(BaseApplication.getContext(), new ArrayList(16), "", "", "");
        frdVar.setShowType(this.d);
        frdVar.setColor(c(frdVar));
        frdVar.setLabelCount(5, true);
        frdVar.setLineWidth(1.5f);
        frdVar.setShowMaxMinValue(false);
        if (this.f27987c) {
            frdVar.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.SECOND_PARTY);
        }
        HwHealthYAxis axisSecondParty = this.f27987c ? hwHealthLineChart.getAxisSecondParty() : hwHealthLineChart.getAxisFirstParty();
        axisSecondParty.setAxisMaximum(d(frdVar));
        axisSecondParty.setAxisMinimum(b(frdVar));
        axisSecondParty.setValueFormatter(a(frdVar) ? new qma() : new qls());
        return frdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.health.lactatethreshold.chart.LacticChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: b */
    public void onCustomChartStyle(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos) {
        super.onCustomChartStyle(hwHealthLineChart, dataInfos);
        hwHealthLineChart.getAxisSecondParty().setEnabled(true);
    }

    public void d(boolean z) {
        this.f27987c = z;
    }
}
