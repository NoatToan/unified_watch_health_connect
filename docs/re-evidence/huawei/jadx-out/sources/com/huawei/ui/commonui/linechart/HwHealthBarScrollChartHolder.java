package com.huawei.ui.commonui.linechart;

import android.content.Context;
import android.graphics.Color;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import defpackage.qly;
import defpackage.qme;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HwHealthBarScrollChartHolder extends HwHealthScrollChartHolder<HwHealthBarDataSet, HwHealthBarChart> {
    public HwHealthBarScrollChartHolder(Context context) {
        super(context);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBarDataSet onCreateDataSet(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        qme qmeVar = new qme(new ArrayList(), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos), dataInfos);
        qmeVar.setColor(Color.argb(255, 253, 178, 144));
        qmeVar.e(Color.argb(255, 250, 101, 33));
        qmeVar.setLabelCount(5, true);
        ((qly) hwHealthBarChart.getData()).e(dataInfos);
        return qmeVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public void initChartData(HwHealthBarChart hwHealthBarChart) {
        if (((qly) hwHealthBarChart.getData()) == null) {
            hwHealthBarChart.setData(new qly(new ArrayList()));
        }
    }
}
