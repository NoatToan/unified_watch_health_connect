package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class YAxisRendererHorizontalBarChart extends YAxisRenderer {
    protected Path mDrawZeroLinePathBuffer;
    protected float[] mRenderLimitLinesBuffer;
    protected Path mRenderLimitLinesPathBuffer;

    public YAxisRendererHorizontalBarChart(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        this.mDrawZeroLinePathBuffer = new Path();
        this.mRenderLimitLinesPathBuffer = new Path();
        this.mRenderLimitLinesBuffer = new float[4];
        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxis(float f14, float f15, boolean z14) {
        float f16;
        double d14;
        if (this.mViewPortHandler.contentHeight() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutX()) {
            MPPointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            MPPointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop());
            if (z14) {
                f16 = (float) valuesByTouchPoint2.f52826x;
                d14 = valuesByTouchPoint.f52826x;
            } else {
                f16 = (float) valuesByTouchPoint.f52826x;
                d14 = valuesByTouchPoint2.f52826x;
            }
            float f17 = (float) d14;
            MPPointD.recycleInstance(valuesByTouchPoint);
            MPPointD.recycleInstance(valuesByTouchPoint2);
            f14 = f16;
            f15 = f17;
        }
        computeAxisValues(f14, f15);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f14, float[] fArr, float f15) {
        this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
        this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
        boolean zIsDrawTopYLabelEntryEnabled = this.mYAxis.isDrawTopYLabelEntryEnabled();
        YAxis yAxis = this.mYAxis;
        int i14 = zIsDrawTopYLabelEntryEnabled ? yAxis.mEntryCount : yAxis.mEntryCount - 1;
        for (int i15 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i15 < i14; i15++) {
            canvas.drawText(this.mYAxis.getFormattedLabel(i15), fArr[i15 * 2], f14 - f15, this.mAxisLabelPaint);
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public void drawZeroLine(Canvas canvas) {
        int iSave = canvas.save();
        this.mZeroLineClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mZeroLineClippingRect.inset(-this.mYAxis.getZeroLineWidth(), 0.0f);
        canvas.clipRect(this.mLimitLineClippingRect);
        MPPointD pixelForValues = this.mTrans.getPixelForValues(0.0f, 0.0f);
        this.mZeroLinePaint.setColor(this.mYAxis.getZeroLineColor());
        this.mZeroLinePaint.setStrokeWidth(this.mYAxis.getZeroLineWidth());
        Path path = this.mDrawZeroLinePathBuffer;
        path.reset();
        path.moveTo(((float) pixelForValues.f52826x) - 1.0f, this.mViewPortHandler.contentTop());
        path.lineTo(((float) pixelForValues.f52826x) - 1.0f, this.mViewPortHandler.contentBottom());
        canvas.drawPath(path, this.mZeroLinePaint);
        canvas.restoreToCount(iSave);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public RectF getGridClippingRect() {
        this.mGridClippingRect.set(this.mViewPortHandler.getContentRect());
        this.mGridClippingRect.inset(-this.mAxis.getGridLineWidth(), 0.0f);
        return this.mGridClippingRect;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public float[] getTransformedPositions() {
        int length = this.mGetTransformedPositionsBuffer.length;
        int i14 = this.mYAxis.mEntryCount;
        if (length != i14 * 2) {
            this.mGetTransformedPositionsBuffer = new float[i14 * 2];
        }
        float[] fArr = this.mGetTransformedPositionsBuffer;
        for (int i15 = 0; i15 < fArr.length; i15 += 2) {
            fArr[i15] = this.mYAxis.mEntries[i15 / 2];
        }
        this.mTrans.pointValuesToPixel(fArr);
        return fArr;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public Path linePath(Path path, int i14, float[] fArr) {
        path.moveTo(fArr[i14], this.mViewPortHandler.contentTop());
        path.lineTo(fArr[i14], this.mViewPortHandler.contentBottom());
        return path;
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        float fContentBottom;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            float[] transformedPositions = getTransformedPositions();
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            this.mAxisLabelPaint.setTextAlign(Paint.Align.CENTER);
            float fConvertDpToPixel = Utils.convertDpToPixel(2.5f);
            float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, "Q");
            YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
            YAxis.YAxisLabelPosition labelPosition = this.mYAxis.getLabelPosition();
            if (axisDependency == YAxis.AxisDependency.LEFT) {
                YAxis.YAxisLabelPosition yAxisLabelPosition = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                ViewPortHandler viewPortHandler = this.mViewPortHandler;
                fContentBottom = (labelPosition == yAxisLabelPosition ? viewPortHandler.contentTop() : viewPortHandler.contentTop()) - fConvertDpToPixel;
            } else {
                YAxis.YAxisLabelPosition yAxisLabelPosition2 = YAxis.YAxisLabelPosition.OUTSIDE_CHART;
                ViewPortHandler viewPortHandler2 = this.mViewPortHandler;
                fContentBottom = (labelPosition == yAxisLabelPosition2 ? viewPortHandler2.contentBottom() : viewPortHandler2.contentBottom()) + fCalcTextHeight + fConvertDpToPixel;
            }
            drawYLabels(canvas, fContentBottom, transformedPositions, this.mYAxis.getYOffset());
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawAxisLineEnabled()) {
            this.mAxisLinePaint.setColor(this.mYAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mYAxis.getAxisLineWidth());
            YAxis.AxisDependency axisDependency = this.mYAxis.getAxisDependency();
            YAxis.AxisDependency axisDependency2 = YAxis.AxisDependency.LEFT;
            ViewPortHandler viewPortHandler = this.mViewPortHandler;
            if (axisDependency == axisDependency2) {
                canvas.drawLine(viewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mAxisLinePaint);
            } else {
                canvas.drawLine(viewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        char c14;
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = this.mRenderLimitLinesBuffer;
        char c15 = 0;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        Path path = this.mRenderLimitLinesPathBuffer;
        path.reset();
        int i14 = 0;
        while (i14 < limitLines.size()) {
            LimitLine limitLine = limitLines.get(i14);
            if (limitLine.isEnabled()) {
                int iSave = canvas.save();
                this.mLimitLineClippingRect.set(this.mViewPortHandler.getContentRect());
                this.mLimitLineClippingRect.inset(-limitLine.getLineWidth(), 0.0f);
                canvas.clipRect(this.mLimitLineClippingRect);
                fArr[c15] = limitLine.getLimit();
                fArr[2] = limitLine.getLimit();
                this.mTrans.pointValuesToPixel(fArr);
                fArr[1] = this.mViewPortHandler.contentTop();
                fArr[3] = this.mViewPortHandler.contentBottom();
                path.moveTo(fArr[c15], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                String label = limitLine.getLabel();
                if (label == null || label.equals("")) {
                    c14 = c15;
                } else {
                    this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setTypeface(limitLine.getTypeface());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float xOffset = limitLine.getXOffset() + limitLine.getLineWidth();
                    float yOffset = limitLine.getYOffset() + Utils.convertDpToPixel(2.0f);
                    LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                    if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        float fCalcTextHeight = Utils.calcTextHeight(this.mLimitLinePaint, label);
                        c14 = c15;
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(label, fArr[c14] + xOffset, this.mViewPortHandler.contentTop() + yOffset + fCalcTextHeight, this.mLimitLinePaint);
                    } else {
                        c14 = c15;
                        if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                            this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(label, fArr[c14] + xOffset, this.mViewPortHandler.contentBottom() - yOffset, this.mLimitLinePaint);
                        } else {
                            LimitLine.LimitLabelPosition limitLabelPosition = LimitLine.LimitLabelPosition.LEFT_TOP;
                            Paint paint = this.mLimitLinePaint;
                            if (labelPosition == limitLabelPosition) {
                                paint.setTextAlign(Paint.Align.RIGHT);
                                canvas.drawText(label, fArr[c14] - xOffset, this.mViewPortHandler.contentTop() + yOffset + Utils.calcTextHeight(this.mLimitLinePaint, label), this.mLimitLinePaint);
                            } else {
                                paint.setTextAlign(Paint.Align.RIGHT);
                                canvas.drawText(label, fArr[c14] - xOffset, this.mViewPortHandler.contentBottom() - yOffset, this.mLimitLinePaint);
                            }
                        }
                    }
                }
                canvas.restoreToCount(iSave);
            } else {
                c14 = c15;
            }
            i14++;
            c15 = c14;
        }
    }
}
