package s42;

import java.util.List;
import l42.k;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls42/c;", "", "Ll42/k;", "weightRangeDTO", "", "Ll42/d;", "measurementTypes", "Lzk0/g;", "weightGoal", "<init>", "(Ll42/k;Ljava/util/List;Lzk0/g;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f157073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<l42.d> f157074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.g f157075c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(k kVar, List<? extends l42.d> list, zk0.g gVar) {
        kVar.getClass();
        list.getClass();
        this.f157073a = kVar;
        this.f157074b = list;
        this.f157075c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f157073a.equals(cVar.f157073a) && this.f157074b.equals(cVar.f157074b) && s.g(this.f157075c, cVar.f157075c);
    }

    public final int hashCode() {
        int iB = u0.b(this.f157073a.hashCode() * 31, 31, this.f157074b);
        zk0.g gVar = this.f157075c;
        return iB + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "WeightChartDailyData(weightRangeDTO=" + this.f157073a + ", measurementTypes=" + this.f157074b + ", weightGoal=" + this.f157075c + ")";
    }
}
