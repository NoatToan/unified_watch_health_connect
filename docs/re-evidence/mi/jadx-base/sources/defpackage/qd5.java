package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class qd5 extends zu5 {
    @Override // defpackage.zu5, defpackage.msc
    public float a(ktc ktcVar, cge cgeVar) {
        float yChartMin = cgeVar.getYChartMin();
        return (ktcVar.V() <= 0.0f || ktcVar.Z() >= 0.0f) ? yChartMin : ktcVar.Z();
    }
}
