package mz;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.charts.CombinedChart;
import com.github.mikephil.chartingv2.charts.LineChart;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.DataSet;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.chartingv2.renderer.LineChartRenderer;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import hz.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0010B\u001d\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tB'\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Lmz/a;", "Lcom/github/mikephil/chartingv2/renderer/LineChartRenderer;", "Lcom/github/mikephil/chartingv2/charts/LineChart;", "chart", "Lmz/d;", "options", "<init>", "(Lcom/github/mikephil/chartingv2/charts/LineChart;Lmz/d;)V", "Lcom/github/mikephil/chartingv2/charts/CombinedChart;", "(Lcom/github/mikephil/chartingv2/charts/CombinedChart;Lmz/d;)V", "Lcom/github/mikephil/chartingv2/interfaces/dataprovider/LineDataProvider;", "Lcom/github/mikephil/chartingv2/animation/ChartAnimator;", "animator", "Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;", "viewPortHandler", "(Lcom/github/mikephil/chartingv2/interfaces/dataprovider/LineDataProvider;Lcom/github/mikephil/chartingv2/animation/ChartAnimator;Lcom/github/mikephil/chartingv2/utils/ViewPortHandler;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends LineChartRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f121604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f121605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f121606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f121607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f121608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f121609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f121610g;

    static {
        new C2304a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LineChart lineChart, d dVar) {
        super(lineChart, lineChart != null ? lineChart.getAnimator() : null, lineChart != null ? lineChart.getViewPortHandler() : null);
        dVar.getClass();
        this.f121605b = new Path();
        this.f121607d = new float[4];
        this.f121606c = dVar.f121619a + dVar.f121620b;
    }

    public ArrayList a(ILineDataSet iLineDataSet) {
        ArrayList arrayList = new ArrayList();
        if (iLineDataSet != null && iLineDataSet.getEntryCount() == 1) {
            T entryForIndex = iLineDataSet.getEntryForIndex(0);
            entryForIndex.getClass();
            arrayList.add(entryForIndex);
        }
        return arrayList;
    }

    public final void b(float[] fArr, float f14, int i14) {
        float f15 = f14 / 2;
        if (this.f121609f) {
            float fContentBottom = this.mViewPortHandler.contentBottom() - f15;
            float fContentTop = this.mViewPortHandler.contentTop() + f15;
            for (int i15 = 1; i15 < i14; i15 += 2) {
                float f16 = fArr[i15];
                if (f16 > fContentBottom) {
                    fArr[i15] = f16 - f15;
                } else if (f16 < fContentTop) {
                    fArr[i15] = f16 + f15;
                }
            }
        }
        if (this.f121610g) {
            float fContentLeft = this.mViewPortHandler.contentLeft() + f15;
            float fContentRight = this.mViewPortHandler.contentRight() - f15;
            for (int i16 = 0; i16 < i14; i16 += 2) {
                float f17 = fArr[i16];
                if (f17 < fContentLeft) {
                    fArr[i16] = f17 + f15;
                } else if (f17 > fContentRight) {
                    fArr[i16] = f17 - f15;
                }
            }
        }
    }

    public boolean c(Entry entry, ILineDataSet iLineDataSet) {
        return entry == null;
    }

    @Override // com.github.mikephil.chartingv2.renderer.LineChartRenderer
    public final void drawCircles(Canvas canvas) {
        float f14;
        float f15;
        char c14;
        canvas.getClass();
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        List<T> dataSets = this.mChart.getLineData().getDataSets();
        int size = dataSets.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = dataSets.get(i14);
            obj.getClass();
            ILineDataSet iLineDataSet = (ILineDataSet) obj;
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                int entryCount = iLineDataSet.getEntryCount();
                int i15 = this.mMinX;
                if (i15 < 0) {
                    i15 = 0;
                }
                T entryForXIndex = iLineDataSet.getEntryForXIndex(i15, DataSet.Rounding.DOWN);
                T entryForXIndex2 = iLineDataSet.getEntryForXIndex(this.mMaxX, DataSet.Rounding.UP);
                char c15 = 1;
                int iMax = (int) Math.max(iLineDataSet.getEntryIndex(entryForXIndex) - (entryForXIndex == entryForXIndex2 ? 1 : 0), 0.0d);
                int iMin = (int) Math.min(Math.max(iMax + 2, iLineDataSet.getEntryIndex(entryForXIndex2) + 1), entryCount);
                float circleRadius = iLineDataSet.getCircleRadius() / 2.0f;
                int iCeil = (int) Math.ceil(((iMin - iMax) * phaseX) + iMax);
                while (iMax < iCeil) {
                    Entry entryForIndex = iLineDataSet.getEntryForIndex(iMax);
                    if (entryForIndex == null) {
                        break;
                    }
                    if (c(entryForIndex, iLineDataSet)) {
                        iMax++;
                    } else {
                        float xIndex = entryForIndex.getXIndex();
                        float val = entryForIndex.getVal() * phaseY;
                        float[] fArr = new float[2];
                        fArr[0] = xIndex;
                        fArr[c15] = val;
                        transformer.pointValuesToPixel(fArr);
                        if (!this.mViewPortHandler.isInBoundsRight(fArr[0])) {
                            break;
                        }
                        if (this.mViewPortHandler.isInBoundsLeft(fArr[0]) && this.mViewPortHandler.isInBoundsY(fArr[c15])) {
                            int circleColor = iLineDataSet.getCircleColor(iMax);
                            this.mRenderPaint.setColor(circleColor);
                            c14 = c15;
                            f15 = phaseX;
                            canvas.drawCircle(fArr[0], fArr[c15], iLineDataSet.getCircleRadius(), this.mRenderPaint);
                            if (iLineDataSet.isDrawCircleHoleEnabled() && circleColor != this.mCirclePaintInner.getColor()) {
                                canvas.drawCircle(fArr[0], fArr[c14], circleRadius, this.mCirclePaintInner);
                            }
                        } else {
                            f15 = phaseX;
                            c14 = c15;
                        }
                        iMax++;
                        c15 = c14;
                        phaseX = f15;
                    }
                }
                f14 = phaseX;
            } else {
                f14 = phaseX;
            }
            i14++;
            phaseX = f14;
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.LineChartRenderer, com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference == null || (bitmap = weakReference.get()) == null || bitmap.getWidth() != chartWidth || (bitmap2 = this.mDrawBitmap.get()) == null || bitmap2.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            WeakReference<Bitmap> weakReference2 = new WeakReference<>(Bitmap.createBitmap(chartWidth, chartHeight, this.mBitmapConfig));
            this.mDrawBitmap = weakReference2;
            Bitmap bitmap3 = weakReference2.get();
            if (bitmap3 != null) {
                this.mBitmapCanvas = new Canvas(bitmap3);
            }
        }
        Bitmap bitmap4 = this.mDrawBitmap.get();
        if (bitmap4 != null) {
            bitmap4.eraseColor(0);
        }
        for (T t7 : this.mChart.getLineData().getDataSets()) {
            if (t7.isVisible() && t7.getEntryCount() > 0) {
                drawDataSet(this.f121608e ? this.mBitmapCanvas : canvas, t7);
            }
        }
        Bitmap bitmap5 = this.mDrawBitmap.get();
        if (bitmap5 == null || canvas == null) {
            return;
        }
        canvas.drawBitmap(bitmap5, 0.0f, 0.0f, this.mRenderPaint);
    }

    @Override // com.github.mikephil.chartingv2.renderer.LineChartRenderer
    public final void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        boolean z14 = iLineDataSet instanceof g;
        Paint paint = this.mRenderPaint;
        if (z14) {
            paint.setShader(((g) iLineDataSet).f86400b);
        } else {
            paint.setShader(null);
        }
        super.drawDataSet(canvas, iLineDataSet);
        ArrayList<Entry> arrayListA = a(iLineDataSet);
        if (arrayListA.isEmpty()) {
            return;
        }
        Transformer transformer = this.mChart.getTransformer(iLineDataSet != null ? iLineDataSet.getAxisDependency() : null);
        if (iLineDataSet != null) {
            this.mRenderPaint.setColor(iLineDataSet.getColor());
        }
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float lineWidth = (iLineDataSet != null ? iLineDataSet.getLineWidth() : 2.0f) / 2;
        for (Entry entry : arrayListA) {
            float[] fArr = {entry.getXIndex(), entry.getVal()};
            transformer.pointValuesToPixel(fArr);
            Canvas canvas2 = this.mBitmapCanvas;
            float f14 = fArr[0];
            float f15 = 1;
            float f16 = fArr[1];
            canvas2.drawRect(f14 - f15, f16 - lineWidth, f14 + f15, f16 + lineWidth, this.mRenderPaint);
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.LineRadarRenderer
    public void drawFilledPath(Canvas canvas, Path path, Drawable drawable) {
        canvas.getClass();
        path.getClass();
        drawable.getClass();
        canvas.save();
        if (this.f121604a) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            canvas.clipPath(path);
        }
        drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) this.mViewPortHandler.contentTop(), (int) this.mViewPortHandler.contentRight(), (int) this.mViewPortHandler.contentBottom());
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // com.github.mikephil.chartingv2.renderer.LineScatterCandleRadarRenderer
    public final void drawHighlightLines(Canvas canvas, float[] fArr, ILineScatterCandleRadarDataSet<?> iLineScatterCandleRadarDataSet) {
        canvas.getClass();
        fArr.getClass();
        iLineScatterCandleRadarDataSet.getClass();
        canvas.restore();
        canvas.save();
        int highLightColor = iLineScatterCandleRadarDataSet.getHighLightColor();
        float highlightLineWidth = iLineScatterCandleRadarDataSet.getHighlightLineWidth();
        float fContentBottom = this.mViewPortHandler.contentBottom();
        Path path = this.f121605b;
        path.reset();
        path.moveTo(fArr[0], this.f121606c);
        path.lineTo(fArr[0], fContentBottom);
        this.mHighlightPaint.setColor(highLightColor);
        this.mHighlightPaint.setStrokeWidth(highlightLineWidth);
        this.mCirclePaintInner.setColor(highLightColor);
        canvas.drawPath(path, this.mHighlightPaint);
    }

    @Override // com.github.mikephil.chartingv2.renderer.LineChartRenderer, com.github.mikephil.chartingv2.renderer.DataRenderer
    public final void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        canvas.getClass();
        highlightArr.getClass();
        for (Highlight highlight : highlightArr) {
            ILineDataSet iLineDataSet = (ILineDataSet) this.mChart.getLineData().getDataSetByIndex(highlight.getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled() && (iLineDataSet instanceof hz.e)) {
            }
        }
        int length = highlightArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            ILineDataSet iLineDataSet2 = (ILineDataSet) this.mChart.getLineData().getDataSetByIndex(highlightArr[i14].getDataSetIndex());
            if (iLineDataSet2 != null && iLineDataSet2.isHighlightEnabled()) {
                int xIndex = highlightArr[i14].getXIndex();
                float f14 = xIndex;
                if (f14 <= this.mAnimator.getPhaseX() * this.mChart.getXChartMax()) {
                    float yValForXIndex = iLineDataSet2.getYValForXIndex(xIndex);
                    if (!Float.isNaN(yValForXIndex)) {
                        float phaseY = this.mAnimator.getPhaseY() * yValForXIndex;
                        float[] fArr = {f14, phaseY};
                        this.mChart.getTransformer(iLineDataSet2.getAxisDependency()).pointValuesToPixel(fArr);
                        drawHighlightLines(canvas, fArr, iLineDataSet2);
                        YAxis axis = this.mChart.getAxis(iLineDataSet2.getAxisDependency());
                        if ((iLineDataSet2 instanceof hz.e ? ((hz.e) iLineDataSet2).f86390a : true) && phaseY >= axis.getAxisMinimum() && phaseY <= axis.getAxisMaximum()) {
                            canvas.drawCircle(fArr[0], fArr[1], 8.0f, this.mCirclePaintInner);
                        }
                    }
                }
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.LineChartRenderer
    public void drawLinear(Canvas canvas, ILineDataSet iLineDataSet) {
        Canvas canvas2;
        int i14;
        int i15;
        int i16;
        canvas.getClass();
        iLineDataSet.getClass();
        int entryCount = iLineDataSet.getEntryCount();
        boolean zIsDrawSteppedEnabled = iLineDataSet.isDrawSteppedEnabled();
        int i17 = zIsDrawSteppedEnabled ? 4 : 2;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        if (iLineDataSet.isDashedLineEnabled()) {
            canvas2 = this.mBitmapCanvas;
            canvas2.getClass();
        } else {
            canvas2 = canvas;
        }
        int i18 = this.mMinX;
        if (i18 < 0) {
            i18 = 0;
        }
        T entryForXIndex = iLineDataSet.getEntryForXIndex(i18, DataSet.Rounding.DOWN);
        T entryForXIndex2 = iLineDataSet.getEntryForXIndex(this.mMaxX, DataSet.Rounding.UP);
        int iMax = (int) Math.max(iLineDataSet.getEntryIndex(entryForXIndex) - (entryForXIndex == entryForXIndex2 ? 1 : 0), 0.0d);
        int entryIndex = iLineDataSet.getEntryIndex(entryForXIndex2) + 1;
        int i19 = 0;
        int iMin = (int) Math.min(Math.max(iMax + 2, entryIndex), entryCount);
        int iCeil = (int) Math.ceil(((iMin - iMax) * phaseX) + iMax);
        int size = iLineDataSet.getColors().size();
        float[] fArr = this.f121607d;
        if (size > 1) {
            int i24 = i17 * 2;
            if (fArr.length != i24) {
                this.f121607d = new float[i24];
            }
            int i25 = iMax;
            for (int i26 = 1; i25 < iCeil && (iCeil <= i26 || i25 != iCeil - 1); i26 = 1) {
                Entry entryForIndex = iLineDataSet.getEntryForIndex(i25);
                if (!c(entryForIndex, iLineDataSet)) {
                    this.f121607d[i19] = entryForIndex.getXIndex();
                    this.f121607d[1] = entryForIndex.getVal() * phaseY;
                    int i27 = i25 + 1;
                    if (i27 < iCeil) {
                        Entry entryForIndex2 = iLineDataSet.getEntryForIndex(i27);
                        if (c(entryForIndex2, iLineDataSet)) {
                            break;
                        }
                        entryForIndex2.getClass();
                        float[] fArr2 = this.f121607d;
                        if (zIsDrawSteppedEnabled) {
                            i16 = i19;
                            fArr2[2] = entryForIndex2.getXIndex();
                            float[] fArr3 = this.f121607d;
                            float f14 = fArr3[1];
                            fArr3[3] = f14;
                            fArr3[4] = fArr3[2];
                            fArr3[5] = f14;
                            fArr3[6] = entryForIndex2.getXIndex();
                            this.f121607d[7] = entryForIndex2.getVal() * phaseY;
                        } else {
                            i16 = i19;
                            fArr2[2] = entryForIndex2.getXIndex();
                            this.f121607d[3] = entryForIndex2.getVal() * phaseY;
                        }
                    } else {
                        i16 = i19;
                        float[] fArr4 = this.f121607d;
                        fArr4[2] = fArr4[i16];
                        fArr4[3] = fArr4[1];
                    }
                    transformer.pointValuesToPixel(this.f121607d);
                    if (!this.mViewPortHandler.isInBoundsRight(this.f121607d[i16])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(this.f121607d[2]) && (this.mViewPortHandler.isInBoundsTop(this.f121607d[1]) || this.mViewPortHandler.isInBoundsBottom(this.f121607d[3]))) {
                        this.mRenderPaint.setColor(iLineDataSet.getColor(i25));
                        b(this.f121607d, this.mRenderPaint.getStrokeWidth(), i24);
                        canvas2.drawLines(this.f121607d, i16, i24, this.mRenderPaint);
                    }
                }
                i25++;
                i19 = 0;
            }
            i15 = entryCount;
            i14 = iMax;
        } else {
            double d14 = (entryCount - 1) * i17;
            double d15 = i17;
            i14 = iMax;
            double d16 = 2;
            if (fArr.length != Math.max(d14, d15) * d16) {
                this.f121607d = new float[(int) (Math.max(d14, d15) * d16)];
            }
            int i28 = iCeil > 1 ? i14 + 1 : i14;
            int i29 = 0;
            while (i28 < iCeil) {
                Entry entryForIndex3 = iLineDataSet.getEntryForIndex(i28 == 0 ? 0 : i28 - 1);
                entryForIndex3.getClass();
                int i30 = entryCount;
                Entry entryForIndex4 = iLineDataSet.getEntryForIndex(i28);
                entryForIndex4.getClass();
                if (!c(entryForIndex3, iLineDataSet) && !c(entryForIndex4, iLineDataSet)) {
                    this.f121607d[i29] = entryForIndex3.getXIndex();
                    int i34 = i29 + 2;
                    this.f121607d[i29 + 1] = entryForIndex3.getVal() * phaseY;
                    if (zIsDrawSteppedEnabled) {
                        this.f121607d[i34] = entryForIndex4.getXIndex();
                        this.f121607d[i29 + 3] = entryForIndex3.getVal() * phaseY;
                        this.f121607d[i29 + 4] = entryForIndex4.getXIndex();
                        i34 = i29 + 6;
                        this.f121607d[i29 + 5] = entryForIndex3.getVal() * phaseY;
                    }
                    this.f121607d[i34] = entryForIndex4.getXIndex();
                    i29 = i34 + 2;
                    this.f121607d[i34 + 1] = entryForIndex4.getVal() * phaseY;
                }
                i28++;
                entryCount = i30;
            }
            i15 = entryCount;
            transformer.pointValuesToPixel(this.f121607d);
            int length = this.f121607d.length;
            for (int i35 = 0; i35 < length; i35++) {
                float[] fArr5 = this.f121607d;
                float f15 = fArr5[i35];
                if (f15 == Float.NEGATIVE_INFINITY) {
                    fArr5[i35] = Float.MIN_VALUE;
                } else if (f15 == Float.POSITIVE_INFINITY) {
                    fArr5[i35] = Float.MAX_VALUE;
                }
            }
            int iMax2 = (int) (Math.max(((iCeil - i14) - 1) * i17, d15) * d16);
            this.mRenderPaint.setColor(iLineDataSet.getColor());
            b(this.f121607d, this.mRenderPaint.getStrokeWidth(), iMax2);
            canvas2.drawLines(this.f121607d, 0, iMax2, this.mRenderPaint);
        }
        this.mRenderPaint.setPathEffect(null);
        if (!iLineDataSet.isDrawFilledEnabled() || i15 <= 0) {
            return;
        }
        drawLinearFill(canvas, iLineDataSet, i14, iMin, transformer);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:35:0x011b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.github.mikephil.chartingv2.data.Entry] */
    @Override // com.github.mikephil.chartingv2.renderer.LineChartRenderer, com.github.mikephil.chartingv2.renderer.DataRenderer
    public final void drawValues(Canvas canvas) {
        char c14;
        float xIndex;
        a aVar = this;
        canvas.getClass();
        super.drawValues(canvas);
        float phaseX = aVar.mAnimator.getPhaseX();
        float phaseY = aVar.mAnimator.getPhaseY();
        List<T> dataSets = aVar.mChart.getLineData().getDataSets();
        int size = dataSets.size();
        int i14 = 0;
        a aVar2 = aVar;
        while (i14 < size) {
            Object obj = dataSets.get(i14);
            obj.getClass();
            ILineDataSet iLineDataSet = (ILineDataSet) obj;
            if (iLineDataSet.isVisible() && iLineDataSet.getEntryCount() != 0) {
                Transformer transformer = aVar2.mChart.getTransformer(iLineDataSet.getAxisDependency());
                int entryCount = iLineDataSet.getEntryCount();
                int i15 = aVar2.mMinX;
                if (i15 < 0) {
                    i15 = 0;
                }
                T entryForXIndex = iLineDataSet.getEntryForXIndex(i15, DataSet.Rounding.DOWN);
                T entryForXIndex2 = iLineDataSet.getEntryForXIndex(aVar2.mMaxX, DataSet.Rounding.UP);
                char c15 = 1;
                int iMax = (int) Math.max(iLineDataSet.getEntryIndex(entryForXIndex) - (entryForXIndex == entryForXIndex2 ? 1 : 0), 0.0d);
                int iCeil = (int) Math.ceil(((((int) Math.min(Math.max(iMax + 2, iLineDataSet.getEntryIndex(entryForXIndex2) + 1), entryCount)) - iMax) * phaseX) + iMax);
                while (iMax < iCeil) {
                    ?? entryForIndex = iLineDataSet.getEntryForIndex(iMax);
                    if (entryForIndex == 0) {
                        break;
                    }
                    if (aVar2.c(entryForIndex, iLineDataSet)) {
                        iMax++;
                    } else {
                        if (entryForIndex instanceof iz.a) {
                            iz.a aVar3 = (iz.a) entryForIndex;
                            float f14 = aVar3.f95859b;
                            if (iLineDataSet.isDrawSteppedEnabled() || iMax <= 0) {
                                xIndex = 0.0f;
                            } else {
                                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(iMax - 1);
                                if (aVar2.c(entryForIndex2, iLineDataSet)) {
                                    xIndex = 0.0f;
                                } else {
                                    xIndex = (entryForIndex.getXIndex() - entryForIndex2.getXIndex()) * ((entryForIndex.getVal() - f14) / (entryForIndex.getVal() - entryForIndex2.getVal()));
                                }
                            }
                            float[] fArr = new float[2];
                            fArr[0] = entryForIndex.getXIndex() - xIndex;
                            fArr[c15] = f14 * phaseY;
                            transformer.pointValuesToPixel(fArr);
                            Drawable drawable = aVar3.f95858a;
                            if (drawable != null) {
                                int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                                int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                                float f15 = fArr[0];
                                float f16 = intrinsicWidth;
                                c14 = c15;
                                float f17 = fArr[c14];
                                float f18 = intrinsicHeight;
                                drawable.setBounds((int) (f15 - f16), (int) (f17 - f18), (int) (f15 + f16), (int) (f17 + f18));
                                drawable.draw(canvas);
                            } else {
                                c14 = c15;
                            }
                        } else {
                            c14 = c15;
                        }
                        iMax++;
                        aVar2 = this;
                        c15 = c14;
                    }
                }
            }
            i14++;
            aVar2 = this;
        }
    }

    /* JADX INFO: renamed from: mz.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmz/a$a;", "", "<init>", "()V", "", "HIGHLIGHT_CIRCLE_RADIUS", "I", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2304a {
        public /* synthetic */ C2304a(j jVar) {
            this();
        }

        private C2304a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(LineChart lineChart) {
        this(lineChart, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(LineChart lineChart, d dVar, int i14, j jVar) {
        this(lineChart, (i14 & 2) != 0 ? new d() : dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CombinedChart combinedChart, d dVar) {
        super(combinedChart, combinedChart != null ? combinedChart.getAnimator() : null, combinedChart != null ? combinedChart.getViewPortHandler() : null);
        dVar.getClass();
        this.f121605b = new Path();
        this.f121607d = new float[4];
        this.f121606c = dVar.f121619a + dVar.f121620b;
    }

    public a(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(lineDataProvider, chartAnimator, viewPortHandler);
        this.f121605b = new Path();
        this.f121607d = new float[4];
    }
}
