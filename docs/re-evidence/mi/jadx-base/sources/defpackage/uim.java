package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.github.mikephil.charting.data.BarEntry;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.chart.mpchart.sleepchart.SleepChart;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes7.dex */
public class uim extends u02 {
    public uim(x02 x02Var, cu3 cu3Var, hwq hwqVar) {
        super(x02Var, cu3Var, hwqVar);
    }

    public void a(Canvas canvas) {
        this.mRenderPaint.setColor(x44.a(aji.c));
        canvas.drawRect(new RectF(this.mViewPortHandler.h(), this.mViewPortHandler.j(), this.mViewPortHandler.i(), this.mViewPortHandler.f()), this.mRenderPaint);
    }

    @Override // defpackage.u02, defpackage.dn5
    public void drawData(Canvas canvas) {
        w02 barData = this.mChart.getBarData();
        x02 x02Var = this.mChart;
        if (x02Var instanceof SleepChart) {
            if (((SleepChart) x02Var).f11774a.h != 0) {
                a(canvas);
                return;
            }
            for (int i = 0; i < barData.j(); i++) {
                gpc gpcVar = (gpc) barData.i(i);
                if (gpcVar.isVisible()) {
                    drawDataSet(canvas, gpcVar, i);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.u02
    public void drawDataSet(Canvas canvas, gpc gpcVar, int i) {
        RectF rectF;
        ryp transformer = this.mChart.getTransformer(gpcVar.m0());
        float fH = this.mAnimator.h();
        float fI = this.mAnimator.i();
        p02 p02Var = this.mBarBuffers[i];
        p02Var.b(fH, fI);
        p02Var.g(i);
        p02Var.e(gpcVar);
        transformer.k(p02Var.f16108b);
        this.mRenderPaint.setColor(gpcVar.n0());
        int iMin = Math.min((int) Math.ceil(gpcVar.O0() * fH), gpcVar.O0());
        int i2 = 0;
        for (int i3 = 0; i2 < p02Var.c() && i3 < iMin; i3++) {
            BarEntry barEntry = (BarEntry) gpcVar.i(i3);
            if (barEntry instanceof SleepItemEntry) {
                int iC = npm.c(((SleepItemEntry) barEntry).f11764a.c);
                int i4 = i2 + 2;
                if (!this.mViewPortHandler.B(p02Var.f16108b[i4])) {
                    continue;
                } else {
                    if (!this.mViewPortHandler.C(p02Var.f16108b[i2])) {
                        return;
                    }
                    this.mRenderPaint.setColor(iC);
                    float fI2 = AppUtil.isRTLDirection() ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i2] : p02Var.f16108b[i2];
                    float fI3 = AppUtil.isRTLDirection() ? (this.mViewPortHandler.i() + this.mViewPortHandler.I()) - p02Var.f16108b[i4] : p02Var.f16108b[i4];
                    if (Math.abs(fI3 - fI2) < 1.0f) {
                        float f = AppUtil.isRTLDirection() ? fI2 - 1.0f : fI2 + 1.0f;
                        float[] fArr = p02Var.f16108b;
                        rectF = new RectF(fI2, fArr[i2 + 1], f, fArr[i2 + 3]);
                    } else {
                        float[] fArr2 = p02Var.f16108b;
                        rectF = new RectF(fI2, fArr2[i2 + 1], fI3, fArr2[i2 + 3]);
                    }
                    canvas.drawRect(rectF, this.mRenderPaint);
                }
            }
            i2 += 4;
        }
    }

    @Override // defpackage.u02, defpackage.dn5
    public void initBuffers() {
        w02 barData = this.mChart.getBarData();
        float yChartMax = this.mChart.getYChartMax();
        this.mBarBuffers = new nim[barData.j()];
        x02 x02Var = this.mChart;
        int i = x02Var instanceof SleepChart ? ((SleepChart) x02Var).f11774a.f30436k : 0;
        for (int i2 = 0; i2 < this.mBarBuffers.length; i2++) {
            gpc gpcVar = (gpc) barData.i(i2);
            this.mBarBuffers[i2] = new nim(gpcVar.O0() * 4 * (gpcVar.N() ? gpcVar.o() : 1), barData.j(), yChartMax, i);
        }
    }

    @Override // defpackage.u02
    public void prepareBarHighlight(float f, float f2, float f3, float f4, ryp rypVar) {
        this.mBarRect.set(f - f4, f2, f + f4, f3);
        rypVar.n(this.mBarRect, this.mAnimator.i());
    }
}
