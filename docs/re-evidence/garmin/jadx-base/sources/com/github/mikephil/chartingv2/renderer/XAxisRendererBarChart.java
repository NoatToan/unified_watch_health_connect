package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.PointF;
import com.github.mikephil.chartingv2.charts.BarChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.BarData;
import com.github.mikephil.chartingv2.utils.Transformer;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import q6.f;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class XAxisRendererBarChart extends XAxisRenderer {
    protected BarChart mChart;

    public XAxisRendererBarChart(ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer, BarChart barChart) {
        super(viewPortHandler, xAxis, transformer);
        this.mChart = barChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f14, PointF pointF) {
        float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
        float[] fArr = {0.0f, 0.0f};
        BarData barData = (BarData) this.mChart.getData();
        int dataSetCount = barData.getDataSetCount();
        int i14 = this.mMinX;
        while (i14 <= this.mMaxX) {
            float groupSpace = (barData.getGroupSpace() / 2.0f) + (barData.getGroupSpace() * i14) + (i14 * dataSetCount);
            fArr[0] = groupSpace;
            if (dataSetCount > 1) {
                fArr[0] = f.c(dataSetCount, 1.0f, 2.0f, groupSpace);
            }
            this.mTrans.pointValuesToPixel(fArr);
            if (this.mViewPortHandler.isInBoundsX(fArr[0]) && i14 >= 0 && i14 < this.mXAxis.getValues().size()) {
                String str = this.mXAxis.getValues().get(i14);
                if (this.mXAxis.isAvoidFirstLastClippingEnabled()) {
                    if (i14 == this.mXAxis.getValues().size() - 1) {
                        float fCalcTextWidth = Utils.calcTextWidth(this.mAxisLabelPaint, str) / 2.0f;
                        if (fArr[0] + fCalcTextWidth > this.mViewPortHandler.contentRight()) {
                            fArr[0] = this.mViewPortHandler.contentRight() - fCalcTextWidth;
                        }
                    } else if (i14 == 0) {
                        float fCalcTextWidth2 = Utils.calcTextWidth(this.mAxisLabelPaint, str) / 2.0f;
                        if (fArr[0] - fCalcTextWidth2 < this.mViewPortHandler.contentLeft()) {
                            fArr[0] = this.mViewPortHandler.contentLeft() + fCalcTextWidth2;
                        }
                    }
                }
                drawLabel(canvas, str, i14, fArr[0], f14, pointF, labelRotationAngle);
            }
            i14 += this.mXAxis.mAxisLabelModulus;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderGridLines(Canvas canvas) {
        Canvas canvas2;
        if (this.mXAxis.isDrawGridLinesEnabled() && this.mXAxis.isEnabled()) {
            float[] fArr = {0.0f, 0.0f};
            this.mGridPaint.setColor(this.mXAxis.getGridColor());
            this.mGridPaint.setStrokeWidth(this.mXAxis.getGridLineWidth());
            BarData barData = (BarData) this.mChart.getData();
            int dataSetCount = barData.getDataSetCount();
            int i14 = this.mMinX;
            while (i14 < this.mMaxX) {
                fArr[0] = ((barData.getGroupSpace() * i14) + (i14 * dataSetCount)) - 0.5f;
                this.mTrans.pointValuesToPixel(fArr);
                if (this.mViewPortHandler.isInBoundsX(fArr[0])) {
                    canvas2 = canvas;
                    canvas2.drawLine(fArr[0], this.mViewPortHandler.offsetTop(), fArr[0], this.mViewPortHandler.contentBottom(), this.mGridPaint);
                } else {
                    canvas2 = canvas;
                }
                i14 += this.mXAxis.mAxisLabelModulus;
                canvas = canvas2;
            }
        }
    }
}
