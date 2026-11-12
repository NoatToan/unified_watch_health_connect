package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.chart;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.XAxis;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart;
import defpackage.njy;
import defpackage.qnq;
import defpackage.twe;
import defpackage.twh;
import defpackage.twk;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenLineChart extends InteractorLineChart {
    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart
    public int getAnimateTime() {
        return 100;
    }

    public BloodOxygenLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BloodOxygenLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    public qnq getLineChartRender(Context context, DataInfos dataInfos) {
        return new twh(this, this.mAnimator, this.mViewPortHandler, context, dataInfos);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    public void initXAxis() {
        XAxis xAxis = getXAxis();
        xAxis.setValueFormatter(new InteractorLineChart.d());
        xAxis.setAxisMinimum(0.0f);
        xAxis.setAxisMaximum(1440.0f);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    public void initCursorMode() {
        setBackgroundColor(this.mContext.getResources().getColor(R.color.color_fff2f2f2));
        enableMarkerView(true);
        setMarkerSlidingMode(HwHealthBaseBarLineChart.MarkerViewSlidingMode.ACCORDING_DATA);
        enableSpacePreserveForDataOverlay(true);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    public void initYRender() {
        this.mAxisRendererFirstParty = new twk(this.mContext, this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new twk(this.mContext, this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        this.mAxisRendererThirdParty = new twk(this.mContext, this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void refresh() {
        LogUtil.d("BloodOxygenLineChart", "refresh chart");
        super.refresh();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public float computeTipsCenterHeightPx() {
        return (this.mAxisFirstParty.mEntries[1] + this.mAxisFirstParty.mEntries[2]) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.ui.main.stories.fitness.views.base.InteractorLineChart
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public twe getHealthLineDataSet(HwHealthBaseBarLineData hwHealthBaseBarLineData) {
        if (hwHealthBaseBarLineData == null) {
            LogUtil.j("BloodOxygenLineChart", "getBloodOxygenHealthLineDataSet data = null");
            return null;
        }
        List<T> dataSets = hwHealthBaseBarLineData.getDataSets();
        if (njy.e(dataSets)) {
            LogUtil.j("BloodOxygenLineChart", "getBloodOxygenHealthLineDataSet dataSets = null");
            return null;
        }
        for (T t : dataSets) {
            if (t instanceof twe) {
                return (twe) t;
            }
        }
        return null;
    }
}
