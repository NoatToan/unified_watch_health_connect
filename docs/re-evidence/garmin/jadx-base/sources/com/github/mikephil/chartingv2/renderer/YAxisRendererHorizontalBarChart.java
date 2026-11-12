package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.utils.PointD;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class YAxisRendererHorizontalBarChart extends YAxisRenderer {
    public YAxisRendererHorizontalBarChart(ViewPortHandler viewPortHandler, YAxis yAxis, Transformer transformer) {
        super(viewPortHandler, yAxis, transformer);
        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
    }

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer
    public void computeAxis(float f14, float f15) {
        if (this.mViewPortHandler.contentHeight() > 10.0f && !this.mViewPortHandler.isFullyZoomedOutX()) {
            PointD valuesByTouchPoint = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop());
            PointD valuesByTouchPoint2 = this.mTrans.getValuesByTouchPoint(this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop());
            if (this.mYAxis.isInverted()) {
                float f16 = (float) valuesByTouchPoint2.f52835x;
                f15 = (float) valuesByTouchPoint.f52835x;
                f14 = f16;
            } else {
                f14 = (float) valuesByTouchPoint.f52835x;
                f15 = (float) valuesByTouchPoint2.f52835x;
            }
        }
        computeAxisValues(f14, f15);
    }

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer
    public void drawYLabels(Canvas canvas, float f14, float[] fArr, float f15) {
        this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
        this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
        int i14 = 0;
        while (true) {
            YAxis yAxis = this.mYAxis;
            if (i14 >= yAxis.mEntryCount) {
                return;
            }
            String formattedLabel = yAxis.getFormattedLabel(i14);
            if (!this.mYAxis.isDrawTopYLabelEntryEnabled() && i14 >= this.mYAxis.mEntryCount - 1) {
                return;
            }
            canvas.drawText(formattedLabel, fArr[i14 * 2], f14 - f15, this.mAxisLabelPaint);
            i14++;
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        float fContentBottom;
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            int i14 = this.mYAxis.mEntryCount * 2;
            float[] fArr = new float[i14];
            for (int i15 = 0; i15 < i14; i15 += 2) {
                fArr[i15] = this.mYAxis.mEntries[i15 / 2];
            }
            this.mTrans.pointValuesToPixel(fArr);
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
            drawYLabels(canvas, fContentBottom, fArr, this.mYAxis.getYOffset());
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
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

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (this.mYAxis.isEnabled()) {
            float[] fArr = new float[2];
            if (this.mYAxis.isDrawGridLinesEnabled()) {
                this.mGridPaint.setColor(this.mYAxis.getGridColor());
                this.mGridPaint.setStrokeWidth(this.mYAxis.getGridLineWidth());
                int i14 = 0;
                while (true) {
                    YAxis yAxis = this.mYAxis;
                    if (i14 >= yAxis.mEntryCount) {
                        break;
                    }
                    fArr[0] = yAxis.mEntries[i14];
                    this.mTrans.pointValuesToPixel(fArr);
                    canvas.drawLine(fArr[0], this.mViewPortHandler.contentTop(), fArr[0], this.mViewPortHandler.contentBottom(), this.mGridPaint);
                    i14++;
                }
            }
            if (this.mYAxis.isDrawZeroLineEnabled()) {
                fArr[0] = 0.0f;
                this.mTrans.pointValuesToPixel(fArr);
                float f14 = fArr[0];
                drawZeroLine(canvas, f14 + 1.0f, 1.0f + f14, this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentBottom());
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        float[] fArr = new float[4];
        Path path = new Path();
        for (int i14 = 0; i14 < limitLines.size(); i14++) {
            LimitLine limitLine = limitLines.get(i14);
            if (limitLine.isEnabled()) {
                fArr[0] = limitLine.getLimit();
                fArr[2] = limitLine.getLimit();
                this.mTrans.pointValuesToPixel(fArr);
                fArr[1] = this.mViewPortHandler.contentTop();
                fArr[3] = this.mViewPortHandler.contentBottom();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                canvas.drawPath(path, this.mLimitLinePaint);
                path.reset();
                String label = limitLine.getLabel();
                if (label != null && !label.equals("")) {
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
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(label, fArr[0] + xOffset, this.mViewPortHandler.contentTop() + yOffset + fCalcTextHeight, this.mLimitLinePaint);
                    } else if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                        this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                        canvas.drawText(label, fArr[0] + xOffset, this.mViewPortHandler.contentBottom() - yOffset, this.mLimitLinePaint);
                    } else {
                        LimitLine.LimitLabelPosition limitLabelPosition = LimitLine.LimitLabelPosition.LEFT_TOP;
                        Paint paint = this.mLimitLinePaint;
                        if (labelPosition == limitLabelPosition) {
                            paint.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(label, fArr[0] - xOffset, this.mViewPortHandler.contentTop() + yOffset + Utils.calcTextHeight(this.mLimitLinePaint, label), this.mLimitLinePaint);
                        } else {
                            paint.setTextAlign(Paint.Align.RIGHT);
                            canvas.drawText(label, fArr[0] - xOffset, this.mViewPortHandler.contentBottom() - yOffset, this.mLimitLinePaint);
                        }
                    }
                }
            }
        }
    }
}
