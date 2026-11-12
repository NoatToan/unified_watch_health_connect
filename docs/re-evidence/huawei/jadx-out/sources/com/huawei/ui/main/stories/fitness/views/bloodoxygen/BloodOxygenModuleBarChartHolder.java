package com.huawei.ui.main.stories.fitness.views.bloodoxygen;

import android.content.Context;
import android.graphics.Color;
import com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import defpackage.qly;
import defpackage.tvs;
import defpackage.ukr;
import defpackage.uks;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenModuleBarChartHolder extends HwHealthBarScrollChartHolder {
    private IChartStorageHelper e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos) {
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return 100.0f;
    }

    public BloodOxygenModuleBarChartHolder(Context context) {
        super(context);
        this.e = new uks();
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return tvs.b(f2);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.e;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBarDataSet onCreateDataSet(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        ukr ukrVar = new ukr(new ArrayList(), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos), dataInfos);
        if (dataInfos.isBloodOxygenData()) {
            ukrVar.setColor(Color.argb(255, 253, 178, 144));
            ukrVar.e(Color.argb(255, 255, 64, 101));
        }
        ukrVar.setLabelCount(tvs.b().length, true);
        ((qly) hwHealthBarChart.getData()).e(dataInfos);
        hwHealthBarChart.getAxisFirstParty().setAxisMinimum(60.0f);
        hwHealthBarChart.getAxisFirstParty().setAxisMaximum(100.0f);
        return ukrVar;
    }
}
