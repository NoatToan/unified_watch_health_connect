package com.huawei.ui.main.stories.fitness.views.bloodoxygen;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.media3.extractor.ts.TsExtractor;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import com.huawei.ui.main.stories.BarChartRender;
import defpackage.qly;
import defpackage.qno;
import defpackage.tvs;
import defpackage.ukm;
import defpackage.ukp;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenBarChartRenderer extends BarChartRender implements IHwHealthDataRender {
    private boolean f;
    private BarChartRender.OnTimeChangedListener h;
    private OnMostValueChangedListener i;
    private Paint j;

    public interface OnMostValueChangedListener {
        void onMostValueChangedListener(float f, float f2);
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    public BloodOxygenBarChartRenderer(HwHealthBarChart hwHealthBarChart, HwHealthBarDataProvider hwHealthBarDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(hwHealthBarDataProvider, chartAnimator, viewPortHandler);
        this.f = false;
        this.j = new Paint();
        LogUtil.e("BloodOxygenBarChartRenderer", "BloodOxygenBarChartRenderer");
        c(hwHealthBarChart, hwHealthBarDataProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qlz
    public void c(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, int i) {
        IHwHealthBarDataSet iHwHealthBarDataSet2;
        qly barData = this.f46467b.getBarData();
        if (canvas == null || barData == null || i < 0 || (iHwHealthBarDataSet2 = (IHwHealthBarDataSet) barData.getDataSetByIndex(i)) == null || !iHwHealthBarDataSet2.isHighlightEnabled() || iHwHealthBarDataSet == null) {
            return;
        }
        this.e.setColor(iHwHealthBarDataSet.getBarBorderColor());
        this.e.setStrokeWidth(Utils.convertDpToPixel(iHwHealthBarDataSet.getBarBorderWidth()));
        qno qnoVar = this.f46468c[i];
        qnoVar.setPhases(this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY());
        qnoVar.setDataSet(i);
        qnoVar.setInverted(false);
        qnoVar.setBarWidth(this.f46467b.getBarData().a());
        qnoVar.b(iHwHealthBarDataSet);
        this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt()).pointValuesToPixel(qnoVar.buffer);
        boolean z = iHwHealthBarDataSet.getColors().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(a(iHwHealthBarDataSet));
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i2 = 0; i2 < qnoVar.size(); i2 += 4) {
            if (this.mViewPortHandler.isInBoundsLeft(qnoVar.buffer[i2])) {
                int i3 = i2 + 2;
                if (this.mViewPortHandler.isInBoundsRight(qnoVar.buffer[i3])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iHwHealthBarDataSet.getColor(i2 / 4));
                    }
                    this.d.set(qnoVar.buffer[i2], qnoVar.buffer[i2 + 1], qnoVar.buffer[i3], qnoVar.buffer[i2 + 3]);
                    HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i2 / 4);
                    if (hwHealthBarEntry == null) {
                        return;
                    }
                    ukp ukpVarA = ((ukm) hwHealthBarEntry.acquireModel()).a();
                    arrayList.add(Float.valueOf(ukpVarA.a()));
                    arrayList.add(Float.valueOf(ukpVarA.d()));
                    e(canvas, this.d, 2, ukpVarA);
                } else {
                    continue;
                }
            }
        }
        e(arrayList);
    }

    private void e(List<Float> list) {
        OnMostValueChangedListener onMostValueChangedListener;
        if (list != null && list.size() > 0) {
            Collections.sort(list);
            if (list.get(0) != null && list.get(list.size() - 1) != null && (onMostValueChangedListener = this.i) != null) {
                onMostValueChangedListener.onMostValueChangedListener(list.get(0).floatValue(), list.get(list.size() - 1).floatValue());
                return;
            }
        }
        OnMostValueChangedListener onMostValueChangedListener2 = this.i;
        if (onMostValueChangedListener2 != null) {
            onMostValueChangedListener2.onMostValueChangedListener(0.0f, 0.0f);
        }
    }

    private void e(Canvas canvas, RectF rectF, int i, ukp ukpVar) {
        float fAbs;
        float f;
        float fAbs2;
        float f2;
        float f3;
        float fAbs3;
        d(i);
        float fD = ukpVar.d();
        float fA = ukpVar.a();
        if ((fD >= 1.0E-7f || fA >= 1.0E-7f) && !e(tvs.b(fD))) {
            float fAbs4 = Math.abs(rectF.right - rectF.left);
            float fAbs5 = Math.abs(rectF.bottom - rectF.top);
            float f4 = (100.0f - fA) / 40.0f;
            float fAbs6 = rectF.top;
            float fAbs7 = rectF.bottom;
            if (fAbs7 - fAbs6 >= fAbs4) {
                fAbs = Math.abs(fAbs6 + fAbs4);
                float f5 = fAbs4 / 2.0f;
                fAbs2 = Math.abs(fAbs6 + f5);
                float fAbs8 = Math.abs(fAbs7 - f5);
                fAbs3 = Math.abs(fAbs7 - fAbs4);
                f3 = fAbs8;
                f2 = fAbs7;
            } else {
                if (f4 * fAbs5 <= fAbs4 / 2.0f) {
                    float f6 = fAbs4 + fAbs6;
                    fAbs = Math.abs(f6);
                    fAbs7 = Math.abs(f6);
                    f = fAbs6;
                } else {
                    float f7 = fAbs7 - fAbs4;
                    float fAbs9 = Math.abs(f7);
                    fAbs = fAbs7;
                    fAbs6 = Math.abs(f7);
                    f = fAbs9;
                }
                fAbs2 = 0.0f;
                f2 = fAbs7;
                f3 = 0.0f;
                float f8 = fAbs6;
                fAbs6 = f;
                fAbs3 = f8;
            }
            c(rectF, i);
            canvas.drawArc(new RectF(rectF.left, fAbs6, rectF.right, fAbs), 0.0f, -180.0f, false, this.j);
            canvas.drawRect(Math.abs(rectF.left), fAbs2, Math.abs(rectF.right), f3, this.j);
            canvas.drawArc(new RectF(rectF.left, fAbs3, rectF.right, f2), 0.0f, 180.0f, false, this.j);
        }
    }

    private void d(int i) {
        if (i == 1) {
            this.j.setColor(Color.argb(255, 255, 64, 101));
        } else {
            this.j.setColor(Color.argb(255, 253, 152, TsExtractor.TS_STREAM_TYPE_AC4));
        }
    }

    private void c(RectF rectF, int i) {
        if (i == 1 || !LanguageUtil.ba(BaseApplication.getContext())) {
            return;
        }
        float f = rectF.left;
        float f2 = rectF.right;
        rectF.right = f;
        rectF.left = f2;
    }

    @Override // defpackage.qlz
    public void c(float f, float f2, float f3, float f4, Transformer transformer) {
        this.f46466a.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.f46466a, this.mAnimator.getPhaseY());
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (canvas == null || !isDrawingValuesAllowed(this.f46467b)) {
            LogUtil.j("BloodOxygenBarChartRenderer", "drawValues canvas is null");
            return;
        }
        if (this.f46467b.getBarData() == null) {
            LogUtil.j("BloodOxygenBarChartRenderer", "drawValues mChart.getBarData() is null");
            return;
        }
        List<T> dataSets = this.f46467b.getBarData().getDataSets();
        for (int i = 0; i < this.f46467b.getBarData().getDataSetCount(); i++) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) dataSets.get(i);
            if (shouldDrawValues(iHwHealthBarDataSet)) {
                applyValueTextStyle(iHwHealthBarDataSet);
                BarBuffer barBuffer = this.f46468c[i];
                MPPointF mPPointF = MPPointF.getInstance(iHwHealthBarDataSet.getIconsOffset());
                mPPointF.x = Utils.convertDpToPixel(mPPointF.x);
                mPPointF.y = Utils.convertDpToPixel(mPPointF.y);
                if (!iHwHealthBarDataSet.isStacked()) {
                    a(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                } else {
                    e(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                }
                MPPointF.recycleInstance(mPPointF);
            }
        }
    }

    private void e(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
        if (barBuffer == null || barBuffer.buffer == null) {
            LogUtil.j("BloodOxygenBarChartRenderer", "setIsStacked buffer or buffer.buffer is null");
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < iHwHealthBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
            HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i);
            int i3 = i2 + 2;
            if (barBuffer.buffer.length <= i3) {
                LogUtil.j("BloodOxygenBarChartRenderer", "setIsStacked valid parameter");
                return;
            }
            float f = (barBuffer.buffer[i2] + barBuffer.buffer[i3]) / 2.0f;
            int valueTextColor = iHwHealthBarDataSet.getValueTextColor(i);
            if (!this.mViewPortHandler.isInBoundsRight(f)) {
                return;
            }
            int i4 = i2 + 1;
            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i4]) && this.mViewPortHandler.isInBoundsLeft(f)) {
                if (iHwHealthBarDataSet.isDrawValuesEnabled()) {
                    c(canvas, iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry.getY(), hwHealthBarEntry, i, this.mViewPortHandler), f, barBuffer.buffer[i4], valueTextColor);
                }
                if (hwHealthBarEntry.getIcon() != null && iHwHealthBarDataSet.isDrawIconsEnabled()) {
                    Drawable icon = hwHealthBarEntry.getIcon();
                    Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) (barBuffer.buffer[i4] + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
                i2 += 4;
                i++;
            }
        }
    }

    private void a(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
        float f;
        for (int i = 0; i < barBuffer.buffer.length * this.mAnimator.getPhaseX(); i += 4) {
            float f2 = (barBuffer.buffer[i] + barBuffer.buffer[i + 2]) / 2.0f;
            if (!this.mViewPortHandler.isInBoundsRight(f2)) {
                return;
            }
            int i2 = i + 1;
            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i2]) && this.mViewPortHandler.isInBoundsLeft(f2)) {
                int i3 = i / 4;
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i3);
                float y = hwHealthBarEntry.getY();
                if (iHwHealthBarDataSet.isDrawValuesEnabled()) {
                    c(canvas, iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry.getY(), hwHealthBarEntry, i3, this.mViewPortHandler), f2, y >= 0.0f ? barBuffer.buffer[i2] : barBuffer.buffer[i + 3], iHwHealthBarDataSet.getValueTextColor(i3));
                }
                if (hwHealthBarEntry.getIcon() != null && iHwHealthBarDataSet.isDrawIconsEnabled()) {
                    Drawable icon = hwHealthBarEntry.getIcon();
                    if (y >= 0.0f) {
                        f = barBuffer.buffer[i2];
                    } else {
                        f = barBuffer.buffer[i + 3];
                    }
                    Utils.drawImage(canvas, icon, (int) (f2 + mPPointF.x), (int) (f + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
            }
        }
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        if (this.f) {
            return;
        }
        qly barData = this.f46467b.getBarData();
        if (canvas == null || highlightArr == null || barData == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iHwHealthBarDataSet != null && iHwHealthBarDataSet.isHighlightEnabled()) {
                this.mHighlightPaint.setColor(d(iHwHealthBarDataSet));
                List<T> entriesForXValue = iHwHealthBarDataSet.getEntriesForXValue(highlight.getX());
                if (entriesForXValue == 0 || entriesForXValue.size() == 0) {
                    BarChartRender.OnTimeChangedListener onTimeChangedListener = this.h;
                    if (onTimeChangedListener != null) {
                        onTimeChangedListener.onTimeChangedListener(0.0f, 0.0f);
                        return;
                    }
                    return;
                }
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) entriesForXValue.get(0);
                if (isInBoundsX(hwHealthBarEntry, iHwHealthBarDataSet)) {
                    ukm ukmVar = (ukm) hwHealthBarEntry.acquireModel();
                    float fB = ukmVar.b();
                    float fC = ukmVar.c();
                    ukp ukpVarA = ukmVar.a();
                    Transformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
                    BarChartRender.OnTimeChangedListener onTimeChangedListener2 = this.h;
                    if (onTimeChangedListener2 != null && ukpVarA != null) {
                        onTimeChangedListener2.onTimeChangedListener(ukpVarA.d(), ukpVarA.a());
                        c(hwHealthBarEntry.getX(), fB, fC, barData.a() / 2.0f, transformer);
                        c(highlight, this.f46466a);
                        e(canvas, this.f46466a, 1, ukpVarA);
                    }
                }
            }
        }
    }

    public void a(BarChartRender.OnTimeChangedListener onTimeChangedListener) {
        this.h = onTimeChangedListener;
    }

    public void e(OnMostValueChangedListener onMostValueChangedListener) {
        this.i = onMostValueChangedListener;
    }

    @Override // defpackage.qlz
    public void c(Highlight highlight, RectF rectF) {
        highlight.setDraw(rectF.centerX(), rectF.top);
    }

    @Override // defpackage.qlz
    public HwHealthBarDataProvider e() {
        return this.f46467b;
    }

    @Override // defpackage.qlz, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public void usePaintAsBackground(boolean z) {
        this.f = z;
    }

    @Override // defpackage.qlz, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        return this.f;
    }

    private int a(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.f) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iHwHealthBarDataSet.getColor();
    }

    private int d(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.f) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iHwHealthBarDataSet.acquireFocusColor();
    }

    @Override // defpackage.qlz, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean hasData() {
        qly barData = this.f46467b.getBarData();
        return (barData == null || barData.getDataSets() == null || barData.getDataSets().size() == 0) ? false : true;
    }
}
