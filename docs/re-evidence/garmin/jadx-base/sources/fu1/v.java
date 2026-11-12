package fu1;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfu1/v;", "", "Lxw1/d;", "activePlan", "Lfu1/t;", "schedule", "", "Lfu1/d;", "dashboardFeed", "Lxw1/p;", "workoutPlanTypes", "<init>", "(Lxw1/d;Lfu1/t;Ljava/util/List;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xw1.d f73560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f73561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<d> f73562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<xw1.p> f73563d;

    public /* synthetic */ v(xw1.d dVar, t tVar, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dVar, (i14 & 2) != 0 ? null : tVar, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f73560a, vVar.f73560a) && p005kotlin.jvm.internal.s.g(this.f73561b, vVar.f73561b) && p005kotlin.jvm.internal.s.g(this.f73562c, vVar.f73562c) && p005kotlin.jvm.internal.s.g(this.f73563d, vVar.f73563d);
    }

    public final int hashCode() {
        xw1.d dVar = this.f73560a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        t tVar = this.f73561b;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<d> list = this.f73562c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<xw1.p> list2 = this.f73563d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        xw1.d dVar = this.f73560a;
        List<d> list = this.f73562c;
        List<xw1.p> list2 = this.f73563d;
        StringBuilder sb3 = new StringBuilder("TrainingPlanDashboard(activePlan=");
        sb3.append(dVar);
        sb3.append(", schedule=");
        sb3.append(this.f73561b);
        sb3.append(", dashboardFeed=");
        return n23.j.j(sb3, list, ", workoutPlanTypes=", list2, ")");
    }

    public v(xw1.d dVar, t tVar, List<d> list, List<xw1.p> list2) {
        this.f73560a = dVar;
        this.f73561b = tVar;
        this.f73562c = list;
        this.f73563d = list2;
    }

    public v() {
        this(null, null, null, null, 15, null);
    }
}
