package com.huawei.health.knit.section.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineData;
import com.huawei.ui.commonui.linechart.common.HwHealthXAxisRenderer;
import defpackage.fqi;
import defpackage.fqj;
import defpackage.fqn;
import defpackage.fqs;
import defpackage.fqu;
import defpackage.fqw;
import defpackage.njy;
import defpackage.qnq;
import defpackage.qqn;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class BloodOxygenLineChart extends InteractorLineChart {
    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart
    public int getAnimateTime() {
        return 100;
    }

    public BloodOxygenLineChart(Context context, DataInfos dataInfos) {
        super(context, dataInfos);
        injectDataContainer(new HwHealthBaseBarLineChart.HwHealthDataContainerGenerator() { // from class: com.huawei.health.knit.section.chart.BloodOxygenLineChart.1
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart.HwHealthDataContainerGenerator
            public boolean typeOf(Class cls) {
                Class<fqi> superclass = fqi.class;
                while (true) {
                    if (superclass == null) {
                        return false;
                    }
                    if (superclass.equals(cls)) {
                        return true;
                    }
                    for (Class<?> cls2 : superclass.getInterfaces()) {
                        if (cls2.equals(cls)) {
                            return true;
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
            }

            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart.HwHealthDataContainerGenerator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public fqi newDataContainer() {
                return new fqi(BloodOxygenLineChart.this);
            }
        });
    }

    public BloodOxygenLineChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BloodOxygenLineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.huawei.health.knit.section.chart.InteractorLineChart
    protected qnq getLineChartRender(Context context, DataInfos dataInfos) {
        if (dataInfos == DataInfos.BloodOxygenAltitudeDayDetail) {
            return new fqj(this, this.mAnimator, this.mViewPortHandler, context, dataInfos);
        }
        return new fqu(this, this.mAnimator, this.mViewPortHandler, context, dataInfos);
    }

    @Override // com.huawei.health.knit.section.chart.InteractorLineChart
    protected void initXAxis() {
        XAxis xAxis = getXAxis();
        xAxis.setValueFormatter(new InteractorLineChart.e());
        xAxis.setAxisMinimum(0.0f);
        xAxis.setAxisMaximum(1440.0f);
    }

    @Override // com.huawei.health.knit.section.chart.InteractorLineChart
    protected void initCursorMode() {
        acquireLayout().m(Utils.convertDpToPixel(30.0f));
        setBackgroundColor(ContextCompat.getColor(BaseApplication.getContext(), R.color.colorBackground));
        enableMarkerView(true);
        setMarkerSlidingMode(HwHealthBaseBarLineChart.MarkerViewSlidingMode.ACCORDING_DATA);
        enableSpacePreserveForDataOverlay(true);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void enableMarkerView(boolean z) {
        this.mIsMarkerViewEnable = z;
        if (!(this.mXAxisRenderer instanceof HwHealthXAxisRenderer)) {
            LogUtil.j("BloodOxygenLineChart", "enableMarkerView mXAxisRenderer not instanceof HwHealthXAxisRenderer");
            return;
        }
        if (z) {
            getXAxis().setYOffset(Utils.convertPixelsToDp(this.mLayout.h() + this.mLayout.f()));
            setExtraBottomOffset(Utils.convertPixelsToDp(this.mLayout.b()) / 2.0f);
            ((HwHealthXAxisRenderer) this.mXAxisRenderer).e(HwHealthXAxisRenderer.Sorption.Y_OFFSET_FLOOR);
            setBackgroundColor(qqn.b(getContext(), com.huawei.ui.commonui.R.color.health_chart_extend_background_color));
            fillChartBackground(qqn.b(getContext(), com.huawei.ui.commonui.R.color.colorBackground), qqn.b(getContext(), com.huawei.ui.commonui.R.color.colorBackground));
            return;
        }
        ((HwHealthXAxisRenderer) this.mXAxisRenderer).e(HwHealthXAxisRenderer.Sorption.Y_OFFSET_CEIL);
        float fI = this.mLayout.i();
        float fG = this.mLayout.g();
        setExtraBottomOffset(Utils.convertPixelsToDp(fI + fG + this.mLayout.c() + this.mLayout.d()));
        setBackgroundColor(0);
        fillChartBackground(0, 0);
    }

    @Override // com.huawei.health.knit.section.chart.InteractorLineChart
    protected void initYRender() {
        this.mAxisRendererFirstParty = new fqn(this.mContext, this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new fqn(this.mContext, this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        this.mAxisRendererThirdParty = new fqn(this.mContext, this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void clipDataArea(Canvas canvas) {
        RectF rectF = new RectF(this.mViewPortHandler.getContentRect());
        rectF.bottom += this.mXAxis.getYOffset();
        rectF.top -= 12.0f;
        canvas.clipRect(rectF);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void refresh() {
        LogUtil.d("BloodOxygenLineChart", "refresh chart");
        super.refresh();
    }

    public void setNewRenderer(DataInfos dataInfos, Context context) {
        if (dataInfos == DataInfos.BloodOxygenAltitudeDayDetail || dataInfos == DataInfos.BloodOxygenAltitudeDayHorizontal) {
            this.mRenderer = new fqj(this, this.mAnimator, this.mViewPortHandler, context, dataInfos);
            this.mAxisRendererFirstParty = new fqn(this.mContext, this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
            this.mAxisRendererSecondParty = new fqn(this.mContext, this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
            this.mAxisRendererThirdParty = new fqn(this.mContext, this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
            return;
        }
        this.mRenderer = new fqu(this, this.mAnimator, this.mViewPortHandler, context, dataInfos);
        this.mAxisRendererFirstParty = new fqw(this.mContext, this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this, dataInfos);
        this.mAxisRendererSecondParty = new fqw(this.mContext, this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this, dataInfos);
        this.mAxisRendererThirdParty = new fqw(this.mContext, this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this, dataInfos);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public float computeTipsCenterHeightPx() {
        return (this.mAxisFirstParty.mEntries[1] + this.mAxisFirstParty.mEntries[2]) / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.section.chart.InteractorLineChart
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public fqs getHealthLineDataSet(HwHealthBaseBarLineData hwHealthBaseBarLineData) {
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
            if (t instanceof fqs) {
                return (fqs) t;
            }
        }
        return null;
    }
}
