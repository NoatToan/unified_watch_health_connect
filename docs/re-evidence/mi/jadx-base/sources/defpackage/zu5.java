package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class zu5 implements msc {
    @Override // defpackage.msc
    public float a(ktc ktcVar, cge cgeVar) {
        float yChartMax = cgeVar.getYChartMax();
        float yChartMin = cgeVar.getYChartMin();
        bge lineData = cgeVar.getLineData();
        if (ktcVar.V() > 0.0f && ktcVar.Z() < 0.0f) {
            return 0.0f;
        }
        if (lineData.t() > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.v() < 0.0f) {
            yChartMin = 0.0f;
        }
        return ktcVar.Z() >= 0.0f ? yChartMin : yChartMax;
    }
}
