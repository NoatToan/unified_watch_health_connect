package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.utils.FSize;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class XAxisRenderer extends AxisRenderer {
    private Path mLimitLinePath;
    float[] mLimitLineSegmentsBuffer;
    protected XAxis mXAxis;

    public XAxisRenderer(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(viewPortHandler, transformer);
        this.mLimitLineSegmentsBuffer = new float[4];
        this.mLimitLinePath = new Path();
        this.mXAxis = xAxis;
        this.mAxisLabelPaint.setColor(-16777216);
        this.mAxisLabelPaint.setTextAlign(Paint.Align.CENTER);
        this.mAxisLabelPaint.setTextSize(Utils.convertDpToPixel(10.0f));
    }

    public void computeAxis(float f14, List<String> list) {
        this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
        this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
        StringBuilder sb3 = new StringBuilder();
        int iRound = Math.round(f14);
        for (int i14 = 0; i14 < iRound; i14++) {
            sb3.append('h');
        }
        float f15 = Utils.calcTextSize(this.mAxisLabelPaint, sb3.toString()).width;
        float fCalcTextHeight = Utils.calcTextHeight(this.mAxisLabelPaint, "Q");
        FSize sizeOfRotatedRectangleByDegrees = Utils.getSizeOfRotatedRectangleByDegrees(f15, fCalcTextHeight, this.mXAxis.getLabelRotationAngle());
        StringBuilder sb4 = new StringBuilder();
        int spaceBetweenLabels = this.mXAxis.getSpaceBetweenLabels();
        for (int i15 = 0; i15 < spaceBetweenLabels; i15++) {
            sb4.append('h');
        }
        FSize fSizeCalcTextSize = Utils.calcTextSize(this.mAxisLabelPaint, sb4.toString());
        this.mXAxis.mLabelWidth = Math.round(f15 + fSizeCalcTextSize.width);
        this.mXAxis.mLabelHeight = Math.round(fCalcTextHeight);
        this.mXAxis.mLabelRotatedWidth = Math.round(sizeOfRotatedRectangleByDegrees.width + fSizeCalcTextSize.width);
        this.mXAxis.mLabelRotatedHeight = Math.round(sizeOfRotatedRectangleByDegrees.height);
        this.mXAxis.setValues(list);
    }

    public void drawLabel(Canvas canvas, String str, int i14, float f14, float f15, PointF pointF, float f16) {
        Utils.drawText(canvas, this.mXAxis.getValueFormatter().getXValue(str, i14, this.mViewPortHandler), f14, f15, this.mAxisLabelPaint, pointF, f16);
    }

    public void drawLabels(Canvas canvas, float f14, PointF pointF) {
        XAxisRenderer xAxisRenderer;
        Canvas canvas2;
        float f15;
        PointF pointF2;
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        float[] fArr = {0.0f, 0.0f};
        int i14 = this.mMinX;
        while (i14 <= this.mMaxX) {
            fArr[0] = i14;
            this.mTrans.pointValuesToPixel(fArr);
            if (this.mViewPortHandler.isInBoundsX(fArr[0])) {
                String str = this.mXAxis.getValues().get(i14);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    if (i14 == this.mXAxis.getValues().size() - 1 && this.mXAxis.getValues().size() > 1) {
                        float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, str);
                        if (fCalcTextWidth > this.mViewPortHandler.offsetRight() * 2.0f && fArr[0] + fCalcTextWidth > this.mViewPortHandler.getChartWidth()) {
                            fArr[0] = fArr[0] - (fCalcTextWidth / 2.0f);
                        }
                    } else if (i14 == 0) {
                        fArr[0] = (Utils.calcTextWidth(this.mAxisLabelPaint, str) / 2.0f) + fArr[0];
                    }
                }
                xAxisRenderer = this;
                canvas2 = canvas;
                f15 = f14;
                pointF2 = pointF;
                xAxisRenderer.drawLabel(canvas2, str, i14, fArr[0], f15, pointF2, labelRotationAngle);
            } else {
                xAxisRenderer = this;
                canvas2 = canvas;
                f15 = f14;
                pointF2 = pointF;
            }
            i14 += xAxisRenderer.mXAxis.mAxisLabelModulus;
            canvas = canvas2;
            f14 = f15;
            pointF = pointF2;
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float yOffset = this.mXAxis.getYOffset();
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP) {
                drawLabels(canvas, this.mViewPortHandler.contentTop() - yOffset, new PointF(0.5f, 1.0f));
                return;
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE) {
                drawLabels(canvas, this.mViewPortHandler.contentTop() + yOffset + this.mXAxis.mLabelRotatedHeight, new PointF(0.5f, 1.0f));
                return;
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM) {
                drawLabels(canvas, this.mViewPortHandler.contentBottom() + yOffset, new PointF(0.5f, 0.0f));
                return;
            }
            XAxis.XAxisPosition position = this.mXAxis.getPosition();
            XAxis.XAxisPosition xAxisPosition = XAxis.XAxisPosition.BOTTOM_INSIDE;
            ViewPortHandler viewPortHandler = this.mViewPortHandler;
            if (position == xAxisPosition) {
                drawLabels(canvas, (viewPortHandler.contentBottom() - yOffset) - this.mXAxis.mLabelRotatedHeight, new PointF(0.5f, 0.0f));
            } else {
                drawLabels(canvas, viewPortHandler.contentTop() - yOffset, new PointF(0.5f, 1.0f));
                drawLabels(canvas, this.mViewPortHandler.contentBottom() + yOffset, new PointF(0.5f, 0.0f));
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderAxisLine(Canvas canvas) {
        Canvas canvas2;
        if (this.mXAxis.isDrawAxisLineEnabled() && this.mXAxis.isEnabled()) {
            this.mAxisLinePaint.setColor(this.mXAxis.getAxisLineColor());
            this.mAxisLinePaint.setStrokeWidth(this.mXAxis.getAxisLineWidth());
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP || this.mXAxis.getPosition() == XAxis.XAxisPosition.TOP_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas2 = canvas;
                canvas2.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentTop(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentTop(), this.mAxisLinePaint);
            } else {
                canvas2 = canvas;
            }
            if (this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTTOM_INSIDE || this.mXAxis.getPosition() == XAxis.XAxisPosition.BOTH_SIDED) {
                canvas2.drawLine(this.mViewPortHandler.contentLeft(), this.mViewPortHandler.contentBottom(), this.mViewPortHandler.contentRight(), this.mViewPortHandler.contentBottom(), this.mAxisLinePaint);
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        if (this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            float[] fArr = {0.0f, 0.0f};
            this.mGridPaint.setColor(this.mXAxis.getGridColor());
            this.mGridPaint.setStrokeWidth(this.mXAxis.getGridLineWidth());
            this.mGridPaint.setPathEffect(this.mXAxis.getGridDashPathEffect());
            Path path = new Path();
            int i14 = this.mMinX;
            while (i14 <= this.mMaxX) {
                fArr[0] = i14;
                this.mTrans.pointValuesToPixel(fArr);
                if (fArr[0] >= this.mViewPortHandler.offsetLeft() && fArr[0] <= this.mViewPortHandler.getChartWidth()) {
                    path.moveTo(fArr[0], this.mViewPortHandler.contentBottom());
                    path.lineTo(fArr[0], this.mViewPortHandler.contentTop());
                    canvas.drawPath(path, this.mGridPaint);
                }
                path.reset();
                i14 += this.mXAxis.mAxisLabelModulus;
            }
        }
    }

    public void renderLimitLineLabel(Canvas canvas, LimitLine limitLine, float[] fArr, float f14) {
        String label = limitLine.getLabel();
        if (label == null || label.equals("")) {
            return;
        }
        this.mLimitLinePaint.setStyle(limitLine.getTextStyle());
        this.mLimitLinePaint.setPathEffect(null);
        this.mLimitLinePaint.setColor(limitLine.getTextColor());
        this.mLimitLinePaint.setStrokeWidth(0.5f);
        this.mLimitLinePaint.setTextSize(limitLine.getTextSize());
        float xOffset = limitLine.getXOffset() + limitLine.getLineWidth();
        LimitLine.LimitLabelPosition labelPosition = limitLine.getLabelPosition();
        if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_TOP) {
            float fCalcTextHeight = Utils.calcTextHeight(this.mLimitLinePaint, label);
            this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
            canvas.drawText(label, fArr[0] + xOffset, this.mViewPortHandler.contentTop() + f14 + fCalcTextHeight, this.mLimitLinePaint);
        } else {
            if (labelPosition == LimitLine.LimitLabelPosition.RIGHT_BOTTOM) {
                this.mLimitLinePaint.setTextAlign(Paint.Align.LEFT);
                canvas.drawText(label, fArr[0] + xOffset, this.mViewPortHandler.contentBottom() - f14, this.mLimitLinePaint);
                return;
            }
            LimitLine.LimitLabelPosition limitLabelPosition = LimitLine.LimitLabelPosition.LEFT_TOP;
            Paint paint = this.mLimitLinePaint;
            if (labelPosition != limitLabelPosition) {
                paint.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(label, fArr[0] - xOffset, this.mViewPortHandler.contentBottom() - f14, this.mLimitLinePaint);
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                canvas.drawText(label, fArr[0] - xOffset, this.mViewPortHandler.contentTop() + f14 + Utils.calcTextHeight(this.mLimitLinePaint, label), this.mLimitLinePaint);
            }
        }
    }

    public void renderLimitLineLine(Canvas canvas, LimitLine limitLine, float[] fArr) {
        float[] fArr2 = this.mLimitLineSegmentsBuffer;
        fArr2[0] = fArr[0];
        fArr2[1] = this.mViewPortHandler.contentTop();
        float[] fArr3 = this.mLimitLineSegmentsBuffer;
        fArr3[2] = fArr[0];
        fArr3[3] = this.mViewPortHandler.contentBottom();
        this.mLimitLinePath.reset();
        Path path = this.mLimitLinePath;
        float[] fArr4 = this.mLimitLineSegmentsBuffer;
        path.moveTo(fArr4[0], fArr4[1]);
        Path path2 = this.mLimitLinePath;
        float[] fArr5 = this.mLimitLineSegmentsBuffer;
        path2.lineTo(fArr5[2], fArr5[3]);
        this.mLimitLinePaint.setStyle(Paint.Style.STROKE);
        this.mLimitLinePaint.setColor(limitLine.getLineColor());
        this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
        this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
        canvas.drawPath(this.mLimitLinePath, this.mLimitLinePaint);
    }

    @Override // com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mXAxis.getLimitLines();
        if (limitLines == null || limitLines.size() <= 0) {
            return;
        }
        for (int i14 = 0; i14 < limitLines.size(); i14++) {
            LimitLine limitLine = limitLines.get(i14);
            if (limitLine.isEnabled()) {
                float[] fArr = {limitLine.getLimit(), 0.0f};
                this.mTrans.pointValuesToPixel(fArr);
                renderLimitLineLine(canvas, limitLine, fArr);
                renderLimitLineLabel(canvas, limitLine, fArr, limitLine.getYOffset() + 2.0f);
            }
        }
    }
}
