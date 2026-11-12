package com.huawei.health.knit.section.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import defpackage.fqo;

/* JADX INFO: loaded from: classes7.dex */
public class BloodOxygenBarChartView extends HwHealthBarChart {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnDataChangedListener f7464a;
    private OnMostChangedListener d;

    public interface OnDataChangedListener {
        void onDataChangedListener(float f, float f2);
    }

    public interface OnMostChangedListener {
        void onMostChangedListener(float f, float f2);
    }

    public BloodOxygenBarChartView(Context context) {
        super(context);
        c();
    }

    private void c() {
        LogUtil.e("BloodOxygenBarChartView", "BloodOxygenBarChartView initStyle!");
        this.mRenderer = new BloodOxygenBarChartRenderer(this, this, this.mAnimator, this.mViewPortHandler);
        this.mAxisRendererFirstParty = new fqo(getContext(), this.mViewPortHandler, this.mAxisFirstParty, this.mFirstAxisTransformer, this);
        this.mAxisRendererSecondParty = new fqo(getContext(), this.mViewPortHandler, this.mAxisSecondParty, this.mSecondAxisTransformer, this);
        enableMarkerView(true);
        enableSpacePreserveForDataOverlay(true);
        ((BloodOxygenBarChartRenderer) this.mRenderer).a(new BarChartRender.OnTimeChangedListener() { // from class: fqp
            @Override // com.huawei.health.knit.section.chart.BarChartRender.OnTimeChangedListener
            public final void onTimeChangedListener(float f, float f2) {
                this.f34415a.c(f, f2);
            }
        });
        ((BloodOxygenBarChartRenderer) this.mRenderer).b(new BloodOxygenBarChartRenderer.OnMostValueChangedListener() { // from class: fql
            @Override // com.huawei.health.knit.section.chart.BloodOxygenBarChartRenderer.OnMostValueChangedListener
            public final void onMostValueChangedListener(float f, float f2) {
                this.d.a(f, f2);
            }
        });
    }

    public /* synthetic */ void c(float f, float f2) {
        OnDataChangedListener onDataChangedListener = this.f7464a;
        if (onDataChangedListener != null) {
            onDataChangedListener.onDataChangedListener(f, f2);
        }
    }

    public /* synthetic */ void a(float f, float f2) {
        OnMostChangedListener onMostChangedListener = this.d;
        if (onMostChangedListener != null) {
            onMostChangedListener.onMostChangedListener(f, f2);
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart
    public void clipDataArea(Canvas canvas) {
        RectF rectF = new RectF(this.mViewPortHandler.getContentRect());
        rectF.bottom += this.mXAxis.getYOffset();
        rectF.top -= this.mXAxis.getYOffset();
        canvas.clipRect(rectF);
    }

    public void setOnDataChangedListener(OnDataChangedListener onDataChangedListener) {
        this.f7464a = onDataChangedListener;
    }

    public void setOnMostChangedListener(OnMostChangedListener onMostChangedListener) {
        this.d = onMostChangedListener;
    }
}
