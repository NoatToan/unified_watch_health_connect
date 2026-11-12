package com.github.mikephil.chartingv2.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import com.github.mikephil.chartingv2.charts.RadarChart;
import com.github.mikephil.chartingv2.components.LimitLine;
import com.github.mikephil.chartingv2.components.YAxis;
import com.github.mikephil.chartingv2.data.RadarData;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class YAxisRendererRadarChart extends YAxisRenderer {
    private RadarChart mChart;

    public YAxisRendererRadarChart(ViewPortHandler viewPortHandler, YAxis yAxis, RadarChart radarChart) {
        super(viewPortHandler, yAxis, null);
        this.mChart = radarChart;
    }

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer
    public void computeAxis(float f14, float f15) {
        computeAxisValues(f14, f15);
    }

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer
    public void computeAxisValues(float f14, float f15) {
        int labelCount = this.mYAxis.getLabelCount();
        double dAbs = Math.abs(f15 - f14);
        if (labelCount == 0 || dAbs <= 0.0d) {
            YAxis yAxis = this.mYAxis;
            yAxis.mEntries = new float[0];
            yAxis.mEntryCount = 0;
            return;
        }
        double dRoundToNextSignificant = Utils.roundToNextSignificant(dAbs / ((double) labelCount));
        double dPow = Math.pow(10.0d, (int) Math.log10(dRoundToNextSignificant));
        if (((int) (dRoundToNextSignificant / dPow)) > 5) {
            dRoundToNextSignificant = Math.floor(dPow * 10.0d);
        }
        boolean zIsForceLabelsEnabled = this.mYAxis.isForceLabelsEnabled();
        YAxis yAxis2 = this.mYAxis;
        if (zIsForceLabelsEnabled) {
            float f16 = ((float) dAbs) / (labelCount - 1);
            yAxis2.mEntryCount = labelCount;
            if (yAxis2.mEntries.length < labelCount) {
                yAxis2.mEntries = new float[labelCount];
            }
            float f17 = f14;
            for (int i14 = 0; i14 < labelCount; i14++) {
                this.mYAxis.mEntries[i14] = f17;
                f17 += f16;
            }
        } else if (yAxis2.isShowOnlyMinMaxEnabled()) {
            YAxis yAxis3 = this.mYAxis;
            yAxis3.mEntryCount = 2;
            yAxis3.mEntries = new float[]{f14, f15};
        } else {
            double d14 = ((double) f14) / dRoundToNextSignificant;
            double dFloor = (d14 < 0.0d ? Math.floor(d14) : Math.ceil(d14)) * dRoundToNextSignificant;
            double d15 = dFloor == 0.0d ? 0.0d : dFloor;
            int i15 = 0;
            for (double d16 = d15; d16 <= Utils.nextUp(Math.floor(((double) f15) / dRoundToNextSignificant) * dRoundToNextSignificant); d16 += dRoundToNextSignificant) {
                i15++;
            }
            if (!this.mYAxis.isAxisMaxCustom()) {
                i15++;
            }
            YAxis yAxis4 = this.mYAxis;
            yAxis4.mEntryCount = i15;
            if (yAxis4.mEntries.length < i15) {
                yAxis4.mEntries = new float[i15];
            }
            for (int i16 = 0; i16 < i15; i16++) {
                this.mYAxis.mEntries[i16] = (float) d15;
                d15 += dRoundToNextSignificant;
            }
        }
        YAxis yAxis5 = this.mYAxis;
        if (dRoundToNextSignificant < 1.0d) {
            yAxis5.mDecimals = (int) Math.ceil(-Math.log10(dRoundToNextSignificant));
        } else {
            yAxis5.mDecimals = 0;
        }
        YAxis yAxis6 = this.mYAxis;
        float[] fArr = yAxis6.mEntries;
        float f18 = fArr[0];
        if (f18 < f14) {
            yAxis6.mAxisMinimum = f18;
        }
        float f19 = fArr[yAxis6.mEntryCount - 1];
        yAxis6.mAxisMaximum = f19;
        yAxis6.mAxisRange = Math.abs(f19 - yAxis6.mAxisMinimum);
    }

    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            PointF centerOffsets = this.mChart.getCenterOffsets();
            float factor = this.mChart.getFactor();
            int i14 = this.mYAxis.mEntryCount;
            for (int i15 = 0; i15 < i14; i15++) {
                if (i15 == i14 - 1 && !this.mYAxis.isDrawTopYLabelEntryEnabled()) {
                    return;
                }
                YAxis yAxis = this.mYAxis;
                PointF position = Utils.getPosition(centerOffsets, (yAxis.mEntries[i15] - yAxis.mAxisMinimum) * factor, this.mChart.getRotationAngle());
                canvas.drawText(this.mYAxis.getFormattedLabel(i15), position.x + 10.0f, position.y, this.mAxisLabelPaint);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.chartingv2.renderer.YAxisRenderer, com.github.mikephil.chartingv2.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null) {
            return;
        }
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        PointF centerOffsets = this.mChart.getCenterOffsets();
        for (int i14 = 0; i14 < limitLines.size(); i14++) {
            LimitLine limitLine = limitLines.get(i14);
            if (limitLine.isEnabled()) {
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                float limit = (limitLine.getLimit() - this.mChart.getYChartMin()) * factor;
                Path path = new Path();
                for (int i15 = 0; i15 < ((RadarData) this.mChart.getData()).getXValCount(); i15++) {
                    PointF position = Utils.getPosition(centerOffsets, limit, this.mChart.getRotationAngle() + (i15 * sliceAngle));
                    if (i15 == 0) {
                        path.moveTo(position.x, position.y);
                    } else {
                        path.lineTo(position.x, position.y);
                    }
                }
                path.close();
                canvas.drawPath(path, this.mLimitLinePaint);
            }
        }
    }
}
