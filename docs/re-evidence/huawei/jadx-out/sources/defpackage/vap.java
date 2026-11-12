package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarChart;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.IHwHealthDataRender;
import com.huawei.ui.commonui.linechart.icommon.HwHealthBarDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.icommon.IStorageModel;
import com.huawei.ui.main.stories.BarChartRender;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vap extends BarChartRender implements IHwHealthDataRender {
    private float f;
    private String h;
    private boolean i;
    private float j;
    private float k;
    private BarChartRender.OnTimeChangedListener l;
    private float m;
    private float n;
    private final Paint o;

    @Override // defpackage.qlz, com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
    }

    public vap(HwHealthBarChart hwHealthBarChart, HwHealthBarDataProvider hwHealthBarDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(hwHealthBarDataProvider, chartAnimator, viewPortHandler);
        this.i = false;
        this.o = new Paint();
        this.h = "TEMPERATURE_MIN_MAX";
        c(hwHealthBarChart, hwHealthBarDataProvider);
        this.m = vbr.h(35.0f);
        this.f = vbr.h(37.2f);
        this.k = vbr.h(37.0f);
    }

    public void b(String str) {
        this.h = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qlz
    protected void c(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, int i) {
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
        transformer.pointValuesToPixel(qnoVar.buffer);
        d(transformer);
        boolean z = iHwHealthBarDataSet.getColors().size() == 1;
        if (z) {
            this.mRenderPaint.setColor(a(iHwHealthBarDataSet));
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
                    if (!(iStorageModelAcquireModel instanceof ukm)) {
                        return;
                    } else {
                        c(canvas, this.d, 2, ((ukm) iStorageModelAcquireModel).a());
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private void d(Transformer transformer) {
        float[] fArr = {0.0f, this.f};
        float[] fArr2 = {0.0f, this.m};
        transformer.pointValuesToPixel(fArr);
        transformer.pointValuesToPixel(fArr2);
        this.n = fArr2[1];
        this.j = fArr[1];
    }

    private void c(Canvas canvas, RectF rectF, int i, ukp ukpVar) {
        float fD = ukpVar.d();
        float fA = ukpVar.a();
        if ((fD >= 1.0E-7f || fA >= 1.0E-7f) && !e(fD)) {
            float fAbs = Math.abs(rectF.right - rectF.left);
            float fAbs2 = Math.abs(rectF.bottom - rectF.top);
            float f = (100.0f - fA) / 40.0f;
            float fAbs3 = rectF.top;
            float fAbs4 = rectF.bottom;
            a(rectF, i);
            if (fAbs4 - fAbs3 >= fAbs) {
                a(rectF, canvas, ukpVar, i);
                return;
            }
            if (f * fAbs2 <= fAbs / 2.0f) {
                fAbs4 = Math.abs(fAbs + fAbs3);
            } else {
                fAbs3 = Math.abs(fAbs4 - fAbs);
            }
            RectF rectF2 = new RectF(rectF.left, fAbs3, rectF.right, fAbs4);
            c(rectF2, canvas, ukpVar, i);
            e(rectF2, canvas, ukpVar, i);
        }
    }

    private void a(RectF rectF, Canvas canvas, ukp ukpVar, int i) {
        float fA = ukpVar.a();
        float fD = ukpVar.d();
        canvas.save();
        Path path = new Path();
        float fAbs = Math.abs(rectF.right - rectF.left) / 2.0f;
        path.addRoundRect(rectF, fAbs, fAbs, Path.Direction.CW);
        canvas.clipPath(path);
        boolean z = false;
        boolean z2 = fA >= this.f;
        boolean z3 = Math.max(this.m, fD) <= Math.min(this.f, fA);
        boolean z4 = fD < this.m;
        if (rectF.top <= this.j && rectF.bottom >= this.j) {
            RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
            rectF2.bottom = this.j;
            rectF.top = this.j;
            b(fA, i);
            canvas.drawRect(rectF2, this.o);
            z2 = false;
        }
        if (rectF.bottom <= this.n || rectF.top >= this.n) {
            z = z4;
        } else {
            RectF rectF3 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
            rectF3.top = this.n;
            rectF.bottom = this.n;
            b(fD, i);
            canvas.drawRect(rectF3, this.o);
        }
        if (z2) {
            b(fA, i);
            canvas.drawRect(rectF, this.o);
        }
        if (z) {
            b(fD, i);
            canvas.drawRect(rectF, this.o);
        }
        if (z3) {
            b(this.k, i);
            canvas.drawRect(rectF, this.o);
        }
        canvas.restore();
    }

    private void c(RectF rectF, Canvas canvas, ukp ukpVar, int i) {
        b(ukpVar.a(), i);
        canvas.drawArc(rectF, 0.0f, -180.0f, false, this.o);
    }

    private void e(RectF rectF, Canvas canvas, ukp ukpVar, int i) {
        b(ukpVar.d(), i);
        canvas.drawArc(rectF, 0.0f, 180.0f, false, this.o);
    }

    private void b(float f, int i) {
        if ("SKIN_TEMPERATURE_MIN_MAX".equals(this.h)) {
            this.o.setColor(Color.argb(255, 86, 187, 191));
            a(i);
            return;
        }
        if (f >= this.f) {
            this.o.setColor(Color.argb(255, 251, 101, 34));
        } else if (f < this.m) {
            this.o.setColor(Color.argb(255, 51, Constants.MAX_PRO_BOTTOM_MARGIN_PAD, 255));
        } else {
            this.o.setColor(Color.argb(255, 86, 187, 191));
        }
        a(i);
    }

    private void a(int i) {
        if (i == 1) {
            this.o.setAlpha(255);
        } else {
            this.o.setAlpha(153);
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
    protected void c(float f, float f2, float f3, float f4, Transformer transformer) {
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
                        b(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                    } else {
                        d(canvas, iHwHealthBarDataSet, barBuffer, mPPointF);
                    }
                    MPPointF.recycleInstance(mPPointF);
                }
            }
        }
    }

    private void d(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
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

    private void b(Canvas canvas, IHwHealthBarDataSet iHwHealthBarDataSet, BarBuffer barBuffer, MPPointF mPPointF) {
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
        BarChartRender.OnTimeChangedListener onTimeChangedListener;
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
                this.mHighlightPaint.setColor(e(iHwHealthBarDataSet));
                List<T> entriesForXValue = iHwHealthBarDataSet.getEntriesForXValue(highlight.getX());
                if ((entriesForXValue == 0 || entriesForXValue.size() == 0) && (onTimeChangedListener = this.l) != null) {
                    onTimeChangedListener.onTimeChangedListener(0.0f, 0.0f);
                    return;
                }
                HwHealthBarEntry hwHealthBarEntry = (HwHealthBarEntry) entriesForXValue.get(0);
                if (isInBoundsX(hwHealthBarEntry, iHwHealthBarDataSet) && (hwHealthBarEntry.acquireModel() instanceof ukm)) {
                    Transformer transformer = this.f46467b.getTransformer(iHwHealthBarDataSet.getAxisDependencyExt());
                    d(transformer);
                    ukm ukmVar = (ukm) hwHealthBarEntry.acquireModel();
                    float fB = ukmVar.b();
                    float fC = ukmVar.c();
                    ukp ukpVarA = ukmVar.a();
                    BarChartRender.OnTimeChangedListener onTimeChangedListener2 = this.l;
                    if (onTimeChangedListener2 != null && ukpVarA != null) {
                        onTimeChangedListener2.onTimeChangedListener(ukpVarA.d(), ukpVarA.a());
                        c(hwHealthBarEntry.getX(), fB, fC, barData.a() / 2.0f, transformer);
                        c(highlight, this.f46466a);
                        c(canvas, this.f46466a, 1, ukpVarA);
                    }
                }
            }
        }
    }

    public void b(BarChartRender.OnTimeChangedListener onTimeChangedListener) {
        this.l = onTimeChangedListener;
    }

    @Override // defpackage.qlz
    protected void c(Highlight highlight, RectF rectF) {
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

    private int a(IHwHealthBarDataSet iHwHealthBarDataSet) {
        if (this.i) {
            return Color.argb(255, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE);
        }
        return iHwHealthBarDataSet.getColor();
    }

    private int e(IHwHealthBarDataSet iHwHealthBarDataSet) {
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
