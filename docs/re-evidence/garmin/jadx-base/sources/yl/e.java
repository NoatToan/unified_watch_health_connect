package yl;

import j53.l;
import m92.h0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyl/e;", "", "Li53/c;", "Lm92/h0$e$c;", "spo2ChartData", "Lm92/h0$e$a;", "elevationChartData", "", "fixedIntervalSize", "maxElevationValue", "", "chartXAxisLabels", "<init>", "(Li53/c;Li53/c;FFLi53/c;)V", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<h0.e.c> f197642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<h0.e.a> f197643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f197644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f197645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<String> f197646e;

    public e(i53.c cVar, i53.c cVar2, float f14, float f15, i53.c cVar3, int i14, j jVar) {
        this((i14 & 1) != 0 ? l.b() : cVar, (i14 & 2) != 0 ? l.b() : cVar2, f14, f15, (i14 & 16) != 0 ? l.b() : cVar3);
    }

    public final boolean a() {
        return (this.f197642a.isEmpty() && this.f197643b.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f197642a, eVar.f197642a) && s.g(this.f197643b, eVar.f197643b) && Float.compare(this.f197644c, eVar.f197644c) == 0 && Float.compare(this.f197645d, eVar.f197645d) == 0 && s.g(this.f197646e, eVar.f197646e);
    }

    public final int hashCode() {
        return this.f197646e.hashCode() + q6.f.d(this.f197645d, q6.f.d(this.f197644c, l2.a(this.f197643b, this.f197642a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PulseOxAcclimationWeeklyReportChartState(spo2ChartData=");
        sb3.append(this.f197642a);
        sb3.append(", elevationChartData=");
        sb3.append(this.f197643b);
        sb3.append(", fixedIntervalSize=");
        l2.n(sb3, this.f197644c, ", maxElevationValue=", this.f197645d, ", chartXAxisLabels=");
        return l2.e(sb3, this.f197646e, ")");
    }

    public e(i53.c<h0.e.c> cVar, i53.c<h0.e.a> cVar2, float f14, float f15, i53.c<String> cVar3) {
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f197642a = cVar;
        this.f197643b = cVar2;
        this.f197644c = f14;
        this.f197645d = f15;
        this.f197646e = cVar3;
    }
}
