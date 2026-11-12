package av1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lav1/e;", "", "Lxu1/a;", "archProgressData", "Ltw1/a;", "currentPlanPhase", "", "upcomingPlanPhase", "completedPlanPhase", "<init>", "(Lxu1/a;Ltw1/a;Ljava/util/List;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xu1.a f13264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tw1.a f13265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<tw1.a> f13266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<tw1.a> f13267d;

    public /* synthetic */ e(xu1.a aVar, tw1.a aVar2, List list, List list2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : aVar, (i14 & 2) != 0 ? null : aVar2, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f13264a, eVar.f13264a) && s.g(this.f13265b, eVar.f13265b) && s.g(this.f13266c, eVar.f13266c) && s.g(this.f13267d, eVar.f13267d);
    }

    public final int hashCode() {
        xu1.a aVar = this.f13264a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        tw1.a aVar2 = this.f13265b;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        List<tw1.a> list = this.f13266c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<tw1.a> list2 = this.f13267d;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTPlanOverviewUiModel(archProgressData=");
        sb3.append(this.f13264a);
        sb3.append(", currentPlanPhase=");
        sb3.append(this.f13265b);
        sb3.append(", upcomingPlanPhase=");
        return n23.j.j(sb3, this.f13266c, ", completedPlanPhase=", this.f13267d, ")");
    }

    public e(xu1.a aVar, tw1.a aVar2, List<tw1.a> list, List<tw1.a> list2) {
        this.f13264a = aVar;
        this.f13265b = aVar2;
        this.f13266c = list;
        this.f13267d = list2;
    }

    public e() {
        this(null, null, null, null, 15, null);
    }
}
