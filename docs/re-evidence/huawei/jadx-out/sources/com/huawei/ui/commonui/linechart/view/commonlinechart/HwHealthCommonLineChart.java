package com.huawei.ui.commonui.linechart.view.commonlinechart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RectF;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import defpackage.qls;
import defpackage.qnt;
import defpackage.qnx;
import defpackage.qnz;
import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthCommonLineChart extends HwHealthLineChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f23741a;

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart
    public int getAnimateTime() {
        return 100;
    }

    public HwHealthCommonLineChart(Context context) {
        super(context);
        this.f23741a = null;
        LogUtil.d("HwHealthCommonLineChart", "construct chart");
        this.f23741a = context;
        this.mRenderer = new qnx(this, this.mAnimator, this.mViewPortHandler, context);
        d();
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void clipDataArea(Canvas canvas) {
        RectF rectF = new RectF(this.mViewPortHandler.getContentRect());
        rectF.top -= this.mXAxis.getYOffset();
        rectF.bottom += this.mXAxis.getYOffset();
        rectF.left -= Utils.convertDpToPixel(5.0f);
        rectF.right += Utils.convertDpToPixel(5.0f);
        canvas.clipRect(rectF);
    }

    public void c() {
        acquireLayout().m(Utils.convertDpToPixel(20.0f)).b(Utils.convertDpToPixel(36.0f)).i(Utils.convertDpToPixel(8.0f));
    }

    private void d() {
        this.mLegend.setEnabled(false);
        getDescription().setEnabled(false);
        c();
        XAxis xAxis = getXAxis();
        xAxis.setValueFormatter(new c());
        xAxis.setAxisMinimum(0.0f);
        xAxis.setAxisMaximum(1440.0f);
        getXAxis().setAvoidFirstLastClipping(false);
        getAxisFirstParty().setValueFormatter(new qls());
        b();
        setBackgroundColor(Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE));
        enableMarkerView(true);
        setMarkerSlidingMode(HwHealthBaseBarLineChart.MarkerViewSlidingMode.ACCORDING_DATA);
        enableSpacePreserveForDataOverlay(true);
        if (this.mMarker instanceof HwHealthMarkerView) {
            ((HwHealthMarkerView) this.mMarker).b(false);
        }
    }

    protected void b() {
        this.mAxisRendererFirstParty = new qnz(this.f23741a, this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new qnz(this.f23741a, this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        this.mAxisRendererThirdParty = new qnz(this.f23741a, this.mViewPortHandler, this.mAxisThirdParty, this.mThirdPartyAxisTransformer, this);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart
    public void resetYaxisAnimateValue() {
        this.mAxisRendererFirstParty.g();
    }

    public static class c implements IAxisValueFormatter {
        @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
        public String getFormattedValue(float f, AxisBase axisBase) {
            DecimalFormat decimalFormat = new DecimalFormat("00");
            int i = (int) f;
            int i2 = i / 60;
            return decimalFormat.format(i2) + ":" + decimalFormat.format(i - (i2 * 60));
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void setMarkerViewPosition(HwHealthBaseBarLineChart.d dVar) {
        this.mMarkerViewPosition = dVar;
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart, com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void refresh() {
        LogUtil.d("HwHealthCommonLineChart", "refresh chart");
        super.refresh();
    }

    private boolean a() {
        List<T> dataSets = ((qnt) this.mData).getDataSets();
        if (dataSets == 0 || dataSets.size() == 0) {
            return true;
        }
        LogUtil.a("HwHealthCommonLineChart", "fillOriginalData mLineData size = ", Integer.valueOf(dataSets.size()));
        return false;
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChart
    public void customAxisShow() {
        if (!a()) {
            super.customAxisShow();
            return;
        }
        this.mAxisFirstParty.setEnabled(true);
        this.mAxisSecondParty.setEnabled(false);
        this.mAxisThirdParty.setEnabled(false);
        this.mAxisFirstParty.setDrawLabels(true);
        this.mAxisSecondParty.setDrawLabels(false);
        this.mAxisThirdParty.setDrawLabels(false);
    }
}
