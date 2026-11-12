package com.github.mikephil.charting.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PieChartRenderer extends DataRenderer {
    protected Canvas mBitmapCanvas;
    private RectF mCenterTextLastBounds;
    private CharSequence mCenterTextLastValue;
    private StaticLayout mCenterTextLayout;
    private TextPaint mCenterTextPaint;
    protected PieChart mChart;
    protected WeakReference<Bitmap> mDrawBitmap;
    protected Path mDrawCenterTextPathBuffer;
    protected RectF mDrawHighlightedRectF;
    private Paint mEntryLabelsPaint;
    private Path mHoleCirclePath;
    protected Paint mHolePaint;
    private RectF mInnerRectBuffer;
    private Path mPathBuffer;
    private RectF[] mRectBuffer;
    protected Paint mTransparentCirclePaint;
    protected Paint mValueLinePaint;

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void initBuffers() {
    }

    public PieChartRenderer(PieChart pieChart, ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
        this.mCenterTextLastBounds = new RectF();
        this.mRectBuffer = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.mPathBuffer = new Path();
        this.mInnerRectBuffer = new RectF();
        this.mHoleCirclePath = new Path();
        this.mDrawCenterTextPathBuffer = new Path();
        this.mDrawHighlightedRectF = new RectF();
        this.mChart = pieChart;
        Paint paint = new Paint(1);
        this.mHolePaint = paint;
        paint.setColor(-1);
        this.mHolePaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.mTransparentCirclePaint = paint2;
        paint2.setColor(-1);
        this.mTransparentCirclePaint.setStyle(Paint.Style.FILL);
        this.mTransparentCirclePaint.setAlpha(105);
        TextPaint textPaint = new TextPaint(1);
        this.mCenterTextPaint = textPaint;
        textPaint.setColor(-16777216);
        this.mCenterTextPaint.setTextSize(Utils.convertDpToPixel(12.0f));
        this.mValuePaint.setTextSize(Utils.convertDpToPixel(13.0f));
        this.mValuePaint.setColor(-1);
        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.mEntryLabelsPaint = paint3;
        paint3.setColor(-1);
        this.mEntryLabelsPaint.setTextAlign(Paint.Align.CENTER);
        this.mEntryLabelsPaint.setTextSize(Utils.convertDpToPixel(13.0f));
        Paint paint4 = new Paint(1);
        this.mValueLinePaint = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    public Paint getPaintHole() {
        return this.mHolePaint;
    }

    public Paint getPaintTransparentCircle() {
        return this.mTransparentCirclePaint;
    }

    public TextPaint getPaintCenterText() {
        return this.mCenterTextPaint;
    }

    public Paint getPaintEntryLabels() {
        return this.mEntryLabelsPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawData(Canvas canvas) {
        int chartWidth = (int) this.mViewPortHandler.getChartWidth();
        int chartHeight = (int) this.mViewPortHandler.getChartHeight();
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != chartWidth || bitmapCreateBitmap.getHeight() != chartHeight) {
            if (chartWidth <= 0 || chartHeight <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(chartWidth, chartHeight, Bitmap.Config.ARGB_4444);
            this.mDrawBitmap = new WeakReference<>(bitmapCreateBitmap);
            this.mBitmapCanvas = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (IPieDataSet iPieDataSet : ((PieData) this.mChart.getData()).getDataSets()) {
            if (iPieDataSet.isVisible() && iPieDataSet.getEntryCount() > 0) {
                drawDataSet(canvas, iPieDataSet);
            }
        }
    }

    protected float calculateMinimumRadiusForSpacedSlice(MPPointF mPPointF, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float fCos = mPPointF.x + (((float) Math.cos(d)) * f);
        float fSin = mPPointF.y + (((float) Math.sin(d)) * f);
        double d2 = (f5 + (f6 / 2.0f)) * 0.017453292f;
        return (float) (((double) (f - ((float) ((Math.sqrt(Math.pow(fCos - f3, 2.0d) + Math.pow(fSin - f4, 2.0d)) / 2.0d) * Math.tan(((180.0d - ((double) f2)) / 2.0d) * 0.017453292519943295d))))) - Math.sqrt(Math.pow((mPPointF.x + (((float) Math.cos(d2)) * f)) - ((fCos + f3) / 2.0f), 2.0d) + Math.pow((mPPointF.y + (((float) Math.sin(d2)) * f)) - ((fSin + f4) / 2.0f), 2.0d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected float getSliceSpace(IPieDataSet iPieDataSet) {
        if (!iPieDataSet.isAutomaticallyDisableSliceSpacingEnabled()) {
            return iPieDataSet.getSliceSpace();
        }
        if (iPieDataSet.getSliceSpace() / this.mViewPortHandler.getSmallestContentExtension() > (iPieDataSet.getYMin() / ((PieData) this.mChart.getData()).getYValueSum()) * 2.0f) {
            return 0.0f;
        }
        return iPieDataSet.getSliceSpace();
    }

    protected void drawDataSet(Canvas canvas, IPieDataSet iPieDataSet) {
        RectF rectF;
        float f;
        float f2;
        boolean z;
        float fMax;
        MPPointF mPPointF;
        IPieDataSet iPieDataSet2 = iPieDataSet;
        float rotationAngle = this.mChart.getRotationAngle();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        RectF circleBox = this.mChart.getCircleBox();
        int entryCount = iPieDataSet.getEntryCount();
        float[] drawAngles = this.mChart.getDrawAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        boolean z2 = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        float holeRadius = z2 ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        float holeRadius2 = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        RectF rectF2 = new RectF();
        boolean z3 = z2 && this.mChart.isDrawRoundedSlicesEnabled();
        int i = 0;
        for (int i2 = 0; i2 < entryCount; i2++) {
            if (Math.abs(iPieDataSet2.getEntryForIndex(i2).getY()) > Utils.FLOAT_EPSILON) {
                i++;
            }
        }
        float sliceSpace = i <= 1 ? 0.0f : getSliceSpace(iPieDataSet2);
        int i3 = 0;
        float f3 = 0.0f;
        while (i3 < entryCount) {
            float f4 = drawAngles[i3];
            if (Math.abs(iPieDataSet2.getEntryForIndex(i3).getY()) > Utils.FLOAT_EPSILON && !(iPieDataSet.isHighlightEnabled() && this.mChart.needsHighlight(i3) && !z3)) {
                boolean z4 = sliceSpace > 0.0f && f4 <= 180.0f;
                this.mRenderPaint.setColor(iPieDataSet2.getColor(i3));
                float f5 = i == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f6 = rotationAngle + ((f3 + (f5 / 2.0f)) * phaseY);
                float f7 = (f4 - f5) * phaseY;
                float f8 = f7 < 0.0f ? 0.0f : f7;
                this.mPathBuffer.reset();
                if (z3) {
                    float f9 = radius - holeRadius2;
                    double d = f6 * 0.017453292f;
                    float fCos = centerCircleBox.x + (((float) Math.cos(d)) * f9);
                    float fSin = centerCircleBox.y + (f9 * ((float) Math.sin(d)));
                    rectF2.set(fCos - holeRadius2, fSin - holeRadius2, fCos + holeRadius2, fSin + holeRadius2);
                }
                double d2 = f6 * 0.017453292f;
                f = holeRadius;
                float fCos2 = (((float) Math.cos(d2)) * radius) + centerCircleBox.x;
                float fSin2 = centerCircleBox.y + (((float) Math.sin(d2)) * radius);
                if (f8 >= 360.0f && f8 % 360.0f <= Utils.FLOAT_EPSILON) {
                    this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, radius, Path.Direction.CW);
                } else {
                    if (z3) {
                        this.mPathBuffer.arcTo(rectF2, f6 + 180.0f, -180.0f);
                    }
                    this.mPathBuffer.arcTo(circleBox, f6, f8);
                }
                rectF = rectF2;
                this.mInnerRectBuffer.set(centerCircleBox.x - f, centerCircleBox.y - f, centerCircleBox.x + f, centerCircleBox.y + f);
                if (z2) {
                    if (f > 0.0f || z4) {
                        if (z4) {
                            f = f;
                            z = true;
                            float fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f4 * phaseY, fCos2, fSin2, f6, f8);
                            if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                                fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                            }
                            fMax = Math.max(f, fCalculateMinimumRadiusForSpacedSlice);
                        } else {
                            f = f;
                            z = true;
                            fMax = f;
                        }
                        float f10 = (i == z || fMax == 0.0f) ? 0.0f : sliceSpace / (fMax * 0.017453292f);
                        float f11 = f10 / 2.0f;
                        float f12 = (f4 - f10) * phaseY;
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        float f13 = rotationAngle + ((f3 + f11) * phaseY) + f12;
                        if (f8 >= 360.0f && f8 % 360.0f <= Utils.FLOAT_EPSILON) {
                            this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, fMax, Path.Direction.CCW);
                            mPPointF = centerCircleBox;
                            rectF = rectF;
                        } else {
                            if (z3) {
                                float f14 = radius - holeRadius2;
                                double d3 = 0.017453292f * f13;
                                mPPointF = centerCircleBox;
                                float fCos3 = centerCircleBox.x + (((float) Math.cos(d3)) * f14);
                                float fSin3 = mPPointF.y + (((float) Math.sin(d3)) * f14);
                                rectF = rectF;
                                rectF.set(fCos3 - holeRadius2, fSin3 - holeRadius2, fCos3 + holeRadius2, fSin3 + holeRadius2);
                                this.mPathBuffer.arcTo(rectF, f13, 180.0f);
                            } else {
                                mPPointF = centerCircleBox;
                                rectF = rectF;
                                double d4 = f13 * 0.017453292f;
                                this.mPathBuffer.lineTo(mPPointF.x + (((float) Math.cos(d4)) * fMax), mPPointF.y + (fMax * ((float) Math.sin(d4))));
                            }
                            this.mPathBuffer.arcTo(this.mInnerRectBuffer, f13, -f12);
                        }
                        centerCircleBox = mPPointF;
                    } else {
                        f2 = 360.0f;
                    }
                    this.mPathBuffer.close();
                    this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                    f3 += f4 * phaseX;
                } else {
                    f2 = 360.0f;
                }
                if (f8 % f2 > Utils.FLOAT_EPSILON) {
                    if (z4) {
                        float fCalculateMinimumRadiusForSpacedSlice2 = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f4 * phaseY, fCos2, fSin2, f6, f8);
                        double d5 = (f6 + (f8 / 2.0f)) * 0.017453292f;
                        this.mPathBuffer.lineTo(centerCircleBox.x + (((float) Math.cos(d5)) * fCalculateMinimumRadiusForSpacedSlice2), centerCircleBox.y + (fCalculateMinimumRadiusForSpacedSlice2 * ((float) Math.sin(d5))));
                    } else {
                        this.mPathBuffer.lineTo(centerCircleBox.x, centerCircleBox.y);
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
                f3 += f4 * phaseX;
            } else {
                f3 += f4 * phaseX;
                i3 = i3;
                radius = radius;
                rotationAngle = rotationAngle;
                phaseX = phaseX;
                circleBox = circleBox;
                drawAngles = drawAngles;
                i = i;
                rectF = rectF2;
                f = holeRadius;
                centerCircleBox = centerCircleBox;
            }
            i3++;
            iPieDataSet2 = iPieDataSet;
            holeRadius = f;
            rectF2 = rectF;
            centerCircleBox = centerCircleBox;
            i = i;
            radius = radius;
            entryCount = entryCount;
            circleBox = circleBox;
            rotationAngle = rotationAngle;
            phaseX = phaseX;
            drawAngles = drawAngles;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawValues(Canvas canvas) {
        int i;
        List<IPieDataSet> list;
        float f;
        float[] fArr;
        float[] fArr2;
        float f2;
        MPPointF mPPointF;
        boolean zIsDrawValuesEnabled;
        float f3;
        PieDataSet.ValuePosition valuePosition;
        MPPointF mPPointF2;
        float f4;
        float f5;
        float f6;
        int color;
        String str;
        PieDataSet.ValuePosition valuePosition2;
        MPPointF mPPointF3;
        IPieDataSet iPieDataSet;
        MPPointF mPPointF4;
        float f7;
        MPPointF mPPointF5;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
        float holeRadius2 = this.mChart.getHoleRadius() / 100.0f;
        float f8 = (radius / 10.0f) * 3.6f;
        if (this.mChart.isDrawHoleEnabled()) {
            f8 = (radius - (radius * holeRadius2)) / 2.0f;
            if (!this.mChart.isDrawSlicesUnderHoleEnabled() && this.mChart.isDrawRoundedSlicesEnabled()) {
                rotationAngle = (float) (((double) rotationAngle) + (((double) (holeRadius * 360.0f)) / (((double) radius) * 6.283185307179586d)));
            }
        }
        float f9 = rotationAngle;
        float f10 = radius - f8;
        PieData pieData = (PieData) this.mChart.getData();
        List<IPieDataSet> dataSets = pieData.getDataSets();
        float yValueSum = pieData.getYValueSum();
        boolean zIsDrawEntryLabelsEnabled = this.mChart.isDrawEntryLabelsEnabled();
        canvas.save();
        float fConvertDpToPixel = Utils.convertDpToPixel(5.0f);
        int i2 = 0;
        int i3 = 0;
        while (i3 < dataSets.size()) {
            IPieDataSet iPieDataSet2 = dataSets.get(i3);
            if (iPieDataSet2.getEntryCount() != 0 && ((zIsDrawValuesEnabled = iPieDataSet2.isDrawValuesEnabled()) || zIsDrawEntryLabelsEnabled)) {
                PieDataSet.ValuePosition xValuePosition = iPieDataSet2.getXValuePosition();
                PieDataSet.ValuePosition yValuePosition = iPieDataSet2.getYValuePosition();
                applyValueTextStyle(iPieDataSet2);
                float fCalcTextHeight = Utils.calcTextHeight(this.mValuePaint, "Q") + Utils.convertDpToPixel(4.0f);
                IValueFormatter valueFormatter = iPieDataSet2.getValueFormatter();
                int entryCount = iPieDataSet2.getEntryCount();
                boolean zIsUseValueColorForLineEnabled = iPieDataSet2.isUseValueColorForLineEnabled();
                int valueLineColor = iPieDataSet2.getValueLineColor();
                int i4 = i2;
                this.mValueLinePaint.setStrokeWidth(Utils.convertDpToPixel(iPieDataSet2.getValueLineWidth()));
                float sliceSpace = getSliceSpace(iPieDataSet2);
                MPPointF mPPointF6 = MPPointF.getInstance(iPieDataSet2.getIconsOffset());
                mPPointF6.x = Utils.convertDpToPixel(mPPointF6.x);
                mPPointF6.y = Utils.convertDpToPixel(mPPointF6.y);
                int i5 = 0;
                while (i5 < entryCount) {
                    PieEntry entryForIndex = iPieDataSet2.getEntryForIndex(i5);
                    MPPointF mPPointF7 = mPPointF6;
                    float f11 = f9 + (((i4 == 0 ? 0.0f : absoluteAngles[i4 - 1] * phaseX) + ((drawAngles[i4] - ((sliceSpace / (f10 * 0.017453292f)) / 2.0f)) / 2.0f)) * phaseY);
                    int i6 = entryCount;
                    float y = this.mChart.isUsePercentValuesEnabled() ? (entryForIndex.getY() / yValueSum) * 100.0f : entryForIndex.getY();
                    String label = entryForIndex.getLabel();
                    int i7 = i3;
                    List<IPieDataSet> list2 = dataSets;
                    double d = f11 * 0.017453292f;
                    float[] fArr3 = drawAngles;
                    float[] fArr4 = absoluteAngles;
                    float fCos = (float) Math.cos(d);
                    float f12 = phaseX;
                    float fSin = (float) Math.sin(d);
                    boolean z = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z2 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.OUTSIDE_SLICE;
                    boolean z3 = zIsDrawEntryLabelsEnabled && xValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    boolean z4 = zIsDrawValuesEnabled && yValuePosition == PieDataSet.ValuePosition.INSIDE_SLICE;
                    if (z || z2) {
                        float valueLinePart1Length = iPieDataSet2.getValueLinePart1Length();
                        float valueLinePart2Length = iPieDataSet2.getValueLinePart2Length();
                        float valueLinePart1OffsetPercentage = iPieDataSet2.getValueLinePart1OffsetPercentage() / 100.0f;
                        PieDataSet.ValuePosition valuePosition3 = yValuePosition;
                        if (this.mChart.isDrawHoleEnabled()) {
                            float f13 = radius * holeRadius2;
                            f3 = ((radius - f13) * valueLinePart1OffsetPercentage) + f13;
                        } else {
                            f3 = radius * valueLinePart1OffsetPercentage;
                        }
                        float fAbs = iPieDataSet2.isValueLineVariableLength() ? valueLinePart2Length * f10 * ((float) Math.abs(Math.sin(d))) : valueLinePart2Length * f10;
                        float f14 = centerCircleBox.x;
                        float f15 = centerCircleBox.y;
                        float f16 = (valueLinePart1Length + 1.0f) * f10;
                        valuePosition = xValuePosition;
                        float f17 = (f16 * fCos) + centerCircleBox.x;
                        float f18 = centerCircleBox.y + (f16 * fSin);
                        mPPointF2 = centerCircleBox;
                        f4 = radius;
                        double d2 = ((double) f11) % 360.0d;
                        if (d2 >= 90.0d && d2 <= 270.0d) {
                            float f19 = f17 - fAbs;
                            this.mValuePaint.setTextAlign(Paint.Align.RIGHT);
                            if (z) {
                                this.mEntryLabelsPaint.setTextAlign(Paint.Align.RIGHT);
                            }
                            f5 = f19;
                            f6 = f19 - fConvertDpToPixel;
                        } else {
                            f5 = f17 + fAbs;
                            this.mValuePaint.setTextAlign(Paint.Align.LEFT);
                            if (z) {
                                this.mEntryLabelsPaint.setTextAlign(Paint.Align.LEFT);
                            }
                            f6 = f5 + fConvertDpToPixel;
                        }
                        if (zIsUseValueColorForLineEnabled) {
                            color = iPieDataSet2.getColor(i5);
                        } else {
                            color = valueLineColor != 1122867 ? valueLineColor : 1122867;
                        }
                        if (color != 1122867) {
                            this.mValueLinePaint.setColor(color);
                            valuePosition2 = valuePosition3;
                            str = label;
                            canvas.drawLine((f3 * fCos) + f14, (f3 * fSin) + f15, f17, f18, this.mValueLinePaint);
                            canvas.drawLine(f17, f18, f5, f18, this.mValueLinePaint);
                        } else {
                            str = label;
                            valuePosition2 = valuePosition3;
                        }
                        if (z && z2) {
                            IPieDataSet iPieDataSet3 = iPieDataSet2;
                            mPPointF3 = mPPointF7;
                            drawValue(canvas, valueFormatter, y, entryForIndex, 0, f6, f18, iPieDataSet2.getValueTextColor(i5));
                            if (i5 < pieData.getEntryCount() && str != null) {
                                drawEntryLabel(canvas, str, f6, f18 + fCalcTextHeight);
                            }
                            iPieDataSet = iPieDataSet3;
                        } else {
                            IPieDataSet iPieDataSet4 = iPieDataSet2;
                            mPPointF3 = mPPointF7;
                            if (z) {
                                if (i5 < pieData.getEntryCount() && str != null) {
                                    drawEntryLabel(canvas, str, f6, f18 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z2) {
                                float f20 = f6;
                                iPieDataSet = iPieDataSet4;
                                drawValue(canvas, valueFormatter, y, entryForIndex, 0, f20, (fCalcTextHeight / 2.0f) + f18, iPieDataSet4.getValueTextColor(i5));
                            }
                            iPieDataSet = iPieDataSet4;
                        }
                    } else {
                        valuePosition = xValuePosition;
                        mPPointF2 = centerCircleBox;
                        f4 = radius;
                        fSin = fSin;
                        mPPointF3 = mPPointF7;
                        str = label;
                        i5 = i5;
                        valueLineColor = valueLineColor;
                        valuePosition2 = yValuePosition;
                        iPieDataSet = iPieDataSet2;
                    }
                    if (z3 || z4) {
                        mPPointF4 = mPPointF2;
                        float f21 = (f10 * fCos) + mPPointF4.x;
                        float f22 = (f10 * fSin) + mPPointF4.y;
                        this.mValuePaint.setTextAlign(Paint.Align.CENTER);
                        if (z3 && z4) {
                            f7 = fCos;
                            drawValue(canvas, valueFormatter, y, entryForIndex, 0, f21, f22, iPieDataSet.getValueTextColor(i5));
                            if (i5 < pieData.getEntryCount() && str != null) {
                                drawEntryLabel(canvas, str, f21, f22 + fCalcTextHeight);
                            }
                        } else {
                            f7 = fCos;
                            if (z3) {
                                if (i5 < pieData.getEntryCount() && str != null) {
                                    drawEntryLabel(canvas, str, f21, f22 + (fCalcTextHeight / 2.0f));
                                }
                            } else if (z4) {
                                drawValue(canvas, valueFormatter, y, entryForIndex, 0, f21, f22 + (fCalcTextHeight / 2.0f), iPieDataSet.getValueTextColor(i5));
                            }
                        }
                    } else {
                        f7 = fCos;
                        mPPointF4 = mPPointF2;
                    }
                    if (entryForIndex.getIcon() == null || !iPieDataSet.isDrawIconsEnabled()) {
                        mPPointF5 = mPPointF3;
                    } else {
                        Drawable icon = entryForIndex.getIcon();
                        mPPointF5 = mPPointF3;
                        Utils.drawImage(canvas, icon, (int) (((f10 + mPPointF5.y) * f7) + mPPointF4.x), (int) (((f10 + mPPointF5.y) * fSin) + mPPointF4.y + mPPointF5.x), icon.getIntrinsicWidth(), icon.getIntrinsicHeight());
                    }
                    i4++;
                    i5++;
                    mPPointF6 = mPPointF5;
                    iPieDataSet2 = iPieDataSet;
                    centerCircleBox = mPPointF4;
                    entryCount = i6;
                    valueLineColor = valueLineColor;
                    dataSets = list2;
                    yValuePosition = valuePosition2;
                    i3 = i7;
                    drawAngles = fArr3;
                    absoluteAngles = fArr4;
                    phaseX = f12;
                    xValuePosition = valuePosition;
                    radius = f4;
                }
                i = i3;
                list = dataSets;
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                mPPointF = centerCircleBox;
                MPPointF.recycleInstance(mPPointF6);
                i2 = i4;
            } else {
                i = i3;
                list = dataSets;
                f = radius;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                f2 = phaseX;
                mPPointF = centerCircleBox;
            }
            i3 = i + 1;
            centerCircleBox = mPPointF;
            dataSets = list;
            drawAngles = fArr;
            absoluteAngles = fArr2;
            phaseX = f2;
            radius = f;
        }
        MPPointF.recycleInstance(centerCircleBox);
        canvas.restore();
    }

    protected void drawEntryLabel(Canvas canvas, String str, float f, float f2) {
        canvas.drawText(str, f, f2, this.mEntryLabelsPaint);
    }

    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawExtras(Canvas canvas) {
        drawHole(canvas);
        canvas.drawBitmap(this.mDrawBitmap.get(), 0.0f, 0.0f, (Paint) null);
        drawCenterText(canvas);
    }

    protected void drawHole(Canvas canvas) {
        if (!this.mChart.isDrawHoleEnabled() || this.mBitmapCanvas == null) {
            return;
        }
        float radius = this.mChart.getRadius();
        float holeRadius = (this.mChart.getHoleRadius() / 100.0f) * radius;
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        if (Color.alpha(this.mHolePaint.getColor()) > 0) {
            this.mBitmapCanvas.drawCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, this.mHolePaint);
        }
        if (Color.alpha(this.mTransparentCirclePaint.getColor()) > 0 && this.mChart.getTransparentCircleRadius() > this.mChart.getHoleRadius()) {
            int alpha = this.mTransparentCirclePaint.getAlpha();
            float transparentCircleRadius = this.mChart.getTransparentCircleRadius() / 100.0f;
            this.mTransparentCirclePaint.setAlpha((int) (alpha * this.mAnimator.getPhaseX() * this.mAnimator.getPhaseY()));
            this.mHoleCirclePath.reset();
            this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, radius * transparentCircleRadius, Path.Direction.CW);
            this.mHoleCirclePath.addCircle(centerCircleBox.x, centerCircleBox.y, holeRadius, Path.Direction.CCW);
            this.mBitmapCanvas.drawPath(this.mHoleCirclePath, this.mTransparentCirclePaint);
            this.mTransparentCirclePaint.setAlpha(alpha);
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    protected void drawCenterText(Canvas canvas) {
        float radius;
        CharSequence centerText = this.mChart.getCenterText();
        if (!this.mChart.isDrawCenterTextEnabled() || centerText == null) {
            return;
        }
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        MPPointF centerTextOffset = this.mChart.getCenterTextOffset();
        float f = centerCircleBox.x + centerTextOffset.x;
        float f2 = centerCircleBox.y + centerTextOffset.y;
        if (this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled()) {
            radius = this.mChart.getRadius() * (this.mChart.getHoleRadius() / 100.0f);
        } else {
            radius = this.mChart.getRadius();
        }
        RectF rectF = this.mRectBuffer[0];
        rectF.left = f - radius;
        rectF.top = f2 - radius;
        rectF.right = f + radius;
        rectF.bottom = f2 + radius;
        RectF rectF2 = this.mRectBuffer[1];
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
        Path path = this.mDrawCenterTextPathBuffer;
        path.reset();
        path.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(rectF2.left, rectF2.top + ((rectF2.height() - height) / 2.0f));
        this.mCenterTextLayout.draw(canvas);
        canvas.restore();
        MPPointF.recycleInstance(centerCircleBox);
        MPPointF.recycleInstance(centerTextOffset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.DataRenderer
    public void drawHighlighted(Canvas canvas, Highlight[] highlightArr) {
        MPPointF mPPointF;
        IPieDataSet dataSetByIndex;
        float f;
        int i;
        float fCalculateMinimumRadiusForSpacedSlice;
        float fMax;
        boolean z = this.mChart.isDrawHoleEnabled() && !this.mChart.isDrawSlicesUnderHoleEnabled();
        if (z && this.mChart.isDrawRoundedSlicesEnabled()) {
            return;
        }
        float phaseX = this.mAnimator.getPhaseX();
        float phaseY = this.mAnimator.getPhaseY();
        float rotationAngle = this.mChart.getRotationAngle();
        float[] drawAngles = this.mChart.getDrawAngles();
        float[] absoluteAngles = this.mChart.getAbsoluteAngles();
        MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
        float radius = this.mChart.getRadius();
        float holeRadius = z ? (this.mChart.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF = this.mDrawHighlightedRectF;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i2 = 0;
        while (i2 < highlightArr.length) {
            int x = (int) highlightArr[i2].getX();
            if (x < drawAngles.length && (dataSetByIndex = ((PieData) this.mChart.getData()).getDataSetByIndex(highlightArr[i2].getDataSetIndex())) != null && dataSetByIndex.isHighlightEnabled()) {
                int entryCount = dataSetByIndex.getEntryCount();
                int i3 = 0;
                for (int i4 = 0; i4 < entryCount; i4++) {
                    if (Math.abs(dataSetByIndex.getEntryForIndex(i4).getY()) > Utils.FLOAT_EPSILON) {
                        i3++;
                    }
                }
                if (x == 0) {
                    i = 1;
                    f = 0.0f;
                } else {
                    f = absoluteAngles[x - 1] * phaseX;
                    i = 1;
                }
                float sliceSpace = i3 <= i ? 0.0f : dataSetByIndex.getSliceSpace();
                float f2 = drawAngles[x];
                float selectionShift = dataSetByIndex.getSelectionShift();
                float f3 = radius + selectionShift;
                rectF.set(this.mChart.getCircleBox());
                float f4 = -selectionShift;
                rectF.inset(f4, f4);
                boolean z2 = sliceSpace > 0.0f && f2 <= 180.0f;
                Integer highlightColor = dataSetByIndex.getHighlightColor();
                if (highlightColor == null) {
                    highlightColor = Integer.valueOf(dataSetByIndex.getColor(x));
                }
                this.mRenderPaint.setColor(highlightColor.intValue());
                float f5 = i3 == 1 ? 0.0f : sliceSpace / (radius * 0.017453292f);
                float f6 = i3 == 1 ? 0.0f : sliceSpace / (f3 * 0.017453292f);
                float f7 = (((f5 / 2.0f) + f) * phaseY) + rotationAngle;
                float f8 = (f2 - f5) * phaseY;
                float f9 = f8 < 0.0f ? 0.0f : f8;
                float f10 = (((f6 / 2.0f) + f) * phaseY) + rotationAngle;
                float f11 = (f2 - f6) * phaseY;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                this.mPathBuffer.reset();
                if (f9 >= 360.0f && f9 % 360.0f <= Utils.FLOAT_EPSILON) {
                    this.mPathBuffer.addCircle(centerCircleBox.x, centerCircleBox.y, f3, Path.Direction.CW);
                } else {
                    double d = f10 * 0.017453292f;
                    this.mPathBuffer.moveTo(centerCircleBox.x + (((float) Math.cos(d)) * f3), centerCircleBox.y + (((float) Math.sin(d)) * f3));
                    this.mPathBuffer.arcTo(rectF, f10, f11);
                }
                if (z2) {
                    double d2 = f7 * 0.017453292f;
                    mPPointF = centerCircleBox;
                    fCalculateMinimumRadiusForSpacedSlice = calculateMinimumRadiusForSpacedSlice(centerCircleBox, radius, f2 * phaseY, (((float) Math.cos(d2)) * radius) + centerCircleBox.x, centerCircleBox.y + (((float) Math.sin(d2)) * radius), f7, f9);
                } else {
                    mPPointF = centerCircleBox;
                    fCalculateMinimumRadiusForSpacedSlice = 0.0f;
                }
                this.mInnerRectBuffer.set(mPPointF.x - r23, mPPointF.y - r23, mPPointF.x + r23, mPPointF.y + r23);
                if (z != 0 && (r23 > 0.0f || z2)) {
                    if (z2) {
                        if (fCalculateMinimumRadiusForSpacedSlice < 0.0f) {
                            fCalculateMinimumRadiusForSpacedSlice = -fCalculateMinimumRadiusForSpacedSlice;
                        }
                        fMax = Math.max(r23, fCalculateMinimumRadiusForSpacedSlice);
                    } else {
                        fMax = r23;
                    }
                    float f12 = (i3 == 1 || fMax == 0.0f) ? 0.0f : sliceSpace / (fMax * 0.017453292f);
                    float f13 = f12 / 2.0f;
                    float f14 = (f2 - f12) * phaseY;
                    if (f14 < 0.0f) {
                        f14 = 0.0f;
                    }
                    float f15 = ((f + f13) * phaseY) + rotationAngle + f14;
                    if (f9 >= 360.0f && f9 % 360.0f <= Utils.FLOAT_EPSILON) {
                        this.mPathBuffer.addCircle(mPPointF.x, mPPointF.y, fMax, Path.Direction.CCW);
                    } else {
                        double d3 = f15 * 0.017453292f;
                        this.mPathBuffer.lineTo(mPPointF.x + (((float) Math.cos(d3)) * fMax), mPPointF.y + (fMax * ((float) Math.sin(d3))));
                        this.mPathBuffer.arcTo(this.mInnerRectBuffer, f15, -f14);
                    }
                } else if (f9 % 360.0f > Utils.FLOAT_EPSILON) {
                    if (z2) {
                        double d4 = (f7 + (f9 / 2.0f)) * 0.017453292f;
                        this.mPathBuffer.lineTo(mPPointF.x + (((float) Math.cos(d4)) * fCalculateMinimumRadiusForSpacedSlice), mPPointF.y + (fCalculateMinimumRadiusForSpacedSlice * ((float) Math.sin(d4))));
                    } else {
                        this.mPathBuffer.lineTo(mPPointF.x, mPPointF.y);
                    }
                }
                this.mPathBuffer.close();
                this.mBitmapCanvas.drawPath(this.mPathBuffer, this.mRenderPaint);
            } else {
                rectF = rectF;
                drawAngles = drawAngles;
                z = z;
                mPPointF = centerCircleBox;
            }
            i2++;
            rectF = rectF;
            holeRadius = holeRadius;
            centerCircleBox = mPPointF;
            drawAngles = drawAngles;
            z = z;
        }
        MPPointF.recycleInstance(centerCircleBox);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void drawRoundedSlices(Canvas canvas) {
        if (this.mChart.isDrawRoundedSlicesEnabled()) {
            IPieDataSet dataSet = ((PieData) this.mChart.getData()).getDataSet();
            if (dataSet.isVisible()) {
                float phaseX = this.mAnimator.getPhaseX();
                float phaseY = this.mAnimator.getPhaseY();
                MPPointF centerCircleBox = this.mChart.getCenterCircleBox();
                float radius = this.mChart.getRadius();
                float holeRadius = (radius - ((this.mChart.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                float[] drawAngles = this.mChart.getDrawAngles();
                float rotationAngle = this.mChart.getRotationAngle();
                int i = 0;
                while (i < dataSet.getEntryCount()) {
                    float f = drawAngles[i];
                    if (Math.abs(dataSet.getEntryForIndex(i).getY()) > Utils.FLOAT_EPSILON) {
                        double d = radius - holeRadius;
                        double d2 = (rotationAngle + f) * phaseY;
                        float fCos = (float) (((double) centerCircleBox.x) + (Math.cos(Math.toRadians(d2)) * d));
                        float fSin = (float) ((d * Math.sin(Math.toRadians(d2))) + ((double) centerCircleBox.y));
                        this.mRenderPaint.setColor(dataSet.getColor(i));
                        this.mBitmapCanvas.drawCircle(fCos, fSin, holeRadius, this.mRenderPaint);
                    }
                    rotationAngle += f * phaseX;
                    i++;
                    phaseY = phaseY;
                    drawAngles = drawAngles;
                }
                MPPointF.recycleInstance(centerCircleBox);
            }
        }
    }

    public void releaseBitmap() {
        Canvas canvas = this.mBitmapCanvas;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.mBitmapCanvas = null;
        }
        WeakReference<Bitmap> weakReference = this.mDrawBitmap;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mDrawBitmap.clear();
            this.mDrawBitmap = null;
        }
    }
}
