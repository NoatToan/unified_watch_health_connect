package defpackage;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;

/* JADX INFO: loaded from: classes4.dex */
public class err extends crr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RadarChart f17007a;

    public err(hwq hwqVar, XAxis xAxis, RadarChart radarChart) {
        super(hwqVar, xAxis, null);
        this.f17007a = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.crr, defpackage.gt1
    public void renderAxisLabels(Canvas canvas) {
        if (this.mXAxis.isEnabled() && this.mXAxis.isDrawLabelsEnabled()) {
            float labelRotationAngle = this.mXAxis.getLabelRotationAngle();
            wye wyeVarC = wye.c(0.5f, 0.25f);
            this.mAxisLabelPaint.setTypeface(this.mXAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mXAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mXAxis.getTextColor());
            float sliceAngle = this.f17007a.getSliceAngle();
            float factor = this.f17007a.getFactor();
            wye centerOffsets = this.f17007a.getCenterOffsets();
            wye wyeVarC2 = wye.c(0.0f, 0.0f);
            for (int i = 0; i < ((baj) this.f17007a.getData()).q().O0(); i++) {
                float f = i;
                String formattedValue = this.mXAxis.getValueFormatter().getFormattedValue(f, this.mXAxis);
                fmq.r(centerOffsets, (this.f17007a.getYRange() * factor) + (this.mXAxis.mLabelRotatedWidth / 2.0f), ((f * sliceAngle) + this.f17007a.getRotationAngle()) % 360.0f, wyeVarC2);
                drawLabel(canvas, formattedValue, wyeVarC2.c, wyeVarC2.d - (this.mXAxis.mLabelRotatedHeight / 2.0f), wyeVarC, labelRotationAngle);
            }
            wye.f(centerOffsets);
            wye.f(wyeVarC2);
            wye.f(wyeVarC);
        }
    }

    @Override // defpackage.crr, defpackage.gt1
    public void renderLimitLines(Canvas canvas) {
    }
}
