package defpackage;

import com.github.mikephil.charting.charts.PieChart;

/* JADX INFO: loaded from: classes4.dex */
public class kwh extends lwh<PieChart> {
    public kwh(PieChart pieChart) {
        super(pieChart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lwh
    public r7c b(int i, float f, float f2) {
        cwc cwcVarY = ((iwh) ((PieChart) this.f25496a).getData()).y();
        return new r7c(i, cwcVarY.i(i).getY(), f, f2, 0, cwcVarY.m0());
    }
}
