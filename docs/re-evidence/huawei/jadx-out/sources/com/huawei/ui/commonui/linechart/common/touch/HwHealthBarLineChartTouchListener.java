package com.huawei.ui.commonui.linechart.common.touch;

import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;

/* JADX INFO: loaded from: classes16.dex */
public class HwHealthBarLineChartTouchListener extends ChartTouchListener<HwHealthBaseBarLineChart<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TouchModeDelegateMgr.TouchModeDelegate f23692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnScaleListener f23693c;
    public HwHealthBaseScrollBarLineChart.ChartShowMode d;
    private TouchModeDelegateMgr e;

    public interface OnScaleListener {
        void onScale(float f);
    }

    public HwHealthBarLineChartTouchListener(HwHealthBaseBarLineChart<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler) {
        super(hwHealthBaseBarLineChart);
        this.d = HwHealthBaseScrollBarLineChart.ChartShowMode.NORMAL;
        this.e = null;
        this.f23692b = null;
        this.f23691a = true;
        this.f23693c = null;
        TouchModeDelegateMgr touchModeDelegateMgr = new TouchModeDelegateMgr(this, (HwHealthBaseBarLineChart) this.mChart, viewPortHandler);
        this.e = touchModeDelegateMgr;
        this.f23692b = touchModeDelegateMgr.b();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        OnScaleListener onScaleListener;
        float scaleX = ((HwHealthBaseBarLineChart) this.mChart).getViewPortHandler().getScaleX();
        if (motionEvent == null) {
            return false;
        }
        this.f23692b = this.f23692b.monitor(motionEvent);
        if (scaleX != ((HwHealthBaseBarLineChart) this.mChart).getViewPortHandler().getScaleX() && (onScaleListener = this.f23693c) != null) {
            onScaleListener.onScale(((HwHealthBaseBarLineChart) this.mChart).getViewPortHandler().getScaleX());
        }
        if (this.f23692b != this.e.b()) {
            if (this.f23691a) {
                ((HwHealthBaseBarLineChart) this.mChart).disableScroll();
                this.f23691a = false;
                return true;
            }
            if (motionEvent.getAction() == 2) {
                ((HwHealthBaseBarLineChart) this.mChart).invalidate();
            }
        } else if (!this.f23691a) {
            ((HwHealthBaseBarLineChart) this.mChart).enableScroll();
            this.f23691a = true;
        }
        if (motionEvent.getAction() == 1) {
            ((HwHealthBaseBarLineChart) this.mChart).invalidate();
        }
        return true;
    }

    public void e() {
        this.d = HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_MODE;
    }

    public void d() {
        this.d = HwHealthBaseScrollBarLineChart.ChartShowMode.SCROLL_SCALE_MODE;
    }

    public void e(OnScaleListener onScaleListener) {
        this.f23693c = onScaleListener;
    }
}
