package gy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgy0/k;", "", "Ln61/f;", "weeklyData", "dailyData", "<init>", "(Ln61/f;Ln61/f;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n61.f f80183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n61.f f80184b;

    static {
        n61.f.Companion companion = n61.f.INSTANCE;
    }

    public k(n61.f fVar, n61.f fVar2) {
        this.f80183a = fVar;
        this.f80184b = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f80183a, kVar.f80183a) && p005kotlin.jvm.internal.s.g(this.f80184b, kVar.f80184b);
    }

    public final int hashCode() {
        n61.f fVar = this.f80183a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        n61.f fVar2 = this.f80184b;
        return iHashCode + (fVar2 != null ? fVar2.hashCode() : 0);
    }

    public final String toString() {
        return "EnduranceScoreUIData(weeklyData=" + this.f80183a + ", dailyData=" + this.f80184b + ")";
    }
}
