package q42;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq42/g0;", "", "Ll42/e;", "weeklyWeightReportDTO", "Lzk0/g;", "pregnancyWeightGainGoals", "<init>", "(Ll42/e;Lzk0/g;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l42.e f142643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.g f142644b;

    static {
        Parcelable.Creator<l42.e> creator = l42.e.CREATOR;
    }

    public /* synthetic */ g0(l42.e eVar, zk0.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : eVar, (i14 & 2) != 0 ? null : gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p005kotlin.jvm.internal.s.g(this.f142643a, g0Var.f142643a) && p005kotlin.jvm.internal.s.g(this.f142644b, g0Var.f142644b);
    }

    public final int hashCode() {
        l42.e eVar = this.f142643a;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        zk0.g gVar = this.f142644b;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "WeightWeeklyReportData(weeklyWeightReportDTO=" + this.f142643a + ", pregnancyWeightGainGoals=" + this.f142644b + ")";
    }

    public g0(l42.e eVar, zk0.g gVar) {
        this.f142643a = eVar;
        this.f142644b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
