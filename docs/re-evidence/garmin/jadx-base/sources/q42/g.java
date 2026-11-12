package q42;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq42/g;", "", "Ll42/k;", "selectedWeightRangeDTO", "Lzk0/g;", "pregnancyWeightGainGoals", "<init>", "(Ll42/k;Lzk0/g;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l42.k f142641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.g f142642b;

    static {
        Parcelable.Creator<l42.k> creator = l42.k.CREATOR;
    }

    public /* synthetic */ g(l42.k kVar, zk0.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : kVar, (i14 & 2) != 0 ? null : gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f142641a, gVar.f142641a) && p005kotlin.jvm.internal.s.g(this.f142642b, gVar.f142642b);
    }

    public final int hashCode() {
        l42.k kVar = this.f142641a;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        zk0.g gVar = this.f142642b;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "WeightDailyReportData(selectedWeightRangeDTO=" + this.f142641a + ", pregnancyWeightGainGoals=" + this.f142642b + ")";
    }

    public g(l42.k kVar, zk0.g gVar) {
        this.f142641a = kVar;
        this.f142642b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
