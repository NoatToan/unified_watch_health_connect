package com.huawei.health.knit.section.chart;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.health.knit.section.view.SectionBarChart_01;
import com.huawei.health.servicesui.R;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hwcommonmodel.accessibility.AbstractTouchNode;
import com.huawei.hwcommonmodel.accessibility.ChartTouchHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import defpackage.frs;
import defpackage.frt;
import defpackage.lrn;
import defpackage.qly;
import defpackage.qno;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TemperatureBarChartRender extends BarChartRender implements IHwHealthDataRender {
    private float f;
    private String h;
    private boolean i;
    private float j;
    private OnTemperatureTimeChangedListener k;
    private float l;
    private final Paint m;
    private float n;
    private float o;
    private float s;

    public interface OnTemperatureTimeChangedListener {
        void onTemperatureTimeChangedListener(frt frtVar);
    }

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    public TemperatureBarChartRender(HwHealthBarChart hwHealthBarChart, HwHealthBarDataProvider hwHealthBarDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(hwHealthBarDataProvider, chartAnimator, viewPortHandler);
        this.i = false;
        this.m = new Paint();
        this.h = "TEMPERATURE_MIN_MAX";
        b(hwHealthBarChart, hwHealthBarDataProvider);
        this.n = a(37.0f);
        this.f = a(37.15f);
        this.l = a(37.5f);
        this.s = a(37.95f);
    }

    public static float a(float f) {
        return UnitUtil.a() ? f : b(f);
    }

    public static float b(float f) {
        return new BigDecimal((f * 1.8f) + 32.0f).setScale(1, 4).floatValue();
    }

    public void d(String str) {
        this.h = str;
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
        ChartTouchHelper accessibilityHelper = ((HwHealthBaseBarLineChart) this.f46467b).getAccessibilityHelper();
        a(accessibilityHelper);
        qno qnoVar = this.f46468c[i];
        qnoVar.setPhases(this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY());
        qnoVar.setDataSet(i);
        qnoVar.setInverted(false);
        qnoVar.setBarWidth(this.f46467b.getBarData().a());
        qnoVar.b(iHwHealthBarDataSet);
        Transformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
        transformer.pointValuesToPixel(qnoVar.buffer);
        a(transformer);
        boolean z = iHwHealthBarDataSet.getColors().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(c(iHwHealthBarDataSet));
        }
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
                    IStorageModel iStorageModelAcquireModel = hwHealthBarEntry.acquireModel();
                    if (!(iStorageModelAcquireModel instanceof frt)) {
                        return;
                    }
                    frt frtVar = (frt) iStorageModelAcquireModel;
                    b(i2, accessibilityHelper, a(canvas, this.d, 2, frtVar.j()), hwHealthBarEntry, frtVar);
                } else {
                    continue;
                }
            }
        }
    }

    private void a(ChartTouchHelper chartTouchHelper) {
        if (chartTouchHelper == null) {
            ReleaseLogUtil.d("TemperatureBarChartRender", "clearNodeByAccessibility helper is null");
            return;
        }
        lrn lrnVarA = chartTouchHelper.a();
        if (lrnVarA == null) {
            ReleaseLogUtil.d("TemperatureBarChartRender", "clearNodeByAccessibility provider is null");
        } else {
            lrnVarA.b();
        }
    }

    private void b(int i, ChartTouchHelper chartTouchHelper, RectF rectF, HwHealthBaseEntry hwHealthBaseEntry, frt frtVar) {
        String formattedValue;
        float fE;
        float fD;
        float fH;
        float fA;
        String str;
        if (chartTouchHelper == null || rectF == null || hwHealthBaseEntry == null) {
            ReleaseLogUtil.d("TemperatureBarChartRender", "setAccessibility helper ", chartTouchHelper, " rectF ", rectF, " entry ", hwHealthBaseEntry);
            return;
        }
        lrn lrnVarA = chartTouchHelper.a();
        if (lrnVarA == null) {
            ReleaseLogUtil.d("TemperatureBarChartRender", "setAccessibility provider is null");
            return;
        }
        AbstractTouchNode abstractTouchNodeA = lrnVarA.a(i);
        if (abstractTouchNodeA == null) {
            ReleaseLogUtil.d("TemperatureBarChartRender", "setAccessibility node is null");
            return;
        }
        IAxisValueFormatter valueFormatter = ((HwHealthBaseScrollBarLineChart) this.f46467b).getXAxis().getValueFormatter();
        if (valueFormatter instanceof HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) {
            formattedValue = ((HwHealthBaseScrollBarLineChart.HwHealthAxisValueFormatter) valueFormatter).getFormattedValueForMarkerView(hwHealthBaseEntry.getX(), this.f46467b.getXAxis());
        } else {
            formattedValue = valueFormatter.getFormattedValue(hwHealthBaseEntry.getX(), this.f46467b.getXAxis());
        }
        if (frtVar != null) {
            fE = frtVar.e();
            fH = frtVar.h();
            fA = frtVar.a();
            fD = frtVar.d();
        } else {
            fE = 0.0f;
            fD = 0.0f;
            fH = 0.0f;
            fA = 0.0f;
        }
        Pair<String, String> pairE = SectionBarChart_01.e(new Pair(Float.valueOf(fH), Float.valueOf(fE)), new Pair(Float.valueOf(fD), Float.valueOf(fA)), UnitUtil.a(), true);
        if (pairE == null) {
            str = "";
        } else {
            str = (String) pairE.first;
        }
        abstractTouchNodeA.setRect(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        abstractTouchNodeA.setDescription(qre.a(R.string.IDS_two_parts, formattedValue, str));
    }

    private void a(Transformer transformer) {
        float[] fArr = {0.0f, this.s};
        float[] fArr2 = {0.0f, this.f};
        transformer.pointValuesToPixel(fArr);
        transformer.pointValuesToPixel(fArr2);
        this.o = fArr2[1];
        this.j = fArr[1];
    }

    private RectF a(Canvas canvas, RectF rectF, int i, frs frsVar) {
        float fD = frsVar.d();
        float fA = frsVar.a();
        if ((fD < 1.0E-7f && fA < 1.0E-7f) || e(fD)) {
            return rectF;
        }
        float fAbs = Math.abs(rectF.right - rectF.left);
        float f = rectF.top;
        float f2 = rectF.bottom;
        e(rectF, i);
        if (f2 - f >= fAbs) {
            b(rectF, canvas, frsVar, i);
            return rectF;
        }
        float f3 = (f2 + f) / 2.0f;
        float f4 = fAbs / 2.0f;
        RectF rectF2 = new RectF(rectF.left, Math.abs(f3 - f4), rectF.right, f3 + f4);
        e(rectF2, canvas, frsVar, i);
        d(rectF2, canvas, frsVar, i);
        return rectF2;
    }

    private void b(RectF rectF, Canvas canvas, frs frsVar, int i) {
        float fA = frsVar.a();
        float fD = frsVar.d();
        canvas.save();
        Path path = new Path();
        float fAbs = Math.abs(rectF.right - rectF.left) / 2.0f;
        path.addRoundRect(rectF, fAbs, fAbs, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z = false;
        boolean z2 = fA >= this.s;
        boolean z3 = Math.max(this.f, fD) <= Math.min(this.s, fA);
        boolean z4 = fD < this.f;
        if (rectF.top <= this.j && rectF.bottom >= this.j) {
            RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
            rectF2.bottom = this.j;
            rectF.top = this.j;
            a(fA, i);
            canvas.drawRect(rectF2, this.m);
            z2 = false;
        }
        if (rectF.bottom <= this.o || rectF.top >= this.o) {
            z = z4;
        } else {
            RectF rectF3 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
            rectF3.top = this.o;
            rectF.bottom = this.o;
            a(fD, i);
            canvas.drawRect(rectF3, this.m);
        }
        if (z2) {
            a(fA, i);
            canvas.drawRect(rectF, this.m);
        }
        if (z) {
            a(fD, i);
            canvas.drawRect(rectF, this.m);
        }
        if (z3) {
            a(this.l, i);
            canvas.drawRect(rectF, this.m);
        }
        canvas.restore();
    }

    private void e(RectF rectF, Canvas canvas, frs frsVar, int i) {
        a(frsVar.a(), i);
        canvas.drawArc(rectF, 0.0f, -180.0f, false, this.m);
    }

    private void d(RectF rectF, Canvas canvas, frs frsVar, int i) {
        a(frsVar.d(), i);
        canvas.drawArc(rectF, 0.0f, 180.0f, false, this.m);
    }

    private void a(float f, int i) {
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.h)) {
            this.m.setColor(Color.argb(255, 86, 187, 191));
            e(i);
            return;
        }
        float f2 = this.f;
        if (f >= f2 && f < this.s) {
            this.m.setColor(Color.argb(255, 255, 117, 0));
        } else if (f < f2) {
            this.m.setColor(Color.argb(255, 76, 186, 191));
        } else {
            this.m.setColor(Color.argb(255, 217, 65, 66));
        }
        e(i);
    }

    private void e(int i) {
        if (i == 1) {
            this.m.setAlpha(255);
        } else {
            this.m.setAlpha(153);
        }
    }

    private void e(RectF rectF, int i) {
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
        if (canvas != null && isDrawingValuesAllowed(this.f46467b)) {
            if (this.f46467b.getBarData() == null) {
                LogUtil.j("TemperatureBarChartRender", "drawValues mChart.getBarData() is null");
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
                        c(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                    } else {
                        b(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    private void b(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
        if (barBuffer == null || barBuffer.buffer == null) {
            LogUtil.j("TemperatureBarChartRender", "setIsStacked buffer or buffer.buffer is null");
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < iHwHealthBarDataSet.getEntryCount() * this.mAnimator.getPhaseX()) {
            HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i);
            int i3 = i2 + 2;
            if (barBuffer.buffer.length <= i3) {
                LogUtil.j("TemperatureBarChartRender", "setIsStacked valid parameter");
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

    private void c(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
        for (int i = 0; i < barBuffer.buffer.length * this.mAnimator.getPhaseX(); i += 4) {
            float f = (barBuffer.buffer[i] + barBuffer.buffer[i + 2]) / 2.0f;
            if (!this.mViewPortHandler.isInBoundsRight(f)) {
                return;
            }
            int i2 = i + 1;
            if (this.mViewPortHandler.isInBoundsY(barBuffer.buffer[i2]) && this.mViewPortHandler.isInBoundsLeft(f)) {
                int i3 = i / 4;
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) iHwHealthBarDataSet.getEntryForIndex(i3);
                float y = hwHealthBarEntry.getY();
                if (iHwHealthBarDataSet.isDrawValuesEnabled()) {
                    c(canvas, iHwHealthBarDataSet.getValueFormatter().getFormattedValue(hwHealthBarEntry.getY(), hwHealthBarEntry, i3, this.mViewPortHandler), f, y >= 0.0f ? barBuffer.buffer[i2] : barBuffer.buffer[i + 3], iHwHealthBarDataSet.getValueTextColor(i3));
                }
                if (hwHealthBarEntry.getIcon() != null && iHwHealthBarDataSet.isDrawIconsEnabled()) {
                    Drawable icon = hwHealthBarEntry.getIcon();
                    Utils.drawImage(canvas, icon, (int) (f + mPPointF.x), (int) ((y >= 0.0f ? barBuffer.buffer[i2] : barBuffer.buffer[i + 3]) + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
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
                if ((entriesForXValue == 0 || entriesForXValue.size() == 0) && this.k != null) {
                    this.k.onTemperatureTimeChangedListener(new frt(42.0f, new frs()));
                    return;
                }
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) entriesForXValue.get(0);
                if (isInBoundsX(hwHealthBarEntry, iHwHealthBarDataSet) && (hwHealthBarEntry.acquireModel() instanceof frt)) {
                    Transformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
                    a(transformer);
                    frt frtVar = (frt) hwHealthBarEntry.acquireModel();
                    float fB = frtVar.b();
                    float fC = frtVar.c();
                    frs frsVarJ = frtVar.j();
                    OnTemperatureTimeChangedListener onTemperatureTimeChangedListener = this.k;
                    if (onTemperatureTimeChangedListener != null && frsVarJ != null) {
                        onTemperatureTimeChangedListener.onTemperatureTimeChangedListener(frtVar);
                        c(hwHealthBarEntry.getX(), fB, fC, barData.a() / 2.0f, transformer);
                        c(highlight, this.f46466a);
                        a(canvas, this.f46466a, 1, frsVarJ);
                    }
                }
            }
        }
    }

    public void a(OnTemperatureTimeChangedListener onTemperatureTimeChangedListener) {
        this.k = onTemperatureTimeChangedListener;
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

    private int c(IHwHealthBarDataSet iHwHealthBarDataSet) {
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
