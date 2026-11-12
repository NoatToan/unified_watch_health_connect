package com.huawei.ui.main.stories.fitness.util.chart;

import android.content.Context;
import android.graphics.Color;
import com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import defpackage.ujh;
import defpackage.ukl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class SleepModuleBarChartHolder extends HwHealthBarScrollChartHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IChartStorageHelper f27101a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<DataInfos, HwHealthBarDataSet> f27102c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos) {
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return 0.0f;
    }

    public SleepModuleBarChartHolder(Context context) {
        super(context);
        this.f27102c = new HashMap();
        this.f27101a = new ujh();
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return ukl.c((int) Math.ceil(f), 5);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f27101a;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBarDataSet onCreateDataSet(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        HwHealthBarDataSet hwHealthBarDataSetOnCreateDataSet = super.onCreateDataSet(hwHealthBarChart, dataInfos, cVar);
        this.f27102c.put(dataInfos, hwHealthBarDataSetOnCreateDataSet);
        if (dataInfos.isCoreSleepData()) {
            hwHealthBarDataSetOnCreateDataSet.e(Color.argb(255, 138, 43, 226));
        }
        return hwHealthBarDataSetOnCreateDataSet;
    }
}
