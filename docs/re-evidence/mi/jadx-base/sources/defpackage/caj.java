package defpackage;

import com.github.mikephil.charting.charts.RadarChart;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class caj extends lwh<RadarChart> {
    public caj(RadarChart radarChart) {
        super(radarChart);
    }

    @Override // defpackage.lwh
    public r7c b(int i, float f, float f2) {
        List<r7c> listC = c(i);
        float fA = ((RadarChart) this.f25496a).a(f, f2) / ((RadarChart) this.f25496a).getFactor();
        r7c r7cVar = null;
        float f3 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < listC.size(); i2++) {
            r7c r7cVar2 = listC.get(i2);
            float fAbs = Math.abs(r7cVar2.j() - fA);
            if (fAbs < f3) {
                r7cVar = r7cVar2;
                f3 = fAbs;
            }
        }
        return r7cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.github.mikephil.charting.data.Entry, j72] */
    public List<r7c> c(int i) {
        this.f25497b.clear();
        float fH = ((RadarChart) this.f25496a).getAnimator().h();
        float fI = ((RadarChart) this.f25496a).getAnimator().i();
        float sliceAngle = ((RadarChart) this.f25496a).getSliceAngle();
        float factor = ((RadarChart) this.f25496a).getFactor();
        wye wyeVarC = wye.c(0.0f, 0.0f);
        for (int i2 = 0; i2 < ((baj) ((RadarChart) this.f25496a).getData()).j(); i2++) {
            rwc rwcVarI = ((baj) ((RadarChart) this.f25496a).getData()).i(i2);
            ?? I = rwcVarI.i(i);
            float f = i;
            fmq.r(((RadarChart) this.f25496a).getCenterOffsets(), (I.getY() - ((RadarChart) this.f25496a).getYChartMin()) * factor * fI, (sliceAngle * f * fH) + ((RadarChart) this.f25496a).getRotationAngle(), wyeVarC);
            this.f25497b.add(new r7c(f, I.getY(), wyeVarC.c, wyeVarC.d, i2, rwcVarI.m0()));
        }
        return this.f25497b;
    }
}
