package com.huawei.ui.main.stories.health.temperature.chart;

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
import defpackage.ukr;
import defpackage.vaj;
import defpackage.vbr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class KnitTemperatureBarChartHolder extends HwHealthBarScrollChartHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vaj f28097a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28098c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.commonui.linechart.HwHealthChartHolder
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onCustomChartStyle(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos) {
    }

    public KnitTemperatureBarChartHolder(Context context) {
        super(context);
        this.f28098c = "TEMPERATURE_MIN_MAX";
        this.f28097a = new vaj();
    }

    public void c(String str) {
        this.f28097a.e(str);
        this.f28098c = str;
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return vbr.b("TEMPERATURE_MIN_MAX".equals(this.f28098c));
    }

    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        return vbr.c("TEMPERATURE_MIN_MAX".equals(this.f28098c));
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.f28097a;
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthBarScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthBarDataSet onCreateDataSet(HwHealthBarChart hwHealthBarChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        ukr ukrVar = new ukr(new ArrayList(), getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos), dataInfos);
        if (dataInfos.isBloodOxygenData()) {
            ukrVar.setColor(Color.argb(255, 253, 178, 144));
            ukrVar.e(Color.argb(255, 255, 64, 101));
        }
        ukrVar.setLabelCount(5, true);
        qly qlyVar = (qly) hwHealthBarChart.getData();
        qlyVar.e(dataInfos);
        if (dataInfos.isDayData()) {
            qlyVar.c(30.0f);
        }
        return ukrVar;
    }
}
