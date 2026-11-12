package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class YAxisRendererRadarChart extends YAxisRenderer {
    private RadarChart mChart;
    private Path mRenderLimitLinesPathBuffer;

    public YAxisRendererRadarChart(ViewPortHandler viewPortHandler, YAxis yAxis, RadarChart radarChart) {
        super(viewPortHandler, yAxis, null);
        this.mRenderLimitLinesPathBuffer = new Path();
        this.mChart = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxisValues(float f14, float f15) {
        ?? r14;
        float f16 = f14;
        int labelCount = this.mAxis.getLabelCount();
        double dAbs = Math.abs(f15 - f16);
        if (labelCount == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            AxisBase axisBase = this.mAxis;
            axisBase.mEntries = new float[0];
            axisBase.mCenteredEntries = new float[0];
            axisBase.mEntryCount = 0;
            return;
        }
        double dRoundToNextSignificant = Utils.roundToNextSignificant(dAbs / ((double) labelCount));
        if (this.mAxis.isGranularityEnabled() && dRoundToNextSignificant < this.mAxis.getGranularity()) {
            dRoundToNextSignificant = this.mAxis.getGranularity();
        }
        double dRoundToNextSignificant2 = Utils.roundToNextSignificant(Math.pow(10.0d, (int) Math.log10(dRoundToNextSignificant)));
        if (((int) (dRoundToNextSignificant / dRoundToNextSignificant2)) > 5) {
            dRoundToNextSignificant = Math.floor(dRoundToNextSignificant2 * 10.0d);
        }
        boolean zIsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            float f17 = ((float) dAbs) / (labelCount - 1);
            AxisBase axisBase2 = this.mAxis;
            axisBase2.mEntryCount = labelCount;
            if (axisBase2.mEntries.length < labelCount) {
                axisBase2.mEntries = new float[labelCount];
            }
            for (int i14 = 0; i14 < labelCount; i14++) {
                this.mAxis.mEntries[i14] = f16;
                f16 += f17;
            }
        } else {
            double dCeil = dRoundToNextSignificant == 0.0d ? 0.0d : Math.ceil(((double) f16) / dRoundToNextSignificant) * dRoundToNextSignificant;
            if (zIsCenterAxisLabelsEnabled) {
                dCeil -= dRoundToNextSignificant;
            }
            double dNextUp = dRoundToNextSignificant == 0.0d ? 0.0d : Utils.nextUp(Math.floor(((double) f15) / dRoundToNextSignificant) * dRoundToNextSignificant);
            if (dRoundToNextSignificant != 0.0d) {
                double d14 = dCeil;
                r14 = zIsCenterAxisLabelsEnabled;
                while (d14 <= dNextUp) {
                    d14 += dRoundToNextSignificant;
                    r14 = (r14 == true ? 1 : 0) + 1;
                }
            } else {
                r14 = zIsCenterAxisLabelsEnabled;
            }
            labelCount = r14 + 1;
            AxisBase axisBase3 = this.mAxis;
            axisBase3.mEntryCount = labelCount;
            if (axisBase3.mEntries.length < labelCount) {
                axisBase3.mEntries = new float[labelCount];
            }
            for (int i15 = 0; i15 < labelCount; i15++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mAxis.mEntries[i15] = (float) dCeil;
                dCeil += dRoundToNextSignificant;
            }
        }
        AxisBase axisBase4 = this.mAxis;
        if (dRoundToNextSignificant < 1.0d) {
            axisBase4.mDecimals = (int) Math.ceil(-Math.log10(dRoundToNextSignificant));
        } else {
            axisBase4.mDecimals = 0;
        }
        if (zIsCenterAxisLabelsEnabled) {
            AxisBase axisBase5 = this.mAxis;
            if (axisBase5.mCenteredEntries.length < labelCount) {
                axisBase5.mCenteredEntries = new float[labelCount];
            }
            float[] fArr = axisBase5.mEntries;
            float f18 = (fArr[1] - fArr[0]) / 2.0f;
            for (int i16 = 0; i16 < labelCount; i16++) {
                AxisBase axisBase6 = this.mAxis;
                axisBase6.mCenteredEntries[i16] = axisBase6.mEntries[i16] + f18;
            }
        }
        AxisBase axisBase7 = this.mAxis;
        float[] fArr2 = axisBase7.mEntries;
        float f19 = fArr2[0];
        axisBase7.mAxisMinimum = f19;
        float f22 = fArr2[labelCount - 1];
        axisBase7.mAxisMaximum = f22;
        axisBase7.mAxisRange = Math.abs(f22 - f19);
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderAxisLabels(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            MPPointF centerOffsets = this.mChart.getCenterOffsets();
            MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
            float factor = this.mChart.getFactor();
            boolean zIsDrawTopYLabelEntryEnabled = this.mYAxis.isDrawTopYLabelEntryEnabled();
            YAxis yAxis = this.mYAxis;
            int i14 = zIsDrawTopYLabelEntryEnabled ? yAxis.mEntryCount : yAxis.mEntryCount - 1;
            for (int i15 = !this.mYAxis.isDrawBottomYLabelEntryEnabled() ? 1 : 0; i15 < i14; i15++) {
                YAxis yAxis2 = this.mYAxis;
                Utils.getPosition(centerOffsets, (yAxis2.mEntries[i15] - yAxis2.mAxisMinimum) * factor, this.mChart.getRotationAngle(), mPPointF);
                canvas.drawText(this.mYAxis.getFormattedLabel(i15), mPPointF.f52828x + 10.0f, mPPointF.f52829y, this.mAxisLabelPaint);
            }
            MPPointF.recycleInstance(centerOffsets);
            MPPointF.recycleInstance(mPPointF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.renderer.YAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null) {
            return;
        }
        float sliceAngle = this.mChart.getSliceAngle();
        float factor = this.mChart.getFactor();
        MPPointF centerOffsets = this.mChart.getCenterOffsets();
        MPPointF mPPointF = MPPointF.getInstance(0.0f, 0.0f);
        for (int i14 = 0; i14 < limitLines.size(); i14++) {
            LimitLine limitLine = limitLines.get(i14);
            if (limitLine.isEnabled()) {
                this.mLimitLinePaint.setColor(limitLine.getLineColor());
                this.mLimitLinePaint.setPathEffect(limitLine.getDashPathEffect());
                this.mLimitLinePaint.setStrokeWidth(limitLine.getLineWidth());
                float limit = (limitLine.getLimit() - this.mChart.getYChartMin()) * factor;
                Path path = this.mRenderLimitLinesPathBuffer;
                path.reset();
                for (int i15 = 0; i15 < ((RadarData) this.mChart.getData()).getMaxEntryCountSet().getEntryCount(); i15++) {
                    Utils.getPosition(centerOffsets, limit, this.mChart.getRotationAngle() + (i15 * sliceAngle), mPPointF);
                    if (i15 == 0) {
                        path.moveTo(mPPointF.f52828x, mPPointF.f52829y);
                    } else {
                        path.lineTo(mPPointF.f52828x, mPPointF.f52829y);
                    }
                }
                path.close();
                canvas.drawPath(path, this.mLimitLinePaint);
            }
        }
        MPPointF.recycleInstance(centerOffsets);
        MPPointF.recycleInstance(mPPointF);
    }
}
