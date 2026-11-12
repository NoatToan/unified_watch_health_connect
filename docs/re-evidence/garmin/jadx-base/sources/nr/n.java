package nr;

import java.util.List;
import p005kotlin.Metadata;
import r22.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/n;", "", "Lnr/o0;", "titleData", "", "Lr22/p1;", "statsList", "<init>", "(Lnr/o0;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f127263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<p1> f127264b;

    public /* synthetic */ n(o0 o0Var, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : o0Var, (i14 & 2) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.f127263a, nVar.f127263a) && p005kotlin.jvm.internal.s.g(this.f127264b, nVar.f127264b);
    }

    public final int hashCode() {
        o0 o0Var = this.f127263a;
        int iHashCode = (o0Var == null ? 0 : o0Var.hashCode()) * 31;
        List<p1> list = this.f127264b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityStatsItemState(titleData=" + this.f127263a + ", statsList=" + this.f127264b + ")";
    }

    public n(o0 o0Var, List<p1> list) {
        this.f127263a = o0Var;
        this.f127264b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
