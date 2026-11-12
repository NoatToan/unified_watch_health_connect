package u21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu21/j1;", "", "", "shouldFetchLatestWeightData", "Ls21/s;", "nutritionGoalType", "", "currentWeightInGrams", "weightGoalInGrams", "<init>", "(ZLs21/s;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f168019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s21.s f168020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f168021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f168022d;

    public j1(boolean z14, s21.s sVar, Double d14, Double d15) {
        this.f168019a = z14;
        this.f168020b = sVar;
        this.f168021c = d14;
        this.f168022d = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f168019a == j1Var.f168019a && this.f168020b == j1Var.f168020b && p005kotlin.jvm.internal.s.g(this.f168021c, j1Var.f168021c) && p005kotlin.jvm.internal.s.g(this.f168022d, j1Var.f168022d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f168019a) * 31;
        s21.s sVar = this.f168020b;
        int iHashCode2 = (iHashCode + (sVar == null ? 0 : sVar.hashCode())) * 31;
        Double d14 = this.f168021c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f168022d;
        return iHashCode3 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WeightSetupData(shouldFetchLatestWeightData=");
        sb3.append(this.f168019a);
        sb3.append(", nutritionGoalType=");
        sb3.append(this.f168020b);
        sb3.append(", currentWeightInGrams=");
        return sn.a.f(this.f168021c, this.f168022d, ", weightGoalInGrams=", ")", sb3);
    }
}
