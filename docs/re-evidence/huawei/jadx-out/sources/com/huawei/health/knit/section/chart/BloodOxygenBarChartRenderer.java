package com.huawei.health.knit.section.chart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.media3.extractor.ts.TsExtractor;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.health.servicesui.R;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hwcommonmodel.accessibility.AbstractTouchNode;
import com.huawei.hwcommonmodel.accessibility.ChartTouchHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import defpackage.fqm;
import defpackage.fqq;
import defpackage.qly;
import defpackage.qno;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class BloodOxygenBarChartRenderer extends BarChartRender implements IHwHealthDataRender {
    private OnMostValueChangedListener f;
    private int h;
    private boolean i;
    private BarChartRender.OnTimeChangedListener j;
    private int k;
    private int l;
    private int m;
    private Paint n;
    private int o;
    private int q;

    public interface OnMostValueChangedListener {
        void onMostValueChangedListener(float f, float f2);
    }

    public static int a(float f) {
        if (f <= 100.0f && f < 90.0f) {
            return f >= 80.0f ? 70 : 60;
        }
        return 85;
    }

    private int b(float f, float f2, float f3, float f4) {
        if (f4 >= f && f4 <= f2) {
            return 1;
        }
        if (f4 < f2 || f4 > f3) {
            return f4 >= f3 ? 3 : 0;
        }
        return 2;
    }

    private int e(float f, float f2, float f3, float f4) {
        if (f4 >= f && f4 <= f2) {
            return 1;
        }
        if (f4 < f2 || f4 > f3) {
            return f4 >= f3 ? 3 : 0;
        }
        return 2;
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    public BloodOxygenBarChartRenderer(HwHealthBarChart hwHealthBarChart, HwHealthBarDataProvider hwHealthBarDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(hwHealthBarDataProvider, chartAnimator, viewPortHandler);
        this.i = false;
        this.n = new Paint();
        this.k = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_red_color);
        this.o = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_orange_color);
        this.h = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_deep_green_color);
        this.q = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_red_selected_color);
        this.m = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_orange_selected_color);
        this.l = ContextCompat.getColor(BaseApplication.getContext(), R.color.blood_oxygen_level_deep_green_selected_color);
        LogUtil.e("BloodOxygenBarChartRenderer", "BloodOxygenBarChartRenderer");
        b(hwHealthBarChart, hwHealthBarDataProvider);
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
        HwHealthTransformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
        float[] fArr = {0.0f, 70.0f, 0.0f, 90.0f, 0.0f, 100.0f};
        transformer.pointValuesToPixel(fArr);
        transformer.pointValuesToPixel(qnoVar.buffer);
        boolean z = iHwHealthBarDataSet.getColors().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(e(iHwHealthBarDataSet));
        }
        ArrayList arrayList = new ArrayList(16);
        ChartTouchHelper accessibilityHelper = ((HwHealthBaseBarLineChart) this.f46467b).getAccessibilityHelper();
        if (accessibilityHelper != null) {
            accessibilityHelper.a().b();
        }
        for (int i2 = 0; i2 < qnoVar.size(); i2 += 4) {
            if (this.mViewPortHandler.isInBoundsLeft(qnoVar.buffer[i2])) {
                int i3 = i2 + 2;
                if (this.mViewPortHandler.isInBoundsRight(qnoVar.buffer[i3])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iHwHealthBarDataSet.getColor(i2 / 4));
                    }
                    this.d.set(qnoVar.buffer[i2], qnoVar.buffer[i2 + 1], qnoVar.buffer[i3], qnoVar.buffer[i2 + 3]);
                    int i4 = i2 / 4;
                    HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i4);
                    if (hwHealthBarEntry == null) {
                        return;
                    }
                    fqq fqqVarA = ((fqm) hwHealthBarEntry.acquireModel()).a();
                    arrayList.add(Float.valueOf(fqqVarA.b()));
                    arrayList.add(Float.valueOf(fqqVarA.a()));
                    c(canvas, this.d, 2, fqqVarA, fArr);
                    if (accessibilityHelper != null) {
                        AbstractTouchNode abstractTouchNodeA = accessibilityHelper.a().a(i4);
                        Rect rect = new Rect();
                        this.d.round(rect);
                        abstractTouchNodeA.setRect(rect);
                        abstractTouchNodeA.setDescription(a(hwHealthBarEntry));
                    }
                } else {
                    continue;
                }
            }
        }
        d(arrayList);
    }

    private String a(HwHealthBarEntry hwHealthBarEntry) {
        String formattedValue;
        String strA;
        if (hwHealthBarEntry == null) {
            LogUtil.j("BloodOxygenBarChartRenderer", "entry is null");
            return "";
        }
        IAxisValueFormatter valueFormatter = ((HwHealthBaseScrollBarLineChart) this.f46467b).getXAxis().getValueFormatter();
        if (valueFormatter instanceof HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) {
            formattedValue = ((HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) valueFormatter).getFormattedValueForMarkerView(hwHealthBarEntry.getX(), ((HwHealthBaseScrollBarLineChart) this.f46467b).getXAxis());
        } else {
            formattedValue = valueFormatter.getFormattedValue(hwHealthBarEntry.getX(), ((HwHealthBaseScrollBarLineChart) this.f46467b).getXAxis());
        }
        fqq fqqVarA = ((fqm) hwHealthBarEntry.acquireModel()).a();
        this.j.onTimeChangedListener(fqqVarA.a(), fqqVarA.b());
        double dA = fqqVarA.a();
        double dB = fqqVarA.b();
        if (((int) dA) != 0 && ((int) dB) != 0) {
            strA = qre.a(R.string.accessibility_range, UnitUtil.e(dA, 2, 0), UnitUtil.e(dB, 2, 0));
        } else {
            strA = "--";
        }
        return qre.a(com.huawei.ui.commonui.R.string.IDS_two_parts, formattedValue, strA);
    }

    private void d(List<Float> list) {
        OnMostValueChangedListener onMostValueChangedListener;
        if (list != null && list.size() > 0) {
            Collections.sort(list);
            if (list.get(0) != null && list.get(list.size() - 1) != null && (onMostValueChangedListener = this.f) != null) {
                onMostValueChangedListener.onMostValueChangedListener(list.get(0).floatValue(), list.get(list.size() - 1).floatValue());
                return;
            }
        }
        OnMostValueChangedListener onMostValueChangedListener2 = this.f;
        if (onMostValueChangedListener2 != null) {
            onMostValueChangedListener2.onMostValueChangedListener(0.0f, 0.0f);
        }
    }

    private void c(Canvas canvas, RectF rectF, int i, fqq fqqVar, float[] fArr) {
        float fAbs;
        float fAbs2;
        float f;
        float f2;
        float f3;
        float f4;
        c(i);
        float f5 = fArr[5];
        float f6 = fArr[3];
        float f7 = fArr[1];
        float fA = fqqVar.a();
        float fB = fqqVar.b();
        if ((fA >= 1.0E-7f || fB >= 1.0E-7f) && !e(a(fA))) {
            float fAbs3 = Math.abs(rectF.right - rectF.left);
            Math.abs(rectF.bottom - rectF.top);
            float f8 = rectF.top;
            float f9 = rectF.bottom;
            int iE = e(f5, f6, f7, f8);
            int iB = b(f5, f6, f7, f9);
            if (f9 > f8) {
                float f10 = fAbs3 / 2.0f;
                fAbs = Math.abs(f8 - f10);
                float fAbs4 = Math.abs(f8 + f10);
                float fAbs5 = Math.abs(f9 - f10);
                fAbs2 = Math.abs(f10 + f9);
                f2 = f8;
                f3 = f9;
                f4 = fAbs5;
                f = fAbs4;
            } else {
                float f11 = fAbs3 / 2.0f;
                fAbs = Math.abs(f8 - f11);
                float fAbs6 = Math.abs(f8 + f11);
                float fAbs7 = Math.abs(f9 - f11);
                fAbs2 = Math.abs(f9 + f11);
                f = fAbs6;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = fAbs7;
            }
            a(rectF, i);
            c(canvas, rectF, i, f6, f7, iE, iB, fAbs, f, f2, f3, f4, fAbs2);
        }
    }

    private void c(Canvas canvas, RectF rectF, int i, float f, float f2, int i2, int i3, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i2 == 1 && i3 == 1) {
            c(canvas, rectF, i, f3, f4, f5, f6, f7, f8);
            return;
        }
        if (i2 == 1 && i3 == 2) {
            d(canvas, rectF, i, f, f3, f4, f5, f6, f7, f8);
            return;
        }
        if (i2 == 1 && i3 == 3) {
            d(canvas, rectF, i, f, f2, f3, f4, f5, f6, f7, f8);
            return;
        }
        if (i2 == 2 && i3 == 2) {
            d(canvas, rectF, i, f3, f4, f5, f6, f7, f8);
            return;
        }
        if (i2 == 2 && i3 == 3) {
            c(canvas, rectF, i, f2, f3, f4, f5, f6, f7, f8);
        } else if (i2 == 3 && i3 == 3) {
            e(canvas, rectF, i, f3, f4, f5, f6, f7, f8);
        } else {
            a(canvas, rectF, i, f3, f4, f5, f6, f7, f8);
        }
    }

    private void a(Canvas canvas, RectF rectF, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        if (i == 2) {
            this.n.setColor(this.k);
        } else {
            this.n.setColor(this.q);
        }
        d(canvas, rectF, f, f2, f3, f4, f5, f6);
    }

    private void e(Canvas canvas, RectF rectF, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        if (i == 2) {
            this.n.setColor(this.k);
        } else {
            this.n.setColor(this.q);
        }
        d(canvas, rectF, f, f2, f3, f4, f5, f6);
    }

    private void c(Canvas canvas, RectF rectF, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (i == 2) {
            this.n.setColor(this.o);
        } else {
            this.n.setColor(this.m);
        }
        canvas.drawRect(Math.abs(rectF.left), f4, Math.abs(rectF.right), f, this.n);
        canvas.drawArc(new RectF(rectF.left, f2, rectF.right, f3), 0.0f, -180.0f, false, this.n);
        if (i == 2) {
            this.n.setColor(this.k);
        } else {
            this.n.setColor(this.q);
        }
        canvas.drawRect(Math.abs(rectF.left), f, Math.abs(rectF.right), f5, this.n);
        canvas.drawArc(new RectF(rectF.left, f6, rectF.right, f7), 0.0f, 180.0f, false, this.n);
    }

    private void d(Canvas canvas, RectF rectF, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        if (i == 2) {
            this.n.setColor(this.o);
        } else {
            this.n.setColor(this.m);
        }
        d(canvas, rectF, f, f2, f3, f4, f5, f6);
    }

    private void d(Canvas canvas, RectF rectF, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 2) {
            this.n.setColor(this.h);
        } else {
            this.n.setColor(this.l);
        }
        canvas.drawRect(Math.abs(rectF.left), f5, Math.abs(rectF.right), f, this.n);
        canvas.drawArc(new RectF(rectF.left, f3, rectF.right, f4), 0.0f, -180.0f, false, this.n);
        if (i == 2) {
            this.n.setColor(this.o);
        } else {
            this.n.setColor(this.m);
        }
        canvas.drawRect(Math.abs(rectF.left), f, Math.abs(rectF.right), f2, this.n);
        if (i == 2) {
            this.n.setColor(this.k);
        } else {
            this.n.setColor(this.q);
        }
        canvas.drawRect(Math.abs(rectF.left), f2, Math.abs(rectF.right), f6, this.n);
        canvas.drawArc(new RectF(rectF.left, f7, rectF.right, f8), 0.0f, 180.0f, false, this.n);
    }

    private void d(Canvas canvas, RectF rectF, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (i == 2) {
            this.n.setColor(this.h);
        } else {
            this.n.setColor(this.l);
        }
        canvas.drawRect(Math.abs(rectF.left), f4, Math.abs(rectF.right), f, this.n);
        canvas.drawArc(new RectF(rectF.left, f2, rectF.right, f3), 0.0f, -180.0f, false, this.n);
        if (i == 2) {
            this.n.setColor(this.o);
        } else {
            this.n.setColor(this.m);
        }
        canvas.drawRect(Math.abs(rectF.left), f, Math.abs(rectF.right), f5, this.n);
        canvas.drawArc(new RectF(rectF.left, f6, rectF.right, f7), 0.0f, 180.0f, false, this.n);
    }

    private void c(Canvas canvas, RectF rectF, int i, float f, float f2, float f3, float f4, float f5, float f6) {
        if (i == 2) {
            this.n.setColor(this.h);
        } else {
            this.n.setColor(this.l);
        }
        d(canvas, rectF, f, f2, f3, f4, f5, f6);
    }

    private void d(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, float f5, float f6) {
        canvas.drawArc(new RectF(rectF.left, f, rectF.right, f2), 0.0f, -180.0f, false, this.n);
        canvas.drawRect(Math.abs(rectF.left), f3, Math.abs(rectF.right), f4, this.n);
        canvas.drawArc(new RectF(rectF.left, f5, rectF.right, f6), 0.0f, 180.0f, false, this.n);
    }

    private void c(int i) {
        if (i == 1) {
            this.n.setColor(Color.argb(255, 255, 64, 101));
        } else {
            this.n.setColor(Color.argb(255, 253, 152, TsExtractor.TS_STREAM_TYPE_AC4));
        }
    }

    private void a(RectF rectF, int i) {
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
                    e(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                } else {
                    a(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                }
                MPPointF.recycleInstance(mPPointF);
            }
        }
    }

    private void a(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
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

    private void e(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
        float f;
        float f2;
        for (int i = 0; i < barBuffer.buffer.length * this.mAnimator.getPhaseX(); i += 4) {
            float f3 = (barBuffer.buffer[i] + barBuffer.buffer[i + 2]) / 2.0f;
            if (!this.mViewPortHandler.isInBoundsRight(f3)) {
                return;
            }
            int i2 = i + 1;
            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i2]) && this.mViewPortHandler.isInBoundsLeft(f3)) {
                int i3 = i / 4;
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i3);
                float y = hwHealthBarEntry.getY();
                if (iHwHealthBarDataSet.isDrawValuesEnabled()) {
                    String formattedValue = iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry.getY(), hwHealthBarEntry, i3, this.mViewPortHandler);
                    if (y >= 0.0f) {
                        f2 = barBuffer.buffer[i2];
                    } else {
                        f2 = barBuffer.buffer[i + 3];
                    }
                    c(canvas, formattedValue, f3, f2, iHwHealthBarDataSet.getValueTextColor(i3));
                }
                if (hwHealthBarEntry.getIcon() != null && iHwHealthBarDataSet.isDrawIconsEnabled()) {
                    Drawable icon = hwHealthBarEntry.getIcon();
                    if (y >= 0.0f) {
                        f = barBuffer.buffer[i2];
                    } else {
                        f = barBuffer.buffer[i + 3];
                    }
                    Utils.drawImage(canvas, icon, (int) (f3 + mPPointF.x), (int) (f + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
            }
        }
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        if (this.i) {
            return;
        }
        qly barData = this.f46467b.getBarData();
        if (canvas == null || highlightArr == null || barData == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iHwHealthBarDataSet != null && iHwHealthBarDataSet.isHighlightEnabled()) {
                this.mHighlightPaint.setColor(b(iHwHealthBarDataSet));
                List<T> entriesForXValue = iHwHealthBarDataSet.getEntriesForXValue(highlight.getX());
                if (entriesForXValue == 0 || entriesForXValue.size() == 0) {
                    BarChartRender.OnTimeChangedListener onTimeChangedListener = this.j;
                    if (onTimeChangedListener != null) {
                        onTimeChangedListener.onTimeChangedListener(0.0f, 0.0f);
                        return;
                    }
                    return;
                }
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) entriesForXValue.get(0);
                if (isInBoundsX(hwHealthBarEntry, iHwHealthBarDataSet)) {
                    fqm fqmVar = (fqm) hwHealthBarEntry.acquireModel();
                    float fB = fqmVar.b();
                    float fC = fqmVar.c();
                    fqq fqqVarA = fqmVar.a();
                    Transformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
                    BarChartRender.OnTimeChangedListener onTimeChangedListener2 = this.j;
                    if (onTimeChangedListener2 != null && fqqVarA != null) {
                        onTimeChangedListener2.onTimeChangedListener(fqqVarA.a(), fqqVarA.b());
                        c(hwHealthBarEntry.getX(), fB, fC, barData.a() / 2.0f, transformer);
                        c(highlight, this.f46466a);
                        float[] fArr = {0.0f, 70.0f, 0.0f, 90.0f, 0.0f, 100.0f};
                        transformer.pointValuesToPixel(fArr);
                        c(canvas, this.f46466a, 1, fqqVarA, fArr);
                    }
                }
            }
        }
    }

    public void a(BarChartRender.OnTimeChangedListener onTimeChangedListener) {
        this.j = onTimeChangedListener;
    }

    public void b(OnMostValueChangedListener onMostValueChangedListener) {
        this.f = onMostValueChangedListener;
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
        this.i = z;
    }

    @Override // defpackage.qlz, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        return this.i;
    }

    private int e(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.i) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iHwHealthBarDataSet.getColor();
    }

    private int b(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.i) {
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
