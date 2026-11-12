package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.github.mikephil.chartingv2.charts.BarChart;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.utils.FSize;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;
import q6.f;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class XAxisRendererHorizontalBarChart extends XAxisRendererBarChart {
    public XAxisRendererHorizontalBarChart(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, BarChart barChart) {
        super(viewPortHandler, xAxis, transformer, barChart);
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public void computeAxis(float f14, List<String> list) {
        this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
        this.mXAxis.setValues(list);
        FSize fSizeCalcTextSize = Utils.calcTextSize(this.mAxisLabelPaint, this.mXAxis.getLongestLabel());
        float xOffset = (int) ((this.mXAxis.getXOffset() * 3.5f) + fSizeCalcTextSize.width);
        float f15 = fSizeCalcTextSize.height;
        FSize sizeOfRotatedRectangleByDegrees = Utils.getSizeOfRotatedRectangleByDegrees(fSizeCalcTextSize.width, f15, this.mXAxis.getLabelRotationAngle());
        this.mXAxis.mLabelWidth = Math.round(xOffset);
        this.mXAxis.mLabelHeight = Math.round(f15);
        XAxis xAxis = this.mXAxis;
        xAxis.mLabelRotatedWidth = (int) ((xAxis.getXOffset() * 3.5f) + sizeOfRotatedRectangleByDegrees.width);
        this.mXAxis.mLabelRotatedHeight = Math.round(sizeOfRotatedRectangleByDegrees.height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.XAxisRendererBarChart, com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f14, PointF pointF) {
        XAxisRendererHorizontalBarChart xAxisRendererHorizontalBarChart;
        Canvas canvas2;
        float f15;
        PointF pointF2;
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        float[] fArr = {0.0f, 0.0f};
        BarData barData = (BarData) this.mChart.getData();
        int dataSetCount = barData.getDataSetCount();
        int i14 = this.mMinX;
        while (i14 <= this.mMaxX) {
            float groupSpace = (barData.getGroupSpace() / 2.0f) + (barData.getGroupSpace() * i14) + (i14 * dataSetCount);
            fArr[1] = groupSpace;
            if (dataSetCount > 1) {
                fArr[1] = f.c(dataSetCount, 1.0f, 2.0f, groupSpace);
            }
            this.mTrans.pointValuesToPixel(fArr);
            if (this.mViewPortHandler.isInBoundsY(fArr[1])) {
                xAxisRendererHorizontalBarChart = this;
                canvas2 = canvas;
                f15 = f14;
                pointF2 = pointF;
                xAxisRendererHorizontalBarChart.drawLabel(canvas2, this.mXAxis.getValues().get(i14), i14, f15, fArr[1], pointF2, labelRotationAngle);
            } else {
                xAxisRendererHorizontalBarChart = this;
                canvas2 = canvas;
                f15 = f14;
                pointF2 = pointF;
            }
            i14 += xAxisRendererHorizontalBarChart.mXAxis.mAxisLabelModulus;
            canvas = canvas2;
            f14 = f15;
            pointF = pointF2;
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float xOffset = this.mXAxis.getXOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                drawLabels(canvas, this.mViewPortHandler.contentRight() + xOffset, new PointF(0.0f, 0.5f));
                return;
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE) {
                drawLabels(canvas, this.mViewPortHandler.contentRight() - xOffset, new PointF(1.0f, 0.5f));
                return;
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                drawLabels(canvas, this.mViewPortHandler.contentLeft() - xOffset, new PointF(1.0f, 0.5f));
                return;
            }
            XAxis.XAxisPosition position = this.mXAxis.getPosition();
            XAxis.XAxisPosition xAxisPosition = XAxis.XAxisPosition.BOTTOM_INSIDE;
            ViewPortHandler viewPortHandler = this.mViewPortHandler;
            if (position == xAxisPosition) {
                drawLabels(canvas, viewPortHandler.contentLeft() + xOffset, new PointF(0.0f, 0.5f));
            } else {
                drawLabels(canvas, viewPortHandler.contentRight() + xOffset, new PointF(0.0f, 0.5f));
                drawLabels(canvas, this.mViewPortHandler.contentLeft() - xOffset, new PointF(1.0f, 0.5f));
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        Canvas canvas2;
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP || this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas2 = canvas;
                canvas2.drawLine(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            } else {
                canvas2 = canvas;
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas2.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.XAxisRendererBarChart, com.github.mikephil.chartingv2.renderer.XAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        Canvas canvas2;
        if (this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            float[] fArr = {0.0f, 0.0f};
            this.mGridPaint.setColor(this.mXAxis.getGridColor());
            this.mGridPaint.setStrokeWidth(this.mXAxis.getGridLineWidth());
            BarData barData = (BarData) this.mChart.getData();
            int dataSetCount = barData.getDataSetCount();
            int i14 = this.mMinX;
            while (i14 <= this.mMaxX) {
                fArr[1] = ((barData.getGroupSpace() * i14) + (i14 * dataSetCount)) - 0.5f;
                this.mTrans.pointValuesToPixel(fArr);
                if (this.mViewPortHandler.isInBoundsY(fArr[1])) {
                    canvas2 = canvas;
                    canvas2.drawLine(this.mViewPortHandler.contentLeft(), fArr[1], this.mViewPortHandler.contentRight(), fArr[1], this.mGridPaint);
                } else {
                    canvas2 = canvas;
                }
                i14 += this.mXAxis.mAxisLabelModulus;
                canvas = canvas2;
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = new float[2];
        Path path = new Path();
        for (int i14 = 0; i14 < limitLines.size(); i14++) {
            LimitLine limitLine = limitLines.get(i14);
            if (limitLine.isEnabled()) {
                this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                fArr[1] = limitLine.getLimit();
                this.mTrans.pointValuesToPixel(fArr);
                path.moveTo(this.mViewPortHandler.contentLeft(), fArr[1]);
                path.lineTo(this.mViewPortHandler.contentRight(), fArr[1]);
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                String label = limitLine.getLabel();
                if (label != null && !label.equals("")) {
                    this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
                    this.mLimitLinePaint.setPathEffect(null);
                    this.mLimitLinePaint.setColor(limitLine.getTextColor());
                    this.mLimitLinePaint.setStrokeWidth(0.5f);
                    this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
                    float fCalcTextHeight = Utils.calcTextHeight(this.mLimitLinePaint, label);
                    float xOffset = limitLine.getXOffset() + Utils.convertDpToPixel(4.0f);
                    float yOffset = limitLine.getYOffset() + limitLine.getLineWidth() + fCalcTextHeight;
                    LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
                    if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - xOffset, (fArr[1] - yOffset) + fCalcTextHeight, this.mLimitLinePaint);
                    } else if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(label, this.mViewPortHandler.contentRight() - xOffset, fArr[1] + yOffset, this.mLimitLinePaint);
                    } else {
                        LimitLine.LimitLabelPosition limitLabelPosition = LimitLine.LimitLabelPosition.LEFT_TOP;
                        Paint paint = this.mLimitLinePaint;
                        if (labelPosition == limitLabelPosition) {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(label, this.mViewPortHandler.contentLeft() + xOffset, (fArr[1] - yOffset) + fCalcTextHeight, this.mLimitLinePaint);
                        } else {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(label, this.mViewPortHandler.offsetLeft() + xOffset, fArr[1] + yOffset, this.mLimitLinePaint);
                        }
                    }
                }
            }
        }
    }
}
