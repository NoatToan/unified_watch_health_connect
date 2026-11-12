package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatDelegate;
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
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import com.huawei.ui.main.stories.BarChartRender;
import defpackage.qly;
import defpackage.qno;
import defpackage.qqn;
import defpackage.umi;
import defpackage.uml;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SleepBarChartRenderer extends BarChartRender implements IHwHealthDataRender {
    private float aa;
    private Paint ab;
    private Paint ac;
    private float ad;
    private float ah;
    private float f;
    private float h;
    private HwHealthBarChart i;
    private int j;
    private boolean k;
    private float l;
    private boolean m;
    private boolean n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private String t;
    private Paint u;
    private OnSleepTimeChangedListener v;
    private float w;
    private Paint x;
    private Paint y;
    private float z;

    public interface OnSleepTimeChangedListener {
        void onSleepTimeChangedListener(float f);
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    public SleepBarChartRenderer(HwHealthBarChart hwHealthBarChart, HwHealthBarDataProvider hwHealthBarDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, String... strArr) {
        super(hwHealthBarDataProvider, chartAnimator, viewPortHandler);
        this.m = true;
        this.k = true;
        this.n = false;
        this.j = 0;
        this.t = "";
        this.x = new Paint();
        this.y = new Paint();
        this.u = new Paint();
        this.ac = new Paint();
        this.ab = new Paint();
        c(hwHealthBarChart, hwHealthBarDataProvider);
        this.i = hwHealthBarChart;
        if (strArr.length > 0) {
            this.t = strArr[1];
        }
    }

    @Override // defpackage.qlz
    public void c(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, int i) {
        IHwHealthBarDataSet iHwHealthBarDataSet2;
        qly barData = this.f46467b.getBarData();
        if (canvas == null || iHwHealthBarDataSet == null || barData == null || (iHwHealthBarDataSet2 = (IHwHealthBarDataSet) barData.getDataSetByIndex(i)) == null || !iHwHealthBarDataSet2.isHighlightEnabled() || i < 0) {
            return;
        }
        this.e.setColor(iHwHealthBarDataSet.getBarBorderColor());
        this.e.setStrokeWidth(Utils.convertDpToPixel(iHwHealthBarDataSet.getBarBorderWidth()));
        if (this.f46468c == null || this.f46468c.length <= i) {
            LogUtil.j("SleepBarChartRenderer", "drawDataSet invalid parameter");
            return;
        }
        qno qnoVar = this.f46468c[i];
        qnoVar.setPhases(this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY());
        qnoVar.setDataSet(i);
        qnoVar.setInverted(false);
        qnoVar.setBarWidth(this.f46467b.getBarData().a());
        qnoVar.b(iHwHealthBarDataSet);
        HwHealthTransformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
        transformer.pointValuesToPixel(qnoVar.buffer);
        boolean z = iHwHealthBarDataSet.getColors().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(e(iHwHealthBarDataSet));
        }
        e(canvas, iHwHealthBarDataSet, qnoVar, z, transformer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, qno qnoVar, boolean z, Transformer transformer) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        ArrayList arrayList3 = new ArrayList(16);
        for (int i = 0; i < qnoVar.size(); i += 4) {
            if (this.mViewPortHandler.isInBoundsLeft(qnoVar.buffer[i])) {
                int i2 = i + 2;
                if (this.mViewPortHandler.isInBoundsRight(qnoVar.buffer[i2])) {
                    if (!z) {
                        this.mRenderPaint.setColor(iHwHealthBarDataSet.getColor(i / 4));
                    }
                    this.d.set(qnoVar.buffer[i], qnoVar.buffer[i + 1], qnoVar.buffer[i2], qnoVar.buffer[i + 3]);
                    HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i / 4);
                    if (hwHealthBarEntry == null) {
                        return;
                    }
                    umi umiVarA = ((uml) hwHealthBarEntry.acquireModel()).a();
                    d(arrayList, arrayList2, arrayList3, umiVarA);
                    a(canvas, this.d, transformer, 2, umiVarA);
                } else {
                    continue;
                }
            }
        }
        a(e(arrayList, arrayList2, arrayList3));
    }

    private void a(int i) {
        if (this.j != i) {
            this.j = i;
            String str = String.format(this.t, UnitUtil.e(i / 60, 1, 0), UnitUtil.e(this.j % 60, 1, 0));
            if (i > 0) {
                ((CoreSleepBarChartView) this.i).a(i, qqn.b(BaseApplication.getContext(), R.color.health_chart_default_line_color), str);
                this.i.reCalculateDynamicBoardForManualRefLine();
                this.i.refresh();
            } else {
                ((CoreSleepBarChartView) this.i).a(i, qqn.b(BaseApplication.getContext(), R.color.colorBackground), "");
                this.i.reCalculateDynamicBoardForManualRefLine();
                this.i.refresh();
            }
        }
    }

    private void d(List<Float> list, List<Float> list2, List<Float> list3, umi umiVar) {
        if (umiVar == null || umiVar.b() == 30) {
            return;
        }
        if (umiVar.c() > 0.0f) {
            list.add(Float.valueOf(umiVar.c()));
        }
        if (umiVar.e() > 0.0f) {
            list2.add(Float.valueOf(umiVar.e()));
        }
        if (umiVar.d() > 0.0f) {
            list3.add(Float.valueOf(umiVar.d()));
        }
    }

    private int e(List<Float> list, List<Float> list2, List<Float> list3) {
        return b(list) + b(list2) + b(list3);
    }

    private int b(List<Float> list) {
        Iterator<Float> it = list.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return list.size() > 0 ? Math.round(fFloatValue / list.size()) : (int) fFloatValue;
    }

    private void a(Canvas canvas, RectF rectF, Transformer transformer, int i, umi umiVar) {
        float f;
        float[] fArr = {0.0f, 0.0f};
        transformer.pointValuesToPixel(fArr);
        float f2 = fArr[1];
        float fAbs = Math.abs(rectF.top - rectF.bottom);
        float fAbs2 = Math.abs(rectF.right - rectF.left);
        if (fAbs >= 1.0E-7f || rectF.top != f2) {
            float f3 = this.m ? (fAbs2 / 2.0f) + 0.0f : 0.0f;
            if (this.k) {
                f3 += fAbs2 / 2.0f;
            }
            if (fAbs < f3) {
                float f4 = (rectF.top + rectF.bottom) / 2.0f;
                float f5 = f3 / 2.0f;
                rectF.top = f4 - f5;
                rectF.bottom = f4 + f5;
                if (rectF.bottom > f2) {
                    float f6 = rectF.bottom - f2;
                    rectF.bottom -= f6;
                    rectF.top -= f6;
                }
            }
            float f7 = rectF.bottom - rectF.top;
            b(i);
            if (f7 <= 0.0f || !this.m) {
                f = 0.0f;
            } else {
                float f8 = fAbs2 / 2.0f;
                f7 -= f8;
                f = f8 + 0.0f;
            }
            if (f7 > 0.0f) {
                e(umiVar);
                b(rectF, f, 0.0f, (rectF.bottom - 0.0f) - (rectF.top + f));
                if (i != 1 && LanguageUtil.ba(BaseApplication.getContext())) {
                    float f9 = rectF.left;
                    float f10 = rectF.right;
                    rectF.right = f9;
                    rectF.left = f10;
                }
                d(canvas, rectF, fAbs2, f);
            }
        }
    }

    private void d(Canvas canvas, RectF rectF, float f, float f2) {
        boolean z;
        if (this.w > 0.0f) {
            float f3 = f / 2.0f;
            canvas.drawArc(new RectF(rectF.left, (rectF.top + f2) - f3, rectF.right, rectF.top + f2 + f3), 0.0f, -180.0f, false, this.x);
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, this.q, this.x);
        }
        boolean z2 = true;
        if (this.ah > 0.0f) {
            float f4 = f / 2.0f;
            canvas.drawArc(new RectF(rectF.left, this.q - f4, rectF.right, this.q + f4), 0.0f, -180.0f, false, this.y);
            canvas.drawRect(rectF.left, this.q, rectF.right, this.ad, this.y);
            z = true;
        } else {
            z = false;
        }
        if (this.l > 0.0f) {
            if (!z) {
                float f5 = f / 2.0f;
                canvas.drawArc(new RectF(rectF.left, this.ad - f5, rectF.right, this.ad + f5), 0.0f, -180.0f, false, this.u);
                z = true;
            }
            canvas.drawRect(rectF.left, this.ad, rectF.right, this.o, this.u);
        }
        if (this.r > 0.0f) {
            if (z) {
                z2 = z;
            } else {
                float f6 = f / 2.0f;
                canvas.drawArc(new RectF(rectF.left, this.o - f6, rectF.right, this.o + f6), 0.0f, -180.0f, false, this.ac);
            }
            canvas.drawRect(rectF.left, this.o, rectF.right, this.s, this.ac);
            z = z2;
        }
        if (this.h > 0.0f) {
            if (!z) {
                float f7 = f / 2.0f;
                canvas.drawArc(new RectF(rectF.left, this.s - f7, rectF.right, this.s + f7), 0.0f, -180.0f, false, this.ab);
            }
            canvas.drawRect(rectF.left, this.s, rectF.right, this.f, this.ab);
        }
    }

    private void b(RectF rectF, float f, float f2, float f3) {
        boolean z = false;
        boolean z2 = this.h <= 0.0f && this.r <= 0.0f;
        if (this.l <= 0.0f && this.ah <= 0.0f) {
            z = true;
        }
        if (z2 && z) {
            this.q = rectF.bottom - f2;
        } else {
            this.q = ((this.w / this.aa) * f3) + rectF.top + f;
        }
        if (this.h <= 0.0f && this.r <= 0.0f && this.l <= 0.0f) {
            this.ad = rectF.bottom - f2;
        } else {
            this.ad = ((this.ah / this.aa) * f3) + this.q;
        }
        if (this.h <= 0.0f && this.r <= 0.0f) {
            this.o = rectF.bottom - f2;
        } else {
            this.o = ((this.l / this.aa) * f3) + this.ad;
        }
        if (this.h <= 0.0f) {
            this.s = rectF.bottom - f2;
        } else {
            this.s = ((this.r / this.aa) * f3) + this.o;
        }
        this.f = rectF.bottom - f2;
    }

    private void e(umi umiVar) {
        this.w = umiVar.a();
        this.ah = umiVar.i();
        this.l = umiVar.d();
        this.r = umiVar.e();
        float fC = umiVar.c();
        this.h = fC;
        this.aa = fC + this.r + this.l + this.ah + this.w;
    }

    private void b(int i) {
        if (i == 1) {
            this.x.setColor(Color.argb(255, 0, 143, 255));
            this.y.setColor(Color.argb(255, 255, 217, 69));
            this.u.setColor(Color.argb(255, 252, 130, 130));
            this.ac.setColor(Color.argb(255, 181, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, 249));
            this.ab.setColor(Color.argb(255, 138, 43, 226));
            return;
        }
        this.x.setColor(e(R.color.color_unselected_noon_sleep));
        this.y.setColor(e(R.color.color_unselected_awake));
        this.u.setColor(e(R.color.color_unselected_rem));
        this.ac.setColor(e(R.color.color_unselected_shallow));
        this.ab.setColor(e(R.color.color_unselected_deep));
    }

    private int e(int i) {
        HwHealthBarChart hwHealthBarChart = this.i;
        if (hwHealthBarChart instanceof CoreSleepBarChartView) {
            return ((CoreSleepBarChartView) hwHealthBarChart).getResources().getColor(i);
        }
        return -1;
    }

    @Override // defpackage.qlz
    public void c(float f, float f2, float f3, float f4, Transformer transformer) {
        this.f46466a.set(f - f4, f2, f + f4, f3);
        transformer.rectToPixelPhase(this.f46466a, this.mAnimator.getPhaseY());
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        if (canvas == null || !isDrawingValuesAllowed(this.f46467b) || this.f46467b.getBarData() == null) {
            return;
        }
        List<T> dataSets = this.f46467b.getBarData().getDataSets();
        float fConvertDpToPixel = Utils.convertDpToPixel(4.5f);
        boolean zIsDrawValueAboveBarEnabled = this.f46467b.isDrawValueAboveBarEnabled();
        for (int i = 0; i < this.f46467b.getBarData().getDataSetCount(); i++) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) dataSets.get(i);
            if (shouldDrawValues(iHwHealthBarDataSet)) {
                applyValueTextStyle(iHwHealthBarDataSet);
                float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "8");
                this.z = zIsDrawValueAboveBarEnabled ? -fConvertDpToPixel : fCalcTextHeight + fConvertDpToPixel;
                this.p = zIsDrawValueAboveBarEnabled ? fCalcTextHeight + fConvertDpToPixel : -fConvertDpToPixel;
                BarBuffer barBuffer = this.f46468c[i];
                MPPointF mPPointF = MPPointF.getInstance(iHwHealthBarDataSet.getIconsOffset());
                mPPointF.x = Utils.convertDpToPixel(mPPointF.x);
                mPPointF.y = Utils.convertDpToPixel(mPPointF.y);
                if (!iHwHealthBarDataSet.isStacked()) {
                    a(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                } else {
                    c(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                }
                MPPointF.recycleInstance(mPPointF);
            }
        }
    }

    private void c(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
        if (barBuffer == null || barBuffer.buffer == null) {
            LogUtil.j("SleepBarChartRenderer", "setIsStacked buffer or buffer.buffer is null");
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < iHwHealthBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
            HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i);
            int i3 = i2 + 2;
            if (barBuffer.buffer.length <= i3) {
                LogUtil.j("SleepBarChartRenderer", "setIsStacked invalid parameter");
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
                    c(canvas, iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry.getY(), hwHealthBarEntry, i, this.mViewPortHandler), f, (hwHealthBarEntry.getY() >= 0.0f ? this.z : this.p) + barBuffer.buffer[i4], valueTextColor);
                }
                if (hwHealthBarEntry.getIcon() != null && iHwHealthBarDataSet.isDrawIconsEnabled()) {
                    Drawable icon = hwHealthBarEntry.getIcon();
                    Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) (barBuffer.buffer[i4] + (hwHealthBarEntry.getY() >= 0.0f ? this.z : this.p) + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
                i2 += 4;
                i++;
            }
        }
    }

    private void a(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
        float f;
        float f2;
        float f3;
        float f4;
        for (int i = 0; i < barBuffer.buffer.length * this.mAnimator.getPhaseX(); i += 4) {
            float f5 = (barBuffer.buffer[i] + barBuffer.buffer[i + 2]) / 2.0f;
            if (!this.mViewPortHandler.isInBoundsRight(f5)) {
                return;
            }
            int i2 = i + 1;
            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i2]) && this.mViewPortHandler.isInBoundsLeft(f5)) {
                int i3 = i / 4;
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i3);
                float y = hwHealthBarEntry.getY();
                if (iHwHealthBarDataSet.isDrawValuesEnabled()) {
                    String formattedValue = iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry.getY(), hwHealthBarEntry, i3, this.mViewPortHandler);
                    if (y >= 0.0f) {
                        f3 = barBuffer.buffer[i2];
                        f4 = this.z;
                    } else {
                        f3 = barBuffer.buffer[i + 3];
                        f4 = this.p;
                    }
                    c(canvas, formattedValue, f5, f3 + f4, iHwHealthBarDataSet.getValueTextColor(i3));
                }
                if (hwHealthBarEntry.getIcon() != null && iHwHealthBarDataSet.isDrawIconsEnabled()) {
                    Drawable icon = hwHealthBarEntry.getIcon();
                    if (y >= 0.0f) {
                        f = barBuffer.buffer[i2];
                        f2 = this.z;
                    } else {
                        f = barBuffer.buffer[i + 3];
                        f2 = this.p;
                    }
                    Utils.drawImage(canvas, icon, (int) (f5 + mPPointF.x), (int) (f + f2 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
            }
        }
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        if (this.n) {
            return;
        }
        qly barData = this.f46467b.getBarData();
        if (canvas == null || highlightArr == null || barData == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            IHwHealthBarDataSet iHwHealthBarDataSet = (IHwHealthBarDataSet) barData.getDataSetByIndex(highlight.getDataSetIndex());
            if (iHwHealthBarDataSet != null && iHwHealthBarDataSet.isHighlightEnabled()) {
                this.mHighlightPaint.setColor(a(iHwHealthBarDataSet));
                List<T> entriesForXValue = iHwHealthBarDataSet.getEntriesForXValue(highlight.getX());
                if (entriesForXValue == 0 || entriesForXValue.size() == 0) {
                    return;
                }
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) entriesForXValue.get(0);
                if (isInBoundsX(hwHealthBarEntry, iHwHealthBarDataSet)) {
                    Transformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
                    uml umlVar = (uml) hwHealthBarEntry.acquireModel();
                    float fB = umlVar.b();
                    float fC = umlVar.c();
                    umi umiVarA = umlVar.a();
                    if (this.v != null && umiVarA != null) {
                        this.v.onSleepTimeChangedListener(fB - umiVarA.i());
                        c(hwHealthBarEntry.getX(), fB, fC, barData.a() / 2.0f, transformer);
                        c(highlight, this.f46466a);
                        a(canvas, this.f46466a, transformer, 1, umiVarA);
                    }
                }
            }
        }
    }

    public void c(OnSleepTimeChangedListener onSleepTimeChangedListener) {
        this.v = onSleepTimeChangedListener;
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
        this.n = z;
    }

    @Override // defpackage.qlz, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean isUsePaintAsBackground() {
        return this.n;
    }

    private int e(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.n) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iHwHealthBarDataSet.getColor();
    }

    private int a(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.n) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iHwHealthBarDataSet.acquireFocusColor();
    }

    @Override // defpackage.qlz, com.huawei.ui.commonui.linechart.common.IHwHealthDataRender
    public boolean hasData() {
        qly barData = this.f46467b.getBarData();
        return (barData == null || barData.getDataSets() == null || barData.getDataSets().size() == 0) ? false : true;
    }

    @Override // defpackage.qlz
    public void d(boolean z, boolean z2) {
        this.m = z;
        this.k = z2;
    }
}
