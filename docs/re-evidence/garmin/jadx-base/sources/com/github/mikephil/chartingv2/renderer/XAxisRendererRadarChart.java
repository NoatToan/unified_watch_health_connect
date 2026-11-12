package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.PointF;
import com.github.mikephil.chartingv2.charts.RadarChart;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class XAxisRendererRadarChart extends XAxisRenderer {
    private RadarChart mChart;

    public XAxisRendererRadarChart(ViewPortHandler viewPortHandler, XAxis xAxis, RadarChart radarChart) {
        super(viewPortHandler, xAxis, null);
        this.mChart = radarChart;
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
            PointF pointF = new PointF(0.5f, 0.0f);
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            float sliceAngle = this.mChart.getSliceAngle();
            float factor = this.mChart.getFactor();
            PointF centerOffsets = this.mChart.getCenterOffsets();
            int i14 = this.mXAxis.mAxisLabelModulus;
            for (int i15 = 0; i15 < this.mXAxis.getValues().size(); i15 += i14) {
                String str = this.mXAxis.getValues().get(i15);
                PointF position = Utils.getPosition(centerOffsets, (this.mXAxis.mLabelRotatedWidth / 2.0f) + (this.mChart.getYRange() * factor), (this.mChart.getRotationAngle() + (i15 * sliceAngle)) % 360.0f);
                drawLabel(canvas, str, i15, position.x, position.y - (this.mXAxis.mLabelRotatedHeight / 2.0f), pointF, labelRotationAngle);
            }
        }
    }

    @Override // com.github.mikephil.chartingv2.renderer.XAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
    }
}
