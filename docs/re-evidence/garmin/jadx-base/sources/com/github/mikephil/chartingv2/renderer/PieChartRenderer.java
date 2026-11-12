package com.github.mikephil.chartingv2.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.chartingv2.animation.ChartAnimator;
import com.github.mikephil.chartingv2.charts.PieChart;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.data.PieData;
import com.github.mikephil.chartingv2.formatter.ValueFormatter;
import com.github.mikephil.chartingv2.highlight.Highlight;
import com.github.mikephil.chartingv2.interfaces.datasets.IPieDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class PieChartRenderer extends DataRenderer {
    protected Canvas mBitmapCanvas;
    private RectF mCenterTextLastBounds;
    private CharSequence mCenterTextLastValue;
    private StaticLayout mCenterTextLayout;
    private TextPaint mCenterTextPaint;
    protected PieChart mChart;
    protected WeakReference<Bitmap> mDrawBitmap;
    private Path mHoleCirclePath;
    protected Paint mHolePaint;
    private RectF mInnerRectBuffer;
    private Path mPathBuffer;
    private RectF[] mRectBuffer;
    protected Paint mTransparentCirclePaint;

    public PieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mCenterTextLastBounds = new RectF();
        this.mRectBuffer = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.mPathBuffer = new Path();
        this.mInnerRectBuffer = new RectF();
        this.mHoleCirclePath = new Path();
        this.mChart = pieChart;
        Paint paint = new Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        Paint paint2 = this.mHolePaint;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        Paint paint3 = new Paint(1);
        this.mTransparentCirclePaint = paint3;
        paint3.setColor(-1);
        this.mTransparentCirclePaint.setStyle(style);
        this.mTransparentCirclePaint.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(-16777216);
        this.mCenterTextPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
    }

    public float calculateMinimumRadiusForSpacedSlice(PointF pointF, float f14, float f15, float f16, float f17, float f18, float f19) {
        double d14 = (f18 + f19) * 0.017453292f;
        float fCos = (((float) Math.cos(d14)) * f14) + pointF.x;
        float fSin = (((float) Math.sin(d14)) * f14) + pointF.y;
        double d15 = ((f19 / 2.0f) + f18) * 0.017453292f;
        float fCos2 = (((float) Math.cos(d15)) * f14) + pointF.x;
        return (float) (((double) (f14 - ((float) (Math.tan(((180.0d - ((double) f15)) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(fSin - f17, 2.0d) + Math.pow(fCos - f16, 2.0d)) / 2.0d))))) - Math.sqrt(Math.pow(((((float) Math.sin(d15)) * f14) + pointF.y) - ((fSin + f17) / 2.0f), 2.0d) + Math.pow(fCos2 - ((fCos + f16) / 2.0f), 2.0d)));
    }

    public void drawCenterText(Canvas canvas) {
        float radius;
        CharSequence centerText = this.mChart.getCenterText();
        if (!this.mChart.isDrawCenterTextEnabled() || centerText == null) {
            return;
        }
        PointF centerCircleBox = this.mChart.getCenterCircleBox();
        if (!this.mChart.isDrawHoleEnabled() || this.mChart.isDrawSlicesUnderHoleEnabled()) {
            radius = this.mChart.getRadius();
        } else {
            radius = (this.mChart.getHoleRadius() / 100.0f) * this.mChart.getRadius();
        }
        RectF[] rectFArr = this.mRectBuffer;
        RectF rectF = rectFArr[0];
        float f14 = centerCircleBox.x;
        rectF.left = f14 - radius;
        float f15 = centerCircleBox.y;
        rectF.top = f15 - radius;
        rectF.right = f14 + radius;
        rectF.bottom = f15 + radius;
        RectF rectF2 = rectFArr[1];
        rectF2.set(rectF);
        float centerTextRadiusPercent = this.mChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF2.inset((rectF2.width() - (rectF2.width() * centerTextRadiusPercent)) / 2.0f, (rectF2.height() - (rectF2.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (!centerText.equals(this.mCenterTextLastValue) || !rectF2.equals(this.mCenterTextLastBounds)) {
            this.mCenterTextLastBounds.set(rectF2);
            this.mCenterTextLastValue = centerText;
            this.mCenterTextLayout = new StaticLayout(centerText, 0, centerText.length(), this.mCenterTextPaint, (int) Math.max(Math.ceil(this.mCenterTextLastBounds.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.mCenterTextLayout.getHeight();
        canvas.save();
        Path path = new Path();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, ((rectF2.height() - height) / 2.0f) + rectF2.top);
        this.mCenterTextLayout.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference == null || weakReference.get().getWidth() != chartWidth || this.mDrawBitmap.get().getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            this.mDrawBitmap = new WeakReference<>(Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444));
            this.mBitmapCanvas = new Canvas(this.mDrawBitmap.get());
        }
        this.mDrawBitmap.get().eraseColor(0);
        for (IPieDataSet iPieDataSet : ((PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        boolean z14;
        float fMax;
        PieChartRenderer pieChartRenderer = this;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = pieChartRenderer.mChart.getRotationAngle();
        float phaseX = pieChartRenderer.mAnimator.getPhaseX();
        float phaseY = pieChartRenderer.mAnimator.getPhaseY();
        RectF circleBox = pieChartRenderer.mChart.getCircleBox();
        int entryCount = iPieDataSet2.getEntryCount();
        float[] drawAngles = pieChartRenderer.mChart.getDrawAngles();
        PointF centerCircleBox = pieChartRenderer.mChart.getCenterCircleBox();
        float radius = pieChartRenderer.mChart.getRadius();
        boolean z15 = pieChartRenderer.mChart.isDrawHoleEnabled() && !pieChartRenderer.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z15 ? (pieChartRenderer.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        int i14 = 0;
        int i15 = 0;
        while (i14 < entryCount) {
            int i16 = i14;
            if (Math.abs(iPieDataSet2.getEntryForIndex(i14).getVal()) > 1.0E-6d) {
                i15++;
            }
            i14 = i16 + 1;
        }
        float sliceSpace = i15 <= 1 ? 0.0f : iPieDataSet2.getSliceSpace();
        float f22 = 0.0f;
        int i17 = 0;
        while (i17 < entryCount) {
            float f24 = drawAngles[i17];
            Entry entryForIndex = iPieDataSet2.getEntryForIndex(i17);
            float f25 = rotationAngle;
            float f26 = phaseX;
            if (Math.abs(entryForIndex.getVal()) <= 1.0E-6d || pieChartRenderer.mChart.needsHighlight(entryForIndex.getXIndex(), ((PieData) pieChartRenderer.mChart.getData()).getIndexOfDataSet(iPieDataSet2))) {
                f14 = holeRadius;
                i17 = i17;
                i15 = i15;
            } else {
                boolean z16 = sliceSpace > 0.0f && f24 <= 180.0f;
                pieChartRenderer.mRenderPaint.setColor(iPieDataSet2.getColor(i17));
                float f27 = i15 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f28 = (((f27 / 2.0f) + f22) * phaseY) + f25;
                float f29 = (f24 - f27) * phaseY;
                if (f29 < 0.0f) {
                    f29 = 0.0f;
                }
                pieChartRenderer.mPathBuffer.reset();
                float f34 = f29 % 360.0f;
                if (f34 == 0.0f) {
                    pieChartRenderer.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, radius, Path.Direction.CW);
                    f15 = radius;
                    f17 = 0.0f;
                    f16 = 0.0f;
                } else {
                    double d14 = f28 * 0.017453292f;
                    f15 = radius;
                    float fCos = (((float) Math.cos(d14)) * f15) + centerCircleBox.x;
                    float fSin = (((float) Math.sin(d14)) * f15) + centerCircleBox.y;
                    pieChartRenderer.mPathBuffer.moveTo(fCos, fSin);
                    pieChartRenderer.mPathBuffer.arcTo(circleBox, f28, f29);
                    f16 = fSin;
                    f17 = fCos;
                }
                RectF rectF = pieChartRenderer.mInnerRectBuffer;
                float f35 = centerCircleBox.x;
                float f36 = f35 - holeRadius;
                float f37 = centerCircleBox.y;
                PointF pointF = centerCircleBox;
                float f38 = f17;
                rectF.set(f36, f37 - holeRadius, f35 + holeRadius, f37 + holeRadius);
                if (!z15 || (holeRadius <= 0.0f && !z16)) {
                    float f39 = f15;
                    i15 = i15;
                    float f44 = f29;
                    f14 = holeRadius;
                    f18 = f39;
                    pieChartRenderer = this;
                    centerCircleBox = pointF;
                    if (f34 != 0.0f) {
                        if (z16 != 0) {
                            radius = f18;
                            float fCalculateMinimumRadiusForSpacedSlice = pieChartRenderer.calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f24 * phaseY, f38, f16, f28, f44);
                            double d15 = ((f44 / 2.0f) + f28) * 0.017453292f;
                            pieChartRenderer.mPathBuffer.lineTo((((float) Math.cos(d15)) * fCalculateMinimumRadiusForSpacedSlice) + centerCircleBox.x, (fCalculateMinimumRadiusForSpacedSlice * ((float) Math.sin(d15))) + centerCircleBox.y);
                        } else {
                            radius = f18;
                            pieChartRenderer.mPathBuffer.lineTo(centerCircleBox.x, centerCircleBox.y);
                        }
                    }
                    pieChartRenderer.mPathBuffer.close();
                    pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
                } else {
                    if (z16 != 0) {
                        pieChartRenderer = this;
                        f19 = f15;
                        centerCircleBox = pointF;
                        z14 = true;
                        float f45 = f29;
                        f14 = holeRadius;
                        float fCalculateMinimumRadiusForSpacedSlice2 = pieChartRenderer.calculateMinimumRadiusForSpacedSlice(centerCircleBox, f19, f24 * phaseY, f38, f16, f28, f45);
                        if (fCalculateMinimumRadiusForSpacedSlice2 < 0.0f) {
                            fCalculateMinimumRadiusForSpacedSlice2 = -fCalculateMinimumRadiusForSpacedSlice2;
                        }
                        fMax = Math.max(f14, fCalculateMinimumRadiusForSpacedSlice2);
                    } else {
                        pieChartRenderer = this;
                        f19 = f15;
                        f14 = holeRadius;
                        centerCircleBox = pointF;
                        z14 = true;
                        fMax = f14;
                    }
                    float f46 = (i15 == z14 || fMax == 0.0f) ? 0.0f : sliceSpace / (fMax * 0.017453292f);
                    float f47 = (((f46 / 2.0f) + f22) * phaseY) + f25;
                    float f48 = (f24 - f46) * phaseY;
                    if (f48 < 0.0f) {
                        f48 = 0.0f;
                    }
                    float f49 = f47 + f48;
                    Path path = pieChartRenderer.mPathBuffer;
                    if (f34 == 0.0f) {
                        path.addCircle(centerCircleBox.x, centerCircleBox.y, fMax, Path.Direction.CCW);
                        f18 = f19;
                    } else {
                        double d16 = f49 * 0.017453292f;
                        f18 = f19;
                        float f50 = fMax;
                        path.lineTo((f50 * ((float) Math.cos(d16))) + centerCircleBox.x, (((float) Math.sin(d16)) * f50) + centerCircleBox.y);
                        pieChartRenderer.mPathBuffer.arcTo(pieChartRenderer.mInnerRectBuffer, f49, -f48);
                    }
                }
                radius = f18;
                pieChartRenderer.mPathBuffer.close();
                pieChartRenderer.mBitmapCanvas.drawPath(pieChartRenderer.mPathBuffer, pieChartRenderer.mRenderPaint);
            }
            f22 = (f24 * f26) + f22;
            i17++;
            iPieDataSet2 = iPieDataSet;
            holeRadius = f14;
            i15 = i15;
            rotationAngle = f25;
            phaseX = f26;
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (Paint) null);
        drawCenterText(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        IPieDataSet dataSetByIndex;
        float f14;
        float f15;
        float f16;
        float f17;
        float fCalculateMinimumRadiusForSpacedSlice;
        float f18;
        float fMax;
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        PointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z14 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z14 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF = new RectF();
        int i14 = 0;
        while (i14 < highlightArr.length) {
            int xIndex = highlightArr[i14].getXIndex();
            if (xIndex < drawAngles.length && (dataSetByIndex = ((PieData) this.mChart.getData()).getDataSetByIndex(highlightArr[i14].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                int entryCount = dataSetByIndex.getEntryCount();
                int i15 = 0;
                int i16 = 0;
                while (i16 < entryCount) {
                    float f19 = radius;
                    float f22 = holeRadius;
                    if (Math.abs(dataSetByIndex.getEntryForIndex(i16).getVal()) > 1.0E-6d) {
                        i15++;
                    }
                    i16++;
                    holeRadius = f22;
                    radius = f19;
                }
                float f24 = radius;
                f14 = holeRadius;
                float f25 = xIndex == 0 ? 0.0f : absoluteAngles[xIndex - 1] * phaseX;
                float sliceSpace = i15 <= 1 ? 0.0f : dataSetByIndex.getSliceSpace();
                float f26 = drawAngles[xIndex];
                float selectionShift = dataSetByIndex.getSelectionShift();
                float f27 = f24 + selectionShift;
                rectF.set(this.mChart.getCircleBox());
                float f28 = -selectionShift;
                rectF.inset(f28, f28);
                boolean z15 = sliceSpace > 0.0f && f26 <= 180.0f;
                this.mRenderPaint.setColor(dataSetByIndex.getColor(xIndex));
                float f29 = i15 == 1 ? 0.0f : sliceSpace / (f24 * 0.017453292f);
                float f34 = i15 == 1 ? 0.0f : sliceSpace / (f27 * 0.017453292f);
                float f35 = (((f29 / 2.0f) + f25) * phaseY) + rotationAngle;
                float f36 = (f26 - f29) * phaseY;
                float f37 = f36 < 0.0f ? 0.0f : f36;
                float f38 = (((f34 / 2.0f) + f25) * phaseY) + rotationAngle;
                float f39 = (f26 - f34) * phaseY;
                if (f39 < 0.0f) {
                    f39 = 0.0f;
                }
                this.mPathBuffer.reset();
                float f44 = f37 % 360.0f;
                Path path = this.mPathBuffer;
                if (f44 == 0.0f) {
                    path.addCircle(centerCircleBox.x, centerCircleBox.y, f27, Path.Direction.CW);
                } else {
                    double d14 = f38 * 0.017453292f;
                    path.moveTo((((float) Math.cos(d14)) * f27) + centerCircleBox.x, (((float) Math.sin(d14)) * f27) + centerCircleBox.y);
                    this.mPathBuffer.arcTo(rectF, f38, f39);
                }
                if (z15) {
                    double d15 = f35 * 0.017453292f;
                    f15 = f24;
                    f16 = f35;
                    f17 = f37;
                    fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, f15, f26 * phaseY, (((float) Math.cos(d15)) * f24) + centerCircleBox.x, (((float) Math.sin(d15)) * f24) + centerCircleBox.y, f16, f17);
                } else {
                    f15 = f24;
                    f16 = f35;
                    f17 = f37;
                    fCalculateMinimumRadiusForSpacedSlice = 0.0f;
                }
                RectF rectF2 = this.mInnerRectBuffer;
                float f45 = centerCircleBox.x;
                f18 = f15;
                float f46 = f45 - f14;
                float f47 = centerCircleBox.y;
                float f48 = f47 - f14;
                float f49 = f16;
                float f50 = f45 + f14;
                float f54 = f17;
                rectF2.set(f46, f48, f50, f47 + f14);
                if (z14 && (f14 > 0.0f || z15)) {
                    if (z15) {
                        if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                            fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                        }
                        fMax = Math.max(f14, fCalculateMinimumRadiusForSpacedSlice);
                    } else {
                        fMax = f14;
                    }
                    float f55 = (i15 == 1 || fMax == 0.0f) ? 0.0f : sliceSpace / (fMax * 0.017453292f);
                    float f56 = (((f55 / 2.0f) + f25) * phaseY) + rotationAngle;
                    float f57 = (f26 - f55) * phaseY;
                    float f58 = f57 < 0.0f ? 0.0f : f57;
                    float f59 = f56 + f58;
                    Path path2 = this.mPathBuffer;
                    if (f44 == 0.0f) {
                        path2.addCircle(centerCircleBox.x, centerCircleBox.y, fMax, Path.Direction.CCW);
                    } else {
                        double d16 = f59 * 0.017453292f;
                        float f64 = fMax;
                        path2.lineTo((f64 * ((float) Math.cos(d16))) + centerCircleBox.x, (((float) Math.sin(d16)) * f64) + centerCircleBox.y);
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f59, -f58);
                    }
                } else if (f44 != 0.0f) {
                    if (z15) {
                        double d17 = ((f54 / 2.0f) + f49) * 0.017453292f;
                        this.mPathBuffer.lineTo((((float) Math.cos(d17)) * fCalculateMinimumRadiusForSpacedSlice) + centerCircleBox.x, (fCalculateMinimumRadiusForSpacedSlice * ((float) Math.sin(d17))) + centerCircleBox.y);
                    } else {
                        this.mPathBuffer.lineTo(centerCircleBox.x, centerCircleBox.y);
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
            } else {
                f18 = radius;
                phaseX = phaseX;
                phaseY = phaseY;
                f14 = holeRadius;
                rectF = rectF;
            }
            i14++;
            holeRadius = f14;
            rectF = rectF;
            radius = f18;
            phaseX = phaseX;
            phaseY = phaseY;
        }
    }

    public void drawHole(Canvas canvas) {
        if (this.mChart.isDrawHoleEnabled()) {
            float radius = this.mChart.getRadius();
            float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
            PointF centerCircleBox = this.mChart.getCenterCircleBox();
            if (Color.alpha(this.mHolePaint.getColor()) > 0) {
                this.mBitmapCanvas.drawCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, this.mHolePaint);
            }
            if (Color.alpha(this.mTransparentCirclePaint.getColor()) <= 0 || this.mChart.getTransparentCircleRadius() <= this.mChart.getHoleRadius()) {
                return;
            }
            int alpha = this.mTransparentCirclePaint.getAlpha();
            float transparentCircleRadius = (this.mChart.getTransparentCircleRadius() / 100.0f) * radius;
            this.mTransparentCirclePaint.setAlpha((int) (this.mAnimator.getPhaseY() * this.mAnimator.getPhaseX() * alpha));
            this.mHoleCirclePath.reset();
            this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, transparentCircleRadius, Path.Direction.CW);
            this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, Path.Direction.CCW);
            this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
            this.mTransparentCirclePaint.setAlpha(alpha);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void drawRoundedSlices(Canvas canvas) {
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            IPieDataSet dataSet = ((PieData) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                PointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i14 = 0;
                while (i14 < dataSet.getEntryCount()) {
                    float f14 = drawAngles[i14];
                    if (Math.abs(dataSet.getEntryForIndex(i14).getVal()) > 1.0E-6d) {
                        double d14 = radius - holeRadius;
                        double d15 = (rotationAngle + f14) * phaseY;
                        float fCos = (float) (((double) centerCircleBox.x) + (Math.cos(Math.toRadians(d15)) * d14));
                        float fSin = (float) ((Math.sin(Math.toRadians(d15)) * d14) + ((double) centerCircleBox.y));
                        this.mRenderPaint.setColor(dataSet.getColor(i14));
                        this.mBitmapCanvas.drawCircle(fCos, fSin, holeRadius, this.mRenderPaint);
                    }
                    rotationAngle += f14 * phaseX;
                    i14++;
                    phaseX = phaseX;
                    phaseY = phaseY;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        IPieDataSet iPieDataSet;
        int i14;
        int i15;
        int i16;
        PieChartRenderer pieChartRenderer = this;
        PointF centerCircleBox = pieChartRenderer.mChart.getCenterCircleBox();
        float radius = pieChartRenderer.mChart.getRadius();
        float rotationAngle = pieChartRenderer.mChart.getRotationAngle();
        float[] drawAngles = pieChartRenderer.mChart.getDrawAngles();
        float[] absoluteAngles = pieChartRenderer.mChart.getAbsoluteAngles();
        float phaseX = pieChartRenderer.mAnimator.getPhaseX();
        pieChartRenderer.mAnimator.getPhaseY();
        float holeRadius = (radius / 10.0f) * 3.6f;
        float f14 = 100.0f;
        float f15 = 2.0f;
        if (pieChartRenderer.mChart.isDrawHoleEnabled()) {
            holeRadius = (radius - (pieChartRenderer.mChart.getHoleRadius() * (radius / 100.0f))) / 2.0f;
        }
        float f16 = radius - holeRadius;
        PieData pieData = (PieData) pieChartRenderer.mChart.getData();
        List<IPieDataSet> dataSets = pieData.getDataSets();
        float yValueSum = pieData.getYValueSum();
        boolean zIsDrawSliceTextEnabled = pieChartRenderer.mChart.isDrawSliceTextEnabled();
        int i17 = 0;
        int i18 = 0;
        while (i17 < dataSets.size()) {
            IPieDataSet iPieDataSet2 = dataSets.get(i17);
            if (iPieDataSet2.isDrawValuesEnabled() || zIsDrawSliceTextEnabled) {
                pieChartRenderer.applyValueTextStyle(iPieDataSet2);
                float fConvertDpToPixel = Utils.convertDpToPixel(4.0f) + Utils.calcTextHeight(pieChartRenderer.mValuePaint, "Q");
                int entryCount = iPieDataSet2.getEntryCount();
                int iMin = Math.min((int) Math.ceil(entryCount * phaseX), entryCount);
                int i19 = i18;
                int i24 = 0;
                while (i24 < iMin) {
                    Entry entryForIndex = iPieDataSet2.getEntryForIndex(i24);
                    float f17 = f14;
                    float f18 = f15;
                    double d14 = f16;
                    float f19 = f16;
                    List<IPieDataSet> list = dataSets;
                    double sliceSpace = rotationAngle + ((drawAngles[i19] - ((iPieDataSet2.getSliceSpace() / (0.017453292f * f16)) / f15)) / f15) + (i19 == 0 ? 0.0f : absoluteAngles[i19 - 1] * phaseX);
                    float fCos = (float) ((Math.cos(Math.toRadians(sliceSpace)) * d14) + ((double) centerCircleBox.x));
                    float fSin = (float) ((Math.sin(Math.toRadians(sliceSpace)) * d14) + ((double) centerCircleBox.y));
                    float val = pieChartRenderer.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getVal() / yValueSum) * f17 : entryForIndex.getVal();
                    ValueFormatter valueFormatter = iPieDataSet2.getValueFormatter();
                    boolean zIsDrawValuesEnabled = iPieDataSet2.isDrawValuesEnabled();
                    if (zIsDrawSliceTextEnabled && zIsDrawValuesEnabled) {
                        i14 = i17;
                        i16 = i24;
                        iPieDataSet = iPieDataSet2;
                        i15 = iMin;
                        pieChartRenderer.drawValue(canvas, valueFormatter, val, entryForIndex, 0, fCos, fSin, iPieDataSet2.getValueTextColor(i24));
                        if (i16 < pieData.getXValCount()) {
                            canvas.drawText(pieData.getXVals().get(i16), fCos, fSin + fConvertDpToPixel, pieChartRenderer.mValuePaint);
                        }
                    } else {
                        int i25 = i24;
                        iPieDataSet = iPieDataSet2;
                        i14 = i17;
                        i15 = iMin;
                        float f22 = val;
                        if (zIsDrawSliceTextEnabled) {
                            if (i25 < pieData.getXValCount()) {
                                pieChartRenderer.mValuePaint.setColor(iPieDataSet.getValueTextColor(i25));
                                canvas.drawText(pieData.getXVals().get(i25), fCos, (fConvertDpToPixel / f18) + fSin, pieChartRenderer.mValuePaint);
                            }
                        } else if (zIsDrawValuesEnabled) {
                            i16 = i25;
                            pieChartRenderer.drawValue(canvas, valueFormatter, f22, entryForIndex, 0, fCos, fSin + (fConvertDpToPixel / f18), iPieDataSet.getValueTextColor(i25));
                        }
                        i16 = i25;
                    }
                    i19++;
                    i24 = i16 + 1;
                    pieChartRenderer = this;
                    iPieDataSet2 = iPieDataSet;
                    f16 = f19;
                    f14 = f17;
                    f15 = f18;
                    dataSets = list;
                    i17 = i14;
                    iMin = i15;
                }
                i18 = i19;
            }
            i17++;
            pieChartRenderer = this;
            f16 = f16;
            f14 = f14;
            f15 = f15;
            dataSets = dataSets;
        }
    }

    public TextPaint getPaintCenterText() {
        return this.mCenterTextPaint;
    }

    public Paint getPaintHole() {
        return this.mHolePaint;
    }

    public Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
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
}
