package defpackage;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lwh<T extends PieRadarChartBase> implements zsc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f25496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<r7c> f25497b = new ArrayList();

    public lwh(T t) {
        this.f25496a = t;
    }

    @Override // defpackage.zsc
    public r7c a(float f, float f2) {
        if (this.f25496a.a(f, f2) > this.f25496a.getRadius()) {
            return null;
        }
        float fB = this.f25496a.b(f, f2);
        T t = this.f25496a;
        if (t instanceof PieChart) {
            fB /= t.getAnimator().i();
        }
        int iC = this.f25496a.c(fB);
        if (iC < 0 || iC >= this.f25496a.getData().q().O0()) {
            return null;
        }
        return b(iC, f, f2);
    }

    public abstract r7c b(int i, float f, float f2);
}
