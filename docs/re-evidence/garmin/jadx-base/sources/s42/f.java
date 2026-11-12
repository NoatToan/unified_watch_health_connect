package s42;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls42/f;", "", "Ll42/e;", "weeklyWeightReportDTO", "", "Ll42/d;", "measurementTypes", "Lzk0/g;", "weightGoal", "<init>", "(Ll42/e;Ljava/util/List;Lzk0/g;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l42.e f157100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<l42.d> f157101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.g f157102c;

    /* JADX WARN: Multi-variable type inference failed */
    public f(l42.e eVar, List<? extends l42.d> list, zk0.g gVar) {
        eVar.getClass();
        list.getClass();
        this.f157100a = eVar;
        this.f157101b = list;
        this.f157102c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f157100a.equals(fVar.f157100a) && this.f157101b.equals(fVar.f157101b) && s.g(this.f157102c, fVar.f157102c);
    }

    public final int hashCode() {
        int iB = u0.b(this.f157100a.hashCode() * 31, 31, this.f157101b);
        zk0.g gVar = this.f157102c;
        return iB + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "WeightChartWeeklyData(weeklyWeightReportDTO=" + this.f157100a + ", measurementTypes=" + this.f157101b + ", weightGoal=" + this.f157102c + ")";
    }
}
