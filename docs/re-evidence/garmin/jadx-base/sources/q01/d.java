package q01;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lq01/d;", "", "", "mealIndex", "calorieGoal", "", "proteinGoal", "fatGoal", "carbsGoal", "<init>", "(ILjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f141988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f141989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f141990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f141991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f141992e;

    public d(int i14, Integer num, Double d14, Double d15, Double d16) {
        this.f141988a = i14;
        this.f141989b = num;
        this.f141990c = d14;
        this.f141991d = d15;
        this.f141992e = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f141988a == dVar.f141988a && s.g(this.f141989b, dVar.f141989b) && s.g(this.f141990c, dVar.f141990c) && s.g(this.f141991d, dVar.f141991d) && s.g(this.f141992e, dVar.f141992e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f141988a) * 31;
        Integer num = this.f141989b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f141990c;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f141991d;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f141992e;
        return iHashCode4 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MealGoal(mealIndex=");
        sb3.append(this.f141988a);
        sb3.append(", calorieGoal=");
        sb3.append(this.f141989b);
        sb3.append(", proteinGoal=");
        b71.i.p(this.f141990c, this.f141991d, ", fatGoal=", ", carbsGoal=", sb3);
        return b71.i.g(sb3, this.f141992e, ")");
    }
}
