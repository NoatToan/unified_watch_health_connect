package qw1;

import ds.e0;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqw1/b;", "", "", "progressDays", "progressWeeks", "totalDays", "totalWeeks", "Li53/c;", "Lqw1/a;", "phases", "<init>", "(IIIILi53/c;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f148377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f148378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<a> f148379e;

    public b(int i14, int i15, int i16, int i17, i53.c<a> cVar) {
        cVar.getClass();
        this.f148375a = i14;
        this.f148376b = i15;
        this.f148377c = i16;
        this.f148378d = i17;
        this.f148379e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f148375a == bVar.f148375a && this.f148376b == bVar.f148376b && this.f148377c == bVar.f148377c && this.f148378d == bVar.f148378d && this.f148379e.equals(bVar.f148379e);
    }

    public final int hashCode() {
        return this.f148379e.hashCode() + q2.d(this.f148378d, q2.d(this.f148377c, q2.d(this.f148376b, Integer.hashCode(this.f148375a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f148375a, this.f148376b, "ITPProgressChartData(progressDays=", ", progressWeeks=", ", totalDays=");
        e0.m(this.f148377c, this.f148378d, ", totalWeeks=", ", phases=", sbJ);
        return l2.e(sbJ, this.f148379e, ")");
    }
}
