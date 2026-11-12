package com.github.mikephil.chartingv2.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.data.DataSet;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineDataSet;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class LineChartRenderer extends LineRadarRenderer {
    protected Path cubicFillPath;
    protected Path cubicPath;
    protected Canvas mBitmapCanvas;
    protected Bitmap.Config mBitmapConfig;
    protected LineDataProvider mChart;
    protected Paint mCirclePaintInner;
    protected WeakReference<Bitmap> mDrawBitmap;
    private float[] mLineBuffer;

    public LineChartRenderer(LineDataProvider lineDataProvider, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mBitmapConfig = Bitmap.Config.ARGB_8888;
        this.cubicPath = new Path();
        this.cubicFillPath = new Path();
        this.mLineBuffer = new float[4];
        this.mChart = lineDataProvider;
        Paint paint = new Paint(1);
        this.mCirclePaintInner = paint;
        paint.setStyle(Paint.Style.FILL);
        this.mCirclePaintInner.setColor(-1);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.github.mikephil.chartingv2.data.Entry] */
    private Path generateFilledPath(ILineDataSet iLineDataSet, int i14, int i15) {
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        boolean zIsDrawSteppedEnabled = iLineDataSet.isDrawSteppedEnabled();
        Path path = new Path();
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i14);
        path.moveTo(entryForIndex.getXIndex(), fillLinePosition);
        path.lineTo(entryForIndex.getXIndex(), entryForIndex.getVal() * phaseY);
        double d14 = ((i15 - i14) * phaseX) + i14;
        int iCeil = (int) Math.ceil(d14);
        for (int i16 = i14 + 1; i16 < iCeil; i16++) {
            ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i16);
            if (zIsDrawSteppedEnabled) {
                ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i16 - 1);
                if (entryForIndex3 != 0) {
                    path.lineTo(entryForIndex2.getXIndex(), entryForIndex3.getVal() * phaseY);
                    path.lineTo(entryForIndex2.getXIndex(), entryForIndex2.getVal() * phaseY);
                }
            } else {
                path.lineTo(entryForIndex2.getXIndex(), entryForIndex2.getVal() * phaseY);
            }
        }
        path.lineTo(iLineDataSet.getEntryForIndex(Math.max(Math.min(((int) Math.ceil(d14)) - 1, iLineDataSet.getEntryCount() - 1), 0)).getXIndex(), fillLinePosition);
        path.close();
        return path;
    }

    /* JADX WARN: Type inference failed for: r13v7, types: [com.github.mikephil.chartingv2.data.Entry] */
    public void drawCircles(Canvas canvas) {
        float f14;
        int i14;
        char c14;
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        List<T> dataSets = this.mChart.getLineData().getDataSets();
        int i15 = 0;
        int i16 = 0;
        while (i16 < dataSets.size()) {
            ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i16);
            if (iLineDataSet.isVisible() && iLineDataSet.isDrawCirclesEnabled() && iLineDataSet.getEntryCount() != 0) {
                this.mCirclePaintInner.setColor(iLineDataSet.getCircleHoleColor());
                Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
                int entryCount = iLineDataSet.getEntryCount();
                int i17 = this.mMinX;
                if (i17 < 0) {
                    i17 = i15;
                }
                T entryForXIndex = iLineDataSet.getEntryForXIndex(i17, DataSet.Rounding.DOWN);
                T entryForXIndex2 = iLineDataSet.getEntryForXIndex(this.mMaxX, DataSet.Rounding.UP);
                char c15 = 1;
                int iMax = Math.max(iLineDataSet.getEntryIndex(entryForXIndex) - (entryForXIndex == entryForXIndex2 ? 1 : i15), i15);
                int iMin = Math.min(Math.max(iMax + 2, iLineDataSet.getEntryIndex(entryForXIndex2) + 1), entryCount);
                float circleRadius = iLineDataSet.getCircleRadius() / 2.0f;
                int iCeil = (int) Math.ceil(((iMin - iMax) * phaseX) + iMax);
                while (iMax < iCeil) {
                    ?? entryForIndex = iLineDataSet.getEntryForIndex(iMax);
                    if (entryForIndex == 0) {
                        break;
                    }
                    float xIndex = entryForIndex.getXIndex();
                    float val = entryForIndex.getVal() * phaseY;
                    float[] fArr = new float[2];
                    fArr[i15] = xIndex;
                    fArr[c15] = val;
                    transformer.pointValuesToPixel(fArr);
                    if (!this.mViewPortHandler.isInBoundsRight(fArr[i15])) {
                        break;
                    }
                    if (this.mViewPortHandler.isInBoundsLeft(fArr[i15]) && this.mViewPortHandler.isInBoundsY(fArr[c15])) {
                        int circleColor = iLineDataSet.getCircleColor(iMax);
                        this.mRenderPaint.setColor(circleColor);
                        i14 = i15;
                        c14 = c15;
                        f14 = phaseX;
                        canvas.drawCircle(fArr[i15], fArr[c15], iLineDataSet.getCircleRadius(), this.mRenderPaint);
                        if (iLineDataSet.isDrawCircleHoleEnabled() && circleColor != this.mCirclePaintInner.getColor()) {
                            canvas.drawCircle(fArr[i14], fArr[c14], circleRadius, this.mCirclePaintInner);
                        }
                    } else {
                        f14 = phaseX;
                        i14 = i15;
                        c14 = c15;
                    }
                    iMax++;
                    i15 = i14;
                    c15 = c14;
                    phaseX = f14;
                }
            }
            i16++;
            i15 = i15;
            phaseX = phaseX;
        }
    }

    /* JADX WARN: Type inference failed for: r14v5, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.github.mikephil.chartingv2.data.Entry] */
    public void drawCubic(Canvas canvas, ILineDataSet iLineDataSet) {
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        int entryCount = iLineDataSet.getEntryCount();
        int i14 = this.mMinX;
        int i15 = 0;
        if (i14 < 0) {
            i14 = 0;
        }
        T entryForXIndex = iLineDataSet.getEntryForXIndex(i14, DataSet.Rounding.DOWN);
        T entryForXIndex2 = iLineDataSet.getEntryForXIndex(this.mMaxX, DataSet.Rounding.UP);
        int i16 = 1;
        int iMax = Math.max(iLineDataSet.getEntryIndex(entryForXIndex) - (entryForXIndex == entryForXIndex2 ? 1 : 0), 0);
        int iMin = Math.min(Math.max(iMax + 2, iLineDataSet.getEntryIndex(entryForXIndex2) + 1), entryCount);
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float cubicIntensity = iLineDataSet.getCubicIntensity();
        this.cubicPath.reset();
        int iCeil = (int) Math.ceil(((iMin - iMax) * phaseX) + iMax);
        char c14 = 2;
        if (iCeil - iMax >= 2) {
            ?? entryForIndex = iLineDataSet.getEntryForIndex(iMax);
            int i17 = iMax + 1;
            iLineDataSet.getEntryForIndex(i17);
            this.cubicPath.moveTo(entryForIndex.getXIndex(), entryForIndex.getVal() * phaseY);
            int i18 = entryCount - 1;
            int iMin2 = Math.min(iCeil, i18);
            while (i17 < iMin2) {
                ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i17 == i16 ? i15 : i17 - 2);
                ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i17 - 1);
                ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i17);
                i17++;
                ?? entryForIndex5 = iLineDataSet.getEntryForIndex(i17);
                this.cubicPath.cubicTo(entryForIndex3.getXIndex() + ((entryForIndex4.getXIndex() - entryForIndex2.getXIndex()) * cubicIntensity), (entryForIndex3.getVal() + ((entryForIndex4.getVal() - entryForIndex2.getVal()) * cubicIntensity)) * phaseY, entryForIndex4.getXIndex() - ((entryForIndex5.getXIndex() - entryForIndex3.getXIndex()) * cubicIntensity), (entryForIndex4.getVal() - ((entryForIndex5.getVal() - entryForIndex3.getVal()) * cubicIntensity)) * phaseY, entryForIndex4.getXIndex(), entryForIndex4.getVal() * phaseY);
                c14 = c14;
                i15 = 0;
                i16 = 1;
            }
            if (iCeil > i18) {
                ?? entryForIndex6 = iLineDataSet.getEntryForIndex(entryCount >= 3 ? entryCount - 3 : entryCount - 2);
                ?? entryForIndex7 = iLineDataSet.getEntryForIndex(entryCount - 2);
                ?? entryForIndex8 = iLineDataSet.getEntryForIndex(i18);
                this.cubicPath.cubicTo(entryForIndex7.getXIndex() + ((entryForIndex8.getXIndex() - entryForIndex6.getXIndex()) * cubicIntensity), (entryForIndex7.getVal() + ((entryForIndex8.getVal() - entryForIndex6.getVal()) * cubicIntensity)) * phaseY, entryForIndex8.getXIndex() - ((entryForIndex8.getXIndex() - entryForIndex7.getXIndex()) * cubicIntensity), (entryForIndex8.getVal() - ((entryForIndex8.getVal() - entryForIndex7.getVal()) * cubicIntensity)) * phaseY, entryForIndex8.getXIndex(), entryForIndex8.getVal() * phaseY);
            }
        }
        if (iLineDataSet.isDrawFilledEnabled()) {
            this.cubicFillPath.reset();
            this.cubicFillPath.addPath(this.cubicPath);
            drawCubicFill(this.mBitmapCanvas, iLineDataSet, this.cubicFillPath, transformer, iMax, iCeil);
        }
        this.mRenderPaint.setColor(iLineDataSet.getColor());
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        transformer.pathValueToPixel(this.cubicPath);
        this.mBitmapCanvas.drawPath(this.cubicPath, this.mRenderPaint);
        this.mRenderPaint.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.github.mikephil.chartingv2.data.Entry] */
    public void drawCubicFill(Canvas canvas, ILineDataSet iLineDataSet, Path path, Transformer transformer, int i14, int i15) {
        if (i15 - i14 <= 1) {
            return;
        }
        float fillLinePosition = iLineDataSet.getFillFormatter().getFillLinePosition(iLineDataSet, this.mChart);
        ?? entryForIndex = iLineDataSet.getEntryForIndex(i15 - 1);
        ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i14);
        float xIndex = entryForIndex == 0 ? 0.0f : entryForIndex.getXIndex();
        float xIndex2 = entryForIndex2 != 0 ? entryForIndex2.getXIndex() : 0.0f;
        path.lineTo(xIndex, fillLinePosition);
        path.lineTo(xIndex2, fillLinePosition);
        path.close();
        transformer.pathValueToPixel(path);
        Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable != null) {
            drawFilledPath(canvas, path, fillDrawable);
        } else {
            drawFilledPath(canvas, path, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference == null || weakReference.get().getWidth() != chartWidth || this.mDrawBitmap.get().getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            this.mDrawBitmap = new WeakReference<>(Bitmap.createBitmap(chartWidth, chartHeight, this.mBitmapConfig));
            this.mBitmapCanvas = new Canvas(this.mDrawBitmap.get());
        }
        this.mDrawBitmap.get().eraseColor(0);
        for (T t7 : this.mChart.getLineData().getDataSets()) {
            if (t7.isVisible() && t7.getEntryCount() > 0) {
                drawDataSet(canvas, t7);
            }
        }
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, this.mRenderPaint);
    }

    public void drawDataSet(Canvas canvas, ILineDataSet iLineDataSet) {
        if (iLineDataSet.getEntryCount() < 1) {
            return;
        }
        this.mRenderPaint.setStrokeWidth(iLineDataSet.getLineWidth());
        this.mRenderPaint.setPathEffect(iLineDataSet.getDashPathEffect());
        if (iLineDataSet.isDrawCubicEnabled()) {
            drawCubic(canvas, iLineDataSet);
        } else {
            drawLinear(canvas, iLineDataSet);
        }
        this.mRenderPaint.setPathEffect(null);
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawCircles(canvas);
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        for (int i14 = 0; i14 < highlightArr.length; i14++) {
            ILineDataSet iLineDataSet = (ILineDataSet) this.mChart.getLineData().getDataSetByIndex(highlightArr[i14].getDataSetIndex());
            if (iLineDataSet != null && iLineDataSet.isHighlightEnabled()) {
                int xIndex = highlightArr[i14].getXIndex();
                float f14 = xIndex;
                if (f14 <= this.mAnimator.getPhaseX() * this.mChart.getXChartMax()) {
                    float yValForXIndex = iLineDataSet.getYValForXIndex(xIndex);
                    if (yValForXIndex != Float.NaN) {
                        float[] fArr = {f14, this.mAnimator.getPhaseY() * yValForXIndex};
                        this.mChart.getTransformer(iLineDataSet.getAxisDependency()).pointValuesToPixel(fArr);
                        drawHighlightLines(canvas, fArr, iLineDataSet);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.github.mikephil.chartingv2.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v34, types: [com.github.mikephil.chartingv2.data.Entry] */
    public void drawLinear(Canvas canvas, ILineDataSet iLineDataSet) {
        int i14;
        char c14;
        int i15;
        char c15;
        int entryCount = iLineDataSet.getEntryCount();
        boolean zIsDrawSteppedEnabled = iLineDataSet.isDrawSteppedEnabled();
        int i16 = zIsDrawSteppedEnabled ? 4 : 2;
        Transformer transformer = this.mChart.getTransformer(iLineDataSet.getAxisDependency());
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        this.mRenderPaint.setStyle(Paint.Style.STROKE);
        Canvas canvas2 = iLineDataSet.isDashedLineEnabled() ? this.mBitmapCanvas : canvas;
        int i17 = this.mMinX;
        int i18 = 0;
        if (i17 < 0) {
            i17 = 0;
        }
        T entryForXIndex = iLineDataSet.getEntryForXIndex(i17, DataSet.Rounding.DOWN);
        T entryForXIndex2 = iLineDataSet.getEntryForXIndex(this.mMaxX, DataSet.Rounding.UP);
        int i19 = 1;
        int iMax = Math.max(iLineDataSet.getEntryIndex(entryForXIndex) - (entryForXIndex == entryForXIndex2 ? 1 : 0), 0);
        int iMin = Math.min(Math.max(iMax + 2, iLineDataSet.getEntryIndex(entryForXIndex2) + 1), entryCount);
        float f14 = ((iMin - iMax) * phaseX) + iMax;
        char c16 = 4;
        int iCeil = (int) Math.ceil(f14);
        int size = iLineDataSet.getColors().size();
        float[] fArr = this.mLineBuffer;
        if (size <= 1) {
            int i24 = (entryCount - 1) * i16;
            if (fArr.length != Math.max(i24, i16) * 2) {
                this.mLineBuffer = new float[Math.max(i24, i16) * 2];
            }
            if (iLineDataSet.getEntryForIndex(iMax) != 0) {
                int i25 = iCeil > 1 ? iMax + 1 : iMax;
                int i26 = 0;
                while (i25 < iCeil) {
                    ?? entryForIndex = iLineDataSet.getEntryForIndex(i25 == 0 ? i18 : i25 - 1);
                    ?? entryForIndex2 = iLineDataSet.getEntryForIndex(i25);
                    if (entryForIndex != 0 && entryForIndex2 != 0) {
                        this.mLineBuffer[i26] = entryForIndex.getXIndex();
                        int i27 = i26 + 2;
                        this.mLineBuffer[i26 + 1] = entryForIndex.getVal() * phaseY;
                        if (zIsDrawSteppedEnabled) {
                            this.mLineBuffer[i27] = entryForIndex2.getXIndex();
                            this.mLineBuffer[i26 + 3] = entryForIndex.getVal() * phaseY;
                            this.mLineBuffer[i26 + 4] = entryForIndex2.getXIndex();
                            i27 = i26 + 6;
                            this.mLineBuffer[i26 + 5] = entryForIndex.getVal() * phaseY;
                        }
                        this.mLineBuffer[i27] = entryForIndex2.getXIndex();
                        this.mLineBuffer[i27 + 1] = entryForIndex2.getVal() * phaseY;
                        i26 = i27 + 2;
                    }
                    i25++;
                    entryCount = entryCount;
                    i18 = 0;
                }
                i14 = entryCount;
                transformer.pointValuesToPixel(this.mLineBuffer);
                int iMax2 = Math.max(((iCeil - iMax) - 1) * i16, i16) * 2;
                this.mRenderPaint.setColor(iLineDataSet.getColor());
                canvas2.drawLines(this.mLineBuffer, 0, iMax2, this.mRenderPaint);
            }
            this.mRenderPaint.setPathEffect(null);
            if (iLineDataSet.isDrawFilledEnabled() || i14 <= 0) {
            }
            drawLinearFill(canvas, iLineDataSet, iMax, iMin, transformer);
            return;
        }
        int i28 = i16 * 2;
        if (fArr.length != i28) {
            this.mLineBuffer = new float[i28];
        }
        int i29 = iMax;
        while (i29 < iCeil && (iCeil <= i19 || i29 != iCeil - 1)) {
            ?? entryForIndex3 = iLineDataSet.getEntryForIndex(i29);
            if (entryForIndex3 == 0) {
                c14 = c16;
                i15 = i19;
            } else {
                c14 = c16;
                i15 = i19;
                this.mLineBuffer[0] = entryForIndex3.getXIndex();
                this.mLineBuffer[i15] = entryForIndex3.getVal() * phaseY;
                int i30 = i29 + 1;
                if (i30 < iCeil) {
                    ?? entryForIndex4 = iLineDataSet.getEntryForIndex(i30);
                    if (entryForIndex4 == 0) {
                        break;
                    }
                    float[] fArr2 = this.mLineBuffer;
                    if (zIsDrawSteppedEnabled) {
                        c15 = 3;
                        fArr2[2] = entryForIndex4.getXIndex();
                        float[] fArr3 = this.mLineBuffer;
                        float f15 = fArr3[i15];
                        fArr3[3] = f15;
                        fArr3[c14] = fArr3[2];
                        fArr3[5] = f15;
                        fArr3[6] = entryForIndex4.getXIndex();
                        this.mLineBuffer[7] = entryForIndex4.getVal() * phaseY;
                    } else {
                        c15 = 3;
                        fArr2[2] = entryForIndex4.getXIndex();
                        this.mLineBuffer[3] = entryForIndex4.getVal() * phaseY;
                    }
                } else {
                    c15 = 3;
                    float[] fArr4 = this.mLineBuffer;
                    fArr4[2] = fArr4[0];
                    fArr4[3] = fArr4[i15];
                }
                transformer.pointValuesToPixel(this.mLineBuffer);
                if (!this.mViewPortHandler.isInBoundsRight(this.mLineBuffer[0])) {
                    break;
                }
                if (this.mViewPortHandler.isInBoundsLeft(this.mLineBuffer[2]) && ((this.mViewPortHandler.isInBoundsTop(this.mLineBuffer[i15]) || this.mViewPortHandler.isInBoundsBottom(this.mLineBuffer[c15])) && (this.mViewPortHandler.isInBoundsTop(this.mLineBuffer[i15]) || this.mViewPortHandler.isInBoundsBottom(this.mLineBuffer[c15])))) {
                    this.mRenderPaint.setColor(iLineDataSet.getColor(i29));
                    canvas2.drawLines(this.mLineBuffer, 0, i28, this.mRenderPaint);
                }
            }
            i29++;
            c16 = c14;
            i19 = i15;
        }
        i14 = entryCount;
        this.mRenderPaint.setPathEffect(null);
        if (iLineDataSet.isDrawFilledEnabled()) {
        }
    }

    public void drawLinearFill(Canvas canvas, ILineDataSet iLineDataSet, int i14, int i15, Transformer transformer) {
        Path pathGenerateFilledPath = generateFilledPath(iLineDataSet, i14, i15);
        transformer.pathValueToPixel(pathGenerateFilledPath);
        Drawable fillDrawable = iLineDataSet.getFillDrawable();
        if (fillDrawable != null) {
            drawFilledPath(canvas, pathGenerateFilledPath, fillDrawable);
        } else {
            drawFilledPath(canvas, pathGenerateFilledPath, iLineDataSet.getFillColor(), iLineDataSet.getFillAlpha());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.github.mikephil.chartingv2.data.Entry] */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        LineChartRenderer lineChartRenderer = this;
        if (lineChartRenderer.mChart.getLineData().getYValCount() < lineChartRenderer.mViewPortHandler.getScaleX() * lineChartRenderer.mChart.getMaxVisibleCount()) {
            List<T> dataSets = lineChartRenderer.mChart.getLineData().getDataSets();
            int i14 = 0;
            LineChartRenderer lineChartRenderer2 = lineChartRenderer;
            while (i14 < dataSets.size()) {
                ILineDataSet iLineDataSet = (ILineDataSet) dataSets.get(i14);
                if (iLineDataSet.isDrawValuesEnabled() && iLineDataSet.getEntryCount() != 0) {
                    lineChartRenderer2.applyValueTextStyle(iLineDataSet);
                    Transformer transformer = lineChartRenderer2.mChart.getTransformer(iLineDataSet.getAxisDependency());
                    int circleRadius = (int) (iLineDataSet.getCircleRadius() * 1.75f);
                    if (!iLineDataSet.isDrawCirclesEnabled()) {
                        circleRadius /= 2;
                    }
                    int entryCount = iLineDataSet.getEntryCount();
                    int i15 = lineChartRenderer2.mMinX;
                    if (i15 < 0) {
                        i15 = 0;
                    }
                    T entryForXIndex = iLineDataSet.getEntryForXIndex(i15, DataSet.Rounding.DOWN);
                    T entryForXIndex2 = iLineDataSet.getEntryForXIndex(lineChartRenderer2.mMaxX, DataSet.Rounding.UP);
                    int iMax = Math.max(iLineDataSet.getEntryIndex(entryForXIndex) - (entryForXIndex == entryForXIndex2 ? 1 : 0), 0);
                    float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(iLineDataSet, lineChartRenderer2.mAnimator.getPhaseX(), lineChartRenderer2.mAnimator.getPhaseY(), iMax, Math.min(Math.max(iMax + 2, iLineDataSet.getEntryIndex(entryForXIndex2) + 1), entryCount));
                    int i16 = 0;
                    LineChartRenderer lineChartRenderer3 = lineChartRenderer2;
                    while (i16 < fArrGenerateTransformedValuesLine.length) {
                        float f14 = fArrGenerateTransformedValuesLine[i16];
                        float f15 = fArrGenerateTransformedValuesLine[i16 + 1];
                        if (!lineChartRenderer3.mViewPortHandler.isInBoundsRight(f14)) {
                            break;
                        }
                        if (lineChartRenderer3.mViewPortHandler.isInBoundsLeft(f14) && lineChartRenderer3.mViewPortHandler.isInBoundsY(f15)) {
                            int i17 = i16 / 2;
                            ?? entryForIndex = iLineDataSet.getEntryForIndex(i17 + iMax);
                            lineChartRenderer3.drawValue(canvas, iLineDataSet.getValueFormatter(), entryForIndex.getVal(), entryForIndex, i14, f14, f15 - circleRadius, iLineDataSet.getValueTextColor(i17));
                        }
                        i16 += 2;
                        lineChartRenderer3 = this;
                        circleRadius = circleRadius;
                    }
                }
                i14++;
                lineChartRenderer2 = this;
            }
        }
    }

    public Bitmap.Config getBitmapConfig() {
        return this.mBitmapConfig;
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void initBuffers() {
    }

    public void releaseBitmap() {
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            weakReference.get().recycle();
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }

    public void setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        releaseBitmap();
    }
}
