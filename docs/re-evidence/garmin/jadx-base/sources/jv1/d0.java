package jv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljv1/d0;", "", "Lhv1/i;", "swimAbility", "Lhv1/f;", "cyclingPastWeekHours", "Ljv1/d;", "runningWeeklyAvgAndPace", "<init>", "(Lhv1/i;Lhv1/f;Ljv1/d;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv1.i f101029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hv1.f f101030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f101031c;

    public /* synthetic */ d0(hv1.i iVar, hv1.f fVar, d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? hv1.i.NOVICE : iVar, (i14 & 2) != 0 ? hv1.f.ZERO_FOUR : fVar, (i14 & 4) != 0 ? new d(null, 0, null, 7, null) : dVar);
    }

    public static d0 a(d0 d0Var, hv1.i iVar, hv1.f fVar, d dVar, int i14) {
        if ((i14 & 1) != 0) {
            iVar = d0Var.f101029a;
        }
        if ((i14 & 2) != 0) {
            fVar = d0Var.f101030b;
        }
        if ((i14 & 4) != 0) {
            dVar = d0Var.f101031c;
        }
        d0Var.getClass();
        iVar.getClass();
        fVar.getClass();
        dVar.getClass();
        return new d0(iVar, fVar, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f101029a == d0Var.f101029a && this.f101030b == d0Var.f101030b && p005kotlin.jvm.internal.s.g(this.f101031c, d0Var.f101031c);
    }

    public final int hashCode() {
        return this.f101031c.hashCode() + ((this.f101030b.hashCode() + (this.f101029a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TriathlonTrainingHistoryUIModel(swimAbility=" + this.f101029a + ", cyclingPastWeekHours=" + this.f101030b + ", runningWeeklyAvgAndPace=" + this.f101031c + ")";
    }

    public d0(hv1.i iVar, hv1.f fVar, d dVar) {
        iVar.getClass();
        fVar.getClass();
        dVar.getClass();
        this.f101029a = iVar;
        this.f101030b = fVar;
        this.f101031c = dVar;
    }

    public d0() {
        this(null, null, null, 7, null);
    }
}
