package com.huawei.ui.main.stories.fitness.util.chart;

import android.content.Context;
import android.graphics.Color;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DataLayerType;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.main.stories.fitness.interactors.TrackModuleChartStorageHelper;
import defpackage.qly;
import defpackage.qnl;
import defpackage.uki;
import defpackage.ukl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class TrackModuleBarChartHolder extends HwHealthBarScrollChartHolder implements DataTypeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<DataSetLayerListener> f27114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IChartStorageHelper f27115b;
    private Map<DataLayerType, qnl> d;

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return 0.0f;
    }

    public TrackModuleBarChartHolder(Context context) {
        super(context);
        this.f27115b = new TrackModuleChartStorageHelper();
        this.f27114a = new ArrayList();
        this.d = new HashMap();
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return ukl.c((int) Math.ceil(f), 5);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f27115b;
    }

    public void c(DataLayerType dataLayerType, int i, int i2, String str) {
        qnl qnlVar = new qnl();
        qnlVar.d(i);
        qnlVar.c(i2);
        qnlVar.c(str);
        this.d.put(dataLayerType, qnlVar);
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBarDataSet onCreateDataSet(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        uki ukiVar = new uki(new ArrayList(), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos), dataInfos);
        ukiVar.setLabelCount(5, true);
        ((qly) hwHealthBarChart.getData()).e(dataInfos);
        if (dataInfos.isMultiData()) {
            this.f27114a.add(ukiVar);
        }
        ukiVar.setColor(Color.argb(255, 137, 222, OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL));
        ukiVar.e(Color.argb(255, 18, 184, 74));
        return ukiVar;
    }

    @Override // com.huawei.ui.main.stories.fitness.util.chart.DataTypeListener
    public void onChange(DataLayerType dataLayerType) {
        if (dataLayerType == null) {
            return;
        }
        qnl qnlVar = this.d.get(dataLayerType);
        Iterator<DataSetLayerListener> it = this.f27114a.iterator();
        while (it.hasNext()) {
            it.next().onChange(dataLayerType, qnlVar);
        }
    }

    public void b() {
        this.f27114a.clear();
    }
}
