package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.ChartInterface;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.linechart.barchart.HwHealthBarDataSet;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthBaseCombinedChart;
import com.huawei.ui.commonui.linechart.combinedchart.HwHealthCombinedChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.icommon.HwHealthLineDataProvider;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthDatasContainer;
import com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import health.compact.a.UnitUtil;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class qnx extends qnq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f46537b;
    protected Path h;

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public boolean isDrawingValuesAllowed(ChartInterface chartInterface) {
        return true;
    }

    public qnx(HwHealthLineDataProvider hwHealthLineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler, Context context) {
        super(hwHealthLineDataProvider, chartAnimator, viewPortHandler, context);
        this.h = new Path();
        this.f46537b = new Paint();
        c();
        this.i = 1;
    }

    private void c() {
        this.f46537b.setAntiAlias(true);
        this.f46537b.setStrokeWidth(Utils.convertDpToPixel(2.0f));
        this.f46537b.setStyle(Paint.Style.STROKE);
    }

    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        List dataSets;
        if (isDrawingValuesAllowed(this.mChart)) {
            if (this.mChart instanceof HwHealthBaseCombinedChart) {
                dataSets = getDataset().getDataSets();
            } else {
                dataSets = this.mChart.getData().getDataSets();
            }
            if (dataSets == null) {
                LogUtil.j("WeightLineChartRender", "drawValues dataSets == null");
                return;
            }
            for (int i = 0; i < dataSets.size(); i++) {
                Object obj = dataSets.get(i);
                if (obj instanceof IHwHealthLineDataSet) {
                    IHwHealthLineDataSet iHwHealthLineDataSet = (IHwHealthLineDataSet) obj;
                    if (iHwHealthLineDataSet.isDataCalculated() && (shouldDrawValues(iHwHealthLineDataSet) || iHwHealthLineDataSet.isShowMaxMinValue())) {
                        applyValueTextStyle(iHwHealthLineDataSet);
                        HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
                        this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
                        float[] fArrD = transformer.d(iHwHealthLineDataSet, this.mAnimator.getPhaseX(), this.mAnimator.getPhaseY(), this.mXBounds.min, this.mXBounds.max);
                        MPPointF mPPointF = MPPointF.getInstance(iHwHealthLineDataSet.getIconsOffset());
                        mPPointF.x = Utils.convertDpToPixel(mPPointF.x);
                        mPPointF.y = Utils.convertDpToPixel(mPPointF.y);
                        e(fArrD, iHwHealthLineDataSet, canvas, mPPointF, i);
                        MPPointF.recycleInstance(mPPointF);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[PHI: r0 r1 r5
      0x0077: PHI (r0v6 float) = (r0v3 float), (r0v16 float) binds: [B:14:0x004e, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r1v5 float) = (r1v2 float), (r1v11 float) binds: [B:14:0x004e, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0077: PHI (r5v4 float) = (r5v1 float), (r5v7 float) binds: [B:14:0x004e, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    protected void e(float[] fArr, IHwHealthLineDataSet iHwHealthLineDataSet, Canvas canvas, MPPointF mPPointF, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float y;
        float f5;
        int iConvertDpToPixel = (int) Utils.convertDpToPixel(7.0f);
        float f6 = 0.0f;
        float f7 = 0.0f;
        float y2 = Float.MIN_VALUE;
        float f8 = Float.MAX_VALUE;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            float f11 = fArr[i2];
            float f12 = fArr[i2 + 1];
            if (!this.mViewPortHandler.isInBoundsRight(f11)) {
                break;
            }
            if (this.mViewPortHandler.isInBoundsLeft(f11) && this.mViewPortHandler.isInBoundsY(f12)) {
                int i3 = i2 / 2;
                int i4 = this.mXBounds.min + i3;
                Entry entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i4);
                if (iHwHealthLineDataSet.isShowMaxMinValue()) {
                    if (entryForIndex.getY() > y2) {
                        y2 = entryForIndex.getY();
                        f6 = f11;
                        f9 = f12;
                    }
                    if (entryForIndex.getY() < f8) {
                        f = f6;
                        f2 = f9;
                        y = entryForIndex.getY();
                        f5 = y2;
                        f3 = f11;
                        f4 = f12;
                    } else {
                        f = f6;
                        f2 = f9;
                        f3 = f10;
                        f4 = f7;
                        y = f8;
                        f5 = y2;
                    }
                } else {
                    f = f6;
                    f2 = f9;
                    f3 = f10;
                    f4 = f7;
                    y = f8;
                    f5 = y2;
                }
                if (iHwHealthLineDataSet.isDrawValuesEnabled()) {
                    drawValue(canvas, iHwHealthLineDataSet.getValueFormatter().getFormattedValue(entryForIndex.getY(), entryForIndex, i4, this.mViewPortHandler), f11, f12 - iConvertDpToPixel, iHwHealthLineDataSet.getValueTextColor(i3));
                }
                if (entryForIndex.getIcon() != null && iHwHealthLineDataSet.isDrawIconsEnabled()) {
                    Drawable icon = entryForIndex.getIcon();
                    Utils.drawImage(canvas, icon, (int) (f11 + mPPointF.x), (int) (f12 + mPPointF.y), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                }
                f6 = f;
                f9 = f2;
                f10 = f3;
                f7 = f4;
                f8 = y;
                y2 = f5;
            }
        }
        if (!iHwHealthLineDataSet.isShowMaxMinValue() || f8 == Float.MAX_VALUE) {
            return;
        }
        MPPointF mPPointF2 = MPPointF.getInstance(f6, f9);
        MPPointF mPPointF3 = MPPointF.getInstance(f10, f7);
        b(canvas, f8, y2, mPPointF3, mPPointF2);
        MPPointF.recycleInstance(mPPointF2);
        MPPointF.recycleInstance(mPPointF3);
    }

    private void b(Canvas canvas, float f, float f2, MPPointF mPPointF, MPPointF mPPointF2) {
        this.mValuePaint.setColor(qqn.d(R.color.textColorSecondary));
        this.mValuePaint.setTextSize(BaseApplication.getContext().getResources().getDimension(R.dimen.textSizeCaption));
        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
        canvas.drawText(UnitUtil.e(f2, 1, 1), mPPointF2.x, (mPPointF2.y - fConvertDpToPixel) - Utils.convertDpToPixel(2.0f), this.mValuePaint);
        if (f != f2) {
            canvas.drawText(UnitUtil.e(f, 1, 1), mPPointF.x, mPPointF.y + (fConvertDpToPixel * 3.0f), this.mValuePaint);
        }
    }

    private void c(IHwHealthLineDataSet iHwHealthLineDataSet) {
        if (iHwHealthLineDataSet instanceof qny) {
            this.f46537b.setColor(qqn.d(R.color.emui_color_tips_bg));
        } else {
            this.f46537b.setColor(iHwHealthLineDataSet.getColor());
        }
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public void drawLinear(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet) {
        if (iHwHealthLineDataSet.isDataCalculated()) {
            c(iHwHealthLineDataSet);
            d();
            HwHealthTransformer transformer = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt());
            Canvas canvas2 = this.mBitmapCanvas;
            this.mXBounds.set(this.mChart, iHwHealthLineDataSet);
            int i = iHwHealthLineDataSet.isDrawSteppedEnabled() ? 4 : 2;
            if (iHwHealthLineDataSet.getColors().size() > 1) {
                if (this.g.length <= i * 2) {
                    this.g = new float[i * 4];
                }
                e(iHwHealthLineDataSet, iHwHealthLineDataSet.isDrawSteppedEnabled(), transformer, this.mAnimator.getPhaseY(), canvas2);
            } else {
                a(iHwHealthLineDataSet.getEntryCount(), i);
                e(iHwHealthLineDataSet, i, transformer, canvas2);
            }
            this.mRenderPaint.setPathEffect(null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.github.mikephil.charting.data.Entry] */
    private void e(IHwHealthLineDataSet iHwHealthLineDataSet, boolean z, Transformer transformer, float f, Canvas canvas) {
        for (int i = this.mXBounds.min; i <= this.mXBounds.range + this.mXBounds.min; i++) {
            ?? entryForIndex = iHwHealthLineDataSet.getEntryForIndex(i);
            if (entryForIndex != 0) {
                this.g[0] = entryForIndex.getX();
                this.g[1] = entryForIndex.getY() * f;
                if (i < this.mXBounds.max) {
                    Entry entryForIndex2 = iHwHealthLineDataSet.getEntryForIndex(i + 1);
                    if (entryForIndex2 == null) {
                        return;
                    } else {
                        c(z, f, entryForIndex2);
                    }
                } else {
                    this.g[2] = this.g[0];
                    this.g[3] = this.g[1];
                }
                transformer.pointValuesToPixel(this.g);
                if (!this.mViewPortHandler.isInBoundsRight(this.g[0])) {
                    return;
                }
                boolean z2 = (this.mViewPortHandler.isInBoundsTop(this.g[1]) || this.mViewPortHandler.isInBoundsBottom(this.g[3])) ? false : true;
                if (this.mViewPortHandler.isInBoundsLeft(this.g[2]) && !z2) {
                    this.mRenderPaint.setColor(iHwHealthLineDataSet.getColor(i));
                    canvas.drawLines(this.g, 0, (z ? 4 : 2) * 2, this.mRenderPaint);
                }
            }
        }
    }

    private void c(boolean z, float f, Entry entry) {
        if (z) {
            this.g[2] = entry.getX();
            this.g[3] = this.g[1];
            this.g[4] = this.g[2];
            this.g[5] = this.g[3];
            this.g[6] = entry.getX();
            this.g[7] = entry.getY() * f;
            return;
        }
        this.g[2] = entry.getX();
        this.g[3] = entry.getY() * f;
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal
    public qnt getDataset() {
        return this.mChart.getLineData();
    }

    @Override // defpackage.qnq
    protected void e(IHwHealthLineDataSet iHwHealthLineDataSet) {
        c(iHwHealthLineDataSet);
    }

    @Override // defpackage.qnq
    protected int a(IHwHealthLineDataSet iHwHealthLineDataSet) {
        return iHwHealthLineDataSet.getColor();
    }

    protected boolean d(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-7f;
    }

    @Override // defpackage.qnq
    protected void c(Canvas canvas, int i, List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet) {
        d(canvas, new Paint(), list, iHwHealthLineDataSet, new e());
    }

    protected void d(Canvas canvas, Paint paint, List<PointF> list, IHwHealthLineDataSet iHwHealthLineDataSet, e eVar) {
        paint.setAntiAlias(true);
        if (this.i == 1) {
            paint.setStyle(Paint.Style.STROKE);
            float[] fArr = new float[list.size() * 2];
            float[] fArr2 = new float[list.size() * 2];
            int i = 0;
            int i2 = 0;
            for (PointF pointF : list) {
                fArr[i] = pointF.x;
                fArr[i + 1] = pointF.y;
                fArr2[i2] = pointF.x;
                fArr2[i2 + 1] = pointF.y;
                i2 += 2;
                i += 2;
            }
            this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).pointValuesToPixel(fArr);
            eVar.d(paint);
            eVar.b(fArr);
            eVar.d(fArr2);
            b(canvas, iHwHealthLineDataSet, eVar);
        }
    }

    @Override // defpackage.qnq
    protected void e(Canvas canvas, float f, float f2, IHwHealthLineDataSet iHwHealthLineDataSet, Path path) {
        int iSave = canvas.save();
        canvas.clipRect(f, (int) this.mViewPortHandler.contentTop(), f2, (int) this.mViewPortHandler.contentBottom());
        canvas.drawPath(path, this.f46537b);
        canvas.restoreToCount(iSave);
        path.reset();
    }

    protected void b(Canvas canvas, IHwHealthLineDataSet iHwHealthLineDataSet, e eVar) {
        for (int i = 0; i < eVar.e().length; i += 2) {
            eVar.c().setAntiAlias(true);
            eVar.c().setStyle(Paint.Style.FILL);
            b(canvas, eVar, iHwHealthLineDataSet, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    protected void b(Canvas canvas, e eVar, IHwHealthLineDataSet iHwHealthLineDataSet, int i) {
        float circleHoleRadius = iHwHealthLineDataSet.getCircleHoleRadius();
        float circleRadius = iHwHealthLineDataSet.getCircleRadius();
        if (i < 0) {
            return;
        }
        float f = eVar.e()[i];
        int i2 = i + 1;
        float f2 = eVar.e()[i2];
        if (iHwHealthLineDataSet.getNodeCircleBackground()) {
            eVar.c().setColor(qqn.d(R.color.chart_background_color));
            canvas.drawCircle(f, f2, circleRadius, eVar.c());
        }
        if (iHwHealthLineDataSet instanceof qny) {
            qny qnyVar = (qny) iHwHealthLineDataSet;
            if (qnyVar.o()) {
                eVar.c().setColor(b(qnyVar, eVar.b()[i2]));
            } else {
                eVar.c().setColor(iHwHealthLineDataSet.getColor());
            }
        } else {
            eVar.c().setColor(iHwHealthLineDataSet.getColor());
        }
        canvas.drawCircle(f, f2, circleHoleRadius, eVar.c());
    }

    protected int b(qny qnyVar, float f) {
        int i;
        float[] fArrK = qnyVar.k();
        int[] iArrA = qnyVar.a();
        if (f >= fArrK[fArrK.length - 1]) {
            return iArrA[iArrA.length - 1];
        }
        if (f < fArrK[0]) {
            return iArrA[0];
        }
        int iA = a(fArrK, f, 0, fArrK.length - 1);
        if (iA > -1 && (i = iA + 1) < iArrA.length - 1) {
            return iArrA[i];
        }
        return iArrA[0];
    }

    private int a(float[] fArr, float f, int i, int i2) {
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            float f2 = fArr[i4];
            int i5 = i4 + 1;
            float f3 = fArr[i5];
            if (Float.compare(f, f2) >= 0 && f < f3) {
                return i4;
            }
            if (f2 < f) {
                i = i5;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    @Override // defpackage.qnq, com.huawei.ui.commonui.linechart.view.HwHealthLineChartRenderLayerOriginal, com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        boolean z;
        Entry hwHealthBaseEntry;
        qnt dataset = getDataset();
        if (highlightArr == null || highlightArr.length <= 0 || dataset == null || canvas == null) {
            return;
        }
        for (Highlight highlight : highlightArr) {
            List<T> dataSets = dataset.getDataSets();
            if (dataSets != 0 && dataSets.size() != 0) {
                if (dataSets.size() == 1) {
                    List<T> entriesForXValue = ((IHwHealthLineDataSet) dataSets.get(0)).getEntriesForXValue(highlight.getX());
                    if (entriesForXValue != 0 && entriesForXValue.size() != 0) {
                        Entry entry = (Entry) entriesForXValue.get(0);
                        if (isUsePaintAsBackground() && ((HwHealthBaseBarLineChart) this.mChart).isManualReferenceLineEnabled()) {
                            hwHealthBaseEntry = new HwHealthBaseEntry(highlight.getX(), ((HwHealthBaseBarLineChart) this.mChart).getManualReferenceLineValue());
                            z = false;
                        } else {
                            z = true;
                            hwHealthBaseEntry = entry;
                        }
                        b(canvas, hwHealthBaseEntry, (IHwHealthLineDataSet) dataSets.get(0), true, z);
                    }
                } else {
                    for (T t : dataSets) {
                        if (!(this.mChart instanceof HwHealthBaseBarLineChart)) {
                            break;
                        }
                        IHwHealthDatasContainer iHwHealthDatasContainerCacheDataContainer = t.cacheDataContainer((HwHealthBaseBarLineChart) this.mChart);
                        if (iHwHealthDatasContainerCacheDataContainer instanceof IHwHealthLineDatasContainer) {
                            List<HwHealthBaseEntry> listSearchEntryForXValue = ((IHwHealthLineDatasContainer) iHwHealthDatasContainerCacheDataContainer).searchEntryForXValue(highlight.getX());
                            if (!njy.e(listSearchEntryForXValue)) {
                                b(canvas, (Entry) listSearchEntryForXValue.get(0), t, true, true);
                            }
                        }
                    }
                }
            }
        }
    }

    protected void b(Canvas canvas, Entry entry, IHwHealthLineDataSet iHwHealthLineDataSet, boolean z, boolean z2) {
        int iArgb = Color.argb(0, 0, 0, 0);
        MPPointD pixelForValues = this.mChart.getTransformer(iHwHealthLineDataSet.getAxisDependencyExt()).getPixelForValues(entry.getX(), entry.getY() * this.mAnimator.getPhaseY());
        float f = (float) pixelForValues.x;
        this.mHighlightPaint.setStrokeWidth(iHwHealthLineDataSet.getHighlightLineWidth());
        this.mHighlightPaint.setColor(iArgb);
        this.mHighlightPaint.setPathEffect(iHwHealthLineDataSet.getDashPathEffectHighlight());
        if (iHwHealthLineDataSet.isVerticalHighlightIndicatorEnabled() && z) {
            this.h.reset();
            if ((this.mChart instanceof Chart) && (((Chart) this.mChart).getMarker() instanceof MarkerView)) {
                this.h.moveTo(f, ((MarkerView) ((Chart) this.mChart).getMarker()).getHeight());
                this.h.lineTo(f, this.mViewPortHandler.contentBottom() + this.mChart.getXAxis().getYOffset());
                canvas.drawPath(this.h, this.mHighlightPaint);
            }
        }
        float x = entry.getX();
        float lowestVisibleX = this.mChart.getLowestVisibleX();
        float highestVisibleX = this.mChart.getHighestVisibleX();
        if (!z2 || x <= lowestVisibleX || x >= highestVisibleX) {
            return;
        }
        float circleHoleRadius = iHwHealthLineDataSet.getCircleHoleRadius() + Utils.convertDpToPixel(1.0f);
        float circleRadius = iHwHealthLineDataSet.getCircleRadius() + Utils.convertDpToPixel(1.0f);
        if (this.mChart instanceof HwHealthCombinedChart) {
            List<T> dataSets = this.mChart.getData().getDataSets();
            if (dataSets.size() > 0 && (dataSets.get(0) instanceof HwHealthBarDataSet)) {
                float[] fArr = {0.0f, 0.0f, a(0.0f), 0.0f};
                this.mChart.getTransformer(((HwHealthCombinedChart) this.mChart).getAxisFirstParty().b()).pointValuesToPixel(fArr);
                circleHoleRadius = (fArr[2] - fArr[0]) / 2.0f;
                circleRadius = circleHoleRadius * 1.5f;
            }
        }
        float f2 = (float) pixelForValues.y;
        b();
        canvas.drawCircle(f, f2, circleRadius, this.mHighlightPaint);
        e(entry, iHwHealthLineDataSet);
        canvas.drawCircle(f, f2, circleHoleRadius, this.mHighlightPaint);
        this.mHighlightPaint.setStyle(Paint.Style.STROKE);
    }

    private void b() {
        this.mHighlightPaint.setAntiAlias(true);
        this.mHighlightPaint.setStrokeWidth(1.0f);
        this.mHighlightPaint.setStyle(Paint.Style.FILL);
        this.mHighlightPaint.setColor(qqn.d(R.color.chart_background_color));
        this.mHighlightPaint.setShadowLayer(8.0f, 0.0f, 6.0f, qqn.d(R.color.chart_shadow_color));
    }

    private void e(Entry entry, IHwHealthLineDataSet iHwHealthLineDataSet) {
        this.mHighlightPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        if (!(this.mChart.getData().getDataSets().get(0) instanceof qny) || !((qny) this.mChart.getData().getDataSets().get(0)).o()) {
            this.mHighlightPaint.setColor(d(iHwHealthLineDataSet));
        } else {
            this.mHighlightPaint.setColor(b((qny) this.mChart.getData().getDataSets().get(0), entry.getY()));
        }
    }

    protected float a(float f) {
        qly barData = ((HwHealthCombinedChart) this.mChart).getBarData();
        return barData != null ? barData.a() : f;
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float[] f46538b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float[] f46539c;
        private int d;
        private Paint e;

        public int a() {
            return this.d;
        }

        public void a(int i) {
            this.d = i;
        }

        public float[] e() {
            return this.f46538b;
        }

        public void b(float[] fArr) {
            this.f46538b = fArr;
        }

        public float[] b() {
            return this.f46539c;
        }

        public void d(float[] fArr) {
            this.f46539c = fArr;
        }

        public Paint c() {
            return this.e;
        }

        public void d(Paint paint) {
            this.e = paint;
        }
    }
}
