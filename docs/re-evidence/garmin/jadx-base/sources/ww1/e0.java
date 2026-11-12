package ww1;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lww1/e0;", "", "", "Lww1/e;", "activeStaticPlans", "Lww1/c;", "activeCyclingPlan", "Lww1/a;", "activeRunningPlan", "Lww1/b;", "activeFBTPlan", "Lww1/d;", "activeStrengthPlan", "Lxw1/p;", "runningPlanTypes", "", "completedPlans", "<init>", "(Ljava/util/List;Lww1/c;Lww1/a;Lww1/b;Lww1/d;Ljava/util/List;I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f187748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f187749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f187750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f187751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f187752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<xw1.p> f187753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f187754g;

    public e0(List<e> list, c cVar, a aVar, b bVar, d dVar, List<xw1.p> list2, int i14) {
        list.getClass();
        list2.getClass();
        this.f187748a = list;
        this.f187749b = cVar;
        this.f187750c = aVar;
        this.f187751d = bVar;
        this.f187752e = dVar;
        this.f187753f = list2;
        this.f187754g = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f187748a.equals(e0Var.f187748a) && p005kotlin.jvm.internal.s.g(this.f187749b, e0Var.f187749b) && p005kotlin.jvm.internal.s.g(this.f187750c, e0Var.f187750c) && p005kotlin.jvm.internal.s.g(this.f187751d, e0Var.f187751d) && p005kotlin.jvm.internal.s.g(this.f187752e, e0Var.f187752e) && this.f187753f.equals(e0Var.f187753f) && this.f187754g == e0Var.f187754g;
    }

    public final int hashCode() {
        int iHashCode = this.f187748a.hashCode() * 31;
        c cVar = this.f187749b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.f187750c;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f187751d;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.f187752e;
        return Integer.hashCode(this.f187754g) + u0.b((iHashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.f187753f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrainingPlans(activeStaticPlans=");
        sb3.append(this.f187748a);
        sb3.append(", activeCyclingPlan=");
        sb3.append(this.f187749b);
        sb3.append(", activeRunningPlan=");
        sb3.append(this.f187750c);
        sb3.append(", activeFBTPlan=");
        sb3.append(this.f187751d);
        sb3.append(", activeStrengthPlan=");
        sb3.append(this.f187752e);
        sb3.append(", runningPlanTypes=");
        sb3.append(this.f187753f);
        sb3.append(", completedPlans=");
        return am.j.q(sb3, this.f187754g, ")");
    }
}
