package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vtr extends ttr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RadarChart f37222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f37223b;

    public vtr(hwq hwqVar, YAxis yAxis, RadarChart radarChart) {
        super(hwqVar, yAxis, null);
        this.f37223b = new Path();
        this.f37222a = radarChart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // defpackage.gt1
    public void computeAxisValues(float f, float f2) {
        ?? r5;
        float f3 = f;
        int labelCount = this.mAxis.getLabelCount();
        double dAbs = Math.abs(f2 - f3);
        if (labelCount == 0 || dAbs <= 0.0d || Double.isInfinite(dAbs)) {
            ft1 ft1Var = this.mAxis;
            ft1Var.mEntries = new float[0];
            ft1Var.mCenteredEntries = new float[0];
            ft1Var.mEntryCount = 0;
            return;
        }
        double dY = fmq.y(dAbs / ((double) labelCount));
        if (this.mAxis.isGranularityEnabled() && dY < this.mAxis.getGranularity()) {
            dY = this.mAxis.getGranularity();
        }
        double dY2 = fmq.y(Math.pow(10.0d, (int) Math.log10(dY)));
        if (((int) (dY / dY2)) > 5) {
            double d = dY2 * 10.0d;
            if (Math.floor(d) != 0.0d) {
                dY = Math.floor(d);
            }
        }
        boolean zIsCenterAxisLabelsEnabled = this.mAxis.isCenterAxisLabelsEnabled();
        if (this.mAxis.isForceLabelsEnabled()) {
            float f4 = ((float) dAbs) / (labelCount - 1);
            ft1 ft1Var2 = this.mAxis;
            ft1Var2.mEntryCount = labelCount;
            if (ft1Var2.mEntries.length < labelCount) {
                ft1Var2.mEntries = new float[labelCount];
            }
            for (int i = 0; i < labelCount; i++) {
                this.mAxis.mEntries[i] = f3;
                f3 += f4;
            }
        } else {
            double dCeil = dY == 0.0d ? 0.0d : Math.ceil(((double) f3) / dY) * dY;
            if (zIsCenterAxisLabelsEnabled) {
                dCeil -= dY;
            }
            double dW = dY == 0.0d ? 0.0d : fmq.w(Math.floor(((double) f2) / dY) * dY);
            if (dY != 0.0d) {
                r5 = zIsCenterAxisLabelsEnabled;
                double d2 = dCeil;
                while (d2 <= dW) {
                    d2 += dY;
                    r5 = (r5 == true ? 1 : 0) + 1;
                }
            } else {
                r5 = zIsCenterAxisLabelsEnabled;
            }
            labelCount = r5 + 1;
            ft1 ft1Var3 = this.mAxis;
            ft1Var3.mEntryCount = labelCount;
            if (ft1Var3.mEntries.length < labelCount) {
                ft1Var3.mEntries = new float[labelCount];
            }
            for (int i2 = 0; i2 < labelCount; i2++) {
                if (dCeil == 0.0d) {
                    dCeil = 0.0d;
                }
                this.mAxis.mEntries[i2] = (float) dCeil;
                dCeil += dY;
            }
        }
        if (dY < 1.0d) {
            this.mAxis.mDecimals = (int) Math.ceil(-Math.log10(dY));
        } else {
            this.mAxis.mDecimals = 0;
        }
        if (zIsCenterAxisLabelsEnabled) {
            ft1 ft1Var4 = this.mAxis;
            if (ft1Var4.mCenteredEntries.length < labelCount) {
                ft1Var4.mCenteredEntries = new float[labelCount];
            }
            float[] fArr = ft1Var4.mEntries;
            float f5 = (fArr[1] - fArr[0]) / 2.0f;
            for (int i3 = 0; i3 < labelCount; i3++) {
                ft1 ft1Var5 = this.mAxis;
                ft1Var5.mCenteredEntries[i3] = ft1Var5.mEntries[i3] + f5;
            }
        }
        ft1 ft1Var6 = this.mAxis;
        float[] fArr2 = ft1Var6.mEntries;
        float f6 = fArr2[0];
        ft1Var6.mAxisMinimum = f6;
        float f7 = fArr2[labelCount - 1];
        ft1Var6.mAxisMaximum = f7;
        ft1Var6.mAxisRange = Math.abs(f7 - f6);
    }

    @Override // defpackage.ttr, defpackage.gt1
    public void renderAxisLabels(Canvas canvas) {
        if (this.mYAxis.isEnabled() && this.mYAxis.isDrawLabelsEnabled()) {
            this.mAxisLabelPaint.setTypeface(this.mYAxis.getTypeface());
            this.mAxisLabelPaint.setTextSize(this.mYAxis.getTextSize());
            this.mAxisLabelPaint.setColor(this.mYAxis.getTextColor());
            wye centerOffsets = this.f37222a.getCenterOffsets();
            wye wyeVarC = wye.c(0.0f, 0.0f);
            float factor = this.f37222a.getFactor();
            int i = this.mYAxis.m() ? this.mYAxis.mEntryCount : this.mYAxis.mEntryCount - 1;
            float fC = this.mYAxis.c();
            for (int i2 = !this.mYAxis.l() ? 1 : 0; i2 < i; i2++) {
                YAxis yAxis = this.mYAxis;
                fmq.r(centerOffsets, (yAxis.mEntries[i2] - yAxis.mAxisMinimum) * factor, this.f37222a.getRotationAngle(), wyeVarC);
                canvas.drawText(this.mYAxis.getFormattedLabel(i2), wyeVarC.c + fC, wyeVarC.d, this.mAxisLabelPaint);
            }
            wye.f(centerOffsets);
            wye.f(wyeVarC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ttr, defpackage.gt1
    public void renderLimitLines(Canvas canvas) {
        List<LimitLine> limitLines = this.mYAxis.getLimitLines();
        if (limitLines == null) {
            return;
        }
        float sliceAngle = this.f37222a.getSliceAngle();
        float factor = this.f37222a.getFactor();
        wye centerOffsets = this.f37222a.getCenterOffsets();
        wye wyeVarC = wye.c(0.0f, 0.0f);
        for (int i = 0; i < limitLines.size(); i++) {
            LimitLine limitLine = limitLines.get(i);
            if (limitLine.isEnabled()) {
                this.mLimitLinePaint.setColor(limitLine.f());
                this.mLimitLinePaint.setPathEffect(limitLine.b());
                this.mLimitLinePaint.setStrokeWidth(limitLine.g());
                float fE = (limitLine.e() - this.f37222a.getYChartMin()) * factor;
                Path path = this.f37223b;
                path.reset();
                for (int i2 = 0; i2 < ((baj) this.f37222a.getData()).q().O0(); i2++) {
                    fmq.r(centerOffsets, fE, (i2 * sliceAngle) + this.f37222a.getRotationAngle(), wyeVarC);
                    if (i2 == 0) {
                        path.moveTo(wyeVarC.c, wyeVarC.d);
                    } else {
                        path.lineTo(wyeVarC.c, wyeVarC.d);
                    }
                }
                path.close();
                canvas.drawPath(path, this.mLimitLinePaint);
            }
        }
        wye.f(centerOffsets);
        wye.f(wyeVarC);
    }
}
